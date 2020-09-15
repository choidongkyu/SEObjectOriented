package academy.pocu.comp2500.lab2;

public class Program {
    private static final double DOUBLE_EPSILON = 0.00001;

    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(0, 0);
        ComplexNumber conjugate = num1.getConjugate(); // conjugate: 2.1 + 1.1i
        conjugate.print();
    }
}
