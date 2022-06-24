package self.Test;

import java.util.*;

public class Demo {
    String n;
    int a;
    Demo(String n,int a){
        this.a=a;
        this.n=n;
    }
    public static void main(String[] args) {
  /*      Demo d= new Demo("abc",123);
        Demo d1= new Demo("abc",123);
        HashSet<Demo> demos= new HashSet<Demo>();
        demos.add(d);
        demos.add(d1);
        System.out.println(demos.size());*/

        ArrayList<Vehicle> ar = new ArrayList<Vehicle>();
        ar.add(new Vehicle("bbbb", "red","abc",111,22 ));
        ar.add(new Vehicle("aaa", "blue","fgd",695,22 ));
        ar.add(new Vehicle("cc", "green","cfr",23,22 ));
        Collections.sort(ar, new Sortbyprice());
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        Collections.sort(ar, new SortbyType());
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        Collections.sort(ar, new SortbyColor());
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }

    public static String[] mySplit(String str, String regex)
    {
        Vector<String> result = new Vector<>();
        int start = 0;
        int pos = str.indexOf(regex);
        while (pos>=start) {
            if (pos>start) {
                result.add(str.substring(start,pos));
            }
            start = pos + regex.length();
            result.add(regex);
            pos = str.indexOf(regex,start);
        }
        if (start<str.length()) {
            result.add(str.substring(start));
        }
        String[] array = result.toArray(new String[0]);
        return array;
    }



}

class Vehicle{
    String modelNumber;
    String color;
    String type;
    int price;
    int weigth;

  Vehicle(String modelNumber,String color,String type,int price,int weigth){
      this.type = type;
      this.modelNumber = modelNumber;
      this.color = color;
      this.price = price;
      this.weigth = weigth;
  }
}
class SortbyType implements Comparator<Vehicle> {

    public int compare(Vehicle a, Vehicle b) {
        return a.type.compareTo(b.type);
    }
}

class SortbyColor implements Comparator<Vehicle> {

    public int compare(Vehicle a, Vehicle b) {
        return a.price - b.price;
    }
}

class Sortbyprice implements Comparator<Vehicle> {

    public int compare(Vehicle a, Vehicle b) {
        return a.color.compareTo(b.color);
    }
}

