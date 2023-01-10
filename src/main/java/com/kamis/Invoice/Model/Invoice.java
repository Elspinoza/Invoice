package com.kamis.Invoice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id")
    private int id;

    @Column(name = "Invoice_Date")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate date;

    @Column(name = "Price")
    private int price;

    @Column(name = "Label")
    private int libelle;



}
