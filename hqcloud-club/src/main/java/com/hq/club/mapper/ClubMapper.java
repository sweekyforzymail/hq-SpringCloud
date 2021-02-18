package com.hq.club.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hq.entity.Club;

/**
 * 俱乐部 数据层
 * 
 * @author muRen
 * @date 2019-04-11
 */
@Mapper
public interface ClubMapper {
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
	 * 删除俱乐部
	 * 
	 * @param clubId
	 *            俱乐部ID
	 * @return 结果
	 */
	public int deleteClubById(String clubId);

	/**
	 * 批量删除俱乐部
	 * 
	 * @param clubIds
	 *            需要删除的数据ID
	 * @return 结果
	 */
	public int deleteClubByIds(String[] clubIds);

	/**
	 * 获取多个俱乐部 （BY ids）
	 */
	List<Club> selectClubByIds(String[] clubIds);

	/**
	 * 上传Logo图片
	 */
	int updateLogoById(Club club);

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
	public int selectClubJoinStatus(@Param("clubId") String clubId, @Param("createBy") String createBy);

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