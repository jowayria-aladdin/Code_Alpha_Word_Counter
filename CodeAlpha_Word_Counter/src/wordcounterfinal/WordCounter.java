
package wordcounterfinal;

public class WordCounter extends javax.swing.JFrame {

    
    public WordCounter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label = new javax.swing.JLabel();
        EnterParag = new javax.swing.JButton();
        UploadFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        Label.setText("     Word Counter");

        EnterParag.setText("Enter Paragraph");
        EnterParag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterParagActionPerformed(evt);
            }
        });

        UploadFile.setText("Upload Text File");
        UploadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(EnterParag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(UploadFile)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterParag)
                    .addComponent(UploadFile))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterParagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterParagActionPerformed
        // TODO add your handling code here:
        dispose();
        new ParagraphWriter().setVisible(true);
            
    }//GEN-LAST:event_EnterParagActionPerformed

    private void UploadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadFileActionPerformed
        // TODO add your handling code here:
        dispose();
        new FileUploader().setVisible(true);
    }//GEN-LAST:event_UploadFileActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WordCounter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnterParag;
    private javax.swing.JLabel Label;
    private javax.swing.JButton UploadFile;
    // End of variables declaration//GEN-END:variables
}
