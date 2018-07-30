package com.panshi.domain;

import java.util.List;

public class RespEntity {
	private int count;
	
	private int code;
	
	private List data;
	
	private String msg;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "RespEntity [count=" + count + ", code=" + code + ", data=" + data + ", msg=" + msg + "]";
	}
	
	
}
