/**
 * Название: SuperMarketApp
 * @version: 1.1
 * Назначение: Смоделировать работу супермаркета (покупки и возврата товаров) с целью изучения принципов ООП
 */

import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromoClient;
import Classes.RefundClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehavior;

public class App {
    public static void main(String[] args) throws Exception {
        
        Market magnit = new Market();
        iActorBehavior client1 = new OrdinaryClient("Boris");
        iActorBehavior client2 = new PromoClient("Vasya", "newyear" , 1);
        iActorBehavior client3 = new RefundClient("Petr");

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);

        magnit.update();

    }
}
