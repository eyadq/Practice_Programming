package day21_tasks;

public class GradeBookTwo {

    public static void main(String[] args) {
        String[] names = {"Mike", "Joe", "Ana", "Ali", "Joanna"};
        int[] scores = {80, 54, 100, 66, 94};

        char[] grades = new char[names.length];
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            if(score >= 85 ){
                grades[i] = 'A';
            } else if ( score>=75 ){
                grades[i] = 'B';
            } else if ( score>=65 ){
                grades[i] = 'C';
            } else {
                grades[i] = 'D';
            }
            System.out.println(names[i] + " | " + scores[i] + " | " + grades[i]);
        }
    }
}
