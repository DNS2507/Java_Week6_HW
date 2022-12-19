package Week6_HW;
//2.1 Declare two static variables
//2.2 Declare one static method
//2.3 Call both static variables into the static method inside the print statement.
// 2.4 Declare the Main method.
//2.5 Call the static method into the Main method and Run the programme.
public class Static_Variables {//Declare Class
    static int a=10;//Declared static variable
    static String b="Dhwanil";//Declared static variable
    Float c=10.5f;//Declared Instance variable

    static void m2(){ //Declare Static Method
        Static_Variables d=new Static_Variables();//Create an Object
        System.out.println(a);//Called out Static variable directly
        System.out.println(b);//Called out Static variable directly
        System.out.println(d.c);//Called Instance variable into Static Method

    }

    public static void main(String[] args) { //Declare Main Method
        Static_Variables s=new Static_Variables();//Create an Object
        m2();
        System.out.println(s.c-s.a);
    }



}
