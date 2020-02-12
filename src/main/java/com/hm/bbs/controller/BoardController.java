package com.hm.bbs.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hm.bbs.service.BoardService;

@Controller
public class BoardController {
	
	@Inject
	private BoardService boardService;

	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", boardService.selectAll());
		return "list";
	}
}
