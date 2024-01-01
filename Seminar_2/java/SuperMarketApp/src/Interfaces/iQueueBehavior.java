package Interfaces;

/** 
 * Интерфейс движения очереди внутри магазина:
 * постановка в очередь, выход из очереди, 
 * принятие и выдача заказов
*/
public interface iQueueBehavior {

    /** Ставим в очередь клиента*/
    public void takeInQueue(iActorBehavior actor);
    /** Удаляем клиента из очереди*/
    public void releaseFromQueue();
    /** Принимаем заказ у клиента*/
    public void takeOrder ();
    /** Выдаём заказ клиенту*/
    public void giveOrder ();

}
