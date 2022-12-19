package Week6_HW;
//Write a Java program to compute the specified expressions
// and print the output.
// Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
public class Calculation {
    public static void main(String[] args) {
        double a=25.5d, b=3.5d, c=40.5d, d=4.5d; //Instance variable
        System.out.println((a*b-b*b)/(c-d));
    }
}
