package hw1;

class HotDrink {

    public String name;
    public double price;
    public int volume;

    public HotDrink(String name, double price, int volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Наименование\t" + name + ", Цена\t" + price + ", Объём\t" + volume;
    }
}