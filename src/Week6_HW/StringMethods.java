package Week6_HW;

public class StringMethods {
    public static void main(String[] args) {
        String name= "Dhwanil", name1="Shah"; //Instance Variable
        System.out.println(name.length()); //String Method
        System.out.println(name.charAt(5));//String Method
        System.out.println(name.concat(name1));//String Method
        System.out.println(name.contains(name));//String Method
        System.out.println(name.startsWith(name));//String Method
        System.out.println(name1.endsWith(name));//String Method
        System.out.println(name.equals(name1));//String Method
        System.out.println(name.indexOf(5));//String Method
        System.out.println(name.isEmpty());//String Method
        System.out.println(name.replace(name,name1));//String Method
        System.out.println(name.substring(3));//String Method
        System.out.println(name.toCharArray());//String Method
        System.out.println(name.toLowerCase());//String Method
        System.out.println(name1.toUpperCase());//String Method
        System.out.println(name.trim());//String Method
        System.out.println(name);//String Method


    }
}
