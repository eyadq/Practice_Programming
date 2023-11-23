package day37_tasks.person;

public class UseAll {

    public static void main(String[] args) {
        //Since person is abstract class, can use by creating ANONYMOUS class that extends abstract
        Person person = new Person("John", 50) {
            @Override
            public void hobby() {
                System.out.println("Making people noises");
            }
        };

        person.hobby();
        System.out.println(person); //Employee clas overrides toString but Person does not
        System.out.println();

        //Again person2 is ANONYMOUS class that extends Employee but we can use it as Employee object
        Employee person2 = new Employee("Sarah", 25, "Teacher", 45_000) {
            @Override
            public void work() {
                System.out.println("Teaching the class");
            }

            @Override
            public void hobby() {
                System.out.println("Not with kids");
            }
        };
        person2.hobby();
        person2.work();
        System.out.println(person2);
        System.out.println();

        Tester person3 = new Tester("Kat", 50, "Tester", 120_000);
        person3.hobby();
        person3.work();
        System.out.println(person3);
        System.out.println();

        Chef person4 = new Chef("Gordon", 40, "Master Chef", 999_000);
        person4.hobby();
        person4.work();
        System.out.println(person4);
        System.out.println();
    }

}
