package com.sean.mybatis.rabbitmq;

import java.io.Serializable;

/**
 * Created by sean on 2017/11/24 18:01.
 *
 * @desc
 */
public class MessageInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	//渠道
	private String channel;
	//来源
	private String content;
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
