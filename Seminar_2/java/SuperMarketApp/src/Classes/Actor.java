package Classes;

import Interfaces.iActorBehavior;

/** 
 * Абстрактный класс клиентов. Реализует интерфейс iActorBehavior
*/
public abstract class Actor implements iActorBehavior{

    /** Поле имя клиента */
    protected String name;

    // For purchasing: checking a state of client

    /** Поле: выбраны ли товары */
    protected boolean isTakeOrder;

    /** Поле: сделан ли заказ */
    protected boolean isMakeOrder;
    
    /** Конструктор для клиента */
    public Actor(String name) {
        this.name = name;
    }

    /** Метод для возврата имени клиента*/
    abstract String getName();
    /** Метод для назначения имени клиента*/
    abstract void setName(String str);
    
}
