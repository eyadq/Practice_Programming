package extra_tasks;

public class NumberLineJumps {

    public static void main(String[] args) {
        int x1 = 2;
        int v1 = 1;

        int x2= 1;
        int v2 = 2;
        System.out.println(canLandAtSamePoint(x1, v1, x2, v2));
        System.out.println(canLandAtSamePoint(0, 3, 4, 2));
        System.out.println(canLandAtSamePoint(0, 2, 5, 3));
    }

    public static String canLandAtSamePoint(int startPoint1, int velocity1, int startPoint2, int velocity2){
        int behind = (startPoint1 > startPoint2) ? startPoint1 : startPoint2;
        int behindVelocity = (behind == startPoint1) ? velocity1 : velocity2;
        int slowestVelocity = (velocity1 > velocity2) ? velocity1 : velocity2;

        if(behindVelocity == slowestVelocity){
            return "NO";
        }

        int position1 = startPoint1;
        int position2 = startPoint2;

        for (int i = 0; i < 10; i++) {
            position1 += velocity1;
            position2 += velocity2;
            if(position1== position2){
                return "YES";
            }
        }
        return "NO";
    }
}
