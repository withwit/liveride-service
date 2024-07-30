package oyetaxi.liveride_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Table(name = "rider")
@Entity
public class Rider {
    @Id
    @Column(name="id")
    private String id;
    private  String name;
    private  String ride;
    private List<String> history;
    private  List<String> curloc;
    private  Boolean active ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRide() {
        return ride;
    }

    public void setRide(String ride) {
        this.ride = ride;
    }

    public List<String> getHistory() {
        return history;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }

    public List<String> getCurloc() {
        return curloc;
    }

    public void setCurloc(List<String> curloc) {
        this.curloc = curloc;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", ride='" + ride + '\'' +
                ", history=" + history +
                ", curloc=" + curloc +
                ", active=" + active +
                '}';
    }
}
