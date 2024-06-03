package hw2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Ян\t\t\t\t");
        Human human2 = new Human("Абдурахмангаджи\t");
        Human human3 = new Human("Иов\t\t\t\t");
        Human human4 = new Human("Аполлинарий\t\t");
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