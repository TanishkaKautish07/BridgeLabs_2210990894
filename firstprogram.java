// import java.util.Scanner;

// public class firstprogram {
// public static void main(String[] args) {
// System.out.println("Hello World");
// System.out.println(args[0]);
// }
// }

// public class firstprogram {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter value of a: ");
// int a = sc.nextInt();

// System.out.print("Enter value of b: ");
// int b = sc.nextInt();

// int sum = a + b;
// System.out.println("Addition of a is " + a + " and b is " + b + " → result is
// " + sum);

// int diff = a - b;
// System.out.println("Subtraction of a is " + a + " and b is " + b + " → result
// is " + diff);

// int prod = a * b;
// System.out.println("Multiplication of a is " + a + " and b is " + b + " →
// result is " + prod);

// if (b != 0) {
// int div = a / b;
// System.out.println("Division of a is " + a + " and b is " + b + " → result is
// " + div);
// } else {
// System.out.println("Division not possible as b is 0");
// }

// if (b != 0) {
// int mod = a % b;
// System.out.println("Modulo (a % b) of a is " + a + " and b is " + b + " →
// result is " + mod);
// } else {
// System.out.println("Modulo not possible as b is 0");
// }

// int aPostInc = a++;
// int bPostDec = b--;

// System.out.println("Post-increment of a (original a was " + aPostInc + ") →
// new value is " + a);
// System.out.println("Post-decrement of b (original b was " + bPostDec + ") →
// new value is " + b);

// sc.close();
// }
// }
//
// 04-07-2025 //
// import java.util.Scanner;

// public class AgeGroupClassifier {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// // Input age
// System.out.print("Enter your age: ");
// int age = scanner.nextInt();

// // Classify age group
// if (age >= 0 && age < 13) {
// System.out.println("Child");
// } else if (age >= 13 && age < 18) {
// System.out.println("Teenager");
// } else if (age >= 18 && age <= 30) {
// System.out.println("Adult");
// } else if (age > 30) {
// System.out.println("Old");
// } else {
// System.out.println("Invalid age");
// }

// scanner.close();
// }
// }
// import java.util.Scanner;

// public class EvenandOdd {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int number = sc.nextInt();
// if (number % 2 == 0) {
// System.out.println(number + " is Even.");
// } else {
// System.out.println(number + " is Odd.");
// }
// }
// }

// import java.util.Scanner;

// public class PrimeNumber {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number u want to check");
// int number = sc.nextInt();
// int count = 0;
// for (int i = 1; i <= number; i++) {
// if (number % i == 0) {
// count++;
// }
// }
// if (count == 2) {
// System.out.println(number + " is a Prime number.");
// } else {
// System.out.println(number + " is Not a prime number,");
// }
// }
// }