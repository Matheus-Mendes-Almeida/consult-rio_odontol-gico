package view;

import javax.swing.JOptionPane;
import model.Dentista;
import exception.FunciSalaInvalidException;
import exception.PesCpfInvalidException;

public class CadastroDoDentista extends javax.swing.JFrame {

    private static CadastroDoDentista cadastro;
    private static Dentista dentista;
    
    private CadastroDoDentista() {
        initComponents();
    }
    
    public static CadastroDoDentista getCadastro() {
        if(cadastro == null)
            cadastro = new CadastroDoDentista();
        
        cadastro.reiniciar();
        dentista = new Dentista();
        
        return cadastro;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JLabel();
        ctCpf = new javax.swing.JTextField();
        txtNome = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        txtCodigoDoFuncionario = new javax.swing.JLabel();
        ctCodigoDoFuncionario = new javax.swing.JTextField();
        txtSalario = new javax.swing.JLabel();
        ctSalario = new javax.swing.JTextField();
        txtCrm = new javax.swing.JLabel();
        ctCrm = new javax.swing.JTextField();
        txtEspecializacao = new javax.swing.JLabel();
        ctEspecializacao = new javax.swing.JTextField();
        btCadastrarDataDeAssoc = new javax.swing.JButton();
        btCadastrarDataDeNasc = new javax.swing.JButton();
        btCadastrarTelefone = new javax.swing.JButton();
        btCadastrarEndereco = new javax.swing.JButton();
        txtSubTituloDadosPessoais = new javax.swing.JLabel();
        txtSubTituloDadosDoProfissional = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro do dentista");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        txtCpf.setText("CPF");

        txtNome.setText("Nome");

        txtCodigoDoFuncionario.setText("Código do funcionário");

        txtSalario.setText("Salário");

        txtCrm.setText("CRM");

        txtEspecializacao.setText("Especialização");

        btCadastrarDataDeAssoc.setText("Cadastrar data de associação");
        btCadastrarDataDeAssoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarDataDeAssocActionPerformed(evt);
            }
        });

        btCadastrarDataDeNasc.setText("Cadastrar data de nascimento");
        btCadastrarDataDeNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarDataDeNascActionPerformed(evt);
            }
        });

        btCadastrarTelefone.setText("Cadastrar telefone");
        btCadastrarTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarTelefoneActionPerformed(evt);
            }
        });

        btCadastrarEndereco.setText("Cadastrar endereço");
        btCadastrarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarEnderecoActionPerformed(evt);
            }
        });

        txtSubTituloDadosPessoais.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtSubTituloDadosPessoais.setText("Dados Pessoais:");

        txtSubTituloDadosDoProfissional.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtSubTituloDadosDoProfissional.setText("Dados do profissional:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSubTituloDadosPessoais)
                    .addComponent(txtCpf)
                    .addComponent(btCadastrarDataDeNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadastrarTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadastrarEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNome)
                    .addComponent(ctCpf)
                    .addComponent(ctNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ctSalario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctCrm, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadastrarDataDeAssoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCrm, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEspecializacao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoDoFuncionario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSubTituloDadosDoProfissional, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctEspecializacao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctCodigoDoFuncionario))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubTituloDadosPessoais)
                    .addComponent(txtSubTituloDadosDoProfissional))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btCadastrarDataDeNasc)
                        .addGap(29, 29, 29)
                        .addComponent(btCadastrarTelefone)
                        .addGap(29, 29, 29)
                        .addComponent(btCadastrarEndereco))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigoDoFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctCodigoDoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCrm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEspecializacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btCadastrarDataDeAssoc)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btCancelar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarDataDeNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarDataDeNascActionPerformed
        dentista.setDataNasc();
        
        CadastroData.getCadastro(dentista.getdataNasc()).setVisible(true);
    }//GEN-LAST:event_btCadastrarDataDeNascActionPerformed

    private void btCadastrarTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarTelefoneActionPerformed
        dentista.setTelefone();
        
        CadastroTelefone.getCadastro(dentista.getTelefone()).setVisible(true);
    }//GEN-LAST:event_btCadastrarTelefoneActionPerformed

    private void btCadastrarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarEnderecoActionPerformed
        dentista.setEndereco();
        
        CadastroEndereco.getCadastro(dentista.getEndereco()).setVisible(true);
    }//GEN-LAST:event_btCadastrarEnderecoActionPerformed

    private void btCadastrarDataDeAssocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarDataDeAssocActionPerformed
        dentista.setDataDeAssoc();
        
        CadastroData.getCadastro(dentista.getDataDeAssoc()).setVisible(true);
    }//GEN-LAST:event_btCadastrarDataDeAssocActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        boolean check = true;
        
        try {
            dentista.setCpf(Long.parseLong(ctCpf.getText()));
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
            dentista.setNome(ctNome.getText());
        }
        
        try{
            dentista.setCodigo(Integer.parseInt(ctCodigoDoFuncionario.getText()));
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O código deve ser um número inteiro.");
            check = false;
            ctCodigoDoFuncionario.setText("");
        }
        
        try{
            dentista.setSalario(Double.parseDouble(ctSalario.getText()));
        } catch (FunciSalaInvalidException ex) {
            ex.printError(dentista);
            check = false;
            ctSalario.setText("");
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O salário deve ser um número decimal.");
            check = false;
            ctSalario.setText("");
        }
        
        try{
            dentista.setCrm(Integer.parseInt(ctCrm.getText()));
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O código deve ser um número inteiro.");
            check = false;
            ctCrm.setText("");
        }
        
        if(ctEspecializacao.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O dentista deve ter uma especialização.");
            check = false;
        }else{
            dentista.setEspecializacao(ctEspecializacao.getText());
        }
        
        if(dentista.getTelefone() == null){
            check = false;
            JOptionPane.showMessageDialog(null, "Cadastre o telefone.");
        }
        
        if(dentista.getdataNasc() == null){
            check = false;
            JOptionPane.showMessageDialog(null, "Cadastre a data de nascimento.");
        }
        
        if(dentista.getDataDeAssoc() == null){
            check = false;
            JOptionPane.showMessageDialog(null, "Cadastre a data de associação.");
        }
        
        if(dentista.getEndereco() == null){
            check = false;
            JOptionPane.showMessageDialog(null, "Cadastre o endereço.");
        }
        
        check = !dentistaRepetido();
        
        if(check){
            Principal.dentistas.add(dentista);
            
            sair();
        }else{
            if(ctEspecializacao.getText().equals(""))
                ctEspecializacao.requestFocus();
            if(ctCrm.getText().equals(""))
                ctCrm.requestFocus();
            if(ctSalario.getText().equals(""))
                ctSalario.requestFocus();
            if(ctCodigoDoFuncionario.getText().equals(""))
                ctCodigoDoFuncionario.requestFocus();
            if(ctNome.getText().equals(""))
                ctNome.requestFocus();
            if(ctCpf.getText().equals(""))
                ctCpf.requestFocus();
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

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
        JOptionPane.showMessageDialog(null, "Dentista Cadastrado");
        
        reiniciar();
        
        this.dispose();
    }
    
    private void reiniciar(){
        ctCpf.setText("");
        ctNome.setText("");
        ctCodigoDoFuncionario.setText("");
        ctSalario.setText("");
        ctCrm.setText("");
        ctEspecializacao.setText("");
        
        ctCpf.requestFocus();
    }
    
    public boolean dentistaRepetido(){
        boolean repetido = false;
        
        for(Dentista d: Principal.dentistas){
            if(d.getCpf() == Long.parseLong(ctCpf.getText()) && d.getCodigo() == Integer.parseInt(ctCodigoDoFuncionario.getText()) && d.getCrm() == Integer.parseInt(ctCrm.getText())){
                JOptionPane.showMessageDialog(null, "O funcionário já está cadastrado.");
                repetido = true;
                break;
            }
            if(d.getCpf() == Long.parseLong(ctCpf.getText())){
                JOptionPane.showMessageDialog(null, "O CPF já está cadastrado.");
                repetido = true;
                break;
            }
            if(d.getCodigo() == Integer.parseInt(ctCodigoDoFuncionario.getText())){
                JOptionPane.showMessageDialog(null, "O código já está sendo utilizado.");
                repetido = true;
                break;
            }
            if(d.getCrm() == Integer.parseInt(ctCrm.getText())){
                JOptionPane.showMessageDialog(null, "O CRM já está sendo utilizado.");
                repetido = true;
                break;
            }
        }
        
        return repetido;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCadastrarDataDeAssoc;
    private javax.swing.JButton btCadastrarDataDeNasc;
    private javax.swing.JButton btCadastrarEndereco;
    private javax.swing.JButton btCadastrarTelefone;
    private javax.swing.JButton btCancelar;
    private javax.swing.JTextField ctCodigoDoFuncionario;
    private javax.swing.JTextField ctCpf;
    private javax.swing.JTextField ctCrm;
    private javax.swing.JTextField ctEspecializacao;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctSalario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JLabel txtCodigoDoFuncionario;
    private javax.swing.JLabel txtCpf;
    private javax.swing.JLabel txtCrm;
    private javax.swing.JLabel txtEspecializacao;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtSalario;
    private javax.swing.JLabel txtSubTituloDadosDoProfissional;
    private javax.swing.JLabel txtSubTituloDadosPessoais;
    // End of variables declaration//GEN-END:variables
}
