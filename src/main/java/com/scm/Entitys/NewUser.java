package com.scm.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class NewUser {
    @Id
    private String UserId;

}
