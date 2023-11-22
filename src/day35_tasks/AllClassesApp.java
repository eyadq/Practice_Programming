package day35_tasks;

public class AllClassesApp {

    public static void main(String[] args) {
        App app1 = new App("Twitter", 2.0);
        app1.download();
        System.out.println(app1);

        Instagram app2 = new Instagram(1.2);
        app2.download();
        app2.postPicture();
        System.out.println(app2);


        Youtube app3 = new Youtube(2.0);
        app3.download();
        app3.watchVideo();
        System.out.println(app3);
    }



}
