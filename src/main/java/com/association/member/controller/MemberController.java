package com.association.member.controller;

import com.association.member.dto.MemberDto;
import com.association.member.service.MemberServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberServiceImpl memberServiceImpl;
    @GetMapping()
    public String fetchMember(HttpServletRequest request){
        return "member";
    }
    @PostMapping("/add")
    public ResponseEntity<MemberDto> addMember(@RequestBody MemberDto memberDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(memberServiceImpl.addMember(memberDto));
    }
}
