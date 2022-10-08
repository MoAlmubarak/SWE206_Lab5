public class sorter {
    public static void main(String[] args) {
    
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
}
