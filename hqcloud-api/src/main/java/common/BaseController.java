package common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

public class BaseController {

	public Object discoveryListInfo(DiscoveryClient dc, String insctanceName) {
		ServiceInstance serviceInstance = dc.getInstances(insctanceName).get(0);
		Map<String, Object> mapCase = new HashMap<String, Object>();
		mapCase.put("Uri:", serviceInstance.getUri());
		mapCase.put("ServiceId:", serviceInstance.getServiceId());
		mapCase.put("Host:", serviceInstance.getHost());
		mapCase.put("Port:", serviceInstance.getPort());
		return mapCase;
	}
}
