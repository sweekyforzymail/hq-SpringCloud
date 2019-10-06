package com.hq.training.serverFromClub;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 服务调用类
 */
@FeignClient(name = "hqcloud-club")
public interface EurekaServerClub {

	/**
	 * 除方法名可自定义外其余必须与提供方接口完全一致（包括：注解、映射名称、参数列表）
	 */
	@GetMapping(value = "/club/getClubSigle")
	public Object clubSigle(@RequestParam Map<String, Object> paramMap);

}
