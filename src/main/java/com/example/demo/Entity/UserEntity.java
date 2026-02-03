package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name = "USERINFO")
@Getter
@Setter

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int USERİD;

    @Column(name = "BADGERNUMBER", nullable = false)
    private String badgerNum;

    @Column(name = "SSN", nullable = false)
    private String ssn;

    @Column(name = "NAME",nullable = false)
    private String name;

    @Column(name = "GENDER", nullable = false)
    private String gender;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DEFAULTDEPTID", nullable = false)
    private String defaultDeptId;

    @Column(name = "CardNo")
    private String cardNo;
}
