import java.util.*;

public class ArrayRequest {
    private static Scanner sc = new Scanner(System.in);
    private final ArrayList<Integer> list;

    public ArrayList<Integer> getList() {
        return list;
    }

    public ArrayRequest(){
        this.list = new ArrayList<>();
    }

    public ArrayRequest(ArrayList<Integer> list) {
        this.list = list;
    }

    public void InputList() {
        System.out.println("Enter number of elements of the list: ");
        int num = sc.nextInt();
        System.out.println("Enter elements of the list: ");
        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }
    }
    public void DeleFirst(int a) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == a) {
                list.remove(i);
                break;
            }
        }
    }
    public void replace(int pos, int num) {
        list.remove(list.size()-1);
        list.add(pos, num);
    }
        public void duplicateFinder() {
            HashSet<Integer> seen = new HashSet<>();
            HashSet<Integer> duplication = new HashSet<>();

            for (Integer number : list) {
                if(!seen.add(number)) {
                    duplication.add(number);
                }
            }
            System.out.println("Duplicates "+duplication);
        }
        public void duplicateDeleter(){
        HashSet<Integer> seen = new HashSet<>();
        list.removeIf(i -> !seen.add(i));
        System.out.println(list);
        }



}
