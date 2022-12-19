package Week6_HW;
//Write a program to convert the upper case to lower case.


public class Uppercase {
    String name ="JAVA IS SIMPLE"; //Instance variable
    String name1 ="Dont make it hard"; //Instance variable

    public static void main(String[] args) {
        Uppercase u=new Uppercase(); //Create Object
        System.out.println(u.name.toLowerCase()); //String method
        System.out.println(u.name1.toUpperCase()); //String method
    }
}
