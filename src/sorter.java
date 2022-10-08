import java.util.*;

public class Sorter {
    public static void main(String[] args) {
        System.out.println("Hello World!")
        Scanner read = new Scanner(System.in);
        int[] list = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter number " + i+1);
            int x = read.nextInt;
            list[i] = x;
        }
        Collections.sort(list);
    }
}
