package view;

import javax.swing.JOptionPane;
import model.Cliente;
import exception.PesCpfInvalidException;

public class CadastroDoCliente extends javax.swing.JFrame {

    private static CadastroDoCliente cadastro;
    private static Cliente cliente;
    
    private CadastroDoCliente() {
        initComponents();
    }
    
    public static CadastroDoCliente getCadastro() {
        if(cadastro == null)
            cadastro = new CadastroDoCliente();
        
        cadastro.reiniciar();
        cliente = new Cliente();
        
        return cadastro;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadastrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtSubTituloPessoal = new javax.swing.JLabel();
        txtCpf = new javax.swing.JLabel();
        ctCpf = new javax.swing.JTextField();
        txtNome = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        btCadastrarTelefone = new javax.swing.JButton();
        btCadastrarDataNasc = new javax.swing.JButton();
        btCadastrarEndereco = new javax.swing.JButton();
        txtCodigo = new javax.swing.JLabel();
        ctCodigoDoCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        txtTitulo.setText("Cadastro do cliente");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtTitulo)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        txtSubTituloPessoal.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtSubTituloPessoal.setText("Dados Pessoais:");

        txtCpf.setText("CPF");

        txtNome.setText("Nome");

        btCadastrarTelefone.setText("Cadastrar telefone");
        btCadastrarTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarTelefoneActionPerformed(evt);
            }
        });

        btCadastrarDataNasc.setText("Cadastrar data de nascimento");
        btCadastrarDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarDataNascActionPerformed(evt);
            }
        });

        btCadastrarEndereco.setText("Cadastrar Endereço");
        btCadastrarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarEnderecoActionPerformed(evt);
            }
        });

        txtCodigo.setText("Código do cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ctCodigoDoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubTituloPessoal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(ctNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCadastrarDataNasc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrarEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrarTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(btCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btCancelar)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSubTituloPessoal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCpf)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrarDataNasc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrarEndereco))
                .addGap(18, 18, 18)
                .addComponent(txtCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctCodigoDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrarTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btCancelar))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        boolean check = true;
        
        try {
            cliente.setCpf(Long.parseLong(ctCpf.getText()));
        } catch (PesCpfInvalidException ex) {
            ex.printError();
            check = false;
            ctCpf.setText("");
            ctCpf.requestFocus();
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O CPF deve conter valores numéricos inteiros.");
            check = false;
            ctCpf.setText("");
            ctCpf.requestFocus();
        }
        
        if(ctNome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O cliente deve ter um nome.");
            check = false;
        }else{
            cliente.setNome(ctNome.getText());
        }
        
        try{
            cliente.setCodigo(Integer.parseInt(ctCodigoDoCliente.getText()));
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O código deve ser um número inteiro.");
            check = false;
            ctCodigoDoCliente.setText("");
        }
        
        if(cliente.getTelefone() == null){
            check = false;
            JOptionPane.showMessageDialog(null, "Cadastre o telefone.");
        }
        
        if(cliente.getdataNasc() == null){
            check = false;
            JOptionPane.showMessageDialog(null, "Cadastre a data de nascimento.");
        }
        
        if(cliente.getEndereco() == null){
            check = false;
            JOptionPane.showMessageDialog(null, "Cadastre o endereço.");
        }
        
        check = !clienteRepetido();
        
        if(check){
            Principal.clientes.add(cliente);
            
            sair();
        }else{
            if(ctCodigoDoCliente.getText().equals(""))
                ctCodigoDoCliente.requestFocus();
            if(ctNome.getText().equals(""))
                ctNome.requestFocus();
            if(ctCpf.getText().equals(""))
                ctCpf.requestFocus();
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        sairSemCadastrar();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btCadastrarTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarTelefoneActionPerformed
        cliente.setTelefone();
        
        CadastroTelefone.getCadastro(cliente.getTelefone()).setVisible(true);
    }//GEN-LAST:event_btCadastrarTelefoneActionPerformed

    private void btCadastrarDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarDataNascActionPerformed
        cliente.setDataNasc();
        
        CadastroData.getCadastro(cliente.getdataNasc()).setVisible(true);
    }//GEN-LAST:event_btCadastrarDataNascActionPerformed

    private void btCadastrarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarEnderecoActionPerformed
        cliente.setEndereco();
        
        CadastroEndereco.getCadastro(cliente.getEndereco()).setVisible(true);
    }//GEN-LAST:event_btCadastrarEnderecoActionPerformed

    private void sairSemCadastrar(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja cancelar a ação?", "Cancelar", JOptionPane.YES_NO_OPTION);
        
        if(resp == 0){
            reiniciar();
            this.dispose();
        }
    }
    
    private void sair(){
        JOptionPane.showMessageDialog(null, "Cliente Cadastrado");
        
        reiniciar();
        
        this.dispose();
    }
    
    private void reiniciar(){
        ctCpf.setText("");
        ctNome.setText("");
        
        ctCpf.requestFocus();
    }
    
    public boolean clienteRepetido(){
        boolean repetido = false;
        
        for(Cliente c: Principal.clientes){
            if(c.getCpf() == Long.parseLong(ctCpf.getText()) && c.getCodigo() == Integer.parseInt(ctCodigoDoCliente.getText())){
                JOptionPane.showMessageDialog(null, "Cliente já cadastrado.");
                repetido = true;
                break;
            }
            if(c.getCpf() == Long.parseLong(ctCpf.getText())){
                JOptionPane.showMessageDialog(null, "O CPF já está cadastrado.");
                repetido = true;
                break;
            }
            if(c.getCodigo() == Integer.parseInt(ctCodigoDoCliente.getText())){
                JOptionPane.showMessageDialog(null, "O código já está sendo utilizado.");
                repetido = true;
                break;
            }
        }
        
        return repetido;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCadastrarDataNasc;
    private javax.swing.JButton btCadastrarEndereco;
    private javax.swing.JButton btCadastrarTelefone;
    private javax.swing.JButton btCancelar;
    private javax.swing.JTextField ctCodigoDoCliente;
    private javax.swing.JTextField ctCpf;
    private javax.swing.JTextField ctNome;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtCpf;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtSubTituloPessoal;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
