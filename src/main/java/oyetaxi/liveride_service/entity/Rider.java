package oyetaxi.liveride_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "rider")
@Entity
public class Rider {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "ride_id")
    private String ride;
    @Column(name = "curloc")
    private String curloc;
    @Column(name = "is_active")
    private Boolean active;

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


    public String getCurloc() {
        return curloc;
    }

    public void setCurloc(String curloc) {
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
                ", curloc=" + curloc +
                ", active=" + active +
                '}';
    }
}
