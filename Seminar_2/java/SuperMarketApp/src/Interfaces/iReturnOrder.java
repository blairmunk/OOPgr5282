package Interfaces;

// Interface for return order

import Classes.Actor;

public interface iReturnOrder{

    public boolean isBroughtOrder();
    public boolean isGetRefund();
    public boolean isGetReject();
    public void setBroughtOrder(boolean val);
    public void setGetRefund(boolean val);
    public void setGetReject(boolean val);
    public Actor getActor();
    
}