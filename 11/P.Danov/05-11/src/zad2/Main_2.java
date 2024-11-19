package zad2;

public class Main_2 {
    public static void main(String[] args) {
        Multiprocessor processor1 = new Multiprocessor(2, 8, 5.4);
        System.out.println(processor1.toString());
        System.out.println(processor1.operationTimeSeqProc(1));
    }
}
