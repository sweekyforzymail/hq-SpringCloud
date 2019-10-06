package com.hq.training.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.druid.support.json.JSONUtils;
import com.hq.entity.Club;
import com.hq.training.serverFromClub.CloudServerNames;
import com.hq.training.serverFromClub.EurekaServerClub;

/**
 * 消费端
 * 
 * Server_Instance_Club
 */
@RestController
@RequestMapping("/test")
public class TestController {

	private final String PERFIX_SERVER_URL = CloudServerNames.CLUB_URL.getServerUrl();

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private EurekaServerClub eurekaServerClub;

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
		Object obj = eurekaServerClub.clubSigle(paramMap);
		if (ObjectUtils.isEmpty(obj)) {
			return "FILER2";
		} else {
			return JSONUtils.toJSONString(obj);
		}
	}
}
