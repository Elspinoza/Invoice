package com.kamis.Invoice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id_Employee")
    private int id;
}
