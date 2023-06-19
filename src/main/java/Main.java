import internalToDo.Calculator;

public class Main {
    public static void main(String[] args) {
        ViewCalculator view = new ViewCalculator(Calculator::new);
        view.run();
    }
}
