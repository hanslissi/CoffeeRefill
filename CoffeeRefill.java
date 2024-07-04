import java.util.Scanner;

public class CoffeeRefill {
    private boolean working;
    private Coffee coffee;
    private CoffeePot coffeePot;
    private Work work;

    public CoffeeRefill() {
        this.working = false;
        this.coffee = new Coffee();
        this.coffeePot = new CoffeePot();
        this.work = new Work();
    }

    public void startWorking() {
        working = true;
        while (working) {
            coffee.drink();
            work.execute();
            if (coffee.isEmpty()) {
                if (coffeePot.isEmpty()) {
                    coffeePot.refill();
                }
                coffeePot.pour(coffee);
            }
        }
    }

    public static void main(String[] args) {
        String coffeeBanner = ""
                + "─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────\n"
                + "\n"
                + " ██████  ██████  ███████ ███████ ███████ ███████     ██     ██  ██████  ██████  ██   ██     ██████   █████  ██    ██ \n"
                + "██      ██    ██ ██      ██      ██      ██          ██     ██ ██    ██ ██   ██ ██  ██      ██   ██ ██   ██  ██  ██  \n"
                + "██      ██    ██ █████   █████   █████   █████       ██  █  ██ ██    ██ ██████  █████       ██   ██ ███████   ████   \n"
                + "██      ██    ██ ██      ██      ██      ██          ██ ███ ██ ██    ██ ██   ██ ██  ██      ██   ██ ██   ██    ██    \n"
                + " ██████  ██████  ██      ██      ███████ ███████      ███ ███   ██████  ██   ██ ██   ██     ██████  ██   ██    ██    \n"
                + "\n"
                + "─────────────────────────────────────────── PRESS ENTER TO WORK ─────────────────────────────────────────────────────\n";
        System.out.println(coffeeBanner);
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.nextLine();
            CoffeeRefill coffeeRefill = new CoffeeRefill();
            coffeeRefill.startWorking();
        }
    }
}