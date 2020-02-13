package com.hm.bbs.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hm.bbs.dto.Criteria;
import com.hm.bbs.dto.PageMaker;
import com.hm.bbs.model.BoardVO;
import com.hm.bbs.service.BoardService;

@Controller
public class BoardController {
	
	@Inject
	private BoardService boardService;

	@GetMapping("/list")
	public String list(@ModelAttribute("cri") Criteria cri, Model model) {
		int totalCount = boardService.totalCount(cri);
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(totalCount);
		model.addAttribute("pageMaker", pageMaker);
		model.addAttribute("list", boardService.selectAll(cri));
		return "list";
	}
	
	@GetMapping("/input")
	public String insert() {
		
		return "input";
	}
	
	@PostMapping("/input")
	public String insert(@ModelAttribute("board") BoardVO board) {				
		boardService.insert(board);		
		return "redirect:list";
	}
	
	@GetMapping("/update")
	public String update(@RequestParam("bno") int bno, Model model) {
		model.addAttribute("board", boardService.selectOne(bno));		
		return "update";
	}	
	
	@PostMapping("/update")
	public String update(@ModelAttribute("board") BoardVO board) {
		boardService.update(board);	
		return "redirect:list";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("bno") int bno) {
		boardService.delete(bno);
		return "redirect:list";
	}
}
