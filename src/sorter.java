import java.util.*;

public class sorter {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int [] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 3;
        numbers[2] = 1;
        numbers[3] = 2;
        numbers[4] = 4;

        int [] numbers2 = new int[5];
        numbers2[0] = 5;
        numbers2[1] = 3;
        numbers2[2] = 1;
        numbers2[3] = 2;
        numbers2[4] = 4;

        selectionSort(numbers);
        System.out.println("selectionSort: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        sortInsertion(numbers2);
        System.out.println("sortInsertion: ");
        for(int i=0; i< numbers2.length; ++i){
            System.out.print(numbers2[i] + " ");
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
    }   
    public static void sort(int[] arr){
        selectionSort(arr);
        for(int i=0; i< arr.length; ++i)
            System.out.print(arr[i] + " ");
        }

        public static void sort2(int[] arr){
            sortInsertion(arr);
            for(int i=0; i< arr.length; ++i)
                System.out.print(arr[i] + " ");
            }
        }
    
