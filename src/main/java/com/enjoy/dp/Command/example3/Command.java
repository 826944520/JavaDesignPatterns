package com.enjoy.dp.Command.example3;
/**
 * 命令接口，声明执行的操作，支持可撤销操作
 */
public interface Command {
	/**
	 * 执行命令对应的操作
	 */
	public void execute();
	/**
	 * 执行撤销命令对应的操作
	 */
	public void undo();
}