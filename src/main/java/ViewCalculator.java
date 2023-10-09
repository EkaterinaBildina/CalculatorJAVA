import complexNumActivation.ComplexNumber;
import internalToDo.MethodOfCalculable;
import preView.InterfaceNewCalculate;


import java.util.Scanner;
//Горизонтальный уровень
public class ViewCalculator {

    private Scanner scanner = new Scanner(System.in);
    private final InterfaceNewCalculate newCalculator;

    public ViewCalculator(InterfaceNewCalculate newCalculator) {
        this.newCalculator = newCalculator;
    }

    public void run() {
        // Запуск калькулятора. Уровень вычислений.

        MethodOfCalculable calculator = newCalculator.create(promptComplexNum());
        // Объект Интерфейса MethodOfCalculable с именем calculator представляет собой
        // финальный объект Интерфейса InterfaceNewCalculate с именем newCalculator.

        // описание вычислительных действий в калькуляторе через while (пока вводные данные
        // соответствуют требованиям)
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
                    String cmd = prompt("Would you like to continue (Y/N)?");
                    if (cmd.equals("Y")) {
                        calculator = newCalculator.create(promptComplexNum());
                       // continue;
                    }

                    break;
            }
        }
    }


    private ComplexNumber promptComplexNum() {
        // метод ввода данных пользователем
        // вертикальный срез
        System.out.println("Please input argument: ");

        String input = scanner.nextLine();
        String[] inputStr = input.split("\\+");
        String a = inputStr[0];
        String b = inputStr[1].split("i")[0];
        ComplexNumber complexNumber = new ComplexNumber(Integer.parseInt(a), Integer.parseInt(b));

// проверка корректности введеных пользователем значений
        while (!input.matches("^\\d+\\+\\d+i$") && !input.matches("^\\d+\\-\\d+i$")) {
            System.out.print(input + " mistake of complex number input");
            System.out.println("\n Please try again to input the Complex number in a+bi or a-bi format: ");
            input = scanner.nextLine();
        }
        if (input.equals("^\\d+\\-\\d+i$")){
            inputStr = input.split("\\-");
            a = inputStr[0];
            b = inputStr[1].split("i")[0];
            complexNumber =  new ComplexNumber(Integer.parseInt(a), Integer.parseInt(b));
        }
        return complexNumber;
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
        // возвращаем введеное число с клавиатуры,
        // находим следующу строку, которую еще не считывали и выводим.
    }
}
