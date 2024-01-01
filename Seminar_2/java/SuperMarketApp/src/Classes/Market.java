package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Interfaces.iActorBehavior;
import Interfaces.iMarketBehavior;
import Interfaces.iQueueBehavior;

/** 
 * Class for supermarket working. Implements store interface (iMarketBehavior) 
 * and the queue in store (iQueueBehavior)
*/
public class Market implements iMarketBehavior,iQueueBehavior {

    /** Creating a queue of clients */
    private List<iActorBehavior> queue;

    
    /** 
     * Constructor of market: creating new store with own queue
     */
    public Market() {
        this.queue = new ArrayList<iActorBehavior>();
    }


    /** 
     * Метод для входа в магазин и назначения в очередь
     * @param actor Клиент из списка
     */
    @Override
    public void acceptToMarket(iActorBehavior actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }
    
    /** 
     * Метод для постановки клиента в очередь
     * @param actor Клиент из списка
     */
    @Override
    public void takeInQueue(iActorBehavior actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }
    
    /** 
     * Метод для выхода из магазина, удаляет из очереди
     * @param actors Список клиентов
     */
    @Override
    public void releseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }


    /** 
     * Метод для функционирования магазина, обновляет состояние клиентов
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    

    /** 
     * Метод выдачи заказа и возвратов. Проверяет, с возвратом ли клиент.
     * Если нет, то если клиент сделал заказ, клиент получает заказ.
     * Если с возвратом, то получает либо возврат, либо отказ в возврате
     */
    @Override
    public void giveOrder() {

        for (iActorBehavior actor : queue) {
            if (!isRefundClient(actor)) {
                if (actor.isMakeOrder()) {
                    actor.setTakeOrder(true);
                    System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
                }
            }
            else {
                inspectGoods(actor);
            }
        }
    }

    /** 
     * Метод выхода из очереди. Если клиент получил заказ 
     * или клиент с возвратом получил возврат или отказ в возврате, 
     * он уходит из очереди
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehavior actor : queue) {
            if (actor.isTakeOrder() || ((RefundClient) actor).isGetRefund() || (((RefundClient) actor).isGetReject())) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releseFromMarket(releaseActors);
    }

    /** 
     * Метод заказа товаров. Для каждого клиента из очереди:
     * Проверяем с возвратом ли пришёл клиент. Если нет,
     * то если клиент еще не сделал заказ, он делает заказ.
     * Если клиент с возвратом, то он отдаёт товар на проверку
     */
    @Override
    public void takeOrder() {
        for (iActorBehavior actor : queue) {
            if (!isRefundClient(actor)) {
                if (!actor.isMakeOrder()) {
                    actor.setMakeOrder(true);
                    System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
                }
            }
            else {
                if (!((RefundClient) actor).isBroughtOrder()){
                    ((RefundClient) actor).setBroughtOrder(true);
                    System.out.println(actor.getActor().getName() + " клиент отдал товар на проверку");
                }
            }
        }
    }

    /** 
     * Метод проверки товара на возврат. 
     * Случайным образом либо даёт возврат, либо отказывает в возврате. 
     */
    @Override
    public void inspectGoods(iActorBehavior actor) {
        Random random = new Random();
        if (random.nextBoolean()) {
            ((RefundClient) actor).setGetRefund(true);
            System.out.println(actor.getActor().getName() + " клиент получил возврат ");
        }
        else {
            ((RefundClient) actor).setGetReject(true);
            System.out.println(actor.getActor().getName() + " клиент получил отказ в возврате товара ");
        }
    
    }

    /** 
     * Метод проверяет, пришёл ли клиент вернуть товар 
     * @param actor Клиент, которого требуется проверить.
     * @return true, если клиент с возвратом, иначе false.
     */
    @Override
    public boolean isRefundClient(iActorBehavior actor) {
        return actor instanceof RefundClient;
    }
}