package day39_tasks;

import java.util.Random;

public class Link implements WebElement {

    String[] links = {"Google.com", "Amazon.com", "Docuport.app", "Discord", "Steam"};
    String[] text = {"Hello world", "Login", "Please don't click that", "Delete this now", "Why not?"};

    @Override
    public void click() {
        Random random = new Random();
        System.out.println("You just clicked on link to: " + links[random.nextInt(5)]);
    }

    @Override
    public String getText() {
        Random random = new Random();
        return links[random.nextInt(5)];
    }

    @Override
    public void sendKeys(String text) {
        System.out.println("Now going to: " + text);
    }
}
