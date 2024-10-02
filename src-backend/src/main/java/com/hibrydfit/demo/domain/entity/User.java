package com.hibrydfit.demo.domain.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.hibrydfit.demo.domain.model.CardioType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "usuarios")
public class User implements UserDetails {
	
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
    
    @OneToMany(mappedBy = "seguidor")
    private List<Seguimiento> seguimientosHechos;

    @OneToMany(mappedBy = "seguido")
    private List<Seguimiento> seguidores;

    @OneToMany(mappedBy = "user")
    private List<Entrenamiento> publicaciones;

    @OneToMany(mappedBy = "user")
    private List<Like> likes;

    @OneToMany(mappedBy = "user")
    private List<Comentario> comentarios;
    
    /**
     * Obtiene las autoridades concedidas al usuario.
     *
     * @return una colección de autoridades concedidas.
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(rol));
        return authorities;
    }

	@Override
	public String getUsername() {
		return user_name;
	}
    
}
