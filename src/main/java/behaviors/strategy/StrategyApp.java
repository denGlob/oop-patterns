package behaviors.strategy;

import java.util.Arrays;

/**
 * Created by denglob on 8/10/17.
 */
public class StrategyApp {
    public static void main(String[] args) {
        StrategyClient client = new StrategyClient();
        client.setSorting(new BubbleSort());
        client.executeSort(new int[]{1, 5, 2, 8,7});

        client.setSorting(new InsertionSort());
        client.executeSort(new int[]{0, -8, 5, 10, 1, 9});
    }
}

//Context
class StrategyClient {
    Sorting sorting;

    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }

    public void executeSort(int[] arr) {
        sorting.sort(arr);
    }
}

interface Sorting {
    void sort(int[] arr);
}

class BubbleSort implements Sorting{

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        System.out.println("-----------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("BUBBLE SORT :");
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------");
    }
}

class InsertionSort implements Sorting{


    @Override
    public void sort(int[] arr) {
        int temp;
        System.out.println("-----------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("INSERTION SORT :");
        for (int i = 1; i < arr.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------");
    }
}


