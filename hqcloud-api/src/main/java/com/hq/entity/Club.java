package com.hq.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 俱乐部表 tb_hq_club
 * 
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Club implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 主键 */
	private String clubId;
	/** 俱乐部名称 */
	private String clubName;
	/** 组织ID */
	private String orgId;
	/** logo地址 */
	private String logoUrl;
	/** 成员数 */
	private Integer memberNum;
	/** 俱乐部简介 */
	private String clubSummary;
	/** 费用 */
	private Double cOST;
	/** 创建人 */
	private String createBy;
	/** 创建时间 */
	private String createDate;
	/** 修改人 */
	private String updateBy;
	/** 修改时间 */
	private String updateDate;
	/** 删除标记位 */
	private String delFlag;
	/** 备注 */
	private String rEMARK;
	/** 组织名称 */
	private String orgName;

	private String clubCoachId;
}
