package program.interview.cvent;

import java.util.PriorityQueue;

public class DiverseString {

    public static void main(String[] args) {
        System.out.println(diverseString(1,1,6));
    }
    public static  String diverseString(int a, int b, int c) {

        PriorityQueue<CharCount> queue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.count, o1.count));
        if (a > 0) queue.add(new CharCount(a, 'a'));
        if (b > 0) queue.add(new CharCount(b, 'b'));
        if (c > 0) queue.add(new CharCount(c, 'c'));

        StringBuilder stringBuilder = new StringBuilder(a+b+c);
        while (!queue.isEmpty()) {
            CharCount max = queue.poll();

            if (checkLastTwoChars(stringBuilder, max.c)) {
                if (queue.isEmpty())
                    break;
                CharCount alt = queue.poll();
                appendIfPresent(stringBuilder, alt);
                if (alt.count > 0)
                    queue.add(alt);
            } else {
                appendIfPresent(stringBuilder, max);
            }

            if (max.count > 0) queue.add(max);
        }
        return stringBuilder.toString();

    }

    private static boolean checkLastTwoChars(StringBuilder stringBuilder, char matchingChar) {
        return stringBuilder.length() >= 2 &&
                stringBuilder.charAt(stringBuilder.length() - 1) == matchingChar &&
                stringBuilder.charAt(stringBuilder.length() - 2) == matchingChar;
    }

    private static void appendIfPresent(StringBuilder builder, CharCount given) {
        if (given.count > 0) {
            builder.append(given.c);
            given.count--;
        }
    }

    private static class CharCount {
        int count;
        char c;

        CharCount(int count, char c) {
            this.count = count;
            this.c = c;
        }
    }
}
