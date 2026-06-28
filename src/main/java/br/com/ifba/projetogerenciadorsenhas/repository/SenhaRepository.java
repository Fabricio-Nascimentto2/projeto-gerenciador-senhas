/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.projetogerenciadorsenhas.repository;

import br.com.ifba.projetogerenciadorsenhas.domain.Senha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 *
 * @author fabricio
 */
@Repository
public interface SenhaRepository extends JpaRepository<Senha, Long> {

    @Query(value = "SELECT * FROM senhas_atendimento WHERE status = :status ORDER BY data_emissao DESC LIMIT 10", nativeQuery = true)
    List<Senha> findTop10ByStatus(@Param("status") String status);

    List<Senha> findByStatus(String status);
    
    List<Senha> findByStatusOrderByDataEmissaoAsc(String status);
}