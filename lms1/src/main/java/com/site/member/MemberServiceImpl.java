package com.site.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberMapper memberMapper;
	
	@Override
	public MemberVO Memberlogin(String id, String pw) {
		MemberVO memberVo = memberMapper.Memberlogin(id,pw);
		return memberVo;
	}

}
