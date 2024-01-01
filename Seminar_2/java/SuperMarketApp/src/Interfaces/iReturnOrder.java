package Interfaces;

/** 
 * Interface for returning orders
 * Describe states of process returning product
 * 
*/
import Classes.Actor;

public interface iReturnOrder{

    /** Проверяем держит ли клиент в руках возвратный товар*/
    public boolean isBroughtOrder();
    /** Проверяем, получил ли клиент возврат*/
    public boolean isGetRefund();
    /** Проверяем, отказано ли клиенту в возврате*/
    public boolean isGetReject();
    /** Забираем товар у клиента и меняем его состояние isBroughtOrder*/
    public void setBroughtOrder(boolean val);
    /** Делаем возврат клиенту и меняем состояние isGetRefund */
    public void setGetRefund(boolean val);
    /** Отказываем клиенту в возврате и меняем состояние isGetReject */
    public void setGetReject(boolean val);
    /** Вернуть имя клиента как родителя (Actor)*/
    public Actor getActor();
    
}