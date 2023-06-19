import complexNumActivation.ComplexNumber;
import internalToDo.MethodOfCalculable;
import preView.InterfaceNewCalculate;


import java.util.Scanner;

public class ViewCalculator {

    private Scanner scanner = new Scanner(System.in);
    private final InterfaceNewCalculate newCalculator;

    public ViewCalculator(InterfaceNewCalculate newCalculator) {
        this.newCalculator = newCalculator;
    }

    public void run() {

        MethodOfCalculable calculator = newCalculator.create(promptComplexNum());

        while (true) {
            System.out.print("Please input from Available operations ( +, -, *, /, =) : ");
            String input = scanner.nextLine().toLowerCase();
            switch (input) {
                case "+":
                    calculator.sum(promptComplexNum());
                    break;
                case "-":
                    calculator.subtraction(promptComplexNum());
                    break;
                case "*":
                    calculator.multiplication(promptComplexNum());
                    break;
                case "/":
                    calculator.division(promptComplexNum());
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
        System.out.println("Please input argument: ");
        String input = scanner.nextLine();
        String[] inputStr;
        String a;
        String b;

        while (!input.matches("^\\d+\\+\\d+i$") && !input.matches("^\\d+\\-\\d+i$")) {
            System.out.print(input + " mistake of complex number input");
            System.out.println("\n Please try again to input the Complex number in a+bi or a-bi format: ");
            input = scanner.nextLine();
        }
        if (input.equals("^\\d+\\+\\d+i$")) {
            inputStr = input.split("\\+");
            a = inputStr[0];
            b = inputStr[1].split("i")[0];

        }
        if (input.equals("^\\d+\\-\\d+i$")) {
            inputStr = input.split("\\-");
            a = inputStr[0];
            b = inputStr[1].split("i")[0];
        }
        return new ComplexNumber(Integer.parseInt(a), Integer.parseInt(b));
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
