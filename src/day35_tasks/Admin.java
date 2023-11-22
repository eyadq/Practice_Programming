package day35_tasks;

public class Admin extends DiscordUser{

    public Admin(String role, String name, int id){
        super(role, name, id);
    }

    public void createChannel(){
        System.out.println("Creating new discord channel");
    }
}
