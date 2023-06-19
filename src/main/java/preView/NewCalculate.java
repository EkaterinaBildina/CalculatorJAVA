package preView;

import complexNumActivation.ComplexNumber;
import internalToDo.Calculator;
import internalToDo.MethodOfCalculable;

public class NewCalculate implements  InterfaceNewCalculate{

    public MethodOfCalculable create(ComplexNumber arg) {
        return new Calculator(arg);
    }
}
