package hw1;

public class HotDrinksMachine implements VendingMachine {

    @Override
    public void getProduct() {
    }

    public HotDrinkWithTemperature getProduct(String name, double price, int volume, int temperature) {
        return new HotDrinkWithTemperature(name, price, volume, temperature);
    }
}