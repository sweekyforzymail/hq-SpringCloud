package com.hq.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 教练表
 * 
 * @author muRen
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Coach implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 主键 */
	private String coachId;
	/** 教练姓名 */
	private String coachName;
	/** 教练头像路径 */
	private String coachHeadPortraitUrl;
	/** 教练性别 */
	private String coachSex;
	/** 电话 */
	private String phoneNo;
	/** 教练介绍 */
	private String coachInfo;
	/** 主要功绩 */
	private String coachFeats;
}
