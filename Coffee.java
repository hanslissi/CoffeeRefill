public class Coffee {
    private int coffeeAmount;
    private static int MAX_COFFEE_AMOUNT = 100;

    public Coffee() {
        this.coffeeAmount = MAX_COFFEE_AMOUNT;
    }

    public void displayCoffee() {
        String steam = "  "
                + "         (\n"
                + "          )\n"
                + "      ( (\n"
                + "       ) )\n"
                + "    ( ( (\n"
                + "      ) )\n"
                + "       (\n"
                + "_        )     _";

        String emptyLine = "│              │";
        String fullLine = "│~~~~~~~~~~~~~~│";
        String bottomLine = "└──────────────┘";
        int lines = 10;
        int emptyLines = (int) (((double) (MAX_COFFEE_AMOUNT - coffeeAmount) / MAX_COFFEE_AMOUNT) * lines);
        System.out.println(steam);
        for (int i = 0; i < lines; i++) {
            if (i < emptyLines) {
                System.out.print(emptyLine);
            } else {
                System.out.print(fullLine);
            }
            switch (i) {
                case 2:
                    System.out.print("==\\\\");
                    break;
                case 3:
                    System.out.print("   \\\\");
                    break;
                case 4:
                    System.out.print("   ││");
                    break;
                case 5:
                    System.out.print("   ││");
                    break;
                case 6:
                    System.out.print("   //");
                    break;
                case 7:
                    System.out.print("==//");
                    break;
            }
            System.out.println();

        }
        System.out.println(bottomLine + "\n\n");
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
