package com.czr.frame.beans;

import java.util.Date;

/**
 * �û�
 * 
 * @author chenzhirong
 */

public class User {
    /**
     * id
     */
	private Long objId;
	/**
	 * ����
	 */
	private String name;
	/**
	 * ����
	 */
	private Date birthday;
	/**
	 * ����ʱ��
	 */
	private Date createtime;
	/**
	 * ����ʱ��
	 */
	private Date updatetime;

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public Long getObjId() {
		return objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
