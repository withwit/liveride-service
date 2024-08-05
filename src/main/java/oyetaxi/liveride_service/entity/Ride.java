package oyetaxi.liveride_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Document(collection = "ridecluster")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ride {


    @Id
    @Column(name="_id")
    private String id;
    @Column(name = "rider_id")
    private String rider;
    @Column(name = "driver_id")
    private String driver;
    @Column(name = "timestamp")
    private LocalDateTime timestamp;
    @Column(name = "loc")
    private String location;
    @Column(name = "status")
    private String status;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRider() {
        return rider;
    }

    public void setRider(String rider) {
        this.rider = rider;
    }


    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "id='" + id + '\'' +
                ", rider='" + rider + '\'' +
                ", driver='" + driver + '\'' +
                ", timestamp=" + timestamp +
                ", location='" + location + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
