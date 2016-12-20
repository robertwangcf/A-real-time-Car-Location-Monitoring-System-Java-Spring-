package teacher.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class CurrentPosition {

    private String vin;
    private Point location;
    private VehicleStatus vehicleStatus = VehicleStatus.NONE;
    private Double speed;
    private Double heading;
    private FaultCode faultCode;
    private ServiceLocation serviceLocation;
}
