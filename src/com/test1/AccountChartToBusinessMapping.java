package com.test1;

public class AccountChartToBusinessMapping {
	private Integer setId;
	private Integer accountId;
	private Integer mappingSetId;
	private String department;
	private Integer businessIndicator;
	private boolean accountMappedToFunction;
	private boolean isActive;
	private String functionName;
	private String functionType;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public AccountChartToBusinessMapping() {

	}

	public AccountChartToBusinessMapping(Integer setId, Integer accountId, Integer mappingSetId, String department,
			Integer businessIndicator, boolean accountMappedToFunction, boolean isActive, String functionName,
			String functionType, String creationCr, String modifiedCr, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.setId = setId;
		this.accountId = accountId;
		this.mappingSetId = mappingSetId;
		this.department = department;
		this.businessIndicator = businessIndicator;
		this.accountMappedToFunction = accountMappedToFunction;
		this.isActive = isActive;
		this.functionName = functionName;
		this.functionType = functionType;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
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

	public Integer getMappingSetId() {
		return mappingSetId;
	}

	public void setMappingSetId(Integer mappingSetId) {
		this.mappingSetId = mappingSetId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getBusinessIndicator() {
		return businessIndicator;
	}

	public void setBusinessIndicator(Integer businessIndicator) {
		this.businessIndicator = businessIndicator;
	}

	public boolean isAccountMappedToFunction() {
		return accountMappedToFunction;
	}

	public void setAccountMappedToFunction(boolean accountMappedToFunction) {
		this.accountMappedToFunction = accountMappedToFunction;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getFunctionType() {
		return functionType;
	}

	public void setFunctionType(String functionType) {
		this.functionType = functionType;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
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
