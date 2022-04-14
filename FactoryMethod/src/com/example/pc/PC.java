package com.example.pc;

import com.example.factory.Product;

public class PC extends Product {
	
	private String serialNumber;
	
	public PC(String serialnumber) {
		super();
		System.out.println(serialnumber + "のPCを作ります");
		this.serialNumber = serialnumber;
	}

	@Override
	public void use() {
		System.out.println(serialNumber + "のPCを使います");
	}
	
	public String getSerialNumber() {
		return this.serialNumber;
	}

}
