package Classes;

// Description of clients with promo actions

public class PromoClient extends Actor {
    
    static int numOfPromoClients; // Increases by 1 when creating new promoclient

    public String actionName;
    public int idPromoClient;
 
    public PromoClient(String name, String actionName, int idPromoClient){
        super(name);
        this.actionName = actionName;
        this.idPromoClient = idPromoClient;
        numOfPromoClients++;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    @Override
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    @Override
    public Actor getActor() {
        return this;
    }
    
    @Override
    String getName() {
        return super.name;
    }

    @Override
    void setName(String str) {
        super.name = str;
    }

}
