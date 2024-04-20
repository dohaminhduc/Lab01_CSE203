import java.util.Scanner;

public class EvenSum {
    private int[] a;
    public EvenSum() {
    }
    public EvenSum(int[] a) {
        this.a = a;
    }
    public int getSumEven(int[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to add:  ");
        int n = sc.nextInt();
        a= new int[n];
        int sum = 0;
        System.out.println("Enter the numbers in the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        return sum;
    }
}










