import java.util.Scanner;

public class Main {
    
    static int findOccurrence(int[] arr, int f, int i) {
        int size = arr.length - 1;
        if (i >= size) {
        return 0;
        }
    
        if (arr[i] == f) {
            return findOccurrence(arr, f, ++i) + 1;
        }
    
        else {
            return findOccurrence(arr, f, ++i);
        }
}
    
    public static void main(String[] args) {
    
        System.out.print("Enter the number of elements in a sequence: ");
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    
        System.out.print("Enter a number which you want to find: ");
        int f = sc.nextInt();
        System.out.println(findOccurrence(arr, f, 0));
    }
}
