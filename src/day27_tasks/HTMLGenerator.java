package day27_tasks;

public class HTMLGenerator {

    public static void main(String[] args) {
        System.out.println( htmlGenerator("div^2") );
        System.out.println( htmlGenerator("li^3") );
    }

    public static String htmlGenerator(String str){
        String output = "";

        String tag = str.substring(0, str.length()-2);
        int amount = Integer.parseInt(str.substring(str.length()-1));
        String single_output = "<" + tag + "></" + tag + ">" ;

        for (int i = 0; i < amount; i++) {
            output += single_output;
        }


        return output;
    }
}
