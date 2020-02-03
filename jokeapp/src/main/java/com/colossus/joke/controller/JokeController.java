package com.colossus.joke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.colossus.joke.service.JokeService;

@Controller
public class JokeController {
	private JokeService jokeService;

	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/", ""})
	String showJoke(Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		return "chucknorris";
	}
}
