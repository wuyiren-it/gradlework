package com.example.demo.pojo;

public class Table {
	
	private String colunm;
	
	private int id;

	public String getColunm() {
		return colunm;
	}

	public void setColunm(String colunm) {
		this.colunm = colunm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Table [colunm=" + colunm + ", id=" + id + "]";
	}

}
