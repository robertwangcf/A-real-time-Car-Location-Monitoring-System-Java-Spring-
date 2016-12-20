package teacher;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationDashboardRestApi {

    @Value("${stomp.url}")
    private String stompUrl;

    @RequestMapping("/clientConfig")
    @ResponseBody
    public String config() throws Exception {
//		String url = null;
//		try {
//			url = getServiceUrl(SERVICE_LOCATION_UPDATER);
//		} catch (Exception t) {
//		}
//		return url == null || url.isEmpty() ? this.stompUrl : url + "/stomp";
        return stompUrl;
    }
}
