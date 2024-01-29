package LearnJava.Sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static void bubbleSort(List<Integer> list){
        int n = list.size();

        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (list.get(j) > list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
            System.out.println();
            for (int num: list) {
                System.out.print(num + " ");
            }
        }
    }
    public static void bubbleSort(int [] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println();
            for (int num: arr) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(12);
        list.add(2);
        list.add(70);
        list.add(50);
        list.add(10);
        list.add(0);

        int [] arr = {12,45,-50, 120, 30,1};

        bubbleSort(list);
        System.out.println();
        bubbleSort(arr);
    }
}
