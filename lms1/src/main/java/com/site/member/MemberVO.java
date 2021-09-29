package com.site.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data@NoArgsConstructor@AllArgsConstructor@Builder
	public class MemberVO {
		
		private String id, pw, nickname, name, dob, gender, email, tel, addr, email_flag, sms_flag, rank, picture;
		private int point;

	}

