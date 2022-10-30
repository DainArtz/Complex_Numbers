import java.lang.Math;
public class ComplexNumber {
    private double real, imaginary;
//    Class Constructors
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumber(double real) {
        this(real, 0);
    }
    public ComplexNumber() {
        this(0, 0);
    }
//    Class Getters
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }
//    Class Setters
    public void setReal(double real) {
        this.real = real;
    }
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
//    Class Methods
    //addition
    public ComplexNumber add(ComplexNumber number) {
        ComplexNumber result = new ComplexNumber();
        result.setReal(this.real+number.getReal());
        result.setImaginary(this.imaginary+number.getImaginary());
        return result;
    }
    public ComplexNumber add(double real) {
        ComplexNumber number = new ComplexNumber(real);
        return add(number);
    }
    public ComplexNumber add(double real, double imaginary) {
        ComplexNumber number = new ComplexNumber(real, imaginary);
        return add(number);
    }
    //subtraction
    public ComplexNumber subtract(ComplexNumber number) {
        ComplexNumber result = new ComplexNumber();
        result.setReal(this.real-number.getReal());
        result.setImaginary(this.imaginary-number.getImaginary());
        return result;
    }
    public ComplexNumber subtract(double real) {
        ComplexNumber number = new ComplexNumber(real);
        return subtract(number);
    }
    public ComplexNumber subtract(double real, double imaginary) {
        ComplexNumber number = new ComplexNumber(real, imaginary);
        return subtract(number);
    }
    //multiplication
    public ComplexNumber multiply(ComplexNumber number) {
        ComplexNumber result = new ComplexNumber();
        result.setReal(this.real * number.real - this.imaginary * number.imaginary);
        result.setImaginary(this.real * number.imaginary + this.imaginary * number.real);
        return result;
    }
    public ComplexNumber multiply(double real) {
        ComplexNumber number = new ComplexNumber(real);
        return multiply(number);
    }
    public ComplexNumber multiply(double real, double imaginary) {
        ComplexNumber number = new ComplexNumber(real, imaginary);
        return multiply(number);
    }
    //division
    public ComplexNumber divide(ComplexNumber number) {
        if (number.real == 0 && number.imaginary == 0) {
            throw new Error("Can't divide by 0");
        }
        ComplexNumber result = new ComplexNumber();
        result.setReal((this.real * number.real + this.imaginary * number.imaginary) / (number.real * number.real + number.imaginary * number.imaginary));
        result.setImaginary((number.real * this.imaginary - this.real * number.imaginary) / (number.real * number.real + number.imaginary * number.imaginary));
        return result;
    }
    public ComplexNumber divide(double real) {
        ComplexNumber number = new ComplexNumber(real);
        return divide(number);
    }
    public ComplexNumber divide(double real, double imaginary) {
        ComplexNumber number = new ComplexNumber(real, imaginary);
        return divide(number);
    }
    //modulus
    public double mod() {
        return Math.sqrt(this.real * this.real + this.imaginary * this.imaginary);
    }
    //argument
    public double arg() {
        if (this.real>0 && this.imaginary>=0) {
            return Math.atan(this.imaginary/this.real);
        } else if (this.real<0 && this.imaginary>0) {
            return Math.PI - Math.atan(Math.abs(this.imaginary/this.real));
        } else if (this.real<0 && this.imaginary<0) {
            return Math.PI + Math.atan(Math.abs(this.imaginary/this.real));
        } else if (this.real>0 && this.imaginary<0) {
            return 2*Math.PI - Math.atan(Math.abs(this.imaginary/this.real));
        } else if (this.real==0 && this.imaginary>0) {
            return Math.PI / 2;
        } else {
            return (3 * Math.PI) / 2;
        }
    }
    //trigonometric form
    public String trigForm() {
        return "z = " + this.mod() + " * (cos " + this.arg() + " + i * sin " + this.arg() + ")";
    }
}
