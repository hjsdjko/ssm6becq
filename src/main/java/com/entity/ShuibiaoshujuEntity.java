package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 水表数据
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
@TableName("shuibiaoshuju")
public class ShuibiaoshujuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShuibiaoshujuEntity() {
		
	}
	
	public ShuibiaoshujuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 业主账号
	 */
					
	private String yezhuzhanghao;
	
	/**
	 * 业主姓名
	 */
					
	private String yezhuxingming;
	
	/**
	 * 楼房号
	 */
					
	private String loufanghao;
	
	/**
	 * 仪表编号
	 */
					
	private String yibiaobianhao;
	
	/**
	 * 水表位数
	 */
					
	private Integer shuibiaoweishu;
	
	/**
	 * 用水吨数
	 */
					
	private Integer yongshuidunshu;
	
	/**
	 * 月份
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date yuefen;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 员工姓名
	 */
					
	private String yuangongxingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：业主账号
	 */
	public void setYezhuzhanghao(String yezhuzhanghao) {
		this.yezhuzhanghao = yezhuzhanghao;
	}
	/**
	 * 获取：业主账号
	 */
	public String getYezhuzhanghao() {
		return yezhuzhanghao;
	}
	/**
	 * 设置：业主姓名
	 */
	public void setYezhuxingming(String yezhuxingming) {
		this.yezhuxingming = yezhuxingming;
	}
	/**
	 * 获取：业主姓名
	 */
	public String getYezhuxingming() {
		return yezhuxingming;
	}
	/**
	 * 设置：楼房号
	 */
	public void setLoufanghao(String loufanghao) {
		this.loufanghao = loufanghao;
	}
	/**
	 * 获取：楼房号
	 */
	public String getLoufanghao() {
		return loufanghao;
	}
	/**
	 * 设置：仪表编号
	 */
	public void setYibiaobianhao(String yibiaobianhao) {
		this.yibiaobianhao = yibiaobianhao;
	}
	/**
	 * 获取：仪表编号
	 */
	public String getYibiaobianhao() {
		return yibiaobianhao;
	}
	/**
	 * 设置：水表位数
	 */
	public void setShuibiaoweishu(Integer shuibiaoweishu) {
		this.shuibiaoweishu = shuibiaoweishu;
	}
	/**
	 * 获取：水表位数
	 */
	public Integer getShuibiaoweishu() {
		return shuibiaoweishu;
	}
	/**
	 * 设置：用水吨数
	 */
	public void setYongshuidunshu(Integer yongshuidunshu) {
		this.yongshuidunshu = yongshuidunshu;
	}
	/**
	 * 获取：用水吨数
	 */
	public Integer getYongshuidunshu() {
		return yongshuidunshu;
	}
	/**
	 * 设置：月份
	 */
	public void setYuefen(Date yuefen) {
		this.yuefen = yuefen;
	}
	/**
	 * 获取：月份
	 */
	public Date getYuefen() {
		return yuefen;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：员工姓名
	 */
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}

}
