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

    public void displayCoffeePot(int line) {
        if (line == 0) 
            System.out.print("                (");
        if (line == 1) 
            System.out.print("                 )");
        if (line == 2) 
            System.out.print("             ( (");
        if (line == 3) 
            System.out.print("              ) )");
        if (line == 4) 
            System.out.print("           ( ( (");
        if (line == 5) 
            System.out.print("             ) )");
        if (line == 6) 
            System.out.print("              (");
        if (line == 7) 
            System.out.print("                )      ");
        if (line <= 7) 
            return;

        char start_symbols[] = {'/', '/', '/', '|', '|', '|', '|', '|', '\\', '\\', '\\'};
        char end_symbols[] = {'\\', '\\', '\\', '|', '|', '|', '|', '|', '/', '/', '/'};
        int w[] = {11, 19, 23, 25, 27, 27, 27, 25, 23, 19, 11};
        int max_w = 27;
        int lines = 11;
        int emptyLines = (int) (((double) (MAX_COFFEE_AMOUNT - coffeeAmount) / MAX_COFFEE_AMOUNT) * lines);
        if (line >= 8 && line < 8 + lines)
        {
            for (int j = 0; j < (max_w - w[line - 8]) / 2; j++)
                System.out.print(' ');
            System.out.print(start_symbols[line - 8]);
            for (int j = 0; j < w[line - 8]; j++)
                System.out.print(line - 8 < emptyLines ? ' ' : '~');
            System.out.print(end_symbols[line - 8]);
            switch (line - 8) {
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
        }
        if (line == 8 + lines)
            System.out.println("            └────┘");
    }

}
