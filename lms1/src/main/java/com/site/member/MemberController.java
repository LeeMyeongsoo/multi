package com.site.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;


	@PostMapping("member/login")
	public String login(@RequestParam String id,@RequestParam String pw,HttpSession session) {
		System.out.println(id);
		MemberVO memberVo = memberService.Memberlogin(id, pw);
		
		if(memberVo != null) {
			session.setAttribute("session_nickname", memberVo.getNickname());
			session.setAttribute("session_id", id);
			session.setAttribute("session_flag", "success");
			session.setAttribute("session_user", "member");
		}
		return "index";
	}

}
