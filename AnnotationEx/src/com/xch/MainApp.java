package com.xch;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx =
		new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("hi Hello World!");
		helloWorld.getMessage();
		}
}
