package internalToDo;

import complexNumActivation.ComplexNumber;

public class Calculator implements MethodOfCalculable {

    public Calculator(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }

    private final ComplexNumber primaryArg;



    @Override
    public void sum(ComplexNumber arg) {
        int a = primaryArg.getA() + arg.getA();
        int b = primaryArg.getB() + arg.getB();
        primaryArg.setA(a);
        primaryArg.setB(b);
    }

    @Override
    public void subtraction(ComplexNumber arg) {
        int a = primaryArg.getA() - arg.getA();
        int b = primaryArg.getB() - arg.getB();
        primaryArg.setA(a);
        primaryArg.setB(b);
    }

    @Override
    public void multiplication(ComplexNumber arg) {
        int a = primaryArg.getA() * arg.getA() - primaryArg.getB() * arg.getB();
        int b = primaryArg.getA() * arg.getB() + primaryArg.getB() * arg.getA();
        primaryArg.setA(a);
        primaryArg.setB(b);

    }

    @Override
    public void division(ComplexNumber arg) {
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
