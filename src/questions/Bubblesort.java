package questions;

/**
 * AlgorithmTest
 * Class: Bubblesort
 * Created by hapo on 2019-03-01.
 * Description: Bubble Sort
 */
public class Bubblesort {

    private static void bubbleSort(int[] arr){
        //배열을 받아서 재귀함수 호출
        //배열의 주소와 배열이 안된 마지막 index를 넘김
        bubbleSort(arr, arr.length-1);
    }

    private static void bubbleSort(int[] arr, int last){
        if(last>0){
            for (int i = 1; i <= last; i++) {
                if(arr[i-1] > arr[i]){
                    swap(arr, i-1, i);
                }
            }
            bubbleSort(arr, last - 1);
        }
    }

    private static void swap(int[] arr, int source, int target){
        int temp = arr[source];
        arr[source] = arr[target];
        arr[target] = temp;
    }

    private static void printArray(int[] arr){
        for (int data:arr) {
            System.out.print(data + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,5,4,2,1,6,4};
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }

}
