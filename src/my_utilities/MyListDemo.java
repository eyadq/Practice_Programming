package my_utilities;

public class MyListDemo {

    public static void main(String[] args) {

        MyList list = new MyList();

        list.append("First");
        System.out.println(list);
        list.append("Second");
        list.append("Third");
        list.append("Forth");
        System.out.println(list);

        for (int i = 0; i < list.length(); i++) {
            System.out.println(list.StringAt(i));
        }

        list.append(0, "Last");
        System.out.println(list);


    }
}
