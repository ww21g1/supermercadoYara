package com.winningwomen.supermercadoYara.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winningwomen.supermercadoYara.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	

}
