package complexNumActivation;

public class ComplexNumber {

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    public ComplexNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return String.format("%d + %di", a, b);
    }
}
