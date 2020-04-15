import java.util.*;
public class Customer{
    public static void main(String[] args){
        String name,gender,hail;
        int age;
   
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name:");
    name=sc.nextLine();
    System.out.println("Enter age:");
    age=sc.nextInt();
    System.out.println("Enter gender:");
    gender=sc.next();
    sc.nextLine();
    System.out.println("Hailing from:");
    hail=sc.nextLine();
    System.out.println("Welcome, "+name+"!");
    System.out.println("Age:"+age);
    System.out.println("Gender:"+gender);
    System.out.println("City:"+hail);
}
}