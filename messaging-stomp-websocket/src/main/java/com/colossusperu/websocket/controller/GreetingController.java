package com.colossusperu.websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.colossusperu.websocket.model.Greeting;
import com.colossusperu.websocket.model.Message;

@Controller
public class GreetingController {
	
	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(Message message) throws Exception{
		Thread.sleep(1000);
		return new Greeting("Hola, " + HtmlUtils.htmlEscape(message.getName() + "!"));
	}
}
