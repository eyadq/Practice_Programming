package day35_tasks;

public class AllClassesDiscord {

    public static void main(String[] args) {

        DiscordUser user1 = new DiscordUser("teacher", "Tom Jerry", 1);
        System.out.println(user1);


        Admin user2 = new Admin("admin", "Mickey Mouse", 2);
        user2.createChannel();
        System.out.println(user2);

        Student user3 = new Student("student", "Bob Jones", 3);
        user3.sendMessage();
        System.out.println(user3);
    }
}
