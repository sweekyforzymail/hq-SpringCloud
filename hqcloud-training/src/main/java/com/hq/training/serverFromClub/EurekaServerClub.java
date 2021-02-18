package com.hq.training.serverFromClub;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hq.training.serverFromClub.fallbackFactory.EurekaServiceFallbackFactory;

/**
 * 服务调用类 fallback/fallbackFactory --> 熔断
 * 
 * fallback(返回简要结果) fallbackFactory(返回详细结果，不支持GetMapping)
 */
@FeignClient(name = "hqcloud-club", fallbackFactory = EurekaServiceFallbackFactory.class)
public interface EurekaServerClub {

	/*
	 * 不使用fallbackFactory时可以选择使用该种方式
	 */
	// public static String fallBackMethod() {
	// System.out.println("////--->服务调用后，出现异常，因此调用该方法 ... ...");
	// return "Service Failded.";
	// }

	/**
	 * 除方法名可自定义外其余必须与提供方接口完全一致（包括：注解、映射名称、参数列表）
	 */
	@RequestMapping(value = "/club/getClubSigle")
	// @HystrixCommand(defaultFallback = "fallBackMethod")
	public Object clubSigle(@RequestParam Map<String, Object> paramMap);

}
