package internalToDo;

import complexNumActivation.ComplexNumber;

//Горизонтальный уровень
public class Calculator implements MethodOfCalculable {

    private final ComplexNumber primaryArg;
    // создание Комплексного числа, которое придет от пользователя

    public Calculator(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
        // явный вызов конструктора оначального(входного) аргумента
    }





    @Override
    public void sum(ComplexNumber arg) {
        //реализация функции суммирования двух введеных комплексных чисел
        int a = primaryArg.getA() + arg.getA();
        int b = primaryArg.getB() + arg.getB();
        primaryArg.setA(a);
        primaryArg.setB(b);
    }

    @Override
    public void subtraction(ComplexNumber arg) {
        //реализация функции вычитания двух введеных комплексных чисел
        int a = primaryArg.getA() - arg.getA();
        int b = primaryArg.getB() - arg.getB();
        primaryArg.setA(a);
        primaryArg.setB(b);
    }

    @Override
    public void multiplication(ComplexNumber arg) {
        //реализация функции перемножения двух введеных комплексных чисел
        int a = primaryArg.getA() * arg.getA() - primaryArg.getB() * arg.getB();
        int b = primaryArg.getA() * arg.getB() + primaryArg.getB() * arg.getA();
        primaryArg.setA(a);
        primaryArg.setB(b);

    }

    @Override
    public void division(ComplexNumber arg) {
        //реализация функции деления двух введеных комплексных чисел
        int a = (int) (primaryArg.getA() * arg.getA() + primaryArg.getB() * arg.getB()
                                        / (Math.pow(arg.getA(),2)  + Math.pow(arg.getB(),2)));
        int b = (int) ((arg.getA() * primaryArg.getB() - primaryArg.getA() * arg.getB() )
                                / (Math.pow(arg.getA(),2)  + Math.pow(arg.getB(),2)));
        primaryArg.setA(a);
        primaryArg.setB(b);
    }

    @Override
    public ComplexNumber getResult() {
        return primaryArg;
    }

}
