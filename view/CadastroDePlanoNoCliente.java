package view;

import javax.swing.JOptionPane;
import model.Cliente;
import model.Plano;

public class CadastroDePlanoNoCliente extends javax.swing.JFrame {

    private static CadastroDePlanoNoCliente cadastro;
    
    private CadastroDePlanoNoCliente() {
        initComponents();
    }
    
    public static CadastroDePlanoNoCliente getCadastro(){
        if(cadastro == null)
            cadastro = new CadastroDePlanoNoCliente();
        
        cadastro.reiniciar();
        
        return cadastro;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtCpfCliente = new javax.swing.JLabel();
        ctCpfCliente = new javax.swing.JTextField();
        txtRegistroDoPlano = new javax.swing.JLabel();
        ctRegistroDoPlano = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Adicionar plano ao cliente");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtTitulo)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtTitulo)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        txtCpfCliente.setText("CPF do cliente");

        txtRegistroDoPlano.setText("Registro do plano");

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btConfirmar.setText("Confiramr");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCpfCliente)
                            .addComponent(ctCpfCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(txtRegistroDoPlano)
                            .addComponent(ctRegistroDoPlano))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCpfCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtRegistroDoPlano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctRegistroDoPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        sairSemCadastrar();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        Cliente cliente = null;
        Plano plano = null;
        
        for(Cliente c: Principal.clientes){
            if(c.getCpf() == Long.parseLong(ctCpfCliente.getText())){
                cliente = c;
                break;
            }
        }
        
        for(Plano p: Principal.planosCobertos){
            if(p.getRegistro() == Integer.parseInt(ctRegistroDoPlano.getText())){
                plano = p;
                break;
            }
        }
        
        if(plano != null && cliente != null){
            cliente.setPlano(plano);
            
            sair();
        }else if(plano == null && cliente != null){
            JOptionPane.showMessageDialog(null, "O registro do plano está errado");
            ctRegistroDoPlano.setText("");
            ctRegistroDoPlano.requestFocus();
        }else if(plano != null && cliente == null){
            JOptionPane.showMessageDialog(null, "O CPF do cliente está errado");
            ctCpfCliente.setText("");
            ctCpfCliente.requestFocus();
        }else{
            JOptionPane.showMessageDialog(null, "CPF e registro estão errados");
            ctCpfCliente.setText("");
            ctRegistroDoPlano.setText("");
            ctCpfCliente.requestFocus();
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void sairSemCadastrar(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja cancelar a ação?", "Cancelar", JOptionPane.YES_NO_OPTION);
        
        if(resp == 0){
            reiniciar();
            this.dispose();
        }
    }
    
    private void sair(){
        JOptionPane.showMessageDialog(null, "Plano Cadastrado com sucesso");
        
        reiniciar();
        
        this.dispose();
    }
    
    private void reiniciar(){
        ctCpfCliente.setText("");
        ctRegistroDoPlano.setText("");
        
        ctCpfCliente.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JTextField ctCpfCliente;
    private javax.swing.JTextField ctRegistroDoPlano;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JLabel txtCpfCliente;
    private javax.swing.JLabel txtRegistroDoPlano;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
