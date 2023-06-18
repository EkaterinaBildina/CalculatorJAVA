package mainToDo;

import complexNumActivation.ComplexNumber;
import internalToDo.MethodOfCalculable;

public class NewCalculate implements  InterfaceNewCalculate{
    @Override
    public MethodOfCalculable create(ComplexNumber arg) {
        return new Calculator(arg);
    }
}
