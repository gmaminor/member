package com.association.member.model;

import com.association.member.dto.MemberDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;

    @Column(unique = true,length = 20)
    private String phone;
    private LocalDate dateOfBirth;

    public static MemberDto getMemberDto(Member member){
        MemberDto memberDto = new MemberDto();
        memberDto.setFirstName(member.getFirstName());
        memberDto.setLastName(member.getLastName());
        memberDto.setPhone(member.getPhone());
        memberDto.setDateOfBirth(member.getDateOfBirth());
        return memberDto;
    }

}
