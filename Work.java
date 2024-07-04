import java.util.Scanner;

public class Work {
    private Scanner scanner;

    public Work() {
        this.scanner = new Scanner(System.in);
    }

    public void execute() {
        try {
            while (true) {
                String input = scanner.nextLine();
                if (input.equals("")) {
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}