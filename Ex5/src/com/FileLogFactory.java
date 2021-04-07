package com;

public class FileLogFactory implements LogFactory{
	public Log createLog() {
		System.out.println("正在创建FileLog");
		return new FileLog();
	}

}
