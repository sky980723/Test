package com.example.star.entity;

public class PublicityApp {

	private String id;

	private int type;// 数据的类型。1：富文本介绍;2:图片介绍;3:视频介绍

	private String introduce;// 首页的介绍

	private String imgUrl;// 图片地址

	private String imgDescribe;// 图片的文字说明

	private String videoUrl;// 视频的地址

	private String videoDescribe;// 视频的文字说明

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getImgDescribe() {
		return imgDescribe;
	}

	public void setImgDescribe(String imgDescribe) {
		this.imgDescribe = imgDescribe;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public String getVideoDescribe() {
		return videoDescribe;
	}

	public void setVideoDescribe(String videoDescribe) {
		this.videoDescribe = videoDescribe;
	}

}
