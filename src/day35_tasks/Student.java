package day35_tasks;

public class Student extends DiscordUser{

    public Student(String role, String name, int id){
        super(role, name, id);
    }

    public void sendMessage(){
        System.out.println("Send message to group chat");
    }
}
