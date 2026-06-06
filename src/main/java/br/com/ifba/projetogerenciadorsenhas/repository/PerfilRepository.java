/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.projetogerenciadorsenhas.repository;

import br.com.ifba.projetogerenciadorsenhas.domain.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 *
 * @author fabricio
 */
@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {
    
    Optional<Perfil> findByNome(String nome);
}