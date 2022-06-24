package self.Test;


// Java implementation of the approach
import java.util.*;

class check2 {

    public static List<String> reduced_String(int k, List<String> s) {
        if (k == 1) {
            List<String> ans = new ArrayList<>();
            return ans;
        }

        Stack<Pair> st = new Stack<Pair>();

        int l = s.size();
        int ctr = 0;

        for (int i = 0; i < l; i++) {

            if (st.size() == 0) {
                st.push(new Pair(s.get(i), 1));
                continue;
            }


            if (st.peek().c == s.get(i)) {
                Pair p = st.peek();
                st.pop();
                p.ctr += 1;
                if (p.ctr == k) {
                    continue;
                } else {
                    st.push(p);
                }
            } else {


                st.push(new Pair(s.get(i), 1));
            }
        }


        List<String> ans = new ArrayList<>();
        while (st.size() > 0) {
            String c = st.peek().c;
            int cnt = st.peek().ctr;
            while (cnt-- > 0)
                ans.add(c);
            st.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        int k = 3;
        List<String> st = new ArrayList<>();
        st.add("a");
        st.add("b");
        st.add("c");
        st.add("d");
        List<String> ans = reduced_String(k, st);
        for (int i=ans.size()-1; i>=0 ;i--)
            System.out.println(ans.get(i));
    }

    static class Pair {
        String c;
        int ctr;

        Pair(String c, int ctr) {
            this.c = c;
            this.ctr = ctr;
        }
    }
}
