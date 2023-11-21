package com.test1;

public class AccountChart {
	private Integer setId;
	private Integer accountId;
	private String accountBudgetIndicator;
	private String accountSheet;
	private String accountControlFlag;
	private String accountDesc;
	private String accountShortDesc;
	private String accountType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public AccountChart() {

	}

	public AccountChart(Integer setId, Integer accountId, String accountBudgetIndicator, String accountSheet,
			String accountControlFlag, String accountDesc, String accountShortDesc, String accountType,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.setId = setId;
		this.accountId = accountId;
		this.accountBudgetIndicator = accountBudgetIndicator;
		this.accountSheet = accountSheet;
		this.accountControlFlag = accountControlFlag;
		this.accountDesc = accountDesc;
		this.accountShortDesc = accountShortDesc;
		this.accountType = accountType;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getSetId() {
		return setId;
	}

	public void setSetId(Integer setId) {
		this.setId = setId;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getAccountBudgetIndicator() {
		return accountBudgetIndicator;
	}

	public void setAccountBudgetIndicator(String accountBudgetIndicator) {
		this.accountBudgetIndicator = accountBudgetIndicator;
	}

	public String getAccountSheet() {
		return accountSheet;
	}

	public void setAccountSheet(String accountSheet) {
		this.accountSheet = accountSheet;
	}

	public String getAccountControlFlag() {
		return accountControlFlag;
	}

	public void setAccountControlFlag(String accountControlFlag) {
		this.accountControlFlag = accountControlFlag;
	}

	public String getAccountDesc() {
		return accountDesc;
	}

	public void setAccountDesc(String accountDesc) {
		this.accountDesc = accountDesc;
	}

	public String getAccountShortDesc() {
		return accountShortDesc;
	}

	public void setAccountShortDesc(String accountShortDesc) {
		this.accountShortDesc = accountShortDesc;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
