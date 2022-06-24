package self.Test;

import com.PostFinser;
import com.sun.org.apache.xpath.internal.operations.String;

import java.io.IOException;

class Check {

   // private Check check = new Check();
    Check(){
        System.out.println("Hello");
    }
    public static void main(String[] args) throws IOException {
    Check check = new Check();
        PostFinser postFinser = new PostFinser();
        postFinser.s();
        postFinser = null;
        postFinser.say();
        //  new Check.Table().display();

     /*   String str ="she sells sea shells";
        String rex = "SsS";
        String replace = "X";
        Pattern p = Pattern.compile(rex);
        Matcher m = p.matcher(str);
        String val = m.replaceAll(replace);
        System.out.println(val);
*/
    /*    try{
            String[] argds = {"asdd","hfgjjhg","jhgj","kjkj"};
            if(argds.length == 0)
                return;
            for(int i =0 ;i<3;i++)
                System.out.println(argds[i]+ " ");
        }
        finally {
            System.out.println(": Test Started");
        }*/

 /*
        File file = new File("result.txt");
        //FileWriter fileWriter1 = new FileWriter(new BufferedWriter(file));
        FileWriter fileWriter = new FileWriter("result.txt");
        fileWriter.write("Maths-logical",0,5);
        fileWriter.flush();
        fileWriter.close();
        System.out.println(new BufferedReader(new FileReader(file)).readLine());*/


    }

    static private int voter = 0;
    int totalVoter;

    private static synchronized int counter() {
        return ++voter;
    }

    public void getTotal() {
        totalVoter = counter();
    }

    public int woodItems = 2;

    public static class Table {
        private int woodItems = 1;

        public void display() {
            System.out.println("Table " + new Check().woodItems);
        }
    }


}
