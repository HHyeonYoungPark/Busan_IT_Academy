package com.hs.bean;

public class BoardDto {
	private int idx;
	private String title;
	private String id;
	private String regdate;
	private String content;
	private String filename;
	public BoardDto(int idx, String title, String id, String regdate, String content, String filename) {
		super();
		this.idx = idx;
		this.title = title;
		this.id = id;
		this.regdate = regdate;
		this.content = content;
		this.filename = filename;
	}
	public BoardDto() {
		super();
	}
	public BoardDto(String title, String id, String content, String filename) {
		super();
		this.title = title;
		this.id = id;
		this.content = content;
		this.filename = filename;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	
}
