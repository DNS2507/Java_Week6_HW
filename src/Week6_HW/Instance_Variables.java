package Week6_HW;
//1.1 Declare two instance variables.
//1.2 Declare one instance method.
//1.3 Call both instance variables into the instance method inside the print statement.
// 1.4 Declare the Main method.
//1.5 Call the above instance method into the Main method and Run the programme.
public class Instance_Variables { //Declare class
    int a=10, b=20; //Declare Instance variable
    int c=30, d=40;//Declare Instance variable


        void m1(){  //Declare Instance Method
            System.out.println(a); //Called out Instance variable
            System.out.println(b);//Called out Instance variable
        }
        void m2(){ //Declare Instance Method
            System.out.println(c);//Called out Instance variable
            System.out.println(d);//Called out Instance variable
        }
        public static void main(String[] args) { //Declare Main Method
        Instance_Variables v=new Instance_Variables();//Create an Object
        v.m1();//Called Instance Method
             v.m2();//Called Instance Method

    }
}
