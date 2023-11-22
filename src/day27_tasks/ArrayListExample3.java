package day27_tasks;

import java.util.ArrayList;

public class ArrayListExample3 {

    public static void main(String[] args) {
        ArrayList <Character> characters = new ArrayList<>();
        int length = 'Z' - 'A' + 1;
        for (int i = 0; i < length; i++) {
            char currentChar = (char)('A' + i);
            characters.add((currentChar));
        }
        System.out.println(characters);
    }
}
