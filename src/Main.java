public class Main {
    public static void main(String[] args) {
        ComplexNumber firstNumber = new ComplexNumber(1, 2);
        ComplexNumber secondNumber = new ComplexNumber(3, 4);
        ComplexNumber thirdNumber = new ComplexNumber();
        thirdNumber = firstNumber.add(secondNumber);
        System.out.println(thirdNumber.getReal());
        System.out.println(thirdNumber.getImaginary());
        thirdNumber = firstNumber.subtract(secondNumber);
        System.out.println(thirdNumber.getReal());
        System.out.println(thirdNumber.getImaginary());
        thirdNumber = firstNumber.multiply(secondNumber);
        System.out.println(thirdNumber.getReal());
        System.out.println(thirdNumber.getImaginary());
        thirdNumber = firstNumber.divide(secondNumber);
        System.out.println(thirdNumber.getReal());
        System.out.println(thirdNumber.getImaginary());
        System.out.println(thirdNumber.mod());
        thirdNumber.setReal(1);
        thirdNumber.setImaginary(1);
        System.out.println(thirdNumber.arg());
        System.out.println(thirdNumber.trigForm());
        thirdNumber.setReal(Math.sqrt(2));
        thirdNumber.setImaginary(0);
        System.out.println(thirdNumber.trigForm());
    }
}