package com.tomtop.msite.entitys.pgsql.member;

import java.io.Serializable;
import java.util.Date;

/**
 * 账户基本信息
 * <p>t_account_base
 * 
 * @author ye_ziran
 * @since 2016年4月11日 上午11:56:53
 */
public class AccountBase implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6090926795400373142L;
	
	private int id;
	private String accountName;//账户名
	private int memberId;//用户id
	private String memberEmail;
	private String cellphone;//手机号
	private String password;//密码
	private int origin;//账户来源；10 Hk注册会员,11 Bbc订购人, 12 M站, 20,微信, 30其他 
	private Date createDate;
	private String createBy;
	private Date updateDate;
	private String updateBy;
	private Boolean activated;
	private String aboutme;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getOrigin() {
		return origin;
	}
	public void setOrigin(int origin) {
		this.origin = origin;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public Boolean isActivated() {
		return activated;
	}
	public void setActivated(Boolean activated) {
		this.activated = activated;
	}
	public String getAboutme() {
		return aboutme;
	}
	public void setAboutme(String aboutme) {
		this.aboutme = aboutme;
	}
	
}
