package com.iu.s3.member;

public class MemberService {
	private MemberDAO memberDAO;

	public MemberService(MemberDAO memberDAO) {
		this.memberDAO = new MemberDAO();
	}
	
	public MemberService() {
		
	}

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	public void test() {
		memberDAO.test();
		System.out.println("MemberService");
	}
}
