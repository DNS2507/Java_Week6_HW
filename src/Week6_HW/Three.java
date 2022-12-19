package Week6_HW;
//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//3.4 Call both instance and static variables into both instance and static methods inside the print statement.
//3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme.
public class Three {
    int a=10;//Declare Instance variable
    static int b=20;//Declare Static variable

    void m1(){ //Declare Instance method

        System.out.println(a);//Called out Instance variable
        System.out.println(b);//Called out static variable into Instance method
    }
    static void m2(){  //Declare Static method
        Three y=new Three();  //Create an object
        System.out.println(y.a); //Called out Instance variable in Static method using Object
        System.out.println(b); //Called out static variable directly
    }

    public static void main(String[] args) {  //Declare Main Method
        Three z=new Three(); //Create an Object
        m2(); //Called out static method directly
        z.m1(); //Called out Instance method using Object
        System.out.println(b-z.a);
    }
}
