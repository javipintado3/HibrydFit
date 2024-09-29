package com.hibrydfit.demo.domain.entity;

import com.hibrydfit.demo.domain.model.CardioType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "comentarios")
public class Comentario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contenido;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private User usuario;
    @ManyToOne
    @JoinColumn(name = "entrenamiento_id")
    private Entrenamiento entrenamiento;
}
