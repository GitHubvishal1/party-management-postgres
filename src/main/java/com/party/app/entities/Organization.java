package com.party.app.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Organization {

	public enum orgStatus {
		INITIALIZED, VALIDATED, DECEASED
	}

	public enum typeNum {
		COMPANY
	}

	public enum nameTypeNum {
		CO, INC, LTD, PTY, PLC, GMBH
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String isLegalEntity;
	private String tradingName;

	@Enumerated(EnumType.STRING)
	private orgStatus status;

	@Enumerated(EnumType.STRING)
	private typeNum type;

	@Enumerated(EnumType.STRING)
	private nameTypeNum nameType;

	@Override
	public String toString() {
		return "Organization [id=" + id + ", isLegalEntity=" + isLegalEntity + ", tradingName=" + tradingName
				+ ", status=" + status + ", type=" + type + ", nameType=" + nameType + "]";
	}

	public Organization(int id, String isLegalEntity, String tradingName, orgStatus status, typeNum type,
			nameTypeNum nameType) {
		super();
		this.id = id;
		this.isLegalEntity = isLegalEntity;
		this.tradingName = tradingName;
		this.status = status;
		this.type = type;
		this.nameType = nameType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsLegalEntity() {
		return isLegalEntity;
	}

	public void setIsLegalEntity(String isLegalEntity) {
		this.isLegalEntity = isLegalEntity;
	}

	public String getTradingName() {
		return tradingName;
	}

	public void setTradingName(String tradingName) {
		this.tradingName = tradingName;
	}

	public orgStatus getStatus() {
		return status;
	}

	public void setStatus(orgStatus status) {
		this.status = status;
	}

	public typeNum getType() {
		return type;
	}

	public void setType(typeNum type) {
		this.type = type;
	}

	public nameTypeNum getNameType() {
		return nameType;
	}

	public void setNameType(nameTypeNum nameType) {
		this.nameType = nameType;
	}

	public Organization() {
	}

}
