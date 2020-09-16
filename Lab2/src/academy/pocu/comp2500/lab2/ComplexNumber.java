package academy.pocu.comp2500.lab2;

public class ComplexNumber {
    public final double real;
    public final double imaginary;


    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public ComplexNumber(double real) {
        this.real = real;
        this.imaginary = 0.0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public boolean isReal() {
        if (imaginary != 0.0) {
            return false;
        }
        return true;
    }

    public boolean isImaginary() {
        if (real != 0.0 || imaginary == 0.0) {
            return false;
        }
        return true;
    }

    public ComplexNumber getConjugate() {
        return new ComplexNumber(real, -imaginary);
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(real - other.real, imaginary - other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber((real * other.real) - (imaginary * other.imaginary),
                (real * other.imaginary) + (imaginary * other.real));
    }

    public ComplexNumber divide(ComplexNumber other) {
        double i = Math.pow(other.real, 2) + Math.pow(other.imaginary, 2);
        double realnumber = ((real * other.real) + (imaginary * other.imaginary)) / i;
        double imaginarynumber = ((imaginary * other.real) - (real * other.imaginary)) / i;
        return new ComplexNumber(realnumber, imaginarynumber);
    }

    public void print() {
        System.out.println(real + " + " + imaginary + "i");
    }
}
