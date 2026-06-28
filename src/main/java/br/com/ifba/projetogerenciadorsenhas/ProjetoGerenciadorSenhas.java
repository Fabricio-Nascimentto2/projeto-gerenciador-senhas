/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.ifba.projetogerenciadorsenhas;

import br.com.ifba.projetogerenciadorsenhas.repository.ClienteRepository;
import br.com.ifba.projetogerenciadorsenhas.repository.PerfilRepository;
import br.com.ifba.projetogerenciadorsenhas.repository.SenhaRepository;
import br.com.ifba.projetogerenciadorsenhas.repository.UsuarioRepository;
import br.com.ifba.projetogerenciadorsenhas.service.UsuarioService;
import br.com.ifba.projetogerenciadorsenhas.view.MenuPrincipal;
import br.com.ifba.projetogerenciadorsenhas.view.TelaLogin;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.ifba.projetogerenciadorsenhas")
@EnableJpaRepositories(basePackages = "br.com.ifba.projetogerenciadorsenhas.repository")
public class ProjetoGerenciadorSenhas {

    public static void main(String[] args) {
        /*ConfigurableApplicationContext context = new SpringApplicationBuilder(ProjetoGerenciadorSenhas.class).headless(false).run(args);

        ClienteRepository clienteRepository = context.getBean(ClienteRepository.class);
        PerfilRepository perfilRepository = context.getBean(PerfilRepository.class);
        UsuarioRepository usuarioRepository = context.getBean(UsuarioRepository.class);
        UsuarioService usuarioService = context.getBean(UsuarioService.class);
        SenhaRepository senhaRepository = context.getBean(SenhaRepository.class);

        java.awt.EventQueue.invokeLater(() -> {new TelaLogin(clienteRepository,perfilRepository,usuarioRepository,usuarioService,senhaRepository).setVisible(true);});
        */
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ProjetoGerenciadorSenhas.class)
            .headless(false) // Necessário para abrir janelas Swing
            .run(args);

        // Pede ao Spring para instanciar e mostrar o MenuPrincipal
        java.awt.EventQueue.invokeLater(() -> {
            context.getBean(MenuPrincipal.class).setVisible(true);
        });
    }
}