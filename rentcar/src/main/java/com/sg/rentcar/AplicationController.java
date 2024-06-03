package com.sg.rentcar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AplicationController {

	@GetMapping("/index")
	public String goHome() {

		return "index";
	}

	@GetMapping("/login")
	public String Login() {

		return "login";
	}

	@GetMapping("/logout")
	public String Logout() {

		return "logout";
	}

}
