package day27_tasks;

import java.util.ArrayList;

public class ArrayListExample4 {

    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();
        int length = 'Z' - 'A' + 1;
        for (int i = 0; i < length; i++) {
            char currentChar = (char)('a' + i);
            characters.add((currentChar));
        }
        System.out.println(characters);
        characters.remove(Character.valueOf('a'));
        characters.remove(Character.valueOf('e'));
        characters.remove(Character.valueOf('i'));
        characters.remove(Character.valueOf('o'));
        characters.remove(Character.valueOf('u'));
        characters.remove(Character.valueOf('y'));
        System.out.println(characters);
    }
}
