/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.projetogerenciadorsenhas.service;

import br.com.ifba.projetogerenciadorsenhas.domain.Usuario;
import br.com.ifba.projetogerenciadorsenhas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fabricio
 */
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario logar(String login, String senha) {

    Usuario usuario = usuarioRepository
            .findByLogin(login)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

    if (!usuario.getSenha().equals(senha)) {
        throw new RuntimeException("Senha inválida");
    }

    return usuario;
}
}