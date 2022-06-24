package self.programs;

import java.util.Scanner;
/*
*  Example 1:
INPUT
3 5
75 76 65 87 87
78 76 68 56 89
67 87 78 77 65
OUTPUT
325 299 296
Example 2:
INPUT
3 3
50 30 70
30 70 99
99 20 30
OUTPUT
120 129 129
Explanation:

Out of these subjects, the students average was lowest in subject 2
i.e 30+70+20= 120/3=40

So the teacher will ignore marks of this subject and will consider the
* title other two subjects for each of the three students i.e. 120 129 129 respectively
* */
public class AverageOfMarks {
    public static void main(String[] args) {
        averageMarks();
    }

    private static void averageMarks() {
        Scanner sc = new Scanner(System.in);
        int noOfStudents = sc.nextInt();
        int noOfSubjects = sc.nextInt();
        int index=0;
        int[] avg = new int[noOfSubjects];
        int[] total = new int[noOfSubjects];
        int[] result = new int[noOfStudents];
        int[][] marks = new int[noOfStudents][noOfSubjects];

        for(int i=0;i<noOfStudents;i++)
        {
            for(int j=0;j<noOfSubjects;j++) {
                marks[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<noOfSubjects;i++)
        {
            for(int j=0;j<noOfStudents;j++) {
                total[i] += marks[j][i];

            }
        }
        for(int j=0;j<noOfSubjects;j++) {
            //  System.out.print(total[j]+" ");
        }
        // System.out.println("");
        for(int j=0;j<noOfSubjects;j++) {
            avg[j] = total[j]/noOfSubjects;

            //  System.out.print(avg[j]+" ");
        }
        int min = avg[0];

        for(int i = 0; i < avg.length; i++)
        {
            if(min > avg[i])
            {
                min = avg[i];
                index=i;
            }
        }
        //  System.out.println(index);

        for(int i=0;i<noOfStudents;i++)
        {
            for(int j=0;j<noOfSubjects;j++) {
                if(j!=index) {
                    result[i] += marks[i][j];

                }
            }
        }
        for(int j=0;j<result.length;j++) {
            System.out.print(result[j]+" ");
        }
    }
}
