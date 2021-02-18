package com.hq.club.service;

import java.util.List;
import java.util.Map;

import com.hq.entity.Club;

/**
 * 俱乐部 服务层
 * 
 * @author muRen
 * @date 2019-04-11
 */
public interface ClubService {
	/**
	 * 查询俱乐部信息
	 * 
	 * @param clubId
	 *            俱乐部ID
	 * @return 俱乐部信息
	 */
	public Club selectClubById(String clubId);

	/**
	 * 查询俱乐部列表
	 * 
	 * @param club
	 *            俱乐部信息
	 * @return 俱乐部集合
	 */
	public List<Club> selectClubList(Club club);

	/**
	 * 新增俱乐部
	 * 
	 * @param club
	 *            俱乐部信息
	 * @return 结果
	 */
	public int insertClub(Club club);

	/**
	 * 修改俱乐部
	 * 
	 * @param club
	 *            俱乐部信息
	 * @return 结果
	 */
	public int updateClub(Club club);

	/**
	 * 删除俱乐部信息
	 * 
	 * @param ids
	 *            需要删除的数据ID
	 * @return 结果
	 */
	public int deleteClubByIds(String ids);

	int updateLogoById(Club club);

	/**
	 * 获取多个俱乐部 （BY ids）
	 */
	List<Club> selectClubByIds(String[] strArrClubIds);

	/**
	 * 查找是否存在关联关系
	 */
	int findClubTrainingRalation(Map<String, Object> objMap);

	/**
	 * 添加关联关系
	 */
	int insertClubTrainingRalation(Map<String, Object> map);

	/**
	 * 查找俱乐部机构关系（by clubIds）
	 */
	List<Map<String, Object>> selectRalationByClubIds(String[] strArrClubIds);

	/**
	 * 查询俱乐部加入状态
	 *
	 * @param clubId
	 *            俱乐部ID
	 * @param createBy
	 * @return 俱乐部信息
	 */
	public int selectClubJoinStatus(String clubId, String createBy);

	/**
	 * 修改俱乐部加入人数
	 *
	 * @param club
	 *            俱乐部信息
	 * @return 结果
	 */
	public int updateClubMemberNum(Club club);

	List<Club> selectByOrgId(String orgId);

}
