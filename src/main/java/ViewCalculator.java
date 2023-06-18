import complexNumActivation.ComplexNumber;
import internalToDo.MethodOfCalculable;

import java.util.Scanner;

public class ViewCalculator {


    public ViewCalculator() {
        this.newCalculator = newCalculator;

    }

    private MethodOfCalculable newCalculator;
    private Scanner scanner = new Scanner(System.in);



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
            String cmd = prompt("Would you like to continue (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;

        }
    }


    private ComplexNumber promptComplexNum() {
        String input = getString();
        while (!input.matches("^\\d+\\+\\d+i$")) {
            System.out.print(input + " mistake of complex number input");
            getString();
        }
        String[] arrayStr = input.split("\\+");
        String a = arrayStr[0];
        String b = arrayStr[1].split("i")[0];
        return new ComplexNumber(Integer.parseInt(a), Integer.parseInt(b));
    }

    private String getString() {
        System.out.println("\n Please input argument: ");
        String input = scanner.nextLine();
        return input;
    }
}
