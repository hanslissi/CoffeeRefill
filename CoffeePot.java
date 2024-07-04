public class CoffeePot {
    private int coffeeAmount;
    private static int MAX_COFFEE_AMOUNT = 300;

    public CoffeePot() {
        this.coffeeAmount = MAX_COFFEE_AMOUNT;
    }

    public boolean isEmpty() {
        return coffeeAmount <= 0;
    }

    public void refill() {
        coffeeAmount = MAX_COFFEE_AMOUNT;
        System.out.println("Coffee pot refilled!");
    }

    public void pour(Coffee coffee) {
        coffee.refill();
        coffeeAmount -= Coffee.getMaxCoffeeAmount();
    }

}
