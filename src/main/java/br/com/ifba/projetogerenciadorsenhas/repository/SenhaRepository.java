/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.projetogerenciadorsenhas.repository;

import br.com.ifba.projetogerenciadorsenhas.domain.Senha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
/**
 *
 * @author fabricio
 */
@Repository
public interface SenhaRepository extends JpaRepository<Senha, Long> {
    
    List<Senha> findByStatusOrderByDataEmissaoAsc(String status);
}