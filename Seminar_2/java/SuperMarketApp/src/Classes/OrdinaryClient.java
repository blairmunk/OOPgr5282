package Classes;

public class OrdinaryClient extends Actor {

    public OrdinaryClient(String name){
        super(name);
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
