package self.programs;

import java.io.*;
import java.util.*;

public class SmallestSubarrayK_distinctElements {


    //k =3
    ///[2,2,1,1,3,3,4,5,6]
//[2,2,1,1,3]
//[2,1,1,3]= 4
//[1,1,3,3,4]
//[1,3,3,4] = 4
//[3,3,4,5]
//[3,4,5] = 3
//[4,5,6] = 3
    public static int findMinimumLengthSubarray(List<Integer> arr, int k) {
        int size = arr.size();
        int i =0, j = k-1 , min = Integer.MAX_VALUE;
        while((j < size )&& ((j-i+1) >= k)){
            Set<Integer> set = new HashSet<>();
            for(int q = i; q<= j ;q++){
                set.add(arr.get(q));
                if(set.size() == k){
                    min = Math.min(min, q-i+1);
                    i++;
                    break;
                }
            }
            if(set.size()< k ){
                j++;
            }

        }



        return Integer.MAX_VALUE == min ? -1 :min;
    }


    public static void main(String[] args) throws IOException {
        int arr[] = { 5
,                1,
                2,
                2,
                1,
                2,
                4 };
        int k = 3;
        List<Integer>  list = new ArrayList<>();
        Arrays.stream(arr).forEach(a ->list.add(a));
        System.out.println(findMinimumLengthSubarray(list ,k));

    }
}
