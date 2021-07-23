public class Complex {

    public static int counter = 0;

    private int a, b;

    Complex(){
        counter++;
    }
    Complex (int a, int b){
        this.a = a;
        this.b = b;
        counter++;
    }
    void getSum(Complex c) {
        int resultA = a + c.a;
        int resultB = b + c.b;
        System.out.println("Sum = " + resultA + " + " + resultB + "i");
    }
    void getSub(Complex c) {
        int resultA = a - c.a;
        int resultB = b - c.b;
        System.out.println("Subtraction = " + resultA + " + " + resultB + "i");
    }
    void getMult (Complex c) {
        int resultA = a * c.a - b * c.b;
        int resultB = a * c.b + b * c.a;
        System.out.println("Product = " + resultA + " + " + resultB + "i");
    }
    void getDiv (Complex c) {
        int resultA1 = (a * c.a + b * c.b);
        int resultA2 = (c.a * c.a + c.b * c.b);
        int resultB1 = (c.a * b - a * c.b);
        int resultB2 = (c.a * c.a + c.b * c.b);
        System.out.println("Quotient = " + resultA1 + "/" + resultA2 + " + " + resultB1 + "/" + resultB2 + "i");
    }
    void getComplexNumber(Complex c){
        System.out.println("Complex number is " + c.a + " + " + c.b + "i");
    }
    void setComplexNumber(int a, int b){
        this.a = a;
        this.b = b;
    }
}
class ComplexTest{
    public static void main(String[] args) {
        Complex c1 = new Complex(-2, 1);
        Complex c2 = new Complex(1, -1);
        c1.getSum(c2);
        c1.getSub(c2);
        c1.getMult(c2);
        c1.getDiv(c2);
        c1.getComplexNumber(c1);
        Complex c3 = new Complex();
        c3.setComplexNumber(8, 4);
        c1.getComplexNumber(c3);
        System.out.println("Number of created complex numbers is " + Complex.counter);
    }
}