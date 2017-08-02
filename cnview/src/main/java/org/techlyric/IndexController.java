package org.techlyric;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class IndexController {

        @RequestMapping("/welcome.html")  
	public String welcomePage(){
		return "welcome";
	}
}
