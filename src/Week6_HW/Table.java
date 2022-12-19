package Week6_HW;
//Write a Java program that takes a number as input and prints its
//multiplication table up to 10.
//Test Data: Input a number: 8
public class Table {
    int a=8; //Instance variable
    int b=1; //Instance variable
    Table(int a, int b){ //Declare two argument constructor
        this.a =a;
        this.b  =b;
        System.out.println("8*"+b +"=" +(a*b));//Concatenation
    }
    public static void main(String[] args) {
        Table c=new Table(8,1);
        Table d=new Table(8,2);
        Table e=new Table(8,3);
        Table f=new Table(8,4);
        Table g=new Table(8,5);
        Table h=new Table(8,6);
        Table i=new Table(8,7);
        Table j=new Table(8,8);
        Table k=new Table(8,9);
        Table l=new Table(8,10);

    }
}
