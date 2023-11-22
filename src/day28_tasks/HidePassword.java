package day28_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {

    public static void main(String[] args) {

        ArrayList<String> passwords = new ArrayList<>(
                Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));

        hidePasswords(passwords);
    }

    public static void hidePasswords(ArrayList<String> list){
        ArrayList<String> passwords = new ArrayList<>();
        for (String password: list) {
            String hidden = "";
            for (int i = 0; i < password.length(); i++) {
                hidden += "*";
            }
            passwords.add(hidden);
        }
        System.out.println(passwords);
    }
}
