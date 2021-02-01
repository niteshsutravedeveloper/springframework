package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "/headlines.htm")
public class HeadLinesController {
	static {
		System.out.println("headlinesController");
	}
	@RequestMapping(value = "/headlines.htm")
	public String  showHeadLines() {
		return "headlines";
	}

}
