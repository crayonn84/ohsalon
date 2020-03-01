package com.gpch.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gpch.login.model.SampleVO;

import jline.internal.Log;

@RestController
public class AdminPageController {

	@GetMapping("/sample")
	public SampleVO makeSample() {

		SampleVO vo = new SampleVO();
		vo.setVal1("v1");
		vo.setVal1("v2");
		vo.setVal1("v3");

		System.out.println(vo);

		return vo;

	}
	/*
	@GetMapping(value = { "/main" })
	public ModelAndView main() {
		Log.debug("adminMain 진입");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("main");
		return modelAndView;
	}
	*/

}
