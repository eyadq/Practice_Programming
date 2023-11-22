package day22_tasks;

public class URLParts {

    public static void main(String[] args) {

        String url = "url = https://learn.loopcamp.com/courses/130";

        for (String part: url.split("/")){
            System.out.println(part);
        }
    }
}
