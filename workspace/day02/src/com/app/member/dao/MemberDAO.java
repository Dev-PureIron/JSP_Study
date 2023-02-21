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
	   return sqlSession.selectOne("member.checkId", identifiaciaton) != null;
   }
   
//   회원가입
   public void join(MemberVO memberVO) {
	   sqlSession.selectOne("member.join", memberVO);
   }
   
//   로그인
   public long login(String memberIdentification, String memberPassword) {
	   HashMap<String, String> loginmap = new HashMap();
	   loginmap.put("memberIdentification", memberIdentification);
	   loginmap.put("memberPassword", memberPassword);
	   
	    return sqlSession.selectOne("member.login", loginmap);
	    
   }
   
//   전체 회원목록 
   public List<MemberVO> selectAll(MemberVO memberVO) {
	   return sqlSession.selectList("member.selectAll");
	   }
   

//	회원 정보 수정
	public void update(MemberVO memberVO) {
		sqlSession.update("member.update", memberVO);
	}
}