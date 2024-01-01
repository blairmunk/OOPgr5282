import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromoClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehavior;

public class App {
    public static void main(String[] args) throws Exception {
        
        Market magnit = new Market();
        iActorBehavior client1 = new OrdinaryClient("Boris");
        iActorBehavior client2 = new OrdinaryClient("Maria");
        iActorBehavior client3 = new SpecialClient("Gubernator", 1);
        iActorBehavior client4 = new TaxInspector();
        iActorBehavior client5 = new PromoClient("Vasya", "newyear", 1);

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);

        magnit.update();

    }
}
