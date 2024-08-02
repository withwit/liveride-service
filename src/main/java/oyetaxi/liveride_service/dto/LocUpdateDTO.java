package oyetaxi.liveride_service.dto;

public class LocUpdateDTO {
    private String curloc;

    @Override
    public String toString() {
        return "LocUpdateDTO{" +
                "curloc='" + curloc + '\'' +
                '}';
    }

    public String getCurloc() {
        return curloc;
    }

    public void setCurloc(String curloc) {
        this.curloc = curloc;
    }


}
