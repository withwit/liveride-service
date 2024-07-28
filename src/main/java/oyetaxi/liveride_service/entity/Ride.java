package oyetaxi.liveride_service.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
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
    private String id;
    private String rider;
    private String driver;
    private LocalDateTime timestamp;
    private String location;
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
