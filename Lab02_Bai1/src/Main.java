//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Complex com1 = new Complex();
    Complex com2 = new Complex();
    com1.getNum();
    com2.getNum();
    com1.AddNum(com2).print();
    com1.SubsNum(com2).print();
    com1.MultiNum(com2).print();
    com1.DivNum(com2).print();
        }
    }
