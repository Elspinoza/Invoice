package com.kamis.Invoice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Counter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id")
    private int id;

    @Column(name = "Counter_Number")
    private String numCompteur;

    @Column(name = "Type")
    private String type;


}
