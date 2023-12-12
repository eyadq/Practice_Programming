package extra_tasks;

public class ElectronicsShop {

    public static void main(String[] args) {
        System.out.println(getMoneySpent(new int[]{40, 50, 60}, new int[]{5, 8, 12}, 60));
        System.out.println(getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10));
        System.out.println(getMoneySpent(new int[]{4}, new int[]{5}, 5));

    }

    public static int getMoneySpent(int[] keyboards, int[]drives, int budget){
        int largestSum = 0;

        int keyboardPrice = 0;
        int drivePrice = 0;

        for (int keyboard : keyboards){
            for (int drive: drives){
                int total = keyboard + drive;
                if(total < budget && total > largestSum){
                    largestSum = total;
                    keyboardPrice = keyboard;
                    drivePrice = drive;
                }
            }
        }

        return (largestSum > 0) ? largestSum : -1;
    }
}
