package com.enjoy.dp.Bridge.example4;
/**
 * 特急消息的抽象接口
 */
public interface SpecialUrgencyMessage extends Message{
	public void hurry(String messageId);
}