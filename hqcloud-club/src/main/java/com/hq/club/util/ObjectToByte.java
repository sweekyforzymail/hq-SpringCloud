package com.hq.club.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

public abstract class ObjectToByte {

	static ObjectOutputStream oos = null; // 对象输出流
	static ByteArrayOutputStream baos = null; // byte数组输出流
	static ByteArrayInputStream bais = null; // 对象输入流

	public static byte[] objectToByte(Object obj) {
		byte[] bytes = null;
		try {
			baos = new ByteArrayOutputStream();// 序列化
			oos = new ObjectOutputStream(baos);// 将数组流传入对象流
			oos.writeObject(obj);// 用对象流读取对象。
			bytes = baos.toByteArray();// 用数组流将传入的对象转化为byte数组

			baos.close();
			oos.close();
			oos.close();
		} catch (Exception e) {
		}
		return bytes;
	}

}