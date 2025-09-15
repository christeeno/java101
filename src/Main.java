import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//        STRING
//        System.out.println("Hello and welcome!");
//        String name1="Ant";
//        String name2="N";
//        System.out.println(name1+name2);
//        System.out.println(name1.length());
//        System.out.println(name1.charAt(0));
//        String name3=name1.replace("a","b");
//        System.out.println(name1.substring(0,2));
//
//        ARRAYS
        int[] marks=new int[3];
        marks[0]=12;
        marks[1]=32;
        marks[2]=11;
        System.out.println(marks[0]);


        System.out.println(marks.length);
        Arrays.sort(marks);
        int[] mark={12,3,4,50};
        int[][] final_marks={{12,23,34},{11,22,33}};
        System.out.println(final_marks[0][0]);

    }
}