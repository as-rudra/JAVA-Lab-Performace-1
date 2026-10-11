
public class DepartmentGradeCountThread extends Thread {

    private Student[] students;

    public DepartmentGradeCountThread(Student[] students) {
        this.students = students;
    }

    @Override
    public void run() {

        int cseAPlus = 0, cseA = 0, cseBPlus = 0;
        int cseB = 0, cseCPlus = 0, cseC = 0;
        int cseDPlus = 0, cseD = 0, cseF = 0;

        int eeeAPlus = 0, eeeA = 0, eeeBPlus = 0;
        int eeeB = 0, eeeCPlus = 0, eeeC = 0;
        int eeeDPlus = 0, eeeD = 0, eeeF = 0;

        int bbaAPlus = 0, bbaA = 0, bbaBPlus = 0;
        int bbaB = 0, bbaCPlus = 0, bbaC = 0;
        int bbaDPlus = 0, bbaD = 0, bbaF = 0;

        for (int i = 0; i < students.length; i++) {

            int[] marks = students[i].getMarks();

            double avg = (double) (marks[0] + marks[1] + marks[2]) / 3;

            String grade;

            if (avg >= 90) {
                grade = "A+";
            } else if (avg >= 85) {
                grade = "A";
            } else if (avg >= 80) {
                grade = "B+";
            } else if (avg >= 75) {
                grade = "B";
            } else if (avg >= 70) {
                grade = "C+";
            } else if (avg >= 65) {
                grade = "C";
            } else if (avg >= 60) {
                grade = "D+";
            } else if (avg >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            if (students[i].getDept() == Department.CSE) {

                if (grade.equals("A+")) cseAPlus++;
                else if (grade.equals("A")) cseA++;
                else if (grade.equals("B+")) cseBPlus++;
                else if (grade.equals("B")) cseB++;
                else if (grade.equals("C+")) cseCPlus++;
                else if (grade.equals("C")) cseC++;
                else if (grade.equals("D+")) cseDPlus++;
                else if (grade.equals("D")) cseD++;
                else cseF++;

            } else if (students[i].getDept() == Department.EEE) {

                if (grade.equals("A+")) eeeAPlus++;
                else if (grade.equals("A")) eeeA++;
                else if (grade.equals("B+")) eeeBPlus++;
                else if (grade.equals("B")) eeeB++;
                else if (grade.equals("C+")) eeeCPlus++;
                else if (grade.equals("C")) eeeC++;
                else if (grade.equals("D+")) eeeDPlus++;
                else if (grade.equals("D")) eeeD++;
                else eeeF++;

            } else if (students[i].getDept() == Department.BBA) {

                if (grade.equals("A+")){
                    bbaAPlus++;
                }
                else if (grade.equals("A")) {
                    bbaA++;
                }
                else if (grade.equals("B+")){
                    bbaBPlus++;
                }
                else if (grade.equals("B")){
                    bbaB++;
                }
                else if (grade.equals("C+")){
                    bbaCPlus++;
                }
                else if (grade.equals("C")){
                    bbaC++;
                }
                else if (grade.equals("D+")){
                    bbaDPlus++;
                }
                else if (grade.equals("D")){
                    bbaD++;
                }
                else{
                    bbaF++;
                }
            }
        }

        System.out.println("CSE: A+=" + cseAPlus + ", A=" + cseA + ", B+=" + cseBPlus + ", B=" + cseB + ", C+=" + cseCPlus + ", C=" + cseC + ", D+=" + cseDPlus + ", D=" + cseD + ", F=" + cseF);

        System.out.println("EEE: A+=" + eeeAPlus + ", A=" + eeeA + ", B+=" + eeeBPlus + ", B=" + eeeB + ", C+=" + eeeCPlus + ", C=" + eeeC + ", D+=" + eeeDPlus + ", D=" + eeeD + ", F=" + eeeF);

        System.out.println("BBA: A+=" + bbaAPlus + ", A=" + bbaA + ", B+=" + bbaBPlus + ", B=" + bbaB + ", C+=" + bbaCPlus + ", C=" + bbaC + ", D+=" + bbaDPlus + ", D=" + bbaD + ", F=" + bbaF);
    }
}
