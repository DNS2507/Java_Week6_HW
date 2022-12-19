package Week6_HW;
//Write a program to enter any radius value of the circle and find out the
//area.(Formula of Area A=PI*r*r).
public class Circle {
;


    public void multiplication(){ //Instance method
        float pi=3.14f; //Instance variable
        int r=5; //Instance variable
        float A = pi*r*r;  //Instance variable
        System.out.println("Radious of Circle is " +A);

    }
    public static void main(String[] args) {
        Circle c=new Circle(); //Create object
        c.multiplication(); //Called out Instance method
    }


}
