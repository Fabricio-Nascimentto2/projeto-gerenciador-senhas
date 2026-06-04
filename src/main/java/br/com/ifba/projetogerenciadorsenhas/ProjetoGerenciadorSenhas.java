/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.ifba.projetogerenciadorsenhas;

import br.com.ifba.projetogerenciadorsenhas.view.TeleAtendente;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProjetoGerenciadorSenhas {

    public static void main(String[] args) {
        // Desativa o modo 'headless' para permitir que o Spring Boot abra componentes visuais (Swing/AWT)
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ProjetoGerenciadorSenhas.class)
                .headless(false)
                .run(args);

        // Inicializa a interface gráfica de forma segura na thread de eventos do Swing
        java.awt.EventQueue.invokeLater(() -> {
            TeleAtendente tela = new TeleAtendente();
            tela.setVisible(true);
        });
    }
}