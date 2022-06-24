package self.study;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Shubham";
        String s2 = "Shubham";
        String s3 = new String("Shubham");
        String s4 = new String("Shubham");

        System.out.println("s1 :" +s1+ " s2 " +s2 +" "+ (s1==s2));
        System.out.println("s3 :" +s3+ " s4 " +s4 +" "+ (s3==s4));
        System.out.println("s1 :" +s1+ " s2 " +s2 +" "+ s1.equals(s2));
        System.out.println("s3 :" +s3+ " s4 " +s4 +" "+ s3.equals(s4));
        System.out.println("s2 :" +s2+ " s3 " +s3 +" "+ s3.equals(s2));
        System.out.println("s2 :" +s2+ " s3 " +s3 +" "+ s3==s2);
    }
}
