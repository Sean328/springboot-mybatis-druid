package com.sean.mybatis.rabbitmq;

import org.springframework.util.SerializationUtils;

import java.io.IOException;
import java.io.Serializable;

/**
 * Created by sean on 2017/11/24 18:00.
 *
 * @desc
 */
public class Sender extends BaseConnector{
	public Sender(String queueName) throws IOException {
		super(queueName);
	}

	public void sendMessage(Serializable object) throws IOException {
		channel.basicPublish("",queueName, null, SerializationUtils.serialize(object));
	}
}
