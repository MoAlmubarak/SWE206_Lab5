import java.util.*;

public class Sorter {
    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.println("Hello World!")
=======
    
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 3;
        numbers[2] = 1;
        numbers[3] = 2;
        numbers[4] = 4;
        selectionSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        sortInsertion(numbers);
        for(int i=0;i<arr.length;++i){
            System.out.print(numbers[i] + " ");
        }
        
    }
    public static void sortInsertion(int [] sort_arr){

        for(int i=0;i<sort_arr.length;++i){

            int j = i;

            while(j > 0 && sort_arr[j-1]>sort_arr[j]){

                int key = sort_arr[j];
                sort_arr[j] = sort_arr[j-1];
                sort_arr[j-1] = key;
                j = j-1;

            }
        }
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            
            arr[i] = arr[min];

            arr[min] = temp;
        }
        
>>>>>>> a5f393ea0cf6c2dedde157677a6a389cdc1cf275
    }
}
