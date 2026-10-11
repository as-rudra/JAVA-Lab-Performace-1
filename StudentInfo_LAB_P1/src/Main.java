import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Student s1 = new Student(101,"Rahim",Department.CSE,80,75,90);
        Student s2 = new Student(102,"Karim",Department.CSE,60,65,70);
        Student s3 = new Student(103,"Ayesha",Department.EEE,90,95,92);
        Student s4 = new Student(104,"Nusrat",Department.EEE,50,55,60);
        Student s5 = new Student(104,"Sakib",Department.BBA,75,80,85);
        Student s6 = new Student(105,"Mim",Department.BBA,40,45,50);

        Student[] students = {s1,s2,s3,s4,s5,s6};

        for(int i=0; i<6; i++){
            System.out.println(students[i].getId()+","+students[i].getName()+","+students[i].getDept()+","+ Arrays.toString(students[i].getMarks()));
        }

        TotalMarksThread t1 = new TotalMarksThread(students);

        t1.start();
        t1.join();

        AverageMarksThread av1 = new AverageMarksThread(students);

        av1.start();
        av1.join();

        DepartmentGradeCountThread dp = new DepartmentGradeCountThread(students);
        dp.start();
        dp.join();

        System.out.println("Result Processing Completed");
    }
}