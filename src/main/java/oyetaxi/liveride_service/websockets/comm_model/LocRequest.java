package oyetaxi.liveride_service.websockets.comm_model;

public class LocRequest {
    //to distinguish rider/driver
    private String type;
    private String driver_id;
    private String rider_id;
    private String ride_id;

    //type of action the request wants to perform (get loc, cancel ride, sos)
    private String action;

    //from the sender to service
    private String curLoc;
    private String destLoc;

    public LocRequest() {
    }

    public LocRequest(String type, String driver_id, String rider_id, String ride_id, String action, String curLoc, String destLoc) {
        this.type = type;
        this.driver_id = driver_id;
        this.rider_id = rider_id;
        this.ride_id = ride_id;
        this.action = action;
        this.curLoc = curLoc;
        this.destLoc = destLoc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }

    public String getRider_id() {
        return rider_id;
    }

    public void setRider_id(String rider_id) {
        this.rider_id = rider_id;
    }

    public String getRide_id() {
        return ride_id;
    }

    public void setRide_id(String ride_id) {
        this.ride_id = ride_id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getCurLoc() {
        return curLoc;
    }

    public void setCurLoc(String curLoc) {
        this.curLoc = curLoc;
    }

    public String getDestLoc() {
        return destLoc;
    }

    public void setDestLoc(String destLoc) {
        this.destLoc = destLoc;
    }


}
