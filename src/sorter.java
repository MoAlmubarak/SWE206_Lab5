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
        //I think we should delete everything from here-
        selectionSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        sortInsertion(numbers);
        for(int i=0; i< list.length; ++i){
            System.out.print(numbers[i] + " ");
        //-to here. Note that it doesn't say that we have to use the sort() methods.
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
    public static void sort(int[] arr){ //Just copy this and replace the first line. (You will probably get an error because of functions with similar headers, I don't know what they were thinking with this question)
        sortInsertion(arr);
        for(int i=0; i< list.length; ++i)//CHANGE THIS TO i++ IN YOUR VERSION{
            System.out.print(numbers[i] + " ");
        }
    }
