package program.interview.marks;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExtraMarks {
    public static String getUserName(String firstName, String lastName) {
        // return the user name as LastName, FirstName e.g. Smith, John
        if (lastName != null)
            lastName = capitaliseFirstLetter(lastName);
        if (firstName != null)
            firstName = capitaliseFirstLetter(firstName);
        if (lastName != null)
            return lastName + ", " + firstName;
        else
            return firstName;
    }


    public static String capitaliseFirstLetter(String s) {
        if (s == null || s.length() < 1) {
            return s;
        }

        char[] chars = s.toCharArray();

        chars[0] = Character.toUpperCase(chars[0]);

        return String.valueOf(chars);
    }

    public static String productValues(Inventory[] items) {
        Map<String, Integer> invCountByCode = new TreeMap<String, Integer>();
        StringBuffer result = new StringBuffer();

        for (Inventory item : items) {
            if (!invCountByCode.containsKey(item.product)) {
                invCountByCode.put(item.product, 0);
            }

            Integer prevLevel = invCountByCode.get(item.product);

            invCountByCode.put(item.product, prevLevel + item.qty);
        }

        for (String prodId : invCountByCode.keySet()) {
            result.append(prodId).append(",").append(invCountByCode.get(prodId));
        }

        return result.toString();
    }


    public static class Inventory {
        public String product;
        public int qty;

        public Inventory(String product, int qty) {
            this.product = product;
            this.qty = qty;
        }


        @Override
        public String toString() {
            return qty + " * " + product;
        }
    }

    public static char[] removeDuplicates(char[] arg) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character chars : arg) {
            if (map.get(chars) == null) {
                map.put(chars, 1);
            }
        }
        char[] chars = new char[map.size()];
        int i = 0;
        for (Character character : map.keySet()) {
            chars[i] = character;
            i++;
        }
        return chars;
    }

    public static String countWordOccurrences(String text) {
        // return "dog,1\ncat,2";
        String[] strings = text.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            s = s.toLowerCase();
            if (map.get(s) == null) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.append(entry.getKey()).append(",").append(entry.getValue()).append("\\n");
        }
        String str = String.valueOf(result).substring(0, result.length() - 2);
        return str.trim();
    }

    public static void main(String[] args) {

        //  System.out.println(countWordOccurrences("dog cat dog"));
//        Inventory inventory1 = new Inventory("Cup" , 10 );
//        Inventory inventory2 = new Inventory("Plate" , 15 );
//        Inventory inventory3 = new Inventory("Cup" , 20 );
//        Inventory[] inventories = {inventory1,inventory2,inventory3};
//        System.out.println(productValues(inventories));

/*
        getUserName("Shubham" ,"Gupta");
        String str = "Cup,30\\nPlate,15";
        if(str.contains("\\n")){
           str=  str.replace("\\n" , " ");
            System.out.println(str);
        }
*/
 /*     MyData myData = new MyData();
        myData.a = 1;
        FooBean.foo(myData);
        System.out.println(myData.a);*/

 /*       try{
            throw new Pizza();
        }catch(Food f){
            System.out.println("Caught base class exception");
        }catch (Pizza p){
            System.out.println("Caught derived class exception");
        }*/

/*        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("hi");
        list.add("how");
        list.add("are");
        list.add("you");
        System.out.println("Before list "+ list);
        Collections.fill(list,"hi");
        list.add("dear");
        System.out.println("After list:" +list);
        System.out.println("Frequency: "+ Collections.frequency(list,"hi"));*/

/*        outer :
        for(int i = 0 ; i < 3 ; i++){
            for (int j =3 ; j >=0  ; j--){
                if(i ==j)
                    continue outer;
                System.out.println(i + " "+ j);
            }
        }*/

/*        String test = "x1y2z3";
        String[] strings = test.split("\\d");
        for(String s : strings){
            System.out.print(s);
        }*/

        //  Scanner scanner = new Scanner(System.in);
        /*int m = 3;
        int n = 14;
        int count =0;
        while (m!=n){
             m =m*2+1;
             count++;
             m = m*2;
             count++;
        }
        System.out.println(count);*/
    }
}

class MyData implements Serializable {
    int a;
}

class FooBean {
    public static void foo(MyData myData) {
        myData.a = 2;
    }
}

class Food extends Exception {
}

class Pizza extends Food {
}

