package view;

import model.Pessoa;
import model.Credencial;
import model.Cliente;
import model.Plano;
import model.Dentista;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    
    public static ArrayList<Dentista> dentistas = new ArrayList<>();
    public static ArrayList<Plano> planosCobertos = new ArrayList<>();
    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        pnlOpcoes = new javax.swing.JPanel();
        btAjustarSalario = new javax.swing.JButton();
        btGerarCredencial = new javax.swing.JButton();
        btAdcPlanoAoCliente = new javax.swing.JButton();
        txtMsgDeOpcoes = new javax.swing.JLabel();
        btAdcPlano = new javax.swing.JButton();
        btAdcDentista = new javax.swing.JButton();
        ctAdcCliente = new javax.swing.JButton();
        MenuDeBarra = new javax.swing.JMenuBar();
        mnArquivos = new javax.swing.JMenu();
        Cadastros = new javax.swing.JMenu();
        mnCadastrosDentistas = new javax.swing.JMenuItem();
        mnCadastrosClientas = new javax.swing.JMenuItem();
        mnCadastrosPlanos = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("OdontoMoc");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pnlOpcoes.setBackground(new java.awt.Color(67, 104, 145));

        btAjustarSalario.setText("Ajustar salario");
        btAjustarSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAjustarSalarioActionPerformed(evt);
            }
        });

        btGerarCredencial.setText("Gerar credencial");
        btGerarCredencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerarCredencialActionPerformed(evt);
            }
        });

        btAdcPlanoAoCliente.setText("Adicionar plano ao cleinte");
        btAdcPlanoAoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdcPlanoAoClienteActionPerformed(evt);
            }
        });

        txtMsgDeOpcoes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMsgDeOpcoes.setForeground(new java.awt.Color(255, 255, 255));
        txtMsgDeOpcoes.setText("O que deseja fazer:");

        btAdcPlano.setText("Adicionar Plano");
        btAdcPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdcPlanoActionPerformed(evt);
            }
        });

        btAdcDentista.setText("Adicionar dentista");
        btAdcDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdcDentistaActionPerformed(evt);
            }
        });

        ctAdcCliente.setText("Adicionar cliente");
        ctAdcCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctAdcClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcoesLayout = new javax.swing.GroupLayout(pnlOpcoes);
        pnlOpcoes.setLayout(pnlOpcoesLayout);
        pnlOpcoesLayout.setHorizontalGroup(
            pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlOpcoesLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtMsgDeOpcoes))
                    .addComponent(btAdcPlanoAoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btGerarCredencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAjustarSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAdcPlano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ctAdcCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAdcDentista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        pnlOpcoesLayout.setVerticalGroup(
            pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMsgDeOpcoes)
                .addGap(22, 22, 22)
                .addComponent(btAdcDentista)
                .addGap(18, 18, 18)
                .addComponent(ctAdcCliente)
                .addGap(18, 18, 18)
                .addComponent(btAdcPlano)
                .addGap(18, 18, 18)
                .addComponent(btAjustarSalario)
                .addGap(18, 18, 18)
                .addComponent(btGerarCredencial)
                .addGap(18, 18, 18)
                .addComponent(btAdcPlanoAoCliente)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        mnArquivos.setText("Arquivos");

        Cadastros.setText("Cadastros");

        mnCadastrosDentistas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnCadastrosDentistas.setText("Dentistas");
        mnCadastrosDentistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrosDentistasActionPerformed(evt);
            }
        });
        Cadastros.add(mnCadastrosDentistas);

        mnCadastrosClientas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnCadastrosClientas.setText("Clientes");
        mnCadastrosClientas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrosClientasActionPerformed(evt);
            }
        });
        Cadastros.add(mnCadastrosClientas);

        mnCadastrosPlanos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnCadastrosPlanos.setText("Planos");
        mnCadastrosPlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrosPlanosActionPerformed(evt);
            }
        });
        Cadastros.add(mnCadastrosPlanos);

        mnArquivos.add(Cadastros);

        MenuDeBarra.add(mnArquivos);

        setJMenuBar(MenuDeBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(480, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdcPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdcPlanoActionPerformed
        CadastroDoPlano.getCadastro().setVisible(true);
    }//GEN-LAST:event_btAdcPlanoActionPerformed

    private void btAdcDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdcDentistaActionPerformed
        CadastroDoDentista.getCadastro().setVisible(true);
    }//GEN-LAST:event_btAdcDentistaActionPerformed

    private void btGerarCredencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerarCredencialActionPerformed
        Pessoa p = null;
        long buscador = pegarCpf();
        
        for(Cliente c: clientes){
            if(c.getCpf() == buscador){
                p = c;
                break;
            }
        }
        for(Dentista d: dentistas){
            if(d.getCpf() == buscador){
                p = d;
                break;
            }
        }
        
        if(p != null)
            Credencial.getCredencial(p).setVisible(true);
        else
            JOptionPane.showMessageDialog(null, "O CPF informado não está cadastrado.");
            
    }//GEN-LAST:event_btGerarCredencialActionPerformed

    public long pegarCpf(){
        long cpf;
        
        String str = JOptionPane.showInputDialog(null, "Informe o CPF", "Informe", JOptionPane.QUESTION_MESSAGE);
        
        try {
            cpf = Long.parseLong(str);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O CPF deve conter valores numéricos inteiros.");
            cpf = 0;
        }
        
        return cpf;
    }
    
    private void ctAdcClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctAdcClienteActionPerformed
        CadastroDoCliente.getCadastro().setVisible(true);
    }//GEN-LAST:event_ctAdcClienteActionPerformed

    private void btAjustarSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAjustarSalarioActionPerformed
        AlterarSalario.getFrame().setVisible(true);
    }//GEN-LAST:event_btAjustarSalarioActionPerformed

    private void btAdcPlanoAoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdcPlanoAoClienteActionPerformed
        CadastroDePlanoNoCliente.getCadastro().setVisible(true);
    }//GEN-LAST:event_btAdcPlanoAoClienteActionPerformed

    private void mnCadastrosPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrosPlanosActionPerformed
        ListaDePlanos.getLista().setVisible(true);
    }//GEN-LAST:event_mnCadastrosPlanosActionPerformed

    private void mnCadastrosClientasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrosClientasActionPerformed
        ListaDeClientes.getLista().setVisible(true);
    }//GEN-LAST:event_mnCadastrosClientasActionPerformed

    private void mnCadastrosDentistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrosDentistasActionPerformed
        ListaDeDentistas.getLista().setVisible(true);
    }//GEN-LAST:event_mnCadastrosDentistasActionPerformed

    public static void main(String args[]) {
        
       	dentistas.add(new Dentista(11282387687L, "Roberto Nobrega", 2, 6, 1984, 38, 991046365, "Minas Gerais", "Montes Claros", "Sao jose", "Coronel Francisco Duraes",  88, "Ap 302", 1, 15, 9, 2020, 4400, 1243, "Cirurgia"));
	dentistas.add(new Dentista(43229456743L, "Reinaldo Motta", 5, 10, 1990, 38, 991069183, "Minas Gerais", "Montes Claros", "Cintra", "Padre Rocha",  102, null, 2, 10, 2, 2019, 5150,  2027, "Endodontia"));
	dentistas.add(new Dentista(43229473931L, "Paula Tejando", 22, 3, 1995, 43, 991445653, "Parana", "Londrina", "Centro", "Rua dos Andradas",  53, null, 3, 2, 2, 2021, 4200, 2413, "Odontopediatria"));
		
	planosCobertos.add(new Plano("Cassi", 1));
	planosCobertos.add(new Plano("Bradesco Saude", 2));
		
	clientes.add(new Cliente(53148545185L, "Laura Almeida", 10, 10, 2010, 38, 990006000, "Minas Gerais", "Montes Claros", "Roxo Verde", "Av Magalhaes Pinto", 402, "Ap 405", 1, null));
	clientes.add(new Cliente(69733229845L, "Livia Rocha", 8, 9, 2003, 32, 993046300, "Minas Gerais", "Pouso Alegre", "Centro", "Av Abreu Lima", 334, "Ap 102", 2, planosCobertos.get(0)));
	clientes.add(new Cliente(57254323479L, "Thomas Turbando", 26, 3, 1999, 15, 997733342, "Sao Paulo", "Sao paulo", "Vila Madalena", "Rua Fradique Coutinho", 1004, "Ap 705", 3, null));
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastros;
    private javax.swing.JMenuBar MenuDeBarra;
    private javax.swing.JButton btAdcDentista;
    private javax.swing.JButton btAdcPlano;
    private javax.swing.JButton btAdcPlanoAoCliente;
    private javax.swing.JButton btAjustarSalario;
    private javax.swing.JButton btGerarCredencial;
    private javax.swing.JButton ctAdcCliente;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu mnArquivos;
    private javax.swing.JMenuItem mnCadastrosClientas;
    private javax.swing.JMenuItem mnCadastrosDentistas;
    private javax.swing.JMenuItem mnCadastrosPlanos;
    private javax.swing.JPanel pnlOpcoes;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JLabel txtMsgDeOpcoes;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
