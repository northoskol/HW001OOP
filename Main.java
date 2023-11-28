import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new BottleOfWater("qwe", 123, 100));
        productList.add(new BottleOfWater("qwe", 200, 150));
        productList.add(new BottleOfWater("zxcg", 500, 1000));
        productList.add(new BottleOfWater("qaffwe", 123, 10));
        productList.add(new HotBeverage("coffee", 150, 80));

        HotBeverageVendingMachine vendingMachine = new HotBeverageVendingMachine();
        vendingMachine.initProduct(productList);

        System.out.println(vendingMachine.getProduct("qwe", 150));
        // Use the correct product name and parameters for HotBeverage
        System.out.println(vendingMachine.getProduct("coffee", 0, 80));

        Product test = new BottleOfWater("asd", 123, 123);
    }
}