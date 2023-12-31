package Interfaces;

import Classes.Actor;

public interface iQueueBehavior {

    public void takeInQueue(Actor actor);
    public void releaseFromQueue();
    public void takeOrder ();
    public void giveOrder ();

}
