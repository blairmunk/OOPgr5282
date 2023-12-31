package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehavior;
import Interfaces.iMarketBehavior;
import Interfaces.iQueueBehavior;

public class Market implements iMarketBehavior,iQueueBehavior {

private List<iActorBehavior> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehavior>();
    }

    @Override
    public void acceptToMarket(iActorBehavior actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehavior actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehavior actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehavior actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehavior actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
            }
        }
    }

}