package Interfaces;

import java.util.List;

import Classes.Actor;


/** 
 * Интерфейс поведения внутри магазина:
 * Вход в магазин, выход из магазина, 
 * проверка товара к возврату, обновление состояний клиентов
*/
public interface iMarketBehavior {

    /** Впускаем в магазин */
    public void acceptToMarket(iActorBehavior actor);
    /** Выпускаем из магазина */
    public void releseFromMarket(List<Actor> actors);
    /** Проверяем, пришёл ли клиент вернуть товар */
    public boolean isRefundClient(iActorBehavior actor); 
    /** Анализируем товар на пригодность к возврату*/
    public void inspectGoods(iActorBehavior actor);
    /** Обновляем состояние клиентов в очереди*/
    public void update();

}
