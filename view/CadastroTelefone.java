package view;

import javax.swing.JOptionPane;
import exception.TelDddLimitException;
import exception.TelDddNegException;
import exception.TelNumNegException;
import model.Telefone;

public class CadastroTelefone extends javax.swing.JFrame {

    private static CadastroTelefone cadastro;
    private Telefone telefone;
    
    private CadastroTelefone() {
        initComponents();
    }
    
    public static CadastroTelefone getCadastro(Telefone telefone){
        if(cadastro == null)
            cadastro = new CadastroTelefone();
        
        cadastro.reiniciar();
        cadastro.telefone = telefone;
        
        return cadastro;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtDdd = new javax.swing.JLabel();
        ctDdd = new javax.swing.JTextField();
        txtNumero = new javax.swing.JLabel();
        ctNumero = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Telefone");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(txtTitulo)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopoLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addGap(14, 14, 14))
        );

        txtDdd.setText("DDD");

        txtNumero.setText("Número");

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
                    .addComponent(txtDdd)
                    .addComponent(txtNumero)
                    .addComponent(ctDdd, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(ctNumero))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctDdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btConfirmar)
                .addGap(18, 18, 18)
                .addComponent(btCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        boolean check = true;
        
        try {
            telefone.setDdd(Integer.parseInt(ctDdd.getText()));
        } catch (TelDddLimitException ex) {
            ex.printError();
            check = false;
            ctDdd.setText("");
        } catch (TelDddNegException ex) {
            ex.printError();
            check = false;
            ctDdd.setText("");
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O DDD deve conter valores numéricos inteiros.");
            check = false;
            ctDdd.setText("");
        }
        
        try {
            telefone.setNumero(Integer.parseInt(ctNumero.getText()));
        } catch (TelNumNegException ex) {
            ex.printError();
            check = false;
            ctNumero.setText("");
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O número deve conter valores numéricos inteiros.");
            check = false;
            ctNumero.setText("");
        }
        
        if(check){           
            sair();
        }else{
            if(ctNumero.getText().equals(""))
                ctNumero.requestFocus();
            if(ctDdd.getText().equals(""))
                ctDdd.requestFocus();
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        sairSemCadastrar();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void sair(){
        JOptionPane.showMessageDialog(null, "Número Cadastrado");
        
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
        ctDdd.setText("");
        ctNumero.setText("");
        
        ctDdd.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JTextField ctDdd;
    private javax.swing.JTextField ctNumero;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JLabel txtDdd;
    private javax.swing.JLabel txtNumero;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
