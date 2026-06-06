/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.projetogerenciadorsenhas.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

/**
 *
 * @author fabricio
 */

@Entity
@Table(name = "senhas_atendimento")
@Data
public class Senha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 10)
    private String codigo; 

    @Column(nullable = false)
    private String tipo; 

    @Column(nullable = false)
    private String status;

    private LocalDateTime dataEmissao;
    private LocalDateTime dataAtendimento;

    @Column(length = 10)
    private String guicheResponsavel;

    @PrePersist
    protected void onCreate() {
        this.dataEmissao = LocalDateTime.now();
        this.status = "AGUARDANDO"; 
    }
}
