package com.vee.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/admin", method = RequestMethod.POST)
	public String printWelcome(ModelMap model, Principal principal) {
		String name = principal.getName();
		model.addAttribute("username", name);
		model.addAttribute("message", "Spring Security Custom Form Example");
		return "success";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(ModelMap model) {
		return "login";
	}

	@RequestMapping(value = "/admin/failLogin", method = RequestMethod.POST)
	public String loginerror(ModelMap model) {
		model.addAttribute("error", "true");
		return "login";
	}

	@RequestMapping(value = "/logoff", method = RequestMethod.POST)
	public String logout(ModelMap model) {
		return "login";
	}
}
