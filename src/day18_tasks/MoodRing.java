package day18_tasks;

public class MoodRing {

    public static void main(String[] args) {

        String color = "blue";
        String mood = "";
        double budget = 0;
        boolean isValid = true;

        switch (color){
            case "pink":
                mood = "happy";
                budget = 200;
                break;
            case "blue":
                mood = "relaxed";
                budget = 150;
                break;
            case "orange":
                mood = "nervous";
                budget = 50;
                break;
            case "angry":
                mood = "angry";
                budget = 0;
                break;
            default:
                isValid = false;
        }

        if(isValid){
            System.out.println("Your mood is " + mood + " and your shopping budget is $" + budget);
        } else {
            System.out.println("Enter valid color");
        }
    }
}
