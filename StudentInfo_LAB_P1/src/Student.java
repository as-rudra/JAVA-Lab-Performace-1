public class Student {
    private int Id;
    private String name;
    private Department dept;
    private int[] marks;

    public Student(int Id, String name, Department dept, int... marks){
        this.Id = Id;
        this.name = name;
        this.dept = dept;
        this.marks = marks;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Department getDept() {
        return dept;
    }

    public int[] getMarks() {
        return marks;
    }
}
