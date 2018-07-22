package com.xpagesbeast.test;

public class UnpTasksPage {
	private String createBargeReadinessId;
	private String createQualityAssuranceId;
	private String createGeneralLiquid;
	private String createCallOutId;
	
	public UnpTasksPage(){
		this.createBargeReadinessId = "//*[@id='newBRButton']";
		this.createCallOutId="//*[@id='newCalloutLink']";
		this.createGeneralLiquid="//*[@id='newLoadLink']";
		this.createQualityAssuranceId = "//*[@id='newQAbutton']";
	}
	
	public String getCreateBargeReadinessId() {
		return createBargeReadinessId;
	}
	public void setCreateBargeReadinessId(String createBargeReadinessId) {
		this.createBargeReadinessId = createBargeReadinessId;
	}
	public String getCreateQualityAssuranceId() {
		return createQualityAssuranceId;
	}
	public void setCreateQualityAssuranceId(String createQualityAssuranceId) {
		this.createQualityAssuranceId = createQualityAssuranceId;
	}
	public String getCreateGeneralLiquid() {
		return createGeneralLiquid;
	}
	public void setCreateGeneralLiquid(String createGeneralLiquid) {
		this.createGeneralLiquid = createGeneralLiquid;
	}
	public String getCreateCallOutId() {
		return createCallOutId;
	}
	public void setCreateCallOutId(String createCallOutId) {
		this.createCallOutId = createCallOutId;
	}
	
	
}
