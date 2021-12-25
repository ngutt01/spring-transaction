package com.spring.app2;

public class Robot {
 private int robotId;
 private Battery battery;
public Robot(int robotId, Battery battery) {
	super();
	this.robotId = robotId;
	this.battery = battery;
}
@Override
public String toString() {
	return "Robot [robotId=" + robotId + ", battery=" + battery + "]";
}
 
 
 }

