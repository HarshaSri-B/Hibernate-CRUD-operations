package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mobiles {
	
	@Id
	@GeneratedValue
	private int mobID;
	private String mobName;
	private String mobModel;
	private double mobPrice;
	
	public Mobiles() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Mobiles(int mobID, String mobName, String mobModel, double mobPrice) {
		super();
		this.mobID = mobID;
		this.mobName = mobName;
		this.mobModel = mobModel;
		this.mobPrice = mobPrice;
	}
	public int getMobID() {
		return mobID;
	}
	public void setMobID(int mobID) {
		this.mobID = mobID;
	}
	public String getMobName() {
		return mobName;
	}
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	public String getMobModel() {
		return mobModel;
	}
	public void setMobModel(String mobModel) {
		this.mobModel = mobModel;
	}
	public double getMobPrice() {
		return mobPrice;
	}
	public void setMobPrice(double mobPrice) {
		this.mobPrice = mobPrice;
	}
	
	
}
