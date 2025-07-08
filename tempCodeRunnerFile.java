import java.util.Scanner;

public class firstprogram {
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter first number: ");
System.out.println("Enter second number : ");
System.out.println("Enter third number : ");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

if(a==b && b==c){
System.out.println("three of them are same");
}
else if(a==b && b!=c){
System.out.println("2 are same and 1 is different");
}
else {
System.out.println("3 are different");
}
}
}