package day35_tasks;

public class DiscordUser {

    private String role;
    private String name;
    private int id;

    public DiscordUser(String role, String name, int id){
        setRole(role);
        setName(name);
        setId(id);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User: " + name +
                "\n\trole: '" + role +
                "\n\tid: " + id;
    }
}
