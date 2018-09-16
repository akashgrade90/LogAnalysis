package com.akashgrade.Troy.models;

public class API {
	private String apiId;
	private String apiName;
	private String apiLogic;
	private String apiRequestFormat;
	private String apiDataFormat;
	
	public String getApiId() {
		return apiId;
	}
	public void setApiId(String apiId) {
		this.apiId = apiId;
	}
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public String getApiLogic() {
		return apiLogic;
	}
	public void setApiLogic(String apiLogic) {
		this.apiLogic = apiLogic;
	}
	public String getApiRequestFormat() {
		return apiRequestFormat;
	}
	public void setApiRequestFormat(String apiRequestFormat) {
		this.apiRequestFormat = apiRequestFormat;
	}
	public String getApiDataFormat() {
		return apiDataFormat;
	}
	public void setApiDataFormat(String apiDataFormat) {
		this.apiDataFormat = apiDataFormat;
	}
	@Override
	public String toString() {
		return "API [apiId=" + apiId + ", apiName=" + apiName + ", apiLogic=" + apiLogic + ", apiRequestFormat="
				+ apiRequestFormat + ", apiDataFormat=" + apiDataFormat + "]";
	}

}
