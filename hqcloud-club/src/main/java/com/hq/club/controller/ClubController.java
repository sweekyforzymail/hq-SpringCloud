package com.hq.club.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hq.club.service.ClubService;
import com.hq.entity.Club;

/**
 * 俱乐部 信息操作处理
 * 
 */
@RestController
@RequestMapping("/club")
public class ClubController {

	@Autowired
	private ClubService clubservice;

	@GetMapping("/getClubSigle")
	public Object getClubSigle(@RequestParam Map<String, Object> paramMap) {
		Club selectClubById = clubservice.selectClubById(paramMap.get("clubId").toString());
		if (ObjectUtils.isEmpty(selectClubById)) {
			return "FILER";
		} else {
			return "SUCCESS";
		}
	}

}
