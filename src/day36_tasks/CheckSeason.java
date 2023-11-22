package day36_tasks;

public class CheckSeason {
    public static void main(String[] args) {
        Season season = new Season("Season ", 120, -5);
        System.out.println(season);
        season.activity();

        Winter winter = new Winter(40, -5);
        System.out.println(winter);
        winter.activity();

        Spring spring = new Spring(70, 40);
        System.out.println(spring);
        spring.activity();

        Summer summer = new Summer(120, 70);
        System.out.println(summer);
        summer.activity();

        Fall fall = new Fall(70, 40);
        System.out.println(fall);
        fall.activity();
    }
}
