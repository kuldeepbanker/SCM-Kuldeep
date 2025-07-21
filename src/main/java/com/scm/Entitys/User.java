package com.scm.Entitys;

import com.scm.Entitys.Enum.Providers;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Users")
@Getter
@Setter
@AllArgsConstructor
@Builder
public class User 
{
    @Id
    private String userId;

    @Column(name = "User_Name",nullable = false)
    private String name;
    @Column(unique = true,nullable = false)
    private String email;
    private String password;
    @Column(length = 1000)
    private String about;
    @Column(length = 1000)
    private String profilePic;
    private String PhoneNumber;

    private Boolean enable = false;
    private Boolean emailvarification = false;
    private Boolean Phonevarification = false;

    // SELF,GOOGLE,GITHUB using LOG in

    private  Providers provider = Providers.SELF;
}
