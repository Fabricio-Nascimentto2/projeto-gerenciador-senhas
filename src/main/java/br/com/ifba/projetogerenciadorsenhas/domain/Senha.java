/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.projetogerenciadorsenhas.domain;

/**
 *
 * @author fabricio
 */
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

    @Column(nullable = false, length = 20)
    private String codigo; 

    @Column(nullable = false)
    private String tipo; 

    @Column(nullable = false)
    private String status;

    private LocalDateTime dataEmissao;
    private LocalDateTime dataAtendimento;

    @Column(length = 100)
    private String guicheResponsavel;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @PrePersist
    protected void onCreate() {
        this.dataEmissao = LocalDateTime.now();
        this.status = "AGUARDANDO"; 
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public LocalDateTime getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(LocalDateTime dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public String getGuicheResponsavel() {
        return guicheResponsavel;
    }

    public void setGuicheResponsavel(String guicheResponsavel) {
        this.guicheResponsavel = guicheResponsavel;
    }
    
}
