package Week6_HW;
//4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.
public class Four {
    int a=10;//Declare Instance variable
    String name ="Dhwanil";//Declare Instance variable
    static int b=20;//Declare Static variable
    static Float c=50.50f;//Declare Static variable

    void m1(){ //Declare Instance method

        System.out.println(a);//Called out Instance variable
        System.out.println(name); //Called out Instance variable
        System.out.println(b);//Called out static variable into Instance method
        System.out.println(c);//Called out static variable into Instance method
    }
    static void m2(){  //Declare Static method
        Four y=new Four();  //Create an object
        System.out.println(y.a); //Called out Instance variable in Static method using Object
        System.out.println(y.name); //Called out Instance variable in Static method using Object
        System.out.println(c); //Called out static variable directly
        System.out.println(b); //Called out static variable directly
    }

    public static void main(String[] args) {  //Declare Main Method
        Four z=new Four(); //Create an Object
        z.m1(); //Called out Instance method using object
        m2(); //Called out Static method
        System.out.println(z.name);
        System.out.println(z.a);
        System.out.println(b);
        System.out.println(c);
    }
}
