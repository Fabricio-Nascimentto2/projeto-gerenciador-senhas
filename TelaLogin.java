package br.com.ifba.projetogerenciadorsenhas.view; import br.com.ifba.projetogerenciadorsenhas.repository.ClienteRepository; import br.com.ifba.projetogerenciadorsenhas.repository.PerfilRepository; 
public class TelaLogin extends javax.swing.JFrame {
    private final ClienteRepository clienteRepository; private final PerfilRepository perfilRepository; private final br.com.ifba.projetogerenciadorsenhas.repository.UsuarioRepository usuarioRepository;
    public TelaLogin(ClienteRepository clienteRepository, PerfilRepository perfilRepository, br.com.ifba.projetogerenciadorsenhas.repository.UsuarioRepository usuarioRepository) {
        this.clienteRepository = clienteRepository;
        this.perfilRepository = perfilRepository;
        this.usuarioRepository = usuarioRepository;
        initComponents(); setLocationRelativeTo(null);
    }
    private TelaLogin() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @SuppressWarnings("unchecked") private void initComponents() { pnlFundotela = new javax.swing.JPanel(); pnlComponetes = new javax.swing.JPanel(); lblUsuario = new javax.swing.JLabel(); lblSenha 
        = new javax.swing.JLabel(); pnlUsuario = new javax.swing.JPanel(); lblUsuarioLogin24 = new javax.swing.JLabel(); txtUsuario = new javax.swing.JTextField(); pnlSenha = new 
        javax.swing.JPanel(); lblSenhaLogin = new javax.swing.JLabel(); txtSenha = new javax.swing.JTextField(); sptLinha = new javax.swing.JSeparator(); btnEntra = new javax.swing.JButton(); 
        lblTituloSuperior = new javax.swing.JLabel(); lblImagemLogotipo = new javax.swing.JLabel(); lblLogotipoO = new javax.swing.JLabel(); lblLogotipoO1 = new javax.swing.JLabel(); lblProjct = new 
        javax.swing.JLabel(); lblTextoInferior = new javax.swing.JLabel(); setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); pnlFundotela.setBackground(new java.awt.Color(255, 
        255, 255)); pnlComponetes.setBackground(new java.awt.Color(255, 255, 255)); pnlComponetes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153))); 
        pnlComponetes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout()); lblUsuario.setText("Usuário"); pnlComponetes.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 
        170, -1, -1)); lblSenha.setText("Senha"); pnlComponetes.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1)); pnlUsuario.setBackground(new java.awt.Color(255, 
        255, 255)); pnlUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255))); lblUsuarioLogin24.setIcon(new 
        javax.swing.ImageIcon(getClass().getResource("/imagens.Login/UsuarioLogin24.png"))); txtUsuario.setForeground(new java.awt.Color(153, 153, 153)); txtUsuario.setText("Usuario"); 
        javax.swing.GroupLayout pnlUsuarioLayout = new javax.swing.GroupLayout(pnlUsuario); pnlUsuario.setLayout(pnlUsuarioLayout); pnlUsuarioLayout.setHorizontalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(pnlUsuarioLayout.createSequentialGroup() .addContainerGap() .addComponent(lblUsuarioLogin24) 
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE) .addContainerGap())
        ); pnlUsuarioLayout.setVerticalGroup( pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(pnlUsuarioLayout.createSequentialGroup() .addContainerGap() 
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuarioLogin24, javax.swing.GroupLayout.Alignment.TRAILING) .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE)) ); pnlComponetes.add(pnlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 320, 40)); pnlSenha.setBackground(new 
        java.awt.Color(255, 255, 255)); pnlSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255))); lblSenhaLogin.setIcon(new 
        javax.swing.ImageIcon(getClass().getResource("/imagens.Login/SenhaLogin.png"))); txtSenha.setForeground(new java.awt.Color(153, 153, 153)); txtSenha.setText("Senha"); javax.swing.GroupLayout 
        pnlSenhaLayout = new javax.swing.GroupLayout(pnlSenha); pnlSenha.setLayout(pnlSenhaLayout); pnlSenhaLayout.setHorizontalGroup(
            pnlSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(pnlSenhaLayout.createSequentialGroup() .addContainerGap() .addComponent(lblSenhaLogin) 
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE) .addContainerGap())
        ); pnlSenhaLayout.setVerticalGroup( pnlSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(pnlSenhaLayout.createSequentialGroup() .addContainerGap() 
                .addGroup(pnlSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSenhaLogin) .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) 
                .addContainerGap(8, Short.MAX_VALUE))
        ); pnlComponetes.add(pnlSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 320, 40)); sptLinha.setBackground(new java.awt.Color(0, 102, 102)); pnlComponetes.add(sptLinha, new 
        org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 310, 10)); btnEntra.setBackground(new java.awt.Color(0, 204, 204)); btnEntra.setFont(new java.awt.Font("Liberation Sans", 0, 18)); 
        btnEntra.setForeground(new java.awt.Color(255, 255, 255)); btnEntra.setText("Entra"); btnEntra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { btnEntraActionPerformed(evt);
            }
        });
        pnlComponetes.add(btnEntra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 150, 50)); lblTituloSuperior.setFont(new java.awt.Font("Liberation Sans", 0, 28)); 
        lblTituloSuperior.setText("Acessar Guichê"); pnlComponetes.add(lblTituloSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1)); lblImagemLogotipo.setIcon(new 
        javax.swing.ImageIcon(getClass().getResource("/imagens.Login/logotipoP.png"))); pnlComponetes.add(lblImagemLogotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, -1));
        lblLogotipoO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens.Login/LogotipoO.png"))); pnlComponetes.add(lblLogotipoO, new
        org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, 40)); lblLogotipoO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens.Login/LogotipoO.png")));
        pnlComponetes.add(lblLogotipoO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 40, 40)); lblProjct.setFont(new java.awt.Font("Liberation Sans", 1, 18));
        lblProjct.setForeground(new java.awt.Color(0, 153, 0)); lblProjct.setText("Project"); pnlComponetes.add(lblProjct, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));
        lblTextoInferior.setFont(new java.awt.Font("Liberation Sans", 0, 16)); lblTextoInferior.setText("Acesso de administradores e atendentes"); pnlComponetes.add(lblTextoInferior, new 
        org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1)); javax.swing.GroupLayout pnlFundotelaLayout = new javax.swing.GroupLayout(pnlFundotela); 
        pnlFundotela.setLayout(pnlFundotelaLayout); pnlFundotelaLayout.setHorizontalGroup(
            pnlFundotelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(pnlFundotelaLayout.createSequentialGroup() .addGap(27, 27, 27) .addComponent(pnlComponetes, 
                javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE) .addContainerGap(29, Short.MAX_VALUE))
        ); pnlFundotelaLayout.setVerticalGroup( pnlFundotelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(pnlFundotelaLayout.createSequentialGroup() .addGap(24, 24, 
                24) .addComponent(pnlComponetes, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE) .addContainerGap(28, Short.MAX_VALUE)));
        ); javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); getContentPane().setLayout(layout); layout.setHorizontalGroup( 
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addComponent(pnlFundotela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 
            Short.MAX_VALUE)
        ); layout.setVerticalGroup( layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addComponent(pnlFundotela, javax.swing.GroupLayout.DEFAULT_SIZE, 
            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        ); pack();
    }
    private void btnEntraActionPerformed(java.awt.event.ActionEvent evt) { String usuarioDigitado = txtUsuario.getText().trim(); String senhaDigitada = txtSenha.getText().trim(); if 
        (usuarioDigitado.isEmpty() || senhaDigitada.isEmpty() || usuarioDigitado.equals("Usuario") || senhaDigitada.equals("Senha")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos!"); return;
        }
        if (usuarioDigitado.equals("admin") && senhaDigitada.equals("admin")) { javax.swing.JOptionPane.showMessageDialog(this, "Acesso Administrador Provisório!"); TelaAdministrador telaAdmin = new 
            TelaAdministrador(clienteRepository, perfilRepository, usuarioRepository); telaAdmin.setVisible(true); this.dispose(); return;
        }
        java.util.List<br.com.ifba.projetogerenciadorsenhas.domain.Cliente> todosClientes = clienteRepository.findAll(); br.com.ifba.projetogerenciadorsenhas.domain.Cliente usuarioLogado = null; for 
        (br.com.ifba.projetogerenciadorsenhas.domain.Cliente c : todosClientes) {
            if (c.getCpf() != null && c.getCpf().equals(usuarioDigitado) && c.getTelefone() != null && c.getTelefone().equals(senhaDigitada)) { usuarioLogado = c; break;
            }
        }
        if (usuarioLogado == null) { javax.swing.JOptionPane.showMessageDialog(this, "Usuário ou Senha incorretos!"); }
        else {
            javax.swing.JOptionPane.showMessageDialog(this, "Bem-vindo, " + usuarioLogado.getNome() + "!"); TelaAdministrador telaAdmin = new TelaAdministrador(clienteRepository, perfilRepository, usuarioRepository);
            telaAdmin.setVisible(true); this.dispose();
        }
    }
    private javax.swing.JButton btnEntra; private javax.swing.JLabel lblImagemLogotipo; private javax.swing.JLabel lblLogotipoO; private javax.swing.JLabel lblLogotipoO1; private javax.swing.JLabel 
    lblProjct; private javax.swing.JLabel lblSenha; private javax.swing.JLabel lblSenhaLogin; private javax.swing.JLabel lblTextoInferior; private javax.swing.JLabel lblTituloSuperior; private 
    javax.swing.JLabel lblUsuario; private javax.swing.JLabel lblUsuarioLogin24; private javax.swing.JPanel pnlComponetes; private javax.swing.JPanel pnlFundotela; private javax.swing.JPanel 
    pnlSenha; private javax.swing.JPanel pnlUsuario; private javax.swing.JSeparator sptLinha; private javax.swing.JTextField txtSenha; private javax.swing.JTextField txtUsuario;
}
