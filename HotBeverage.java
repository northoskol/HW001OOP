public class HotBeverage extends Product {
    private int volume;
    private int temperature;

    public HotBeverage(String name, int cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
        this.volume = 0; // Initialize volume
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotBeverage{" +
                "name=" + super.getName() +
                ";cost=" + super.getCost() +
                ";temperature=" + temperature +
                '}';
    }
}