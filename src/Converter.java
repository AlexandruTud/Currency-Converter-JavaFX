import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Converter extends javax.swing.JFrame {
    public Converter() {
        setTitle("Currency Converter"); //adaugam titlu GUI-ului
        initComponents();
        ImageIcon logo = new ImageIcon("C:\\Users\\Alexandru\\Desktop\\Info II\\Currency Converter/pngegg.png"); //setam iconita GUI-ului
        this.setIconImage(logo.getImage());    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboConvertTo = new javax.swing.JComboBox<>();
        txtAmountInRon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Buton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel3 = new javax.swing.JLabel();
        finalAmount = new javax.swing.JTextField();
        checkbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setText("Convert to:");

        cboConvertTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "JPY", "CAD", "AUD", "RUB", "ARS", "BTC" }));

        txtAmountInRon.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtAmountInRon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountInRonActionPerformed(evt);
            }
        });
        txtAmountInRon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmountInRonKeyTyped(evt);
            }
        });

        jLabel2.setText("Amount in RON:");

        Buton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Buton.setText("Convert");
        Buton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButonMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Amount converted:");

        checkbox.setText("Convert amount in integer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(330, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(326, 326, 326))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Buton, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cboConvertTo, 0, 470, Short.MAX_VALUE)
                                .addComponent(txtAmountInRon)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmountInRon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboConvertTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Buton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAmountInRonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountInRonActionPerformed
        
    }//GEN-LAST:event_txtAmountInRonActionPerformed

    private void ButonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButonMouseClicked
        //facem convert la suma introdusa
        double amountInRon = Double.parseDouble(txtAmountInRon.getText());
        double result;        
        if(cboConvertTo.getSelectedItem().toString() == "USD"){
            result = (amountInRon / 4.99);
            finalAmount.setText(Double.toString(result));
        }
        else if(cboConvertTo.getSelectedItem().toString() == "EUR"){
            result = (amountInRon / 4.91);
            finalAmount.setText(Double.toString(result));
        }
        else if(cboConvertTo.getSelectedItem().toString() == "JPY"){
            result = (amountInRon / 0.03);
            finalAmount.setText(Double.toString(result));
        }
        else if(cboConvertTo.getSelectedItem().toString() == "CAD"){
            result = (amountInRon / 3.64);
            finalAmount.setText(Double.toString(result));
        }
        else if(cboConvertTo.getSelectedItem().toString() == "BTC"){
            result = (amountInRon / 102354.28);
            finalAmount.setText(Double.toString(result));
        }
        else if(cboConvertTo.getSelectedItem().toString() == "AUD"){
            result = (amountInRon / 3.16);
            finalAmount.setText(Double.toString(result));
        }
        else if(cboConvertTo.getSelectedItem().toString() == "RUB"){
            result = (amountInRon / 0.08);
            finalAmount.setText(Double.toString(result));
        }
        else if(cboConvertTo.getSelectedItem().toString() == "ARS"){
            result = (amountInRon / 0.03);
            finalAmount.setText(Double.toString(result));
        }
        //daca e bifata casuta convertim la int
        if(checkbox.isSelected()){
            if(cboConvertTo.getSelectedItem().toString() == "USD"){
                result = (amountInRon / 4.99);
                finalAmount.setText(Integer.toString((int)result));
            }
            else if(cboConvertTo.getSelectedItem().toString() == "EUR"){
                result = (amountInRon / 4.91);
                finalAmount.setText(Integer.toString((int)result));
            }
            else if(cboConvertTo.getSelectedItem().toString() == "JPY"){
                result = (amountInRon / 0.03);
                finalAmount.setText(Integer.toString((int)result));
            }
            else if(cboConvertTo.getSelectedItem().toString() == "CAD"){
                result = (amountInRon / 3.64);
                finalAmount.setText(Integer.toString((int)result));
            }
            else if(cboConvertTo.getSelectedItem().toString() == "BTC"){
                result = (amountInRon / 102354.28);
                finalAmount.setText(Double.toString((int)result));
            }
            else if(cboConvertTo.getSelectedItem().toString() == "AUD"){
                result = (amountInRon / 3.16);
                finalAmount.setText(Double.toString((int)result));
            }
            else if(cboConvertTo.getSelectedItem().toString() == "RUB"){
                result = (amountInRon / 0.08);
                finalAmount.setText(Double.toString((int)result));
            }
            else if(cboConvertTo.getSelectedItem().toString() == "ARS"){
                result = (amountInRon / 0.03);
                finalAmount.setText(Double.toString((int)result));
            }
        }
        
    }//GEN-LAST:event_ButonMouseClicked

    private void txtAmountInRonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountInRonKeyTyped
        //introducem doar numere si puncte 
        if(Character.isLetter(evt.getKeyChar()))
            evt.consume();
        else{
            try{
                Double.parseDouble(txtAmountInRon.getText()+evt.getKeyChar());
            }catch(NumberFormatException e){
                evt.consume();
            }
        }
        
    }//GEN-LAST:event_txtAmountInRonKeyTyped
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Converter().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buton;
    private javax.swing.JComboBox<String> cboConvertTo;
    private javax.swing.JCheckBox checkbox;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JTextField finalAmount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtAmountInRon;
    // End of variables declaration//GEN-END:variables

}
