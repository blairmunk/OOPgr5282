package Classes;

import Interfaces.iReturnOrder;

/**
 * Это класс для клиентов, которые возвращают товар. Реализует поведение iReturnOrder. 
 * Также реализует поведение обычных клиентов
 */
public class RefundClient extends Actor implements iReturnOrder {

    // For return order
    protected boolean isBroughtOrder;
    protected boolean isGetRefund;
    protected boolean isGetReject;

    public RefundClient(String name) {
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
    public boolean isBroughtOrder() {
        return this.isBroughtOrder;
    }

    @Override
    public boolean isGetRefund() {
        return this.isGetRefund;
    }

    @Override
    public boolean isGetReject() {
        return this.isGetReject;
    }

    @Override
    public void setBroughtOrder(boolean val) {
        this.isBroughtOrder = val;
    }

    @Override
    public void setGetRefund(boolean val) {
        this.isGetRefund = val;
    }

    @Override
    public void setGetReject(boolean val) {
        this.isGetReject = val;
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
