package com.tomosoft.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Utils {
	/**
	 * 返回异常堆栈信息 而不仅仅是异常类型
	 * @param t
	 * @return
	 */
	public static String getStackTrace(Throwable t){
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		try{
			t.printStackTrace(pw);
			return sw.toString();
		}finally{
			pw.close();
		}
	}
	/**
	 * 返回异常堆栈信息 而不仅仅是异常类型
	 * @param t
	 * @return
	 */
	public static String getStackTrace2(Throwable t){
		ByteArrayOutputStream buf = new java.io.ByteArrayOutputStream();
		try {
			t.printStackTrace(new java.io.PrintWriter(buf, true));
			return buf.toString();
		}finally{
			try {
				buf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
