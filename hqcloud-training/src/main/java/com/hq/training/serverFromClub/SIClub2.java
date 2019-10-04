package com.hq.training.serverFromClub;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hqcloud-club")
public interface SIClub2 {

	/**
	 * 必须与提供方接口完全一致
	 */
	@GetMapping(value = "/club/getClubSigle")
	public Object getClubSigle(@RequestParam Map<String, Object> paramMap);
}
