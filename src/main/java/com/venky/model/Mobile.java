package com.venky.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {

	@Id
	private Integer model_no;
	private String model_name;
	private String mobile_name;
	private String ram_size;
	private String rom_size;
	private String os_name;
	private String process_name;
	private String f_cam;
	private String b_cam;
	private String battary_capacity;
	private String imei_no;
	private String price;
	private String color;

	public Mobile() {
		super();
	}

	public Integer getModel_no() {
		return model_no;
	}

	public void setModel_no(Integer model_no) {
		this.model_no = model_no;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public String getMobile_name() {
		return mobile_name;
	}

	public void setMobile_name(String mobile_name) {
		this.mobile_name = mobile_name;
	}

	public String getRam_size() {
		return ram_size;
	}

	public void setRam_size(String ram_size) {
		this.ram_size = ram_size;
	}

	public String getRom_size() {
		return rom_size;
	}

	public void setRom_size(String rom_size) {
		this.rom_size = rom_size;
	}

	public String getOs_name() {
		return os_name;
	}

	public void setOs_name(String os_name) {
		this.os_name = os_name;
	}

	public String getProcess_name() {
		return process_name;
	}

	public void setProcess_name(String process_name) {
		this.process_name = process_name;
	}

	public String getF_cam() {
		return f_cam;
	}

	public void setF_cam(String f_cam) {
		this.f_cam = f_cam;
	}

	public String getB_cam() {
		return b_cam;
	}

	public void setB_cam(String b_cam) {
		this.b_cam = b_cam;
	}

	public String getBattary_capacity() {
		return battary_capacity;
	}

	public void setBattary_capacity(String battary_capacity) {
		this.battary_capacity = battary_capacity;
	}

	public String getImei_no() {
		return imei_no;
	}

	public void setImei_no(String imei_no) {
		this.imei_no = imei_no;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
