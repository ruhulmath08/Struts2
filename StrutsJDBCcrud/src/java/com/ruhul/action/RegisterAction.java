/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhul.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ruhul.dao.Admin;

/**
 *
 * @author Ruhul-Pc
 */
public class RegisterAction extends ActionSupport{
    private static final long serialVersionUID = 2139116285823340125L;
	private String uname, uemail, upass, udeg;
	private String msg = "";
	Admin admin = null;
	int ctr = 0;

	@Override
	public String execute() throws Exception {
		admin = new Admin();

		try {
			ctr = admin.registerUser(uname, uemail, upass, udeg);
			if (ctr > 0) {
				msg = "Registration Successfull";
			} else {
				msg = "Some error";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "REGISTER";
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String getUdeg() {
		return udeg;
	}

	public void setUdeg(String udeg) {
		this.udeg = udeg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCtr() {
		return ctr;
	}

	public void setCtr(int ctr) {
		this.ctr = ctr;
	}
}
