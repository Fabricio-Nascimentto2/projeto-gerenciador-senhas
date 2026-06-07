/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
 
package br.com.ifba.projetogerenciadorsenhas.view;

import br.com.ifba.projetogerenciadorsenhas.repository.ClienteRepository;
import br.com.ifba.projetogerenciadorsenhas.repository.PerfilRepository;

public class TelaAdministrador extends javax.swing.JFrame {

    private final ClienteRepository clienteRepository;
    private final PerfilRepository perfilRepository;

    public TelaAdministrador(ClienteRepository clienteRepository, PerfilRepository perfilRepository) {
        this.clienteRepository = clienteRepository;
        this.perfilRepository = perfilRepository;
        initComponents();
        setLocationRelativeTo(null);
    }

    private TelaAdministrador() {
        this(null, null);
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        pnlMenuLateral = new javax.swing.JPanel();
        lblPaineladministrador = new javax.swing.JLabel();
        lblFerfilUsuarioimagem = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblAdministrador = new javax.swing.JLabel();
        spdPaineladministrador = new javax.swing.JSeparator();
        btnDashboard = new javax.swing.JButton();
        btnAtendentes = new javax.swing.JButton();
        btnGuichês = new javax.swing.JButton();
        btnSenhas = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnCadastraAtendentes = new javax.swing.JButton();
        btnExcluirAtendentes = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTextoSuperior = new javax.swing.JLabel();
        pnlPesquisa = new javax.swing.JPanel();
        lblPeaquisa = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenuLateral.setBackground(new java.awt.Color(0, 204, 204));
        pnlMenuLateral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPaineladministrador.setBackground(new java.awt.Color(255, 255, 255));
        lblPaineladministrador.setFont(new java.awt.Font("Liberation Sans", 1, 30)); 
        lblPaineladministrador.setForeground(new java.awt.Color(255, 255, 255));
        lblPaineladministrador.setText("Painel Administrativo");

        lblFerfilUsuarioimagem.setText("👤");

        lblNome.setText("Nome");
        lblAdministrador.setText("Administrador");

        btnDashboard.setFont(new java.awt.Font("Liberation Sans", 1, 18)); 
        btnDashboard.setForeground(new java.awt.Color(0, 102, 102));
        btnDashboard.setText("  Dashboard");

        btnAtendentes.setFont(new java.awt.Font("Liberation Sans", 1, 16)); 
        btnAtendentes.setForeground(new java.awt.Color(0, 102, 102));
        btnAtendentes.setText(" Atendentes                ");

        btnGuichês.setFont(new java.awt.Font("Liberation Sans", 1, 16)); 
        btnGuichês.setForeground(new java.awt.Color(0, 102, 102));
        btnGuichês.setText("Guichês                      ");

        btnSenhas.setFont(new java.awt.Font("Liberation Sans", 1, 16)); 
        btnSenhas.setForeground(new java.awt.Color(0, 102, 102));
        btnSenhas.setText("Senhas                       ");

        btnSair.setFont(new java.awt.Font("Liberation Sans", 1, 16)); 
        btnSair.setForeground(new java.awt.Color(0, 102, 102));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnCadastraAtendentes.setFont(new java.awt.Font("Liberation Sans", 1, 16)); 
        btnCadastraAtendentes.setForeground(new java.awt.Color(0, 102, 102));
        btnCadastraAtendentes.setText("Cadastra Atendentes");
        btnCadastraAtendentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraAtendentesActionPerformed(evt);
            }
        });

        btnExcluirAtendentes.setFont(new java.awt.Font("Liberation Sans", 1, 16)); 
        btnExcluirAtendentes.setForeground(new java.awt.Color(0, 102, 102));
        btnExcluirAtendentes.setText("Excluir Atendentes");

        javax.swing.GroupLayout pnlMenuLateralLayout = new javax.swing.GroupLayout(pnlMenuLateral);
        pnlMenuLateral.setLayout(pnlMenuLateralLayout);
        pnlMenuLateralLayout.setHorizontalGroup(
            pnlMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLateralLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblFerfilUsuarioimagem)
                .addGap(6, 6, 6)
                .addGroup(pnlMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblAdministrador))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlMenuLateralLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPaineladministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spdPaineladministrador))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLateralLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExcluirAtendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCadastraAtendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAtendentes, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(btnGuichês, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSenhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(48, 48, 48))
        );
        pnlMenuLateralLayout.setVerticalGroup(
            pnlMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLateralLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblPaineladministrador)
                .addGroup(pnlMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLateralLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAdministrador))
                    .addGroup(pnlMenuLateralLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblFerfilUsuarioimagem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spdPaineladministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastraAtendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirAtendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuichês, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSenhas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnlMenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 690));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTextoSuperior.setFont(new java.awt.Font("Liberation Sans", 0, 14)); 
        lblTextoSuperior.setText("GERENCIADOR DE SENHAS ");
        jPanel1.add(lblTextoSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, -1));

        pnlPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        pnlPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        lblPeaquisa.setText("🔍");

        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        txtPesquisa.setText("Pesquisa");

        javax.swing.GroupLayout pnlPesquisaLayout = new javax.swing.GroupLayout(pnlPesquisa);
        pnlPesquisa.setLayout(pnlPesquisaLayout);
        pnlPesquisaLayout.setHorizontalGroup(
            pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPeaquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPesquisaLayout.setVerticalGroup(
            pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPeaquisa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(pnlPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 540, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 750, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, -1, 770, 690));

        pack();
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
        new TelaLogin(clienteRepository, perfilRepository).setVisible(true);
        this.dispose();
    }

    private void btnCadastraAtendentesActionPerformed(java.awt.event.ActionEvent evt) {
        CadastroAtendente painelCadastro = new CadastroAtendente(clienteRepository, perfilRepository);
        
        javax.swing.JDialog janelaModal = new javax.swing.JDialog(this, "Módulo de Cadastro", true);
        janelaModal.getContentPane().add(painelCadastro);
        janelaModal.pack();
        janelaModal.setLocationRelativeTo(this); 
        janelaModal.setVisible(true);
    }

    private javax.swing.JButton btnAtendentes;
    private javax.swing.JButton btnCadastraAtendentes;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnExcluirAtendentes;
    private javax.swing.JButton btnGuichês;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSenhas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAdministrador;
    private javax.swing.JLabel lblFerfilUsuarioimagem;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPaineladministrador;
    private javax.swing.JLabel lblPeaquisa;
    private javax.swing.JLabel lblTextoSuperior;
    private javax.swing.JPanel pnlMenuLateral;
    private javax.swing.JPanel pnlPesquisa;
    private javax.swing.JSeparator spdPaineladministrador;
    private javax.swing.JTextField txtPesquisa;
}
