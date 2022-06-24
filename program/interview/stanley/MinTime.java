package program.interview.stanley;

import java.util.Arrays;
import java.util.List;

public class MinTime {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{3, 1, 7, 2, 4});
        int processes = 15;
        System.out.println(minTime(list , processes));
    }

    private static int minTime(List<Integer> list, int processes) {
        int result = 0;
        while (processes > 0){
            int index = getHighestElementIndex(list);
            int maxValue = list.get(index);
            processes = processes-maxValue;
            list.set(index , maxValue/2);
            result ++;
        }
        return result;
    }

   static int getHighestElementIndex(List<Integer> list){
        int index =-1 , max= -1;
        for(int i = 0; i < list.size() ; i ++){
            if(list.get(i) > max){
                index = i;
                max = list.get(i);
            }
        }
        return  index;
    }

}
