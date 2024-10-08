package com.hibrydfit.demo.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "seguimientos")
public class Seguimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Usuario que sigue a otro
    @ManyToOne
    @JoinColumn(name = "seguidor_id", nullable = false)
    private User seguidor;

    // Usuario que es seguido
    @ManyToOne
    @JoinColumn(name = "seguido_id", nullable = false)
    private User seguido;

    }
