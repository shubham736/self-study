package program.interview;

public class FirstCharacterOfCamelCase {
    public static void main(String[] args) {
        String str= "Shubham Gupta";
        System.out.println(printValue(str));
        System.out.println(reverseWord(str));
            reverses(str);
    }

    //Method 2
    static void reverses(String str)
    {

        char[] inputArray = str.toCharArray();
        char[] result = new char[inputArray.length];

        // Mark spaces in result
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }

        // Traverse input string from beginning
        // and put characters in result from end
        int j = result.length - 1;
        for (int i = 0; i < inputArray.length; i++) {

            // Ignore spaces in input string
            if (inputArray[i] != ' ') {

                // ignore spaces in result.
                if (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        System.out.println(String.valueOf(result));
    }
   //  Method 1
    private static StringBuilder reverseWord(String str) {
        String[] strings = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for(String s : strings){
            int size = s.length();
            for(int i = 0 ; i < size ; i++){
                builder.append(s.charAt(size-1-i));
            }
            builder.append(" ");
        }
        return builder;
    }

    static  StringBuilder printValue(String str){
        StringBuilder builder = new StringBuilder();
        String[]  strings = str.split(" ");
        for (String s : strings){
            builder.append(s.charAt(0));
        }
        return builder;
    }
}
