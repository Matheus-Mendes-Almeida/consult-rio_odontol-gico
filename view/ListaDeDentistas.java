package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Dentista;

public class ListaDeDentistas extends javax.swing.JFrame {

    private static ListaDeDentistas lista;
    
    public ListaDeDentistas() {
        initComponents();
    }
    
    public static ListaDeDentistas getLista(){
        if(lista == null)
            lista = new ListaDeDentistas();
        
        lista.gerarTabela();
        
        return lista;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDentistas = new javax.swing.JTable();
        btSair = new javax.swing.JButton();
        btExcluirRegistro = new javax.swing.JButton();
        btAlterarNome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Lista de Dentistas");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopoLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addGap(19, 19, 19))
        );

        tblDentistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "CRM", "Código"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDentistas);

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btExcluirRegistro.setText("Excluir dentista");
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btAlterarNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExcluirRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAlterarNome)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluirRegistro)
                        .addGap(18, 18, 18)
                        .addComponent(btSair)))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btExcluirRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirRegistroActionPerformed
        int buscador = getBuscador();
        
        boolean conseguiu = false;
        for(int i = 0; i<Principal.dentistas.size(); i++){
            if(Principal.dentistas.get(i).getCodigo() == buscador);{
                Principal.dentistas.remove(i);
                JOptionPane.showMessageDialog(null, "Dentista removido com sucesso");
                conseguiu = true;
                break;
            }
        }
        
        if(!conseguiu)
           JOptionPane.showMessageDialog(null, "Nenhum dentista foi encontrdo");
            
        gerarTabela();
    }//GEN-LAST:event_btExcluirRegistroActionPerformed

    private void btAlterarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarNomeActionPerformed
        int buscador = getBuscador();
        
        boolean conseguiu = false;
        for(Dentista d: Principal.dentistas){
            if(d.getCodigo() == buscador);{
                String str = JOptionPane.showInputDialog(null, "Informe o novo nome", "Informe", JOptionPane.QUESTION_MESSAGE);
                
                d.setNome(str);
                
                conseguiu = true;
                break;
            }
        }
        
        if(!conseguiu)
           JOptionPane.showMessageDialog(null, "Nenhum dentista foi encontrdo");
            
        gerarTabela();
    }//GEN-LAST:event_btAlterarNomeActionPerformed

    public void gerarTabela(){
        int posicaoDaLinha = 0;
        DefaultTableModel modelo = (DefaultTableModel) tblDentistas.getModel();
        
        modelo.setRowCount(posicaoDaLinha);
        
        for(Dentista d: Principal.dentistas){
            modelo.insertRow(posicaoDaLinha, new Object []{d.getNome(), d.getCpf(), d.getCrm(), d.getCodigo()});
            
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
    private javax.swing.JTable tblDentistas;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
