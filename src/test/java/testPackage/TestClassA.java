package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.Pojo;

public class TestClassA extends Pojo {
	
	
@BeforeClass
public void beforeclass(){
	System.out.println("BeforeClass");
}
@BeforeMethod
public void beforeMethod() {
	System.out.println("BeforeMethod");
}
@Test(priority=-1,invocationCount=2,dependsOnMethods={"test3"})
public void test1() {
	System.out.println("Test 1");
}
@Test
public void test2() {
	System.out.println("Test 2");
}
@Test
public void test3() {
	System.out.println("Test 3");
}
@Test
public void test4() {
	System.out.println("Test 4");
}
@AfterMethod
public void afterMethod() {
	System.out.println("AfterMethod");
}

@AfterClass
public void afterClass() {
	System.out.println("AfterClass");
}





}
