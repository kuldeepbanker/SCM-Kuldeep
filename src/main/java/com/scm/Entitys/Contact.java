package com.scm.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contact {

    @Id
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String picture;
    private String discription;
    private Boolean faivorite=false;
    private String websitelink;
    private String LinkdinLink;

}
