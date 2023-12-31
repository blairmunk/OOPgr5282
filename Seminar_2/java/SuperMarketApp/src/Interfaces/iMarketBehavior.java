package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarketBehavior {

    public void acceptToMarket(Actor actor);
    public void releseFromMarket(List<Actor> actors);
    public void update();

}
