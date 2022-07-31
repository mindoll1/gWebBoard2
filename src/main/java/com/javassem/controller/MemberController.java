package com.javassem.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javassem.dao.MemberDAO;
import com.javassem.domain.GonziVO;
import com.javassem.domain.MemberVO;
import com.javassem.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	
	//회원가입 창으로 이동
	@RequestMapping("user/userJoin.do")
	public void userJoin() {}
	
	//로그인 창으로 이동
	@RequestMapping("user/userLogin.do")
	public void userLogin() {	}
	
	@RequestMapping("user/{ss}.do")
	public String test(@PathVariable String ss) {
		// 요청창에 user 가 있기에 뷰페이지에 user폴더안에서 찾음
		
		return "user/"+ss;
	}
	
	@RequestMapping("user/board.do")
	public void xx() {}
	
	
	//회원가입 jsp 
	@RequestMapping("user/userInsert.do")
	public String insert(MemberVO vo) throws IOException{
		memberService.userInsert(vo);
		return "user/userJoin_ok";
	}
	

	
	//로그인 jsp
	@RequestMapping("user/login.do")
	public String iWantLogin(MemberVO vo){
		MemberVO isok =	memberService.idCheck_Login(vo);

		if(isok.getUserId().equals(vo.getUserId()) &&
				isok.getUserPass().equals(vo.getUserPass()) )
	return "user/Main";
		return "user/login_ok"; 

	
	/*
	 * if(isok == null)return "user/userLogin"; return "user/login_ok";
	 */
	}
	
	

	//************************************
	//************************************
	//******에이젝스로 들어온 값들은 String return -> view 로 가는게 아니라 변수값을 보내줘야되는디..
	@RequestMapping(value="user/idCheck.do",
			produces="app-8lication/text;charset=UTF")
	@ResponseBody	//AJAX 요청인 경우
	public String idCheck(MemberVO vo) {
		String msg = "아이디 사용이 가능합니다";
		MemberVO resultVO = memberService.idCheck_Login(vo);
		if(resultVO != null) 
			msg = "중복된 아이디 오로로로롤";
		return msg;
	}
	
	
	

	 @RequestMapping(value="user/board.do", produces =
	 "application/text;charset=UTF-8")
	 @ResponseBody 
	 public String getboard(GonziVO vo, Model m) {
	 m.addAttribute("first",memberService.gonziList(vo));
	 return "user/board.do";
			 }
	 
	
	
	
	
}
