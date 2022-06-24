package program.interview;

public class StringToMatrix {
    public static void main(String[] args) {
        String str = "5.0,100,5.5,101,6.0,102:L10;5.0,99,5.5,100,6.0,101:L20;";
        //String str = "5.0,100,5.5,101,6.0,102:L10;5.0,99,5.5,100,6.0,101:L20;5.0,199,5.5,110,6.0,121:L30";
        conversionOfStringTo2D(str);
    }

    static void conversionOfStringTo2D(String string) {
        int size = string.length();
        String[][] two_array = new String[size + 1][size + 1];
        String[] str = string.split(";");
        two_array[0][0] = "  ";
        int counter = 0;
        String[] temp = new String[size + 1];
        for (String st : str) {
            String[] innerStr = st.split(":");
            if (innerStr.length > 1) {
                two_array[0][counter + 1] = innerStr[1];
                temp[counter] = innerStr[0];
            }
            counter++;
        }
        int count = 0;
        for (int j = 0; j < temp.length; j++) {
            if (temp[j] != null) {
                String[] innerStr = temp[j].split(",");
                int evenCount = 0;
                int oddCount = 0;
                for (int i = 0; i < innerStr.length; i++) {
                    if (i % 2 == 0 && count == 0) {
                        two_array[evenCount + 1][i] = innerStr[i];
                        evenCount++;
                    } else if (i % 2 != 0) {
                        two_array[oddCount + 1][i + j] = innerStr[i];
                        oddCount++;
                    }
                }
                count++;
            }
        }
        print2D(two_array);

    }


    static void print2D(String[][] str) {
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                if (str[i][j] != null) {
                    System.out.print(str[i][j] + " ");
                }
            }
            if (str[i][2] != null) {
                System.out.println();
            }

        }
    }
}
