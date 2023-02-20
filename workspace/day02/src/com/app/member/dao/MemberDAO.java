package com.app.member.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.app.member.domain.MemberVO;
import com.app.mybatis.config.MyBatisConfig;

public class MemberDAO {
   public SqlSession sqlSession;
   
   public MemberDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }
   
//   아이디 중복검사
   public boolean checkId(String identifiaciaton) {
	   return sqlSession.selectOne("checkId", identifiaciaton) != null;
   }
   
//   회원가입
   public void join(MemberVO memberVO) {
	   sqlSession.selectOne("join", memberVO);
   }
   
//   로그인
   public void login(String identification, String password) {
	   HashMap<String, String> hashmap = new HashMap();
	   hashmap.put("login", identification);
	   hashmap.put("login", password);
   }
   
//   회원정보 수정
//   public void modify(MemberVO memberVO) {
	   
//   }
   
//   회원탈퇴
   public void withdrawall(int id) {
	   
   }
   
//   전체 회원목록 
   public void selectAll(MemberVO memberVO) {
	   
   }
   
}

