public class Coffee {
    private int coffeeAmount;
    private static int MAX_COFFEE_AMOUNT = 100;

    private CoffeePot pot;

    public Coffee(CoffeePot pot) {
        this.coffeeAmount = MAX_COFFEE_AMOUNT;
        this.pot = pot;
    }

    public void displayCoffee() {
        System.out.print("                       ");
        pot.displayCoffeePot(0);
        System.out.print("\n         (             ");
        pot.displayCoffeePot(1);
        System.out.print("\n          )            ");
        pot.displayCoffeePot(2);
        System.out.print("\n      ( (              ");
        pot.displayCoffeePot(3);
        System.out.print("\n       ) )             ");
        pot.displayCoffeePot(4);
        System.out.print("\n    ( ( (              ");
        pot.displayCoffeePot(5);
        System.out.print("\n      ) )              ");
        pot.displayCoffeePot(6);
        System.out.print("\n       (               ");
        pot.displayCoffeePot(7);
        System.out.print("\n_        )     _       ");
        pot.displayCoffeePot(8);

        String emptyLine = "\n│              │";
        String fullLine = "\n│~~~~~~~~~~~~~~│";
        String bottomLine = "\n└──────────────┘       ";
        int lines = 10;
        int emptyLines = (int) (((double) (MAX_COFFEE_AMOUNT - coffeeAmount) / MAX_COFFEE_AMOUNT) * lines);
        for (int i = 0; i < lines; i++) {
            if (i < emptyLines) {
                System.out.print(emptyLine);
            } else {
                System.out.print(fullLine);
            }
            switch (i) {
                case 2:
                    System.out.print("==\\\\   ");
                    break;
                case 3:
                    System.out.print("   \\\\  ");
                    break;
                case 4:
                    System.out.print("   ││  ");
                    break;
                case 5:
                    System.out.print("   ││  ");
                    break;
                case 6:
                    System.out.print("   //  ");
                    break;
                case 7:
                    System.out.print("==//   ");
                    break;
                default:
                    System.out.print("       ");
                    break;
            }
            pot.displayCoffeePot(i + 9);
        }
        System.out.print(bottomLine);
        pot.displayCoffeePot(19);
        System.out.println("\n\n");
    }

    public void drink() {
        coffeeAmount -= 10;
        displayCoffee();
    }

    public boolean isEmpty() {
        return coffeeAmount <= 0;
    }

    public void refill() {
        coffeeAmount = MAX_COFFEE_AMOUNT;
    }

    public static int getMaxCoffeeAmount() {
        return MAX_COFFEE_AMOUNT;
    }
}
