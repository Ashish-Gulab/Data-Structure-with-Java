import java.util.*;
class ConceptOfClasses
{
    public static void main(String[] args)
    {
        // Store the roll numbers of five students
        int[] rollNo=new int[5];

        // Store the name of the five Students
        String[] name=new String[5];

        // Store the data of various students(Name,Roll Number,Marks)
        int[] rollNos=new int[5];
        String[] name1=new String[5];
        float[] marks=new float[5];

        // But here we did not want to use three arrays to store these values. We want to store it like "int[] StudentData=new int[5];". So it will be possible through classes.

        StudentData[] students=new StudentData[5];
        // StudentData is the class data type

        // Declaring student1 
        StudentData student1;
        System.out.println(Arrays.toString(students));
    }

    class StudentData{
        int rollNos;
        String name1;
        int age;
    }
}