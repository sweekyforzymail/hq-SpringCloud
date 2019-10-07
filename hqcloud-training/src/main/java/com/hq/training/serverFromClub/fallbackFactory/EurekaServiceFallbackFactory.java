package com.hq.training.serverFromClub.fallbackFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

import com.hq.training.serverFromClub.EurekaServerClub;

import feign.hystrix.FallbackFactory;

/**
 * 熔断（实现类）
 */
@Component
public class EurekaServiceFallbackFactory implements FallbackFactory<EurekaServerClub> {

	private Map<String, Object> errorMapper = null;

	private Map<String, Object> errorMapper() {
		errorMapper = new ConcurrentHashMap<String, Object>();
		errorMapper.put("CODE", "200");
		errorMapper.put("EXPLAIN",
				"Access service failed. What are the exceptions of the service providers that need to be confirmed.");
		errorMapper.put("MSG", "Service ERROR>>>");
		return errorMapper;
	}

	@Override
	public EurekaServerClub create(Throwable arg0) {
		errorMapper();
		return new EurekaServiceWithFallbackFactory() {
			public Object clubSigle(Map<String, Object> paramMap) {
				return errorMapper;
			}
		};
	}

}
