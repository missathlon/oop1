package hw2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Yen\t\t\t\t");
        Human human2 = new Human("Someone\t");
        Human human3 = new Human("Nikita\t\t\t\t");
        Human human4 = new Human("Timur\t\t");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.update();
        while (!market.checkActorInMarket()) {
            market.update();
        }
    }
}