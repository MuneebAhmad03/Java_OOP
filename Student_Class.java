class StudentId {                          //Class

    int age ;
    String name;

    int grade;
    String schoolId;


    public StudentId(int age, String name,  int grade,String schoolId) {
        this.age = age;
        this.name = name;

        this.grade = grade;
        this.schoolId = schoolId;
    }
    void display(){
        System.out.print("Student Details : Name : " + name+ " Age : "+ age + " Grade : " + grade + " School ID : " +schoolId);

    }

}

public class Student_Class{
    public static void main (String[] Args){

        StudentId studentId = new StudentId(18,"Muneeb" , 10,"SCS1"); //Object

        studentId.display();

    }

}

