/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdevapp;

import java.lang.Object;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.AbstractListModel;
import java.util.Map;

/**
 *
 * @author djulzz
 */
public class MainWindow extends javax.swing.JFrame {

    public void AddStudent( String First_Name )
    {
        m_jLabel_showing_message.setText(First_Name);
        return;
    }
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
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

        m_jScrollPane_Main_UI = new javax.swing.JScrollPane();
        m_jList_bag_Selection = new javax.swing.JList<>();
        m_jLabel_showing_message = new javax.swing.JLabel();
        m_jSpinner_Bag_Quantity = new javax.swing.JSpinner();
        m_jLabel_Number_Bag_Selection = new javax.swing.JLabel();
        m_jLabel_Bags_to_Choose = new javax.swing.JLabel();
        m_jButton_Add_To_Cart = new javax.swing.JButton();
        m_jLabel_Cart_So_Far = new javax.swing.JLabel();
        m_jScrollPane_Cart_So_Far = new javax.swing.JScrollPane();
        m_jList_Cart_So_Far = new javax.swing.JList<>();
        m_jButton_Place_Order = new javax.swing.JButton();
        m_jButton_Add_Student = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        m_jList_bag_Selection.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Louis Vuiton Bag", "Chanel Bag", "Kenneth Cole Bag", "Douche Bag", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        m_jList_bag_Selection.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                SelectionChanged(evt);
            }
        });
        m_jScrollPane_Main_UI.setViewportView(m_jList_bag_Selection);

        m_jLabel_Number_Bag_Selection.setText("Number of Bags");

        m_jLabel_Bags_to_Choose.setText("Bag to Choose");

        m_jButton_Add_To_Cart.setText("Add To Cart");
        m_jButton_Add_To_Cart.setName(""); // NOI18N
        m_jButton_Add_To_Cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jButton_Add_To_CartActionPerformed(evt);
            }
        });

        m_jLabel_Cart_So_Far.setText("Cart So Far");

        m_jList_Cart_So_Far.setModel
        (
            new DefaultListModel<>()
        );
        m_jList_Cart_So_Far.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        m_jScrollPane_Cart_So_Far.setViewportView(m_jList_Cart_So_Far);

        m_jButton_Place_Order.setText("Place Order");
        m_jButton_Place_Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jButton_Place_OrderActionPerformed(evt);
            }
        });

        m_jButton_Add_Student.setText("Add Student");
        m_jButton_Add_Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jButton_Add_StudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m_jLabel_Bags_to_Choose)
                        .addGap(68, 68, 68)
                        .addComponent(m_jLabel_Number_Bag_Selection)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                        .addComponent(m_jLabel_showing_message))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m_jScrollPane_Main_UI, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_jButton_Add_To_Cart))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m_jSpinner_Bag_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_jLabel_Cart_So_Far)
                            .addComponent(m_jScrollPane_Cart_So_Far, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m_jButton_Add_Student)
                            .addComponent(m_jButton_Place_Order))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_jLabel_Bags_to_Choose)
                    .addComponent(m_jLabel_Number_Bag_Selection))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m_jScrollPane_Main_UI, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(m_jButton_Add_To_Cart))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m_jSpinner_Bag_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(m_jLabel_showing_message)
                        .addGap(18, 18, 18)
                        .addComponent(m_jLabel_Cart_So_Far)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(m_jScrollPane_Cart_So_Far, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addComponent(m_jButton_Place_Order)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m_jButton_Add_Student)
                .addGap(78, 78, 78))
        );

        m_jLabel_showing_message.getAccessibleContext().setAccessibleName("m_label_bag_selected");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectionChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_SelectionChanged
        // TODO add your handling code here:
        int selected_index = m_jList_bag_Selection.getSelectedIndex();
        String selection = m_jList_bag_Selection.getModel().getElementAt(selected_index);

        m_jLabel_showing_message.setText(selection);
    }//GEN-LAST:event_SelectionChanged

    private void m_jButton_Add_To_CartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jButton_Add_To_CartActionPerformed
        // TODO add your handling code here:
        int selected_index = m_jList_bag_Selection.getSelectedIndex();
        String selection = m_jList_bag_Selection.getModel().getElementAt(selected_index);
        javax.swing.JList<String> current_content = m_jList_Cart_So_Far;

        DefaultListModel<String> mdl = (DefaultListModel<String>)m_jList_Cart_So_Far.getModel();

        int i = ( int )m_jSpinner_Bag_Quantity.getValue();
        String s2 = String.valueOf(i);
        mdl.addElement( selection + " " + s2 );
        int size = mdl.getSize();
        String s = String.valueOf(size);
        m_jLabel_showing_message.setText(selection + " " + s2 );
        m_jList_Cart_So_Far.setModel(mdl);
    }//GEN-LAST:event_m_jButton_Add_To_CartActionPerformed

    private void m_jButton_Place_OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jButton_Place_OrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_jButton_Place_OrderActionPerformed

    private void m_jButton_Add_StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jButton_Add_StudentActionPerformed
        // TODO add your handling code here:
        StudentDialog dialog = new StudentDialog( this );

        dialog.setVisible(true);
    }//GEN-LAST:event_m_jButton_Add_StudentActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton m_jButton_Add_Student;
    private javax.swing.JButton m_jButton_Add_To_Cart;
    private javax.swing.JButton m_jButton_Place_Order;
    private javax.swing.JLabel m_jLabel_Bags_to_Choose;
    private javax.swing.JLabel m_jLabel_Cart_So_Far;
    private javax.swing.JLabel m_jLabel_Number_Bag_Selection;
    private javax.swing.JLabel m_jLabel_showing_message;
    private javax.swing.JList<String> m_jList_Cart_So_Far;
    private javax.swing.JList<String> m_jList_bag_Selection;
    private javax.swing.JScrollPane m_jScrollPane_Cart_So_Far;
    private javax.swing.JScrollPane m_jScrollPane_Main_UI;
    private javax.swing.JSpinner m_jSpinner_Bag_Quantity;
    // End of variables declaration//GEN-END:variables
}
