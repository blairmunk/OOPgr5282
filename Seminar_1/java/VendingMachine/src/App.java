import java.util.ArrayList;
import java.util.List;

import domain.Bottle;
import domain.HotDrink;
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
        product item4 = new Bottle("Cola", 3, 90, "drinks", 0.5);
        product item5 = new HotDrink("Tea", 4, 80, "drinks", 90);
        product item6 = new HotDrink("Capuccino", 5, 120, "drinks", 85);
        product item7 = new HotDrink("Hot Chocolate", 6, 130, "drinks", 60);    

        List <product> assort = new ArrayList<>();
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);
        assort.add(item6);
        assort.add(item7);

        Holder hold1 = new Holder();
        CoinDispenser cd1 = new CoinDispenser();
        Display disp1 = new Display();

        VendingMachine machine1 = new VendingMachine(hold1, disp1, cd1, assort);

        for (product prod: machine1.getProducts()){
            System.out.println(prod);
        }
    }
}
