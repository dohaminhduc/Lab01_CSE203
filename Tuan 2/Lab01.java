public class Lab01 {
    public static void main(String[] args) {
        /*SumFirstLast obj = new SumFirstLast();
        System.out.println(obj.SumFirstLastDigit);*/

        /*Minimum obj = new Minimum();
        System.out.println(obj.getMinimum);*/

       /* Hailstone obj = new Hailstone();
        System.out.println(obj.HailstoneSequence);*/

        /*EvenSum obj = new EvenSum();
        System.out.println(obj.getSumEven);*/

        /*ArrayRequest list = new ArrayRequest();
        list.InputList();
        System.out.println(list.getList());
        list.DeleFirst(7);
        System.out.println(list.getList());
        list.replace(5,69);
        System.out.println(list.getList());
        list.duplicateFinder();
        list.duplicateDeleter();*/

        StringRequest sr1 = new StringRequest("Hello");
        StringRequest sr2 = new StringRequest("World");
        StringRequest sr3 = new StringRequest("asdsa");
        sr1.getLength();
        sr2.wordscounter();
        sr1.Concatenate(sr2.getStr());
        sr3.Palindrome();
    }
}
