package com.example.fit_buddy.member;

import com.example.fit_buddy.posts.Post;
import com.example.fit_buddy.secret.Secret;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name="member_id")
    private Long id;

    private String name;

    private int year; //운동 경력 athletic career

    private String pw;

    @OneToMany(mappedBy ="member")
    private List<Post> posts=new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Secret> secrets=new ArrayList<>();


}
