import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class demo1 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('a');
        list.add('A');
        list.add('c');
        list.add('d');
        list.add('f');

        int[] arr = {9, 1, 0, 2, 4, 5, 1, 0}; // 1,1,2,4,5,9,0,0
        int size = arr.length;
    /*    Arrays.sort(arr);

        int index =-1;
        int size=arr.length;
        for(int i  =0 ; i< arr.length ; i++ ){
            if(arr[i] >0) {
                index =i;
                break;
            }
        }

        if(index > 0) {
            int[] res = new int[size];
            Arrays.fill(res,0);
            for (int i = index; i < size; i++) {
                res[i - index] = arr[i];
            }
            Arrays.stream(res).forEach(System.out::print);
        }
        System.out.println("==================================");*/
        int count = 0;  // Count of non-zero elements
        for (int i = 0; i < size; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
        while (count < size)
            arr[count++] = 0;
        Arrays.stream(arr).forEach(System.out::print);

        System.out.println("-----------------------------");

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : list) {
            c = Character.toLowerCase(c);
            map.merge(c, 1, Integer::sum);
        }
        map.forEach((k, v) -> System.out.println(k + " " + v));

    }
}
class  b extends a{

    @Override
    void m1() {
        System.out.println("b");
    }

    public static void main(String[] args) {
        b b= (b) new a();
        b.m1();
    }
}
 class  a{
     void m1() {
         System.out.println("a");
     }
 }

