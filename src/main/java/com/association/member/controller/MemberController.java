package com.association.member.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping(path="/member")
    public String fetchMember(HttpServletRequest request){
        return "member";
    }
}
