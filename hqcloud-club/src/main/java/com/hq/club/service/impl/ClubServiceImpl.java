package com.hq.club.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hq.club.mapper.ClubMapper;
import com.hq.club.service.ClubService;
import com.hq.entity.Club;

/**
 * 俱乐部 服务层实现
 * 
 */
@Service
public class ClubServiceImpl implements ClubService {

	@Autowired
	private ClubMapper clubMapper;

	/**
	 * 查询俱乐部信息
	 * 
	 * @param clubId
	 *            俱乐部ID
	 * @return 俱乐部信息
	 */
	public Club selectClubById(String clubId) {
		return clubMapper.selectClubById(clubId);
	}

	/**
	 * 查询俱乐部列表
	 * 
	 * @param club
	 *            俱乐部信息
	 * @return 俱乐部集合
	 */

	public List<Club> selectClubList(Club club) {
		return clubMapper.selectClubList(club);
	}

	/**
	 * 新增俱乐部
	 * 
	 * @param club
	 *            俱乐部信息
	 * @return 结果
	 */

	public int insertClub(Club club) {
		return clubMapper.insertClub(club);
	}

	/**
	 * 修改俱乐部
	 * 
	 * @param club
	 *            俱乐部信息
	 * @return 结果
	 */

	public int updateClub(Club club) {
		return clubMapper.updateClub(club);
	}

	/**
	 * 删除俱乐部对象
	 * 
	 * @param ids
	 *            需要删除的数据ID
	 * @return 结果
	 */

	public int deleteClubByIds(String ids) {
		return 0;
	}

	/**
	 * 上传Logo图片
	 */

	public int updateLogoById(Club club) {
		return clubMapper.updateLogoById(club);
	}

	/**
	 * 获取多个俱乐部 （BY ids）
	 */

	public List<Club> selectClubByIds(String[] strArrClubIds) {
		return clubMapper.selectClubByIds(strArrClubIds);
	}

	/**
	 * 查找是否存在关联关系
	 */

	public int findClubTrainingRalation(Map<String, Object> objMap) {
		return clubMapper.findClubTrainingRalation(objMap);
	}

	/**
	 * 添加关联关系
	 */

	public int insertClubTrainingRalation(Map<String, Object> map) {
		return clubMapper.insertClubTrainingRalation(map);
	}

	/**
	 * 查找俱乐部机构关系（by clubIds）
	 */

	public List<Map<String, Object>> selectRalationByClubIds(String[] strArrClubIds) {
		return clubMapper.selectRalationByClubIds(strArrClubIds);
	}

	/**
	 * 查询俱乐部加入状态
	 *
	 * @param clubId
	 *            俱乐部ID
	 * @param createBy
	 * @return 俱乐部信息
	 */

	public int selectClubJoinStatus(String clubId, String createBy) {
		return clubMapper.selectClubJoinStatus(clubId, createBy);
	}

	/**
	 * 修改俱乐部加入人数
	 *
	 * @param club
	 *            俱乐部信息
	 * @return 结果
	 */

	public int updateClubMemberNum(Club club) {
		return clubMapper.updateClubMemberNum(club);
	}

	public List<Club> selectByOrgId(String orgId) {
		return clubMapper.selectByOrgId(orgId);
	}
}
