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

public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id")
    private int id;

    @Column(name = "Installation_Day")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate InstallationDay;

    @Column(name = "Registration_Date")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate registrationDate;

    @Column(name = "Initial_Level")
    //Variable permettant l'initialisation des donnees du compteur du debut du mois
    private double initLevel;

    @Column(name = "Start")
    //Variable permettant l'entree en donner du debut du compteur au debut du mois
    private double startLevel;

    @Column(name = "End")
    //Variable permettant l'entree en donnee du compteur a la fin du mois
    private double endLevel;

}
