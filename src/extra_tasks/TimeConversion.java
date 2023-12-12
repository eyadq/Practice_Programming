package extra_tasks;

public class TimeConversion {

    public static void main(String[] args) {

        String time = "12:01:00PM";
        System.out.println(formatTime(time));

        String laterTime = "07:05:45PM";
        System.out.println(formatTime(laterTime));
    }

    public static String formatTime(String time){
        String timeFormatted = "";

        String modifier = time.substring(8);
        int hour = Integer.valueOf(time.substring(0, 2));

        if(modifier.equals("PM")){
            hour += 12;
        }
        if(hour >= 24){
            hour -= 24;
        }
        if(("" + hour).length() == 1){
            timeFormatted += "0" + hour;
        } else {
            timeFormatted += "" + hour;
        }

        return timeFormatted + time.substring(2, 8);
    }
}
