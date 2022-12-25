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
        // int[] rollNos=new int[5];
        // String[] name1=new String[5];
        // float[] marks=new float[5];

        // But here we did not want to use three arrays to store these values. We want to store it like "int[] StudentData=new int[5];". So it will be possible through classes.

        StudentData[] students=new StudentData[5];
        // StudentData is the class data type

        // Declaring student1 
        // StudentData student1;
        // System.out.println(Arrays.toString(students));

        // By default it gives the default values

        StudentData student2=new StudentData();
        StudentData student=new StudentData("Ashish Gulab",11,20);
        StudentData student1=new StudentData("Ram",1,21);
        StudentData student3=new StudentData(student2);
        StudentData random=new StudentData();

        student2.name1="Ashish Gulab";
        student2.rollNos=11;
        student2.age=20;

        System.out.println(student2.rollNos);
        System.out.println(student2.name1);
        System.out.println(student2.age);

        System.out.println();

        System.out.println(student.rollNos);
        System.out.println(student.name1);
        System.out.println(student.age);

        System.out.println();

        System.out.println(student1.rollNos);
        System.out.println(student1.name1);
        System.out.println(student1.age);

        System.out.println();

        System.out.println(student3.rollNos);
        System.out.println(student3.name1);
        System.out.println(student3.age);

        System.out.println();

        System.out.println(random.rollNos);
        System.out.println(random.name1);
        System.out.println(random.age);

        StudentData one= new StudentData();
        StudentData two=one;

        one.name1="Sunder";
        System.out.println(two.name1);
    }
}

class StudentData
{
    int rollNos;
    String name1;
    int age;

    StudentData()
    {
        this.name1="Ashish Gulab";
        this.rollNos=11;
        this.age=20;
    }

    // StudentData()
    // {
    //     // calling a constructor from other constructor
    //     // internally: new StudentData(13,"Default Person",100.0f)
    //     this("Default Person",1,100);
    // }

    StudentData(String name1,int rollNos,int age)
    {
        this.name1=name1;
        this.rollNos=rollNos;
        this.age=age;
    }

    // Value from iside the other constructor
    StudentData(StudentData other)
    {
        this.name1=other.name1;
        this.rollNos=other.rollNos;
        this.age=other.age;
    }
}
