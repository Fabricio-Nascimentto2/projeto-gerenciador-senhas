/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.ifba.projetogerenciadorsenhas;

import br.com.ifba.projetogerenciadorsenhas.repository.ClienteRepository;
import br.com.ifba.projetogerenciadorsenhas.repository.PerfilRepository;
import br.com.ifba.projetogerenciadorsenhas.view.TelaLogin;
import br.com.ifba.projetogerenciadorsenhas.view.TeleAtendente;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProjetoGerenciadorSenhas {

    public static void main(String[] args) {
        // Inicializa o contexto do Spring Boot de modo "headless" desativado para aceitar interfaces Swing
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ProjetoGerenciadorSenhas.class)
                .headless(false)
                .run(args);

        // Recupera os repositórios gerenciados pelo Spring
        ClienteRepository clienteRepo = context.getBean(ClienteRepository.class);
        PerfilRepository perfilRepo = context.getBean(PerfilRepository.class);

        // Abre a Tela de Login passando as conexões com maestria
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin(clienteRepo, perfilRepo).setVisible(true);
        });
    }
}