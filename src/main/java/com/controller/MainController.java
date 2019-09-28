package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Board;
import com.repository.BoardRepository;
import com.repository.MemberRepository;

@Controller
public class MainController {

	@Autowired
	BoardRepository br;

	@Autowired
	MemberRepository mr;

	@GetMapping("/")
	public ModelAndView index() {

//		Member member = new Member();
//
//		member.setUserId("test1");
//		member.setUserPwd("1123");
//		member.setAge(21);
//		member.setGender("F");
//		member.setInsertDate(new Date());
//
//		mr.save(member);
//
//		for (int i = 0; i < 100; i++) {
//			Board board = new Board();
//			board.setMember(member);
//			board.setContent("내용" + i);
//			board.setTitle("제목" + i);
//			board.setInsertDate(new Date());
//
//			br.save(board);
//		}
//		Pageable pg = PageRequest.of(0, 6, Sort.Direction.DESC, "boardSeq");
//
//		Page<Board> pgData = br.findBy(pg);
//
//		List<Board> aList = pgData.getContent();
//
//		for (Board b : aList) {
//			System.out.println(b.toString());
//		}
//		
//		System.out.println(pgData.getSize());
//		System.out.println(pgData.getTotalPages());
//		System.out.println(pgData.getNumberOfElements());
//		System.out.println(pgData.nextPageable());

		Board board = new Board();

		board = br.findById(5L).get();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("result", board);
		return mv;
	}

}
