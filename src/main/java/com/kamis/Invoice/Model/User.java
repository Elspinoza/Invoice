package com.kamis.Invoice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id")
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Last_Name")
    private String lastName;
    @Column(name = "Phone_Number")
    private String tel;
    @Column(name = "Email")
    private String email;
    @Column(name = "Counter_Number")
    private String numCompteur;

}
