import java.util.ArrayList;
import java.util.Collections;

public class StringRequest {
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    private String str;
    public StringRequest(){}
    public StringRequest(String str) {
        this.str = str;
    }
    public void getLength() {
        System.out.println(str.length());
    }

    public void wordscounter(){
        int words = 0;
        for (char c : str.toCharArray()) {
            if (c != ' ') {
                words += 1;
            }
        }
        System.out.println(words);
    }

    public void Concatenate(String a) {
        System.out.println(str.concat(a));
    }

    public void Palindrome() {
        ArrayList<Character> charList = new ArrayList<>();
        for (char c : str.toCharArray()) {
            charList.add(c);
        }
        ArrayList<Character> charList2 = new ArrayList<>(charList);
        Collections.reverse(charList2);
        if(charList.equals(charList2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
