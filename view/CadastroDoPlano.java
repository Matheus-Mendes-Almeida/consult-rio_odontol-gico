package view;

import javax.swing.JOptionPane;
import model.Plano;

public class CadastroDoPlano extends javax.swing.JFrame {
    
    private static CadastroDoPlano cadastro;
    private static Plano plano;
    
    private CadastroDoPlano() {
        initComponents();
    }
    
    public static CadastroDoPlano getCadastro(){
        if(cadastro == null){
            cadastro = new CadastroDoPlano();
        }
        
        cadastro.reiniciar();
        plano = new Plano();
        
        return cadastro;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JLabel();
        txtRegistro = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        ctRegistro = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtNome.setText("Nome:");

        txtRegistro.setText("Registro:");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Cadastrar plano");

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
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtTitulo)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(btCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btCancelar)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(txtRegistro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ctRegistro)
                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome)
                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btCancelar))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        sairSemCadastrar();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        boolean check = true;
        
        if(ctNome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Deve ser inserido o nome do plano");
            check = false;
        }else{
            plano.setNome(ctNome.getText());
        }
        
        try{
            plano.setRegistro(Integer.parseInt(ctRegistro.getText()));
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O registro do plano deve ser valores inteiros");
            ctRegistro.setText("");
            check = false;
        }
        
        check = !planoRepetido();
        
        if(check){
                Principal.planosCobertos.add(plano);
                
                sair();
        }else{
            if(ctRegistro.getText().equals(""))
                ctRegistro.requestFocus();
            if(ctNome.getText().equals(""))
                ctNome.requestFocus();
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void sairSemCadastrar(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja cancelar a ação?", "Cancelar", JOptionPane.YES_NO_OPTION);
        
        if(resp == 0){
            reiniciar();
            this.dispose();
        }
    }
    
    private void sair(){
        JOptionPane.showMessageDialog(null, "Plano cadastrado");
        
        reiniciar();
        
        this.dispose();
    }
    
    private void reiniciar(){
        ctNome.setText("");
        ctRegistro.setText("");
        ctNome.requestFocus();
    }
    
    public boolean planoRepetido(){
        boolean repetido = false;
        
        for(Plano p: Principal.planosCobertos){
            if(p.getNome().equalsIgnoreCase(ctNome.getText()) && p.getRegistro() == Integer.parseInt(ctRegistro.getText())){
                JOptionPane.showMessageDialog(null, "O plano já está cadastrado.");
                repetido = true;
                break;
            }
            if(p.getNome().equalsIgnoreCase(ctNome.getText())){
                JOptionPane.showMessageDialog(null, "O nome do plano já está sendo utilizado.");
                repetido = true;
                break;
            }
            if(p.getRegistro() == Integer.parseInt(ctRegistro.getText())){
                JOptionPane.showMessageDialog(null, "O registro do plano já está sendo utilizado.");
                repetido = true;
                break;
            }
        }
        
        return repetido;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctRegistro;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtRegistro;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
