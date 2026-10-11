public class TotalMarksThread extends Thread{
    private Student[] students;

    public TotalMarksThread(Student[] students){
        this.students = students;
    }
    @Override
    public void run(){
        for(int i=0; i<6; i++){
            int[] marks = students[i].getMarks();
            System.out.println("Total Marks for " + students[i].getName() + ":" + (marks[0]+marks[1]+marks[2]));
        }
    }
}
