import complexNumActivation.ComplexNumber;
import internalToDo.MethodOfCalculable;

import java.util.Scanner;

public class ViewCalculator {


    private MethodOfCalculable newCalculator;
    private Scanner scanner = new Scanner(System.in);

    public ViewCalculator() {
        this.newCalculator = newCalculator;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }



    public void run() {

        MethodOfCalculable calculator = newCalculator.create(promptComplexNum());

        while (true) {
            System.out.print("Available operations ( +, -, *, /, =) : ");
            String input = scanner.nextLine().toLowerCase();
            switch (input) {
                case "+":
                    newCalculator.sum(promptComplexNum());
                    break;
                case "-":
                    newCalculator.subtraction(promptComplexNum());
                    break;
                case "*":
                    newCalculator.multiplication(promptComplexNum());
                    break;
                case "/":
                    newCalculator.division(promptComplexNum());
                    break;
                case "=":
                    System.out.println("Result: " + calculator.getResult());
                    break;
            }
            String cmd = prompt("Need to continue (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;

        }
    }
    private ComplexNumber promptComplexNum() {
        System.out.println("Please input argument: ");
        String input = scanner.nextLine();
        while (!input.matches("^\\d+\\+\\d+i$")) {
            System.out.print(input + " mistake of complex number input");
            System.out.println("\n Please input argument: ");
            input = scanner.nextLine();
        }
        String[] arrayStr = input.split("\\+");
        String x = arrayStr[0];
        String y = arrayStr[1].split("i")[0];
        return new ComplexNumber(Integer.parseInt(x), Integer.parseInt(y));
    }
}
