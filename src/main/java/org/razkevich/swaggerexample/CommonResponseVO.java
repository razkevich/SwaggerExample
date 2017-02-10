package org.razkevich.swaggerexample;

import java.util.Calendar;

public class CommonResponseVO {

	private Integer resultCode;
	private String resultDescription;
	private Calendar currentBankDateTime;
	private String bankTimeZone;

	public CommonResponseVO() {
		this(CommonResult.SUCCESS);
	}

	public CommonResponseVO(CommonResult r) {
		setResult(r);
	}

	public Integer getResultCode() {
		return resultCode;
	}

	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultDescription() {
		return resultDescription;
	}

	public void setResultDescription(String resultDescription) {
		this.resultDescription = resultDescription;
	}

	public Calendar getCurrentBankDateTime() {
		return currentBankDateTime;
	}

	public void setCurrentBankDateTime(Calendar currentBankDateTime) {
		this.currentBankDateTime = currentBankDateTime;
	}

	public String getBankTimeZone() {
		return bankTimeZone;
	}

	public void setBankTimeZone(String bankTimeZone) {
		this.bankTimeZone = bankTimeZone;
	}

	public void setResult(CommonResult result) {
		if (result != null) {
			resultCode = Integer.parseInt(result.getCode());
			resultDescription = result.getMessage();
		} else {
			throw new IllegalArgumentException("Result cannot be null");
		}
	}

	public void setResult(CommonResult result, Object... params) {
		if (result != null) {
			resultCode = Integer.parseInt(result.getCode());
			resultDescription = String.format(result.getMessage(), params);
		} else {
			throw new IllegalArgumentException("Result cannot be null");
		}
	}
}
