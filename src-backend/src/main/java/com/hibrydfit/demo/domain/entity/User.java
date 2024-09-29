package com.hibrydfit.demo.domain.entity;

import java.util.List;
import java.util.Set;

import com.hibrydfit.demo.domain.model.CardioType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "usuarios")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String user_name;
    private String nombre;
    private String apellidos;
    private String email;
    private String password;
    private String rol;
    private Integer fire;
    private CardioType cardioFav;
    
    
}
