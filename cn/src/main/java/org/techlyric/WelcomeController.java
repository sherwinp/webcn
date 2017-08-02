package org.techlyric;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

        @RequestMapping("/welcome.json")  
	public String welcome(){
		return "welcome";
	}
}
