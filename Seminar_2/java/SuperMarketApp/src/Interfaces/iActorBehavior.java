package Interfaces;
// Interface for client behavior

import Classes.Actor;

/** 
 * Интерфейс поведения клиентов:
 * Сделан ли заказ, получен ли товар
 * Заказ товара, получение товара
*/
public interface iActorBehavior {

    /** Получен ли заказ?*/
    public boolean isTakeOrder();
    /** Сделан ли заказ*/
    public boolean isMakeOrder();
    /** Поменять состояние isTakeOrder*/
    public void setTakeOrder(boolean val);
    /** Поменять состояние isMakeOrder*/
    public void setMakeOrder(boolean val);
    /** Вернуть имя клиента как родителя (Actor)*/
    public Actor getActor();

}