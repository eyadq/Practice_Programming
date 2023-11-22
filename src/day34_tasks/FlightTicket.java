package day34_tasks;

public class FlightTicket {

    private String type;
    private String locationDepature;
    private String locationArrival;

    public static void main(String[] args) {
        FlightTicket ticket = new FlightTicket("business", "Mexico", "Canada");
        System.out.println(ticket);
    }

    public FlightTicket(String type, String locationDepature, String locationArrival) {
        setType(type.toLowerCase().trim());
        setLocationDepature(locationDepature);
        setLocationArrival(locationArrival);
    }

    @Override
    public String toString() {
        return type +" Ticket" +
                "\n\tLocation Depature: " + locationDepature +
                "\n\tLocation Arrival: " + locationArrival;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        switch(type){
            case "first":
                this.type = "First";
                break;
            case "business":
                this.type = "Business";
                break;
            case "economy":
                this.type = "Economy";
                break;
            default:
                System.out.println("Ticket can only be \"first\", \"business\", or \"economy\".");
        }
    }

    public String getLocationDepature() {
        return locationDepature;
    }

    public void setLocationDepature(String locationDepature) {
        this.locationDepature = locationDepature;
    }

    public String getLocationArrival() {
        return locationArrival;
    }

    public void setLocationArrival(String locationArrival) {
        this.locationArrival = locationArrival;
    }
}
