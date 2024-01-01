package Interfaces;

import java.util.List;

import Classes.Actor;


/** 
 * Интерфейс поведения внутри магазина:
 * Вход в магазин, выход из магазина, 
 * проверка товара к возврату, обновление состояний клиентов
*/
public interface iMarketBehavior {

    public void acceptToMarket(iActorBehavior actor);
    public void releseFromMarket(List<Actor> actors);
    public boolean isRefundClient(iActorBehavior actor); 
    public void inspectGoods(iActorBehavior actor);
    public void update();

}
