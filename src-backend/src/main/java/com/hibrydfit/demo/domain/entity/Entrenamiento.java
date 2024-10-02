package com.hibrydfit.demo.domain.entity;

import java.time.LocalDateTime;

import com.hibrydfit.demo.domain.model.TipoDeEntrenamiento;

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
@Table(name = "entrenamientos")
public class Entrenamiento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private TipoDeEntrenamiento tipo;
    private String descripcion;
    private LocalDateTime fecha;
    private Integer duracion;  
    private String intensidad;  
    
    
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private User user;
}
