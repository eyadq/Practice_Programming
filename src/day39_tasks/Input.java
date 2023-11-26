package day39_tasks;

import java.util.Random;

public class Input implements WebElement {

    String[] inputText = {"username", "password", "email", "default", "search"};
    @Override
    public void click() {
        Random random = new Random();
        System.out.println("You just clicked on input for: " + inputText[random.nextInt(5)]);
    }

    @Override
    public String getText() {
        Random random = new Random();
        return inputText[random.nextInt(5)];
    }

    @Override
    public void sendKeys(String text) {
        System.out.println("Entered into input field: " + text);
    }
}
