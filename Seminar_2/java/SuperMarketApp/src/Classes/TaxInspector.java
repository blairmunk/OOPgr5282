package Classes;

import Interfaces.iActorBehavior;

public class TaxInspector implements iActorBehavior {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    public TaxInspector() {
        this.name = "Tax Audit";
    }

    public String getName() {
        return name;
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        isTakeOrder = val;
    }

    public void setMakeOrder(boolean val) {
        isMakeOrder = val;
    }

    public Actor getActor() {
        return new OrdinaryClient(name);
    }
    
}
