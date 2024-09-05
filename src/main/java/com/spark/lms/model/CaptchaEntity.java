package com.spark.lms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="captchadata")
public class CaptchaEntity {
	@Id
	Long id;
	String captchatext;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCaptchatext() {
		return captchatext;
	}
	public void setCaptchatext(String captchatext) {
		this.captchatext = captchatext;
	}
}
	

