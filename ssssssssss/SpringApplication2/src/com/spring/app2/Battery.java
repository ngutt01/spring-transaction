package com.spring.app2;

public class Battery {

	private int batteryId;
	private String volt;
	public void setBatteryId(int batteryId) {
		this.batteryId = batteryId;
	}
	public void setVolt(String volt) {
		this.volt = volt;
	}
	@Override
	public String toString() {
		return "Battery [batteryId=" + batteryId + ", volt=" + volt + "]";
	}
		
	}

