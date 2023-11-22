package day15_tasks;

public class SMSPart {

    public static void main(String[] args) {
        String str = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}";
        String sender = str.substring(str.indexOf('<') + 1, str.indexOf('>'));
        System.out.println(sender);
        String number = str.substring(str.indexOf('[') + 1, str.indexOf(']'));
        System.out.println(number);
        String message = str.substring(str.indexOf('{') + 2, str.indexOf('}'));
        System.out.println(message);
    }
}
