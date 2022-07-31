package com.javassem.service;

import java.util.List;

import com.javassem.domain.GonziVO;
import com.javassem.domain.MemberVO;

public interface MemberService {
	
	public MemberVO idCheck_Login( MemberVO vo);
	
	public int userInsert(MemberVO vo );
	
	public List<GonziVO> gonziList(GonziVO vo);
	

}
