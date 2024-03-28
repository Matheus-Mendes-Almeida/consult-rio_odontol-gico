package view;

import javax.swing.JOptionPane;
import exception.EndeNumNegException;
import model.Endereco;

public class CadastroEndereco extends javax.swing.JFrame {

    private static CadastroEndereco cadastro;
    private Endereco endereco;
    
    public CadastroEndereco() {
        initComponents();
    }

     public static CadastroEndereco getCadastro(Endereco endereco){
        if(cadastro == null)
            cadastro = new CadastroEndereco();
        
        cadastro.reiniciar();
        cadastro.endereco = endereco;
        
        return cadastro;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        ctEstado = new javax.swing.JTextField();
        txtCidade = new javax.swing.JLabel();
        ctCidade = new javax.swing.JTextField();
        txtBairro = new javax.swing.JLabel();
        ctBairro = new javax.swing.JTextField();
        txtRua = new javax.swing.JLabel();
        ctRua = new javax.swing.JTextField();
        txtNumero = new javax.swing.JLabel();
        ctNumero = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JLabel();
        ctComplemento = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Endereço");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopoLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addGap(20, 20, 20))
        );

        txtEstado.setText("Estado");

        txtCidade.setText("Cidade");

        txtBairro.setText("Bairro");

        txtRua.setText("Rua");

        txtNumero.setText("Número");

        txtComplemento.setText("Complemento");

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btConfirmar.setText("Confirmar");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ctComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(txtComplemento)
                    .addComponent(txtEstado)
                    .addComponent(txtCidade)
                    .addComponent(txtBairro)
                    .addComponent(txtRua)
                    .addComponent(txtNumero)
                    .addComponent(ctEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(ctCidade)
                    .addComponent(ctBairro)
                    .addComponent(ctRua)
                    .addComponent(ctNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        boolean check = true;
        
        if(ctEstado.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O estado deve ser informado.");
            check = false;
        }else{
            endereco.setEstado(ctEstado.getText());
        }
        
        if(ctCidade.getText().equals("")){
            JOptionPane.showMessageDialog(null, "A cidade deve ser informada.");
            check = false;
        }else{
            endereco.setCidade(ctCidade.getText());
        }
        
        if(ctBairro.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O bairro deve ser informado.");
            check = false;
        }else{
            endereco.setBairro(ctBairro.getText());
        }
        
        if(ctRua.getText().equals("")){
            JOptionPane.showMessageDialog(null, "A rua deve ser informada.");
            check = false;
        }else{
            endereco.setRua(ctRua.getText());
        }
        
        try{
            endereco.setNumero(Integer.parseInt(ctNumero.getText()));
        } catch(EndeNumNegException e){
            e.printError();
            check = false;
            ctNumero.setText("");
        }
        
        if(!ctComplemento.getText().equals(""))
            endereco.setComplemento(ctComplemento.getText());
         
        if(check)
            sair();
        else
            ctNumero.requestFocus();
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        sairSemCadastrar();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void sair(){
        JOptionPane.showMessageDialog(null, "Endereço Cadastrado");
        
        reiniciar();
        
        this.dispose(); 
    }

    private void sairSemCadastrar(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja cancelar a ação?", "Cancelar", JOptionPane.YES_NO_OPTION);
        
        if(resp == 0){
            reiniciar();
            this.dispose();
        }
    }
    
    private void reiniciar(){
        ctEstado.setText("");
        ctCidade.setText("");
        ctBairro.setText("");
        ctRua.setText("");
        ctNumero.setText("");
        ctComplemento.setText("");
        
        ctEstado.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JTextField ctBairro;
    private javax.swing.JTextField ctCidade;
    private javax.swing.JTextField ctComplemento;
    private javax.swing.JTextField ctEstado;
    private javax.swing.JTextField ctNumero;
    private javax.swing.JTextField ctRua;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JLabel txtBairro;
    private javax.swing.JLabel txtCidade;
    private javax.swing.JLabel txtComplemento;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtNumero;
    private javax.swing.JLabel txtRua;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
