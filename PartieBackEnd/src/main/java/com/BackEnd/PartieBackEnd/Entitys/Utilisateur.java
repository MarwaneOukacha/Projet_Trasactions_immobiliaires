package com.BackEnd.PartieBackEnd.Entitys;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Utilisateur  implements UserDetails{
	@Id
	@GeneratedValue
	private long ID;
	@Column(nullable=false)
	private String nom;
	@Column(nullable=false)
	private String prenom;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private String numero_telephone;
	@Column(nullable=false)
	private String type;
	@Column(nullable=false)
	private String password;
	@Column()
	private String IME;
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
