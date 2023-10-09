package complexNumActivation;

// Горизонтальные уровни архитектуры
public class ComplexNumber {

    // базовый класс для Комплексных чисел
    private int a;
    private int b;

    public int getA() {
        // чтение ввода пользователя, возвращает значение числа a
        return a;
    }

    public void setA(int a) {
        // изменяет (устанавливает)значение числа a
        this.a = a;
    }

    public int getB() {
        // чтение ввода пользователя, возвращает значение числа b
        return b;
    }

    public void setB(int b) {
        // изменяет (устанавливает)значение числа b
        this.b = b;
    }


    public ComplexNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        // вывод комплексных чисел
        return String.format("%d + %di", a, b);
    }
}
