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
// import java.util.Scanner;

// public class SameDigits {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt(); // Example number
// if (num >= 100 && num <= 999) {
// int hundreds = num / 100;
// int tens = (num / 10) % 10;
// int units = num % 10;
// if (hundreds == tens && tens == units || hundreds == units) {
// System.out.println("All digits are equal.");
// } else if (hundreds == tens || tens == units) {
// System.out.println(" Two Digits are Same.");
// }
// } else {
// System.out.println("Number is not a three-digit number.");
// }
// }
// }
// 7/07/2025
// switch case
// import java.util.*;

// public class firstprogram {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// switch (x) {
// case 1:
// System.out.print(50000 * 30 / 100 + 50000);
// break;
// case 2:
// System.out.print(40000 * 25 / 100 + 40000);
// break;
// case 3:
// System.out.print(30000 * 20 / 100 + 30000);
// break;
// case 4:
// System.out.print(20000 * 15 / 100 + 20000);
// break;
// }
// }
// }
// 07-07-2025//

// import java.util.Scanner;

// public class firstprogram {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String color = scanner.nextLine().trim().toLowerCase();
//         String message;

//         switch (color) {
//             case "red":
//                 message = "STOP!";
//                 break;
//             case "yellow":
//                 message = "GET READY!";
//                 break;
//             case "green":
//                 message = "GO!";
//                 break;
//             default:
//                 message = "Invalid color! Please enter Red, Yellow, or Green.";
//         }
//         System.out.println(message);
//         scanner.close();
//     }
// }
import java.util.*;

public class firstprogram {
    public static void main(String[] args) {
        int n;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}