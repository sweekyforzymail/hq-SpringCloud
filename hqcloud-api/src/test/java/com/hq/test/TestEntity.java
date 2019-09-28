package com.hq.test;

import java.io.Serializable;

import org.junit.Test;

public class TestEntity implements Serializable {
	private static final long serialVersionUID = 6488167380663552003L;

	private int id;
	private String name;

	@Test
	public void testMethod() {
		System.out.println("D");
	}

}
