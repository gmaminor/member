package com.association.member.dto;

import com.association.member.model.Member;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Setter
@Getter
public class MemberDto implements Serializable {
    @NotBlank(message = "FirstName should not be blank")
    private String firstName;
    @NotBlank(message = "LastName should not be blank")
    private String lastName;
    @NotBlank(message = "Phone should not be blank")
    private String phone;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    public static Member getMember(MemberDto memberDto){
        Member member = new Member();
        member.setFirstName(memberDto.getFirstName());
        member.setLastName(memberDto.getLastName());
        member.setPhone(memberDto.getPhone());
        member.setDateOfBirth(memberDto.getDateOfBirth());
        return member;
    }
}
