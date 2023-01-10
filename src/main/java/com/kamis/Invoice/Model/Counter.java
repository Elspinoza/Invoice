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
    private int id;
    @Basic(optional = false)
    private String numCompteur;
    @Basic(optional = false)
    private String type;

}
