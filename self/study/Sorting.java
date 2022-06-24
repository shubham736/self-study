package self.study;

import com.utlity.Print;

import java.util.Arrays;
import java.util.TreeSet;

public class Sorting {

    public static void main(String[] args) {
        int[] ints = {3,5,1,7,9,8};
        System.out.println("Before Sorting");
        Print.printArray(ints);
        Integer[] integers1 = {3,5,1,7,9,8};
        //bubbleSort(ints);
        //insertionSort(ints);
       // selectionSort(ints);
        quickSort(ints , 0, ints.length-1);
        System.out.println("After Sorting");
        Print.printArray(ints);
/*        TreeSet<Integer> integers = new TreeSet<Integer>(Arrays.asList(integers1));
        System.out.println(integers);*/
    }

    static void bubbleSort(int[] ints){
        int temp = 0;
        for(int i = 0 ; i < ints.length ; i++){
            for(int j = 1; j < ints.length-i ; j++){
                if(ints[j-1] > ints[j]){
                    temp = ints[j-1];
                    ints[j-1]= ints[j];
                    ints[j] = temp;
                }
            }
        }
    }

    static  void insertionSort(int[] ints){
        int size = ints.length;
        for(int i = 1 ; i < size ; i++){
            int key = ints[i];
            int j= i-1;
            while (j >=0 && ints[j] > key){
                ints[j+1] = ints[j];
                j= j-1;
            }
            ints[j+1] = key;
        }
    }


    static void selectionSort(int[] array){
        int size = array.length;
        for (int i = 0 ;  i < size ; i++){
            int index = i ;
             for(int j = i+1 ; j < size-1; j++ ){
                 if(array[j] < array[index]){
                     index = j;
                 }
             }
             int smaller = array[index];
             array[index] = array[i];
             array[i] = smaller;
        }
    }

    static  void quickSort(int[] array, int beg , int end){
        int loc;
        if(beg < end){
            loc = partition(array , beg, end);
            quickSort(array,beg,loc-1);
            quickSort(array, loc+1,end);

        }
    }

    private static int partition(int[] array, int beg, int end) {
        int left =beg, right=end , temp , flag=0, loc= beg;
        while(flag != 1){
            while ((array[loc] <= array[right]) && (loc != right))
                right --;
            if(loc == right)
                flag =1;
            else if (array[loc] > array[right]) {
                temp = array[loc];
                array[loc]  = array[right];
                array[right] = temp;
                loc = right;
            }
            if(flag != 1){
                while ((array[loc] >= array[left]) && (loc != left))
                    left ++;
                if(loc == left)
                    flag =1;
                else if (array[loc] < array[left]) {
                    temp = array[loc];
                    array[loc]  = array[left];
                    array[left] = temp;
                    loc = left;
                }
            }
        }
        return loc;
    }
}
