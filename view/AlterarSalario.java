package view;

import javax.swing.JOptionPane;
import model.Dentista;
import exception.FunciSalaInvalidException;

public class AlterarSalario extends javax.swing.JFrame {
    
    private static AlterarSalario frame;
    
    private AlterarSalario() {
        initComponents();
    }

    public static AlterarSalario getFrame(){
        if(frame == null)
            frame = new AlterarSalario();
        
        frame.reiniciar();
        
        return frame;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JLabel();
        ctCodigoDoFuncionario = new javax.swing.JTextField();
        txtSalario = new javax.swing.JLabel();
        ctNovoSalario = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Alterar salário");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtTitulo)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtTitulo)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        txtCodigo.setText("Código do funcionário");

        txtSalario.setText("Novo salário");

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
                    .addComponent(txtCodigo)
                    .addComponent(txtSalario)
                    .addComponent(ctCodigoDoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(ctNovoSalario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctCodigoDoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSalario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctNovoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        Dentista dentista = null;
        
        boolean deuCerto = true;
        try{
            for(Dentista d: Principal.dentistas){
                if(d.getCodigo() == Integer.parseInt(ctCodigoDoFuncionario.getText()))
                    dentista = d;
                break;
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O codigo deve conter números inteiros");
            ctCodigoDoFuncionario.setText("");
            deuCerto = false;
        }
        
        if(deuCerto){
            if(dentista == null)
                JOptionPane.showMessageDialog(null, "O código não existe");
            else
                try {
                    dentista.setSalario(Double.parseDouble(ctNovoSalario.getText()));
                    sair();
            } catch (FunciSalaInvalidException ex) {
                JOptionPane.showMessageDialog(null, "O salario deve ser superior a 1000 reias");
                ctNovoSalario.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(null, "3");
            if(ctNovoSalario.getText().equals(""))
                ctNovoSalario.requestFocus();
            if(ctCodigoDoFuncionario.getText().equals(""))
                ctCodigoDoFuncionario.requestFocus();
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        sairSemCadastrar();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void sairSemCadastrar(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja cancelar a ação?", "Cancelar", JOptionPane.YES_NO_OPTION);
        
        if(resp == 0){
            reiniciar();
            this.dispose();
        }
    }
    
    private void sair(){
        JOptionPane.showMessageDialog(null, "Salario alterado");
        
        reiniciar();
        
        this.dispose();
    }
    
    private void reiniciar(){
        ctCodigoDoFuncionario.setText("");
        ctNovoSalario.setText("");
        
        ctCodigoDoFuncionario.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JTextField ctCodigoDoFuncionario;
    private javax.swing.JTextField ctNovoSalario;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtSalario;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
