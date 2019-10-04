package com.hq.training.serverFromClub;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hq.entity.Club;

/**
 * 消费端
 * 
 * Server_Instance_Club
 */
@RestController
@RequestMapping("/siClub")
public class SIClub {

	private final String PERFIX_SERVER_URL = CloudServerNames.CLUB_URL.getServerUrl();

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private SIClub2 siClub;

	/**
	 * 消费方式 一 （restTemplate 方式）
	 */
	@GetMapping("/sigleClubFromClub")
	public Object sigleClubFromClub(@RequestParam Map<String, Object> paramMap) {

		Object obj = restTemplate.getForObject(PERFIX_SERVER_URL + "/club/getClubSigle?clubId={clubId}", Club.class,
				paramMap);
		if (ObjectUtils.isEmpty(obj)) {
			return "FILER";
		} else {
			return "SUCCESS";// PS:当时用该方式时，服务提供方返回值为 "SUCCESS" 时，消费端不开心
		}
	}

	/**
	 * 消费方式 二 （feign 主流方式）
	 */
	@GetMapping("/sigleClubFromClub2")
	public Object sigleClubFromClub2(@RequestParam Map<String, Object> paramMap) {
		Object obj = siClub.getClubSigle(paramMap);
		if (ObjectUtils.isEmpty(obj)) {
			return "FILER2";
		} else {
			return "SUCCESS2";
		}
	}
}
