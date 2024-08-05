package oyetaxi.liveride_service.websockets.comm_model;

public class LocResponse {

    //type of action the request performed ( loc, cancelled ride, sos)
    private String action;

    //from the service to driver
    private String curLoc;
    private String destLoc;

    public LocResponse(String action) {
        this.action = action;
    }

    public LocResponse() {
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
