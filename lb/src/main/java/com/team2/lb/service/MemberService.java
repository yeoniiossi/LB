package com.team2.lb.service;

import org.springframework.stereotype.Service;

import com.team2.lb.vo.Member;

@Service
public interface MemberService {

	void joinMember(Member member);

}
