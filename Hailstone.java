import java.util.Scanner;

public class Hailstone {
    private int num;
    public Hailstone() {}
    public Hailstone(int num) {
        this.num = num;
    }
    public void HailstoneSequence(int num) {
        while(num>1){
            if(num%2==0){
                System.out.println(num+" is even, so we take n/2: ");
                num/=2;
                System.out.println(num);
            } else {
                System.out.println(num+" is odd, so we take 3*n+1: ");
                num=3*num+1;
                System.out.println(num);
            }
        }
    }
}
