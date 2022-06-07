package com.netbanking.main.pojo;

public class FixedDepositeMaster {
	
	private String fixedDepositeId;
	private int duration;
	private double fixedDepositeRateOfInterest;
	
	public FixedDepositeMaster() {
	}

	public FixedDepositeMaster(String fixedDepositeId, int duration, double fixedDepositeRateOfInterest) {
		super();
		this.fixedDepositeId = fixedDepositeId;
		this.duration = duration;
		this.fixedDepositeRateOfInterest = fixedDepositeRateOfInterest;
	}

	public String getFixedDepositeId() {
		return fixedDepositeId;
	}

	public void setFixedDepositeId(String fixedDepositeId) {
		this.fixedDepositeId = fixedDepositeId;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getFixedDepositeRateOfInterest() {
		return fixedDepositeRateOfInterest;
	}

	public void setFixedDepositeRateOfInterest(double fixedDepositeRateOfInterest) {
		this.fixedDepositeRateOfInterest = fixedDepositeRateOfInterest;
	}

	@Override
	public String toString() {
		return "FixedDepositeMaster [fixedDepositeId=" + fixedDepositeId + ", duration=" + duration
				+ ", fixedDepositeRateOfInterest=" + fixedDepositeRateOfInterest + "]";
	}
	
	

}
