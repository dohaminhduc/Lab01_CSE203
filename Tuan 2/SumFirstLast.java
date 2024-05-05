import java.util.Scanner;

public class SumFirstLast {
    private long number;
    public SumFirstLast() {}
    public SumFirstLast(long number) {
        this.number = number;
    }
    public long SumFirstLastDigit() {
        int LastDigit =(int) number%10;
        int FirstDigit =(int) number;
        while (FirstDigit >= 10)
            FirstDigit /= 10;
        return LastDigit+FirstDigit;
    }
}
