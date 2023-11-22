package day05_tasks;

public class ColumbusSailed {

    public static void main(String[] args) {

        int year = 1491;

        String statement = "IN " + year + " COLUMBUS SAILED THE OCEANBLUE";

        System.out.println(statement);
        System.out.println("Now rewriting history so Columbus sailed in 1492");
        year = 1492;
        statement = "IN " + year + " COLUMBUS SAILED THE OCEANBLUE";
        System.out.println(statement);
    }
}
