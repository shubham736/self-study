package program.interview.stanley.inheritance;

import java.util.List;

public class GenericTests {
}

 class MinMax<N extends Number> {
    private N min,max;
    public N getMin(){
        return min;
    }

     public N getMax() {
         return max;
     }

     public void add(N added){
        if(min == null || added.doubleValue() < min.doubleValue()){
            min = added;
        }
        if(max == null || added.doubleValue() > max.doubleValue()){
            max = added;
        }
     }

    // public  static  int sum(List list){
    public  static  int sum(List<Integer> list){
        int sum = 0;
        //for(Iterator  itr = list.iterator() ; itr.hasNext(); ){
          //  int i = ((Integer)itr.next()).intValue();
         for(int i : list){
            sum +=i;
        }
        return sum;
     }
 }
