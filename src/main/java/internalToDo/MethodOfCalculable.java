package internalToDo;

public interface MethodOfCalculable {
    MethodOfCalculable sum(ComplexNumber arg);
    MethodOfCalculable subtraction(ComplexNumber arg);

    MethodOfCalculable multiplication(ComplexNumber arg);

    ComplexNumber getResult();
}
