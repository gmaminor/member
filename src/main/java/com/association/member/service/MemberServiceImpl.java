package com.association.member.service;

import com.association.member.dto.MemberDto;
import com.association.member.model.Member;
import com.association.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;
    @Override
    public MemberDto addMember(MemberDto memberDto) {
        Member member = memberRepository.save(MemberDto.getMember(memberDto));
        return Member.getMemberDto(member);
    }

    @Override
    public int deleteMember(int id) {
        return 0;
    }

    @Override
    public List<Member> addMembers(List<MemberDto> memberDtos) {
        return null;
    }
}
