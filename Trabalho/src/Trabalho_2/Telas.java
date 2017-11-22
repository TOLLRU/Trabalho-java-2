/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import sun.swing.FilePane;

/**
 *
 * @author VITOR
 */
public class Telas extends javax.swing.JFrame {
    /**
     * Creates new form Telas
     */
    CaixaDeTexto caixa = new CaixaDeTexto();
    
    public Telas() {
        initComponents();
    }
    
    public void atualizaLetras(){
        int vog = 0, cons = 0, espc = 0;

        String frase = caixa.Texto.toLowerCase();
        for(int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if(c == 32){
                espc++;
                continue;
            }
            if(c == 97 | c == 101 | c == 105 | c == 111 | c == 117){
                vog++;
                continue;
            }
            if(c >= 98 && c <= 122) cons++;
        }

        qntVogais.setText(Integer.toString(vog));
        qntConsoantes.setText(Integer.toString(cons));
        qntEspaco.setText(Integer.toString(espc));
        
        vog = 0; cons = 0; espc = 0;
    }
    
    class CustomFileFilter extends FileFilter{
        String descricao;
        String extensoes[];

        public CustomFileFilter(String descricao, String[] extensoes){
            super();
            if (descricao == null) {
                this.descricao = extensoes[0];
            } else {
                this.descricao = descricao;
            }
            this.extensoes = (String[]) extensoes.clone();
            toLower(this.extensoes);
        }

        private void toLower(String array[]) {
            for (int i = 0, n = array.length; i < n; i++) {
                array[i] = array[i].toLowerCase();
            }
        }

        public boolean accept(File arquivo) {
            if (arquivo.isDirectory()) {
                return true;
            } else {
                String path = arquivo.getAbsolutePath().toLowerCase();
                for (int i = 0, n = extensoes.length; i < n; i++) {
                    String extension = extensoes[i];
                    if ((path.endsWith(extension) && (path.charAt(path.length() - extension.length() - 1)) == '.')) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override
        public String getDescription() {
            return descricao;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        lerArquivo = new javax.swing.JButton();
        salvarArquivo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tela1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tela2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        qntVogais = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        qntConsoantes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        qntEspaco = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lerArquivo.setText("Ler Arquivo");
        lerArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lerArquivoActionPerformed(evt);
            }
        });

        salvarArquivo.setText("Salvar Arquivo");
        salvarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarArquivoActionPerformed(evt);
            }
        });

        Tela1.setColumns(20);
        Tela1.setRows(5);
        jScrollPane3.setViewportView(Tela1);

        Tela2.setEditable(false);
        Tela2.setColumns(20);
        Tela2.setRows(5);
        jScrollPane2.setViewportView(Tela2);

        jLabel1.setText("Vogais:");

        jLabel3.setText("Consoantes:");

        jLabel2.setText("Espaços:");

        jLabel4.setText("Arquivo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(qntEspaco, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(qntConsoantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qntVogais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(lerArquivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salvarArquivo)
                        .addGap(61, 61, 61))))
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(qntVogais, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qntConsoantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(qntEspaco, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lerArquivo)
                            .addComponent(salvarArquivo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarArquivoActionPerformed
        if (caixa.Nome == null){
            JOptionPane.showMessageDialog(null, "Insira um arquivo para ser modificado!");
        } else {
            caixa.Texto = Tela1.getText();
            File arq = new File(caixa.Diretorio);

            try {
                FileWriter fw = new FileWriter(arq, false);
                PrintWriter pw = new PrintWriter(fw);
                pw.write(""); 
                pw.flush();
                pw.write(caixa.Texto);
                pw.flush();
                pw.close();
            } catch (IOException ex) {
                Logger.getLogger(Telas.class.getName()).log(Level.SEVERE, null, ex);
            }
            Tela2.setText(caixa.Texto);
            atualizaLetras();
        }
    }//GEN-LAST:event_salvarArquivoActionPerformed

    private void lerArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lerArquivoActionPerformed
        caixa.Texto = "";
        Tela2.setText("");
        Tela1.setText("");
        JFileChooser chooser = new JFileChooser();
        CustomFileFilter filtro = new CustomFileFilter("Arquivos de texto", new String[] {"txt"});
        chooser.setFileFilter(filtro);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) != JFileChooser.APPROVE_OPTION)
            return;
        File file = chooser.getSelectedFile();
        if (!file.getAbsolutePath().endsWith(".txt"))
            file = new File(file.getAbsolutePath() + ".txt");
        
        try {  
            InputStream is = new FileInputStream(file); 
            InputStreamReader isr = new InputStreamReader(is); 
            BufferedReader br = new BufferedReader(isr); 
            String s = "";
            caixa.Texto = "";
            while ( (s = br.readLine()) != null ){
		Tela1.append(s + "\n");
            }
            caixa.Texto = Tela1.getText();
            caixa.Nome = file.getName();
            caixa.Diretorio = file.getCanonicalPath();
            
        } catch(Exception x){ 
            System.out.println(x.getMessage()); 
        }
        jLabel5.setText(caixa.Nome);
        atualizaLetras();
        
    }//GEN-LAST:event_lerArquivoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        String senha = "";
        do {
                senha = "";
                JPasswordField passwordUsuario = new JPasswordField(10);
                char[] senhaVet = passwordUsuario.getPassword();
                
                JPanel loginUsuario = new JPanel();
                JLabel lgUsuario = new JLabel("Login");
                JTextField cpUsuario = new JTextField(10);
                loginUsuario.add(lgUsuario);
                loginUsuario.add(cpUsuario);
                
                JPanel novaTentativa = new JPanel();
                JLabel novaSenha = new JLabel("Senha");
                JPasswordField novoPassword = new JPasswordField(10);
                passwordUsuario.setEchoChar('*'); 
                novaTentativa.add(novaSenha);
                novaTentativa.add(novoPassword);
                
                JOptionPane.showMessageDialog(null, loginUsuario, "Acesso restrito", JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null, novaTentativa, "Acesso restrito", JOptionPane.PLAIN_MESSAGE);
                
                senhaVet = novoPassword.getPassword();
                senha = String.copyValueOf(senhaVet);
                if (!senha.equals("123")){
                    int result = JOptionPane.showConfirmDialog(null, "Senha incorreta! Sair?", "*** Senha incorreta ***", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (result == JOptionPane.YES_OPTION) 
                        System.exit(0);
                }
            
        } while (!senha.equals("123"));
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Telas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Tela1;
    private javax.swing.JTextArea Tela2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton lerArquivo;
    private javax.swing.JLabel qntConsoantes;
    private javax.swing.JLabel qntEspaco;
    private javax.swing.JLabel qntVogais;
    private javax.swing.JButton salvarArquivo;
    // End of variables declaration//GEN-END:variables
}
