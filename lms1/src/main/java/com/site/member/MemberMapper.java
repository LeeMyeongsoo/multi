package com.site.member;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

	MemberVO Memberlogin(String id, String pw);

}
