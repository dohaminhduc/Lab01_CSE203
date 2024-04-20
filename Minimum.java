import java.util.ArrayList;
import java.util.Collections;

public class Minimum {
    private int a;
    private int b;
    private int c;

    public Minimum(){
    }
    public Minimum(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getMinimum() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        System.out.println(Collections.min(list));
    }
}
