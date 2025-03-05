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
		//유효성 검사
		if(!isValid(first, second))
			return "callError";
		
		model.addAttribute("first", first);
		model.addAttribute("second", second);
		
		return "call"; //WEB-INF/views/call.jsp
	}
	
	private boolean isValid(String first, String second) {
		return true;
	}
	
	
}
