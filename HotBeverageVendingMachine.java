import java.util.List;
public class HotBeverageVendingMachine implements VendingMachine {
    private List<Product> productList;

    @Override
    public void initProduct(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product item : productList)
            if (item.getName().equals(name))
                return item;
        return null;
    }

    public Product getProduct(String name, int volume) {
        for (Product item : productList)
            if (item.getName().equals(name) && ((BottleOfWater) item).getVolume() == volume)
                return item;
        return null;
    }

    public Product getProduct(int volume) {
        for (Product item : productList)
            if (((BottleOfWater) item).getVolume() == volume)
                return item;
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (Product item : productList)
            if (item.getName().equals(name) && ((HotBeverage) item).getVolume() == volume &&
                    ((HotBeverage) item).getTemperature() == temperature)
                return item;
        return null;
    }
}