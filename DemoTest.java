import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoTest {
    public static void main(String[] args) {
       /* Given the arrival and departure times of all trains that reach a
       railway station, the task is to find the minimum number of platforms required
       for the railway station so that no train waits.
        Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
        dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}

        {9:10, 9:50, 10:00, 11:30, 17:00, 20:00}
        Output: 3*/
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
       // int dep[] = {1120, 1200, 1120, 1130, 1900, 2000};  // {910, 1120, 1130, 1200,  1900, 2000};
        int dep[] = {910, 945, 1000, 1130, 1700, 2000};  // {910, 1120, 1130, 1200,  1900, 2000};
        System.out.println(minPlateForm(arr, dep));

    }

    private static int minPlateForm(int[] arr, int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int size = arr.length;
        if(size <1)
            return 0;
        int plateForm=1 , i=1, k=0, res =1;

        while (i< size && k < size){
            if(arr[i] <=dep[k]){
                plateForm ++;
                i++;
            }
            else if(arr[i] > dep[k]){
                plateForm --;
                k++;
            }
            if(plateForm >res)
                res =plateForm;
        }
        return res;
    }
}
