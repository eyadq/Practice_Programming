package day22_tasks;

public class AWSZones {

    public static void main(String[] args) {
        String[] zones = {"us-east-1","us-west-1","us-west-2","us-west-3"};
        String appName = "etsy";

        for (int i = 0; i < zones.length; i++) {
            System.out.println("Deploying " + appName + " to " + zones[i] + "...");
            System.out.println("Deployment completed for " + zones[i]);
        }
    }

}
