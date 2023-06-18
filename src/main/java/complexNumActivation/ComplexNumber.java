package complexNumActivation;

public class ComplexNumber {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%.5f + %.5fi", x, y);
    }
}
