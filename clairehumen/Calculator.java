package clairehumen;

public class Calculator {
    public static void main(String[] args) {
        Integer a = 4;
        Integer b = 123456789;
        Double c = new Double(a);
        Double d = new Double(b);
        Integer sum = addTwoIntegers(a,b);
        System.out.println(sum);
        Integer difference = subtractTwoIntegers(a, b);
        System.out.println(difference);
        Integer product = multiplyTwoIntegers(a, b);
        System.out.println(product);
        Double quotient = divideTwoIntegers(c, d);
        System.out.println(quotient);}

    public static Integer addTwoIntegers(Integer a, Integer b) {
        Integer sum = a + b;
        return sum;
    }

    public static Integer subtractTwoIntegers(Integer a, Integer b) {
        Integer difference = a - b;
        return difference;
    }
    public static Integer multiplyTwoIntegers(Integer a, Integer b) {
        Integer product = a * b;
        return product;
    }
    public static Double divideTwoIntegers(Double a, Double b) {
        Double quotient = a / b;
        return quotient;
    }
}