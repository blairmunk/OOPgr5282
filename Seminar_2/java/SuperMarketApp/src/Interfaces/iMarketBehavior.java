package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarketBehavior {

    public void acceptToMarket(iActorBehavior actor);
    public void releseFromMarket(List<Actor> actors);
    public void inspectGoods();
    public void update();

}
