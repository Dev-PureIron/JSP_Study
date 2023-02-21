package com.app.member.dao;

import com.app.member.domain.MemberVO;

public class Test {
public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		
		memberVO.setMemberName("이순철");
		memberVO.setMemberIdentification("lsc00");
		memberVO.setMemberPassword("1234");
		memberVO.setMemberBirth("0000-12-05");
		
		System.out.println(memberDAO.checkId("lsc00"));
		System.out.println((memberDAO.login("lsc00","1234")));
		

//		memberDAO.selectAll().stream().map(MemberVO::getMemberName).forEach(System.out::println);
}
}
