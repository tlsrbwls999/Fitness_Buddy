package com.example.fit_buddy.secret;

import com.example.fit_buddy.member.Member;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Secret {

    @Id @GeneratedValue
    @Column(name = "secret_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private Member member;

    private String title;

    private String content;

}
