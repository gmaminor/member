package com.association.member.service;

import com.association.member.dto.MemberDto;
import com.association.member.model.Member;

import java.util.List;

public interface MemberService {
    MemberDto addMember(MemberDto memberDto);
    int deleteMember(int id);
    List<Member> addMembers(List<MemberDto> memberDtos);
}
