package com.demo.oops;

public class Engine {
	
	private int engineId;
	
	private String engineName;

	public Engine(int engineId, String engineName) {
		this.engineId = engineId;
		this.engineName = engineName;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", engineName=" + engineName + "]";
	}

}
