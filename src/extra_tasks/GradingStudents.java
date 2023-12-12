package extra_tasks;

public class GradingStudents {

    public static void main(String[] args) {
        int[] grades = {84, 29, 57};
        for (int num : grades){
            System.out.println(num + " is in gradebook as: " + finalGrade(num));
        }
        int[] grades2 = {73, 67, 38, 33};
        for (int num : grades2){
            System.out.println(num + " is in gradebook as: " + finalGrade(num));
        }
    }

    public static int finalGrade(int grade){
        if(grade < 40)
            return grade;

        int remainder = grade%5;
        int roundedGrade = grade + (5-remainder);
        grade = (roundedGrade - grade < 3) ? roundedGrade : grade;

        return grade;
    }




}
