package com.jshop.entity;

// Generated 2014-10-9 18:51:28 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * WeixinMediaFileT generated by hbm2java
 */
@Entity
@Table(name = "weixin_media_file_t", catalog = "jshoper3")
public class WeixinMediaFileT implements java.io.Serializable {

	private String id;
	private String type;
	private String filename;
	private String filesize;
	private String mediaId;
	private String status;
	private Date createtime;
	private Date updatetime;
	private String creatorid;
	private String jshoperxid;
	private String shopid;

	public WeixinMediaFileT() {
	}

	public WeixinMediaFileT(String id, String type, String filename,
			String filesize, String mediaId, String status, Date createtime,
			Date updatetime, String creatorid) {
		this.id = id;
		this.type = type;
		this.filename = filename;
		this.filesize = filesize;
		this.mediaId = mediaId;
		this.status = status;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.creatorid = creatorid;
	}

	public WeixinMediaFileT(String id, String type, String filename,
			String filesize, String mediaId, String status, Date createtime,
			Date updatetime, String creatorid, String jshoperxid, String shopid) {
		this.id = id;
		this.type = type;
		this.filename = filename;
		this.filesize = filesize;
		this.mediaId = mediaId;
		this.status = status;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.creatorid = creatorid;
		this.jshoperxid = jshoperxid;
		this.shopid = shopid;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "TYPE", nullable = false, length = 45)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "FILENAME", nullable = false)
	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Column(name = "FILESIZE", nullable = false)
	public String getFilesize() {
		return this.filesize;
	}

	public void setFilesize(String filesize) {
		this.filesize = filesize;
	}

	@Column(name = "MEDIA_ID", nullable = false, length = 256)
	public String getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	@Column(name = "STATUS", nullable = false, length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "JSHOPERXID", length = 20)
	public String getJshoperxid() {
		return this.jshoperxid;
	}

	public void setJshoperxid(String jshoperxid) {
		this.jshoperxid = jshoperxid;
	}

	@Column(name = "SHOPID", length = 20)
	public String getShopid() {
		return this.shopid;
	}

	public void setShopid(String shopid) {
		this.shopid = shopid;
	}

}
