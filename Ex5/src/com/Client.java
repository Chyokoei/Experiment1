package com;

public class Client {
	public static void main(String arg[]) {
		try {
			Log log;
			LogFactory factory;
			factory = (LogFactory)XMLUtil.getBean();
			log= factory.createLog();
			log.writeLog();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
