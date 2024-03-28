package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Plano;

public class ListaDePlanos extends javax.swing.JFrame {
    
    private static ListaDePlanos lista;
    
    private ListaDePlanos() {
        initComponents();
    }
    
    public static ListaDePlanos getLista(){
        if(lista == null)
            lista = new ListaDePlanos();
        
        lista.gerarTabela();
        
        return lista;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlanos = new javax.swing.JTable();
        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        btExcluirRegistro = new javax.swing.JButton();
        btAlterarNome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblPlanos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Registro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPlanos);

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Lista de Planos");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtTitulo)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btExcluirRegistro.setText("Excluir Plano");
        btExcluirRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirRegistroActionPerformed(evt);
            }
        });

        btAlterarNome.setText("Alterar nome");
        btAlterarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btExcluirRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAlterarNome, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAlterarNome)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluirRegistro)
                        .addGap(18, 18, 18)
                        .addComponent(btSair)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btExcluirRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirRegistroActionPerformed
        int buscador = getBuscador();
        
        boolean conseguiu = false;
        for(int i = 0; i<Principal.planosCobertos.size(); i++){
            if(Principal.planosCobertos.get(i).getRegistro() == buscador);{
                Principal.planosCobertos.remove(i);
                JOptionPane.showMessageDialog(null, "Plano removido com sucesso");
                conseguiu = true;
                break;
            }
        }
        
        if(!conseguiu)
            JOptionPane.showMessageDialog(null, "Nenhum plano foi encontrdo");
        
        gerarTabela();
    }//GEN-LAST:event_btExcluirRegistroActionPerformed

    private void btAlterarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarNomeActionPerformed
        int buscador = getBuscador();
        
        boolean conseguiu = false;
        for(Plano p: Principal.planosCobertos){
            if(p.getRegistro() == buscador);{
                String str = JOptionPane.showInputDialog(null, "Informe o novo nome", "Informe", JOptionPane.QUESTION_MESSAGE);
                
                p.setNome(str);
                
                conseguiu = true;
                break;
            }
        }
        
        if(!conseguiu)
           JOptionPane.showMessageDialog(null, "Nenhum plano foi encontrdo");
            
        gerarTabela();
    }//GEN-LAST:event_btAlterarNomeActionPerformed

    public void gerarTabela(){
        int posicaoDaLinha = 0;
        DefaultTableModel modelo = (DefaultTableModel) tblPlanos.getModel();
        
        modelo.setRowCount(posicaoDaLinha);
        
        for(Plano p: Principal.planosCobertos){
            modelo.insertRow(posicaoDaLinha, new Object []{p.getNome(), p.getRegistro()});
            
            posicaoDaLinha ++;
        }
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sair", JOptionPane.YES_NO_OPTION);
        
        if(resp == 0)
            this.dispose();
    }
    
    public int getBuscador(){
        String str = JOptionPane.showInputDialog(null, "Informe o código", "Informe", JOptionPane.QUESTION_MESSAGE);
        int buscador;
        
        try {
            buscador = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Deve ser informado um numero inteiro");
            buscador = getBuscador();
        }
        
        return buscador;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarNome;
    private javax.swing.JButton btExcluirRegistro;
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JTable tblPlanos;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
