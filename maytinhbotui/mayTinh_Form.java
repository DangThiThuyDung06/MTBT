/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maytinhbotui;

/**
 *
 * @author dell
 */
public class mayTinh_Form extends javax.swing.JFrame {
       String t1 = "";
       String t2 = "";
    public mayTinh_Form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        result = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        percent = new javax.swing.JButton();
        div = new javax.swing.JButton();
        number7 = new javax.swing.JButton();
        number8 = new javax.swing.JButton();
        number9 = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        number4 = new javax.swing.JButton();
        number5 = new javax.swing.JButton();
        number6 = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        number1 = new javax.swing.JButton();
        number2 = new javax.swing.JButton();
        number3 = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        number0 = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        equal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CASIO");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        result.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        result.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(result)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setLayout(new java.awt.GridLayout(5, 4, 5, 5));

        clear.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        clear.setText("C");
        jPanel2.add(clear);

        delete.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        delete.setText("AC");
        jPanel2.add(delete);

        percent.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        percent.setText("%");
        percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });
        jPanel2.add(percent);

        div.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        jPanel2.add(div);

        number7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number7.setText("7");
        number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });
        jPanel2.add(number7);

        number8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number8.setText("8");
        number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });
        jPanel2.add(number8);

        number9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number9.setText("9");
        number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });
        jPanel2.add(number9);

        mul.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        mul.setText("x");
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        jPanel2.add(mul);

        number4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number4.setText("4");
        number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });
        jPanel2.add(number4);

        number5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number5.setText("5");
        number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });
        jPanel2.add(number5);

        number6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number6.setText("6");
        number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });
        jPanel2.add(number6);

        sub.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        jPanel2.add(sub);

        number1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number1.setText("1");
        number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });
        jPanel2.add(number1);

        number2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number2.setText("2");
        number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });
        jPanel2.add(number2);

        number3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number3.setText("3");
        number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });
        jPanel2.add(number3);

        plus.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        jPanel2.add(plus);

        number0.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number0.setText("0");
        number0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });
        jPanel2.add(number0);

        decimal.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        decimal.setText(",");
        jPanel2.add(decimal);

        sqrt.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        sqrt.setText("sqrt");
        sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });
        jPanel2.add(sqrt);

        equal.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        jPanel2.add(equal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultActionPerformed

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1ActionPerformed
        String cmt = evt.getActionCommand();
        
        result.setText(result.getText() + cmt);
        
    }//GEN-LAST:event_number1ActionPerformed

    private void number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number2ActionPerformed
        String cmt = evt.getActionCommand();
        
        result.setText(result.getText() + cmt);
    }//GEN-LAST:event_number2ActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        String cmt = evt.getActionCommand();
        
        t2 = cmt;
        t1 = result.getText();
        
        result.setText("");
    }//GEN-LAST:event_plusActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        if(result.getText().equals("") || t1.equals("")){
            return ;
        }
        try
        {
            double n1 = Double.parseDouble(t1);
            double n2 = Double.parseDouble(result.getText());
            double kq=0;
            if(t2.equals("+")){
                kq = n1+n2;
            }
            else if(t2.equals("-")){
                kq = n1-n2;
            }
            else if(t2.equals("x")){
                kq = n1*n2;
            }
            else if(t2.equals("/")){
                kq = n1/n2;
            }
            result.setText("" + kq);
        }catch (Exception e){
            e.printStackTrace();
        }   
    }//GEN-LAST:event_equalActionPerformed

    private void sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtActionPerformed
        if(result.getText().equals("")){
            return;
        }
        String cmt = evt.getActionCommand();
        try{
            double value = Double.parseDouble(result.getText());
            if(cmt.equals("sqrt")){
                value = Math.sqrt(value);
            }else if(cmt.equals("%")){
                value = value * 100;
            }
            result.setText(""+value);
        }catch (Exception e){
            e.printStackTrace();
        } 
    }//GEN-LAST:event_sqrtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(mayTinh_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mayTinh_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mayTinh_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mayTinh_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mayTinh_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton decimal;
    private javax.swing.JButton delete;
    private javax.swing.JButton div;
    private javax.swing.JButton equal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mul;
    private javax.swing.JButton number0;
    private javax.swing.JButton number1;
    private javax.swing.JButton number2;
    private javax.swing.JButton number3;
    private javax.swing.JButton number4;
    private javax.swing.JButton number5;
    private javax.swing.JButton number6;
    private javax.swing.JButton number7;
    private javax.swing.JButton number8;
    private javax.swing.JButton number9;
    private javax.swing.JButton percent;
    private javax.swing.JButton plus;
    private javax.swing.JTextField result;
    private javax.swing.JButton sqrt;
    private javax.swing.JButton sub;
    // End of variables declaration//GEN-END:variables
}
