package Week6_HW;
//Write a program for a calculator with addition, subtraction, multiplication
//and division methods all with parameters and use string concatenation
//methods.(Note: Two static and Two instance methods.)
public class Calculator {

    void addition(){ //No return type with no parameters, Instance method
        int a=10, b=20; //Declare Instance Variable
        System.out.println("Addition is " +(a+b));
    }
    void subtraction(int c, int d){  //No return type with parameters, Instance method
        System.out.println("Subtraction is " +(c-d));
    }

    static int multiplication(){  //Return type with no parameters, Static method
        int e=10, f=20; //Declare Instance variable
        int result= e*f;
        System.out.println("Multiplication is " +result);
        return result;
    }
    static int division(int g, int h){ //Return type with parameters, Static method
        int i=g/h;
        System.out.println("Division is " +i);
        return i;
    }

    public static void main(String[] args) { //Main method
        Calculator x=new Calculator();// create object
        x.addition(); //Called out Instance method
        x.subtraction(100, 50);//Called out Instance method
        multiplication();//Called out static method
        division(100, 10);////Called out static method
    }

}
