package day39_tasks;

import java.util.ArrayList;

public class RunnerClass {

    public static void main(String[] args) {

        WebElement elementLink = new Link();
        elementLink.click();
        System.out.println(elementLink.getText());
        elementLink.sendKeys("Google");
        System.out.println();

        WebElement elementInput = new Input();
        elementInput.click();
        System.out.println(elementInput.getText());
        elementInput.sendKeys("Discord");
        System.out.println();

        WebDriverUtil.clickElement(elementLink);
        WebDriverUtil.clickElement(elementInput);

        System.out.println();
        ArrayList<WebElement> elements = new ArrayList<>();
        elements.add(new Link());
        elements.add(new Link());
        elements.add(new Input());
        elements.add(new Input());

        for (WebElement element: elements){
            WebDriverUtil.clickElement(element);
        }

    }
}
