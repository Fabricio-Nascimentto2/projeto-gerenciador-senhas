/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.projetogerenciadorsenhas.service;

import br.com.ifba.projetogerenciadorsenhas.domain.Senha;
import br.com.ifba.projetogerenciadorsenhas.repository.SenhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author fabricio
 */


@Service
public class SenhaService {

    @Autowired
    private SenhaRepository senhaRepository;

    public Senha chamarProximo(String guiche) {
        List<Senha> fila = senhaRepository.findByStatusOrderByDataEmissaoAsc("AGUARDANDO");
        
        if (fila.isEmpty()) {
            return null;
        }

        Senha proxima = fila.get(0);
        
        proxima.setStatus("EM_ATENDIMENTO");
        proxima.setDataAtendimento(LocalDateTime.now());
        proxima.setGuicheResponsavel(guiche);
        
        return senhaRepository.save(proxima);
    }
}