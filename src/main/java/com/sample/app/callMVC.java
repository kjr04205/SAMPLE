package com.sample.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class callMVC {
	@RequestMapping("/getCallMVC")
	public String main(String first, String second, Model model) throws IOException {
		System.out.println("1");
		//유효성 검사
		if(!isValid(first, second))
			return "callError";
		
		System.out.println("3");
		model.addAttribute("first", first);
		model.addAttribute("second", second);
		
		return "call"; //WEB-INF/views/call.jsp
	}
	
	private boolean isValid(String first, String second) {
		System.out.println("2");
		System.out.println(first);
		System.out.println(second);
		if(first == "" || second == "") {
			System.out.println(first);
			System.out.println(second);
			System.out.println("값 비었음.");
		}
		return true;
	}
	
	
}
