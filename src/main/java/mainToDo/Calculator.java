package mainToDo;

import complexNumActivation.ComplexNumber;
import internalToDo.MethodOfCalculable;

public class Calculator implements MethodOfCalculable {

    public Calculator(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }

    private ComplexNumber primaryArg;



    @Override
    public void sum(ComplexNumber arg) {
        int x = (int) (primaryArg.getX() + arg.getX());
        int y = (int) (primaryArg.getY() + arg.getY());
        primaryArg.setX(x);
        primaryArg.setY(y);
    }

    @Override
    public void subtraction(ComplexNumber arg) {
        int x = (int) (primaryArg.getX() - arg.getX());
        int y = (int) (primaryArg.getY() - arg.getY());
        primaryArg.setX(x);
        primaryArg.setY(y);
    }

    @Override
    public void multiplication(ComplexNumber arg) {
        int x = (int) (primaryArg.getX() * arg.getX() - primaryArg.getY() * arg.getY());
        int y = (int) (primaryArg.getX() * arg.getY() + primaryArg.getY() * arg.getX());
        primaryArg.setX(x);
        primaryArg.setY(y);

    }

    @Override
    public void division(ComplexNumber arg) {
        int x = (int) ((int) (primaryArg.getX() * arg.getX() + primaryArg.getY() * arg.getY())
                                / (Math.pow(arg.getX(),2)  + Math.pow(arg.getY(),2)));
        int y = (int) ((int)(arg.getX() * primaryArg.getY() - primaryArg.getX() * arg.getY() )
                                / (Math.pow(arg.getX(),2)  + Math.pow(arg.getY(),2)));
        primaryArg.setX(x);
        primaryArg.setY(y);
    }

    @Override
    public ComplexNumber getResult() {
        return primaryArg;
    }
}
