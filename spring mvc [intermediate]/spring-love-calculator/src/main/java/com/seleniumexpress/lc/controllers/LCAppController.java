package com.seleniumexpress.lc.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.UserInfoDTO;

@Controller
public class LCAppController {

	@RequestMapping("/")
	//public String showHomePage(Model model) {
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userinfodto) {
		// read the existing property by fetching it from the dto
		/* UserInfoDTO userInfo = new UserInfoDTO();
		model.addAttribute("userInfo", userInfo); */
		
		return "home-page";
	}

	@RequestMapping("/process-homepage")
	/*public String showResultPage(@RequestParam("userName") String userName1,
			@RequestParam("crushName") String crushName1, Model model) {*/
	// public String showResultPage(UserInfoDTO userInfoDTO, Model model) {
	public String showResultPage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		/*System.out.println("user name is : " + userInfoDTO.getUserName());
		System.out.println("crush name is : " + userInfoDTO.getCrushName());
		
		model.addAttribute("userInfo", userInfoDTO);*/
		
		return "result-page";
	}
}

