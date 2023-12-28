import java.util.ArrayList;
import java.util.List;

import domain.Bottle;
import domain.product;
import service.CoinDispenser;
import service.Display;
import service.Holder;
import service.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        product item1 = new product("lays", 0, 100, "snack");
        product item2 = new product("twix", 1, 80, "chocolate");
        product item3 = new product("nuts", 2, 95, "nuts");
        product item4 = new Bottle("Cola", 3, 120, "drinks", 0.5);

        List <product> assort = new ArrayList<>();
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);

        Holder hold1 = new Holder();
        CoinDispenser cd1 = new CoinDispenser();
        Display disp1 = new Display();

        VendingMachine machine1 = new VendingMachine(hold1, disp1, cd1, assort);

        for (product prod: machine1.getProducts()){
            System.out.println(prod);
        }
    }
}
