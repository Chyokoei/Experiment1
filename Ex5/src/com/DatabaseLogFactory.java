package com;

public class DatabaseLogFactory implements LogFactory{
	public Log createLog() {
		System.out.println("正在创建DatabaseLog");
		return new DatabaseLog();
	}

}