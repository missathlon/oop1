package hw1;

public class Main {

    public static void main(String[] args) {

        HotDrinkWithTemperature hotDrink1 = new HotDrinkWithTemperature("Tea", 25, 200, 90);
        HotDrinkWithTemperature hotDrink2 = new HotDrinkWithTemperature("Coffee", 35, 100, 80);
        HotDrinkWithTemperature hotDrink3 = new HotDrinkWithTemperature("Latte", 50, 150, 80);
        HotDrinkWithTemperature hotDrink4 = new HotDrinkWithTemperature("Cappuccino", 250, 100, 60);
        HotDrinkWithTemperature hotDrink5 = new HotDrinkWithTemperature("Cocoa", 200, 100, 60);
        HotDrinkWithTemperature hotDrink6 = new HotDrinkWithTemperature("Americano", 180, 100, 55);
        HotDrinkWithTemperature hotDrink7 = new HotDrinkWithTemperature("Filtered", 150, 75, 50);
        HotDrinkWithTemperature hotDrink8 = new HotDrinkWithTemperature("Sbi-ten", 150, 125, 50);

        HotDrinksMachine hotDrinksMachine = new HotDrinksMachine();
        HotDrinkWithTemperature product1 = hotDrinksMachine.getProduct("Tea", 25, 200, 90);
        HotDrinkWithTemperature product2 = hotDrinksMachine.getProduct("Coffee", 35, 100, 80);
        HotDrinkWithTemperature product3 = hotDrinksMachine.getProduct("Cocoa", 50, 150, 80);
        HotDrinkWithTemperature product4 = hotDrinksMachine.getProduct("Mulled wine", 250, 100, 60);
        HotDrinkWithTemperature product5 = hotDrinksMachine.getProduct("Punsh", 200, 100, 60);
        HotDrinkWithTemperature product6 = hotDrinksMachine.getProduct("Grog", 180, 100, 55);
        HotDrinkWithTemperature product7 = hotDrinksMachine.getProduct("Flip", 150, 75, 50);
        HotDrinkWithTemperature product8 = hotDrinksMachine.getProduct("Sbi-ten", 150, 125, 50);
    }
}