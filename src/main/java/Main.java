import internalToDo.Calculator;

public class Main {
    // Разработать одну или несколько программ на выбранном языке программирования,
    // демонстрирующих применение принципов SOLID.
    // Сопроводить разработку созданием UML-диаграммы,
    // которая будет отображать ключевые компоненты системы и их взаимосвязи.

    public static void main(String[] args) {
        ViewCalculator view = new ViewCalculator(Calculator::new);
        view.run();
    }
}
