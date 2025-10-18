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
 * 售后服务
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-11-25 14:43:31
 */
@TableName("shouhoufuwu")
public class ShouhoufuwuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShouhoufuwuEntity() {
		
	}
	
	public ShouhoufuwuEntity(T t) {
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
    @TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 类型
	 */
					
	private String leixing;
	
	/**
	 * 商品图片
	 */
					
	private String shangpintupian;
	
	/**
	 * 服务内容
	 */
					
	private String fuwuneirong;
	
	/**
	 * 申请原因
	 */
					
	private String shenqingyuanyin;
	
	/**
	 * 申请时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shenqingshijian;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 商家号
	 */
					
	private String shangjiahao;
	
	/**
	 * 商家名称
	 */
					
	private String shangjiamingcheng;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
	/**
	 * 设置：类型
	 */
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
	/**
	 * 设置：商品图片
	 */
	public void setShangpintupian(String shangpintupian) {
		this.shangpintupian = shangpintupian;
	}
	/**
	 * 获取：商品图片
	 */
	public String getShangpintupian() {
		return shangpintupian;
	}
	/**
	 * 设置：服务内容
	 */
	public void setFuwuneirong(String fuwuneirong) {
		this.fuwuneirong = fuwuneirong;
	}
	/**
	 * 获取：服务内容
	 */
	public String getFuwuneirong() {
		return fuwuneirong;
	}
	/**
	 * 设置：申请原因
	 */
	public void setShenqingyuanyin(String shenqingyuanyin) {
		this.shenqingyuanyin = shenqingyuanyin;
	}
	/**
	 * 获取：申请原因
	 */
	public String getShenqingyuanyin() {
		return shenqingyuanyin;
	}
	/**
	 * 设置：申请时间
	 */
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：商家号
	 */
	public void setShangjiahao(String shangjiahao) {
		this.shangjiahao = shangjiahao;
	}
	/**
	 * 获取：商家号
	 */
	public String getShangjiahao() {
		return shangjiahao;
	}
	/**
	 * 设置：商家名称
	 */
	public void setShangjiamingcheng(String shangjiamingcheng) {
		this.shangjiamingcheng = shangjiamingcheng;
	}
	/**
	 * 获取：商家名称
	 */
	public String getShangjiamingcheng() {
		return shangjiamingcheng;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
