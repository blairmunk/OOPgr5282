package Classes;

import Interfaces.iActorBehavior;

public abstract class Actor implements iActorBehavior{

    protected String name;

    // For purchasing
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    
    public Actor(String name) {
        this.name = name;
    }

    abstract String getName();
    abstract void setName(String str);
    
}
