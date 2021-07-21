package com.techcushy.springBoot_validation.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name="Users")
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private  Long id;
    @Column(name="firstName",nullable = false)
    //user name should not be null and empty
    //user at least have 2 characters
    @NotEmpty
    @Size(min = 2, message="users should have atleast 2 char")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    //valid email format
    @NotEmpty
    @Email
    @Column(name="email",nullable = false)
    private String email;

    @Column(name="password")
    @NotEmpty
    @Size(min=8, message="give the atleast8 char")
    private String password;

}
