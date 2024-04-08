import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Create Scanner
        System.out.print("Enter num of the task: ");
        int task = sc.nextInt();

        switch (task) {
            case 1:
                task1(); //Start task1
                break;
            case 2:
                task2(); //Start task2
                break;
            case 3:
                task3(); //Start task3
                break;
            case 4:
                task4(); //Start task4
                break;
            case 5:
                task5(); //Start task5
                break;
            case 6:
                task6(); //Start task6
                break;
            case 7:
                task7(); //Start task7
                break;
            case 8:
                task8(); //Start task8
                break;
            case 9:
                task9(); //Start task9
                break;
            case 10:
                task10(); //Start task10
                break;
        }



    }


    //Task1
    public static void task1() {

        Scanner sc = new Scanner(System.in); //Create Scanner
        int n = sc.nextInt();
        int[] k = new int[n];
        int min = Integer.MAX_VALUE; //initialize min as the largest number

        for (int i = 0; i < n; i++) { //Loop for adding and checking every element in the array at the same time
            k[i] = sc.nextInt(); //Add
            if (k[i] < min) { //Check
                min = k[i];
            }
        }
        System.out.println(min); //Output
    }


    //Task2
    public static void task2() {
        Scanner sc = new Scanner(System.in); //Create Scanner
        int n = sc.nextInt();
        int[] k = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++) { //Add elements and summarize them into sum
            k[i] = sc.nextInt();
            sum += k[i];
        }

        double avg = (sum+0.0)/n; //sum is integer, so I added +0.0 to convert it to double
        System.out.println(avg); //Output
    }


    //Task3
    public static void task3() {
        Scanner sc = new Scanner(System.in); //Create Scanner
        int n = sc.nextInt();
        boolean isPrime = true; //Start with isPrime as true

        for(int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) { //Stop the loop if there are is no remainder
                isPrime = false;
                break;
            } //If loop is finished, isPrime is still true
        }

        if (isPrime) {
            System.out.println("Prime"); //Output
        } else System.out.println("Composite"); //Output
    }


    //Task4
    static int fact(int n) {
        if (n == 0 || n == 1) { //0! and 1! = 1
            return 1; }
        else
            return n*fact(n-1); //Factorial of any number N equals to N * (N-1)!
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in); //Create Scanner
        int n = sc.nextInt();

        System.out.println(fact(n)); //Output our function
    }


    //Task5
    static int fib(int n) {
        if (n == 1 || n == 2) { //Fibonacci series start with two 1's
            return 1; }
        else
            return fib(n-1) + fib(n-2); //N number of Fibonacci series equal to sum of two previous numbers
    }

    public static void task5() {
        Scanner sc = new Scanner(System.in); //Create Scanner
        int n = sc.nextInt();

        System.out.println(fib(n)); //Output our function
    }


    //Task6
    static int power(int a, int n, int k) {
        if (k == 0)
            return a;
        else return a*power(a,n,k-1); //n powers k is equal to n * n powers k-1
    }

    public static void task6() {
        Scanner sc = new Scanner(System.in); //Create Scanner
        int a = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(power(a, n, n-1)); //Output our function
    }


    //Task 7
    static void reverse(int[] k, int i, int n) {
        if (i < n) { //Base case
            int temp = k[i]; //We are changing two elements in array with "mirrored" position
            k[i] = k[n];     //For example: first element and last element replaces each other
            k[n] = temp;     //1 2 3 4 5 -> 5 2 3 4 1 (after 1st iteration)
            reverse(k, i + 1, n - 1); //Now we are replacing the next elements (2 and n-1; 3 and n-2 and so on)
        }
    }

    public static void task7() {
        Scanner sc = new Scanner(System.in); //Create Scanner
        int n = sc.nextInt();
        int[] k = new int[n];

        for(int i = 0; i < n; i++) { //Initialize the array
            k[i] = sc.nextInt();
        }

        reverse(k, 0, n-1); //Call recursive function
        for(int i = 0; i < n; i++)
            System.out.print(k[i] + " "); //Output
    }


    //Task8
    static boolean checkDigits(String k, int i, int n) {
        if (i<n) {
            if (Character.isDigit(k.charAt(i))) //We are using isDigit to determine if letter is a digit
                return checkDigits(k, i + 1, n); //If it is, we are checking the next letter
            else
                return false; //If it is not, return false
        }
        return true; //If there is no more letters, return true
    }

    public static void task8() {
        Scanner sc = new Scanner(System.in); //Create Scanner
        String k = sc.nextLine();

        System.out.println(checkDigits(k, 0, k.length()-1)); //Output our function
    }


    //Task9
    static int bincoef(int k, int n) {
        if (k == 0 || k == n) { //C(n, 0) and C(n, n) = 1 (For example,
            return 1;           //we can take all apples and no apples only in 1 way)
        }
        return bincoef(k-1,n-1) + bincoef(k, n-1); //According to the given formula
    }

    public static void task9() {
        Scanner sc = new Scanner(System.in); //Create Scanner
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(bincoef(k,n)); //Output our function
    }


    //Task 10
    static int gcd(int a, int b) {
        if (b==0) //If there is no remainder, we found GCD of two numbers
            return a;
        else
            return gcd(b, a % b); //any number a is equal to n (some integer)*b + a % b
            //And according to Euclidean Algorithm, the next our step would be finding
            //the value of b through n (some integer) * (a%b) (previous remainder) + (b % (a%b)) (new remainder)
    }

    public static void task10() {
        Scanner sc = new Scanner(System.in); //Create Scanner
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a,b)); //Output our function
    }


}