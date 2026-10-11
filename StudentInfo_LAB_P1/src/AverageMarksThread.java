public class AverageMarksThread extends Thread{
    private Student[] students;

    public AverageMarksThread(Student[] students){
        this.students = students;
    }
    @Override
    public void run(){
        for (int i = 0; i < 6; i++) {
            int[] marks = students[i].getMarks();

            double avgMark = (double) (marks[0] + marks[1] + marks[2]) / 3;

            String letterGrade;
            double gradePoint;

            if (avgMark >= 90) {
                letterGrade = "A+";
                gradePoint = 4.00;
            } else if (avgMark >= 85) {
                letterGrade = "A";
                gradePoint = 3.75;
            } else if (avgMark >= 80) {
                letterGrade = "B+";
                gradePoint = 3.50;
            } else if (avgMark >= 75) {
                letterGrade = "B";
                gradePoint = 3.25;
            } else if (avgMark >= 70) {
                letterGrade = "C+";
                gradePoint = 3.00;
            } else if (avgMark >= 65) {
                letterGrade = "C";
                gradePoint = 2.75;
            } else if (avgMark >= 60) {
                letterGrade = "D+";
                gradePoint = 2.50;
            } else if (avgMark >= 50) {
                letterGrade = "D";
                gradePoint = 2.25;
            } else {
                letterGrade = "F";
                gradePoint = 0.00;
            }

            System.out.println(
                    "Avg Marks for " + students[i].getName() + ": " + avgMark
            );

            System.out.println(
                    "Letter Grade for " + students[i].getName() + ": " + letterGrade
            );

            System.out.printf("Grade Point for" + students[i].getName()+ ":" + gradePoint);
        }
    }
}
