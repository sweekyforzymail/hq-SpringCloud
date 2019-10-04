package com.hq.club.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hq.club.service.ClubService;

import common.BaseController;

/**
 * 俱乐部 信息操作处理
 * 
 * 
 */
@RestController
@RequestMapping("/club")
public class ClubController extends BaseController {

	@Autowired
	private ClubService clubservice;
	@Autowired
	private DiscoveryClient dc;

	/**
	 * 获取俱乐部（by id） 兼（提供方）
	 */
	@GetMapping("/getClubSigle")
	public Object getClubSigle(@RequestParam Map<String, Object> paramMap) {
		return clubservice.selectClubById(paramMap.get("clubId").toString());
	}

	/**
	 * cloud 简要信息
	 */
	@GetMapping("/serverInfo")
	public Object serverInfo() {
		return discoveryListInfo(dc, "HQCLOUD-CLUB");
	}

}
