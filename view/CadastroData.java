package view;

import javax.swing.JOptionPane;
import exception.DatAnoException;
import exception.DatDiaException;
import exception.DatMesException;
import model.Data;

public class CadastroData extends javax.swing.JFrame {

    private static CadastroData cadastro;
    private Data data;
    
    private CadastroData() {
        initComponents();
    }
    
    public static CadastroData getCadastro(Data data){
        if(cadastro == null)
            cadastro = new CadastroData();
        
        cadastro.reiniciar();
        cadastro.data = data;
        
        return cadastro;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtDia = new javax.swing.JLabel();
        ctDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JLabel();
        ctMes = new javax.swing.JTextField();
        txtAno = new javax.swing.JLabel();
        ctAno = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Data");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtTitulo)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        txtDia.setText("Dia");

        txtMes.setText("Mes");

        txtAno.setText("Ano");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 210, Short.MAX_VALUE)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDia)
                                    .addComponent(txtMes)
                                    .addComponent(txtAno)
                                    .addComponent(ctDia, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(ctMes)
                                    .addComponent(ctAno))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        sairSemCadastrar();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        boolean check = true;
        
        try {
            data.setDia(Integer.parseInt(ctDia.getText()));
        } catch (DatDiaException ex) {
            ex.printError();
            check = false;
            ctDia.setText("");
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O dia deve conter valores numéricos inteiros.");
            check = false;
            ctDia.setText("");
        }
        
        try {
            data.setMes(Integer.parseInt(ctMes.getText()));
        } catch (DatMesException ex) {
            ex.printError();
            check = false;
            ctMes.setText("");
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O mês deve conter valores numéricos inteiros.");
            check = false;
            ctMes.setText("");
        }
        
        try {
            data.setAno(Integer.parseInt(ctAno.getText()));
        } catch (DatAnoException ex) {
            ex.printError();
            check = false;
            ctAno.setText("");
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O ano deve conter valores numéricos inteiros.");
            check = false;
            ctAno.setText("");
        }
        
        if(check){           
            sair();
        }else{
            if(ctAno.getText().equals(""))
                ctAno.requestFocus();
            if(ctMes.getText().equals(""))
                ctMes.requestFocus();
            if(ctDia.getText().equals(""))
                ctDia.requestFocus();
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

     private void sair(){
        JOptionPane.showMessageDialog(null, "Data Cadastrada");
        
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
        ctDia.setText("");
        ctMes.setText("");
        ctAno.setText("");
        
        ctDia.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JTextField ctAno;
    private javax.swing.JTextField ctDia;
    private javax.swing.JTextField ctMes;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JLabel txtAno;
    private javax.swing.JLabel txtDia;
    private javax.swing.JLabel txtMes;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
