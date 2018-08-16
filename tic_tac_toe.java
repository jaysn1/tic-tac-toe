
package javaapplication1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tic_tac_toe extends javax.swing.JFrame implements ActionListener{

    public tic_tac_toe() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
            
        int flag=0;
        int win=0;
        int done1=0;
        int done2=0;
        int done3=0;
        int done4=0;
        int done5=0;
        int done6=0;
        int done7=0;
        int done8=0;
        int done9=0;
        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(win==0)   {    

        if(flag==0  && done1==0) {
            jButton1.setText("O");
            flag=1;
            done1=1;
        }
        else if(flag==1 && done1==0)    {
            jButton1.setText("X");
            flag=0;
            done1=1;
        }
        if( (jButton1.getText().equals("X") && jButton2.getText().equals("X") && jButton3.getText().equals("X")) || (jButton1.getText().equals("X") && jButton4.getText().equals("X") && jButton7.getText().equals("X")) || (jButton1.getText().equals("X") && jButton5.getText().equals("X") &&jButton9.getText().equals("X")))
        {
         win=1;   
            jTextField2.setText("you win");
        }
        else if( (jButton1.getText().equals("O") && jButton2.getText().equals("O") && jButton3.getText().equals("O")) || (jButton1.getText().equals("O") && jButton4.getText().equals("O") && jButton7.getText().equals("O")) || (jButton1.getText().equals("O") && jButton5.getText().equals("O") &&jButton9.getText().equals("O")))
        {
            win=1;
            jTextField2.setText("you win");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(win==0)   {    
        if(flag==0 && done2==0) {
            jButton2.setText("O");
            flag=1;
            done2=1;
        }
        else if(flag==1 && done2==0)    {
            jButton2.setText("X");
            flag=0;
                    done2=1;
}
        if( (jButton1.getText().equals("X") && jButton2.getText().equals("X") && jButton3.getText().equals("X")) || (jButton2.getText().equals("X") && jButton5.getText().equals("X") && jButton8.getText().equals("X")) )
        {
            win=1;
            jTextField2.setText("you win");
        }
        else if( (jButton1.getText().equals("O") && jButton2.getText().equals("O") && jButton3.getText().equals("O")) || (jButton2.getText().equals("O") && jButton5.getText().equals("O") && jButton8.getText().equals("O")) )
        {
            win=1;
            jTextField2.setText("you win");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    if(win==0)   {    
        if(flag==0 && done3==0) {
            jButton3.setText("O");
            flag=1;
            done3=1;
        }
        else if(flag==1 && done3==0)    {
            jButton3.setText("X");
            flag=0;
            done3=1;
        }
        
        if( (jButton1.getText().equals("X") && jButton2.getText().equals("X") && jButton3.getText().equals("X")) || (jButton3.getText().equals("X") && jButton6.getText().equals("X") && jButton9.getText().equals("X")) || (jButton3.getText().equals("X") && jButton5.getText().equals("X") &&jButton7.getText().equals("X")))
        {
            win=1;
            jTextField2.setText("you win");
        }
        else if( (jButton1.getText().equals("O") && jButton2.getText().equals("O") && jButton3.getText().equals("O")) || (jButton3.getText().equals("O") && jButton6.getText().equals("O") && jButton9.getText().equals("O")) || (jButton3.getText().equals("O") && jButton5.getText().equals("O") &&jButton7.getText().equals("O")))
        {
            win=1;
            jTextField2.setText("you win");
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    if(win==0)   {    
        if(flag==0 && done4==0) {
            jButton4.setText("O");
            flag=1;
            done4=1;
        }
        else if(flag==1 && done4==0)    {
            jButton4.setText("X");
            flag=0;
            done4=1;
        }
        if( (jButton4.getText().equals("X") && jButton5.getText().equals("X") && jButton6.getText().equals("X")) || (jButton1.getText().equals("X") && jButton4.getText().equals("X") && jButton7.getText().equals("X")) )
        {
            win=1;
            jTextField2.setText("you win");
        }
        else if( (jButton4.getText().equals("O") && jButton5.getText().equals("O") && jButton6.getText().equals("O")) || (jButton1.getText().equals("O") && jButton4.getText().equals("O") && jButton7.getText().equals("O")) )
        {
            win=1;
            jTextField2.setText("you win");
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     if(win==0)   {    
        if(flag==0 && done5==0) {
            jButton5.setText("O");
            flag=1;
            done5=1;
        }
        else if(flag==1 && done5==0)    {
            jButton5.setText("X");
            flag=0;
            done5=1;
        }
        if((jButton1.getText().equals("X") && jButton5.getText().equals("X") && jButton9.getText().equals("X")) ||(jButton3.getText().equals("X") && jButton5.getText().equals("X") && jButton7.getText().equals("X")) ||(jButton4.getText().equals("X") && jButton5.getText().equals("X") && jButton6.getText().equals("X")) ||(jButton2.getText().equals("X") && jButton5.getText().equals("X") && jButton8.getText().equals("X")))
        {
         win=1;   
            jTextField2.setText("you win");
        }
        else if((jButton1.getText().equals("O") && jButton5.getText().equals("O") && jButton9.getText().equals("O")) ||(jButton3.getText().equals("O") && jButton5.getText().equals("O") && jButton7.getText().equals("O")) ||(jButton4.getText().equals("O") && jButton5.getText().equals("O") && jButton6.getText().equals("O")) ||(jButton2.getText().equals("O") && jButton5.getText().equals("O") && jButton8.getText().equals("O")))
        {
            win=1;
            jTextField2.setText("you win");
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     if(win==0)   {    
        if(flag==0 && done6==0) {
            jButton6.setText("O");
            flag=1;
            done6=1;
        }
        else if(flag==1 && done6==0)    {
            jButton6.setText("X");
            flag=0;
            done6=1;
        }
        if( (jButton4.getText().equals("X") && jButton5.getText().equals("X") && jButton6.getText().equals("X")) || (jButton3.getText().equals("X") && jButton6.getText().equals("X") && jButton9.getText().equals("X")) )
        {
            win=1;
            jTextField2.setText("you win");
        }
        else if( (jButton4.getText().equals("O") && jButton5.getText().equals("O") && jButton6.getText().equals("O")) || (jButton3.getText().equals("O") && jButton6.getText().equals("O") && jButton9.getText().equals("O")) )
        {
            win=1;
            jTextField2.setText("you win");
        }
    }//GEN-LAST:event_jButton6ActionPerformed
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     if(win==0)   {    
        if(flag==0 && done7==0) {
            jButton7.setText("O");
            flag=1;
            done7=1;
        }
        else if(flag==1 && done7==0)    {
            jButton7.setText("X");
            flag=0;
            done7=1;
        }
        if( (jButton7.getText().equals("X") && jButton8.getText().equals("X") && jButton9.getText().equals("X")) || (jButton1.getText().equals("X") && jButton4.getText().equals("X") && jButton7.getText().equals("X")) || (jButton3.getText().equals("X") && jButton5.getText().equals("X") &&jButton7.getText().equals("X")))
        {
            win=1;
            jTextField2.setText("you win");
        }
        else if( (jButton7.getText().equals("O") && jButton8.getText().equals("O") && jButton9.getText().equals("O")) || (jButton1.getText().equals("O") && jButton4.getText().equals("O") && jButton7.getText().equals("O")) || (jButton3.getText().equals("O") && jButton5.getText().equals("O") &&jButton7.getText().equals("O")))
        {
            win=1;
            jTextField2.setText("you win");
        }
    }//GEN-LAST:event_jButton7ActionPerformed
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
     if(win==0)   {    
        if(flag==0 && done8==0) {
            jButton8.setText("O");
            flag=1;
            done8=1;
        }
        else if(flag==1 && done8==0)    {
            jButton8.setText("X");
            flag=0;
            done8=1;
        }
        if( (jButton1.getText().equals("X") && jButton2.getText().equals("X") && jButton3.getText().equals("X")) || (jButton2.getText().equals("X") && jButton5.getText().equals("X") && jButton8.getText().equals("X")) )
        {
            win=1;
            jTextField2.setText("you win");
        }
        else if( (jButton1.getText().equals("O") && jButton2.getText().equals("O") && jButton3.getText().equals("O")) || (jButton2.getText().equals("O") && jButton5.getText().equals("O") && jButton8.getText().equals("O")) )
        {
            win=1;
            jTextField2.setText("you win");
        }
    }//GEN-LAST:event_jButton8ActionPerformed
    }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     if(win==0)   {
        if(flag==0 && done9==0) {
            jButton9.setText("O");
            flag=1;
            done9=1;
        }
        else if(flag==1 && done9==0)    {
            jButton9.setText("X");
            flag=0;
            done9=1;
        }
        if( (jButton7.getText().equals("X") && jButton8.getText().equals("X") && jButton9.getText().equals("X")) || (jButton3.getText().equals("X") && jButton6.getText().equals("X") && jButton9.getText().equals("X")) || (jButton1.getText().equals("X") && jButton5.getText().equals("X") &&jButton9.getText().equals("X")))
        {
            win=1;
            jTextField2.setText("you win");
        }
        else if( (jButton7.getText().equals("O") && jButton8.getText().equals("O") && jButton9.getText().equals("O")) || (jButton3.getText().equals("O") && jButton6.getText().equals("O") && jButton9.getText().equals("O")) || (jButton1.getText().equals("O") && jButton5.getText().equals("O") &&jButton9.getText().equals("O")))
        {
            win=1;
            jTextField2.setText("you win");
        }
        
    }//GEN-LAST:event_jButton9ActionPerformed
    }
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tic_tac_toe().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    
    public void actionPerformed(ActionEvent e) {
  
    }
}
