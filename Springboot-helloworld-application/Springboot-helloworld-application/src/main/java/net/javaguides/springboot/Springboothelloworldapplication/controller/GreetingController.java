package net.javaguides.springboot.Springboothelloworldapplication.controller;

import java.util.concurrent.atomic.AtomicLong;

import javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.Springboothelloworldapplication.entity.Greeting;


@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	//甚麼是domain object??

	//@RequestMapping 確認http的request導向/greeting而對應這個這個greeting()方法
	//這邊沒有一定要get put post或是甚麼方式來傳送資料 而@RequestMapping是預設值接收get，也可以使用@requestMapping(method=GET)來指定接收資料的方式
	//@RequestParam會綁並網址床過來的值 傳送給這個greeting()方法 並把它命名為 String name ，若是沒有傳來資料，那就是預設為world
	//這個方法會創立一個新的greet 並使用greeting template寫入id以及name並回傳
	//這個RESTful web service controller會置入並回傳這個Greeting 物件，而這個物件會直接被轉成JSON格是回傳給HTTP
	//@RestController會讓這個controller的每一個方法回傳成domain object 而不是一個view
	//而若只是@controller就只能回傳view??This code uses Spring 4’s new @RestController annotation, which marks the class as a controller where every method returns a domain object instead of a view. It’s shorthand for @Controller and @ResponseBodyrolled together.
	//Greeting物件必須被轉換成JSON模式，感謝spring的HTTP訊息轉換支援，我們就不需要自己手動轉換，
	//因為Jackson2已經在我們的classpath中，其中的MappingJackson2HttpMessageConverter ，他幫我們做到了這件事情
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue = "world") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
