package com.ltcp.helloworld;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class DevOpsVOTest {
	
	private DevOpsVO devOpsVO;
	
	@Before
	public void init() {
		devOpsVO = new DevOpsVO();
	}

	@Test
	public void testGetGreeting() {
		System.out.println("Greeting Test.");
		Assert.assertEquals("I am DevOps.", devOpsVO.getGreeting());
	}

	@Test
	public void testSetGreeting() {
		String newGreeting = "New DevOps Greeting.";
		devOpsVO.setGreeting(newGreeting);
		Assert.assertEquals(newGreeting, devOpsVO.getGreeting());
	}

}
