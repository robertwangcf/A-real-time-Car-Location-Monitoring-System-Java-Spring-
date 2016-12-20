package teacher;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import teacher.model.CurrentPosition;
//import teacher.service.ServiceLocationService;

@MessageEndpoint
@EnableBinding(Sink.class)
public class LocationUpdaterSink {

    @Autowired
    private SimpMessagingTemplate template;

    @Autowired
    private ObjectMapper objectMapper;

    //@Autowired
    // private ServiceLocationService serviceLocationService;

    @ServiceActivator(inputChannel = Sink.INPUT)
    public void updateLocationaddServiceLocations(String input) throws Exception {

        CurrentPosition payload = this.objectMapper.readValue(input, CurrentPosition.class);

//		serviceLocationService.updateServiceLocations(payload);

        this.template.convertAndSend("/topic/vehicles", payload);
    }

}
