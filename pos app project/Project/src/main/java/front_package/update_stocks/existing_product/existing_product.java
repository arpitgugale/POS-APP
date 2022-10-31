/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front_package.update_stocks.existing_product;

import front_package.Front_page;

//import front_package.Stock_Manage.Update_stocks.Update_stocks;

import front_package.login.login;
import front_package.update_stocks.Update_stocks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;


/**
 *
 * @author dell
 */
public class existing_product extends javax.swing.JFrame {

    /**
     * Creates new form existing_product
     */
    public existing_product() {
        initComponents();
        setSize(1980, 1080);
        this.setResizable(true);
        this.setAlwaysOnTop(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	imagelabel=new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        product_name = new javax.swing.JTextField();
        product_quantity = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        category = new javax.swing.JTextField();
        product_id = new javax.swing.JTextField();
        add_product = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255, 100));

        logout.setBackground(new java.awt.Color(153, 255, 102));
        logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logout.setText("Logout");
        logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 102)));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(153, 255, 102));
        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 102)));
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel7.setText("Add Existing Product");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Enter Product ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Enter Quantity");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Enter Price");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Enter Category");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Enter Product Name");

        product_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        product_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        product_quantity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        product_quantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        price.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        category.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        category.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        product_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        product_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        add_product.setBackground(new java.awt.Color(153, 255, 102));
        add_product.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add_product.setText("Add Product");
        add_product.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 102)));
        add_product.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_productActionPerformed(evt);
            }
            });
        reset.setBackground(new java.awt.Color(153, 255, 102));
        reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reset.setText("Reset");
        reset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 102)));
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(product_name)
                                .addComponent(product_id, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addComponent(product_quantity)
                                .addComponent(price)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(add_product, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(420, 420, 420))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_product, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(190, 140, 1160, 570);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, -3, 1370, 780);

        imagelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backdrop.jpg")));
        imagelabel.setPreferredSize(new java.awt.Dimension(1980, 1080));
        getContentPane().add(imagelabel);
        imagelabel.setBounds(0, 0, 1980, 1080);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Logout Successfull");
        if(evt.getSource() == logout){
            Front_page fp = new Front_page();
            fp.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    	if(login.LOGIN==1)
    	{
        if(evt.getSource() == back)
        {
            Update_stocks fp = new Update_stocks();
            fp.setVisible(true);
            setVisible(false);
            dispose();
        }
    	}
    	else
    	{
    		JOptionPane.showInternalMessageDialog(rootPane, "Please Login First");
    		Front_page fp = new Front_page();
            fp.setVisible(true);
            dispose();
    		
    	}
    }//GEN-LAST:event_backActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
    	product_id.setText(" ");
    	product_name.setText(" ");
        product_quantity.setText(" ");
        price.setText(" ");
        category.setText(" ");
    }//GEN-LAST:event_resetActionPerformed

    private void add_productActionPerformed(java.awt.event.ActionEvent evt)
    {
    	if(login.LOGIN==1)
    	{
    	String p_id=product_id.getText();
    	String p_name=product_name.getText();
    	String p_price=price.getText();
    	String quantity=product_quantity.getText();
    	String cat=category.getText();
    	
    	String url="jdbc:postgresql://localhost/POS_APP";
    	String user="postgres";
    	String password="postgres";
    	String sql_search="Select name from inventory where id=?";
    	String sql_update="UPDATE inventory SET name=?,actual_quantity=?,price=?,category=? WHERE id=?";
    	PreparedStatement psu=null,pss=null;
    	
			if(product_id.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(rootPane, "Error \n Check Product ID");
				product_id.setText(" ");
			}
			else if(product_name.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(rootPane, "Check Product Name");
				product_name.setText(" ");
			}
			else if(product_quantity.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(rootPane, "Check Product Quantity");
				product_quantity.setText(" ");
			}
			else if(price.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(rootPane, "Check Product Price");
				price.setText(" ");
			}
			else if(category.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(rootPane, "Check Category");
				category.setText(" ");
			}
			else
			{
				try(Connection con=DriverManager.getConnection(url,user,password))
    	{
					System.out.println("Try Catch block entered");
    		psu=con.prepareStatement(sql_update);
    		System.out.println("1");
    		pss=con.prepareStatement(sql_search);
    		System.out.println("2");
    		psu.setString(1,p_name);
    		System.out.println("3");
    		psu.setInt(2,Integer.parseInt(quantity));
    		
    		psu.setDouble(3,Double.parseDouble(p_price));
    		psu.setString(4,cat);
    		psu.setString(5,p_id);
    		pss.setString(1,p_id);
    		if(pss.execute())
    		{
    			if(psu.executeUpdate()!=0)
    			{
    				JOptionPane.showMessageDialog(rootPane, "Product Update Successfull");
    			}
    		}
    		
    		}
    	catch(Exception e)
    		{
    		JOptionPane.showMessageDialog(rootPane,"Error \n Check All Fields"+e.getLocalizedMessage());
    		}
		}
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(rootPane, "Please Login First");
    		Front_page fp = new Front_page();
            fp.setVisible(true);
            dispose();
    	}
    	
    }   	
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
            java.util.logging.Logger.getLogger(existing_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(existing_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(existing_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(existing_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new existing_product().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel imagelabel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_product;
    private javax.swing.JButton back;
    private javax.swing.JButton reset;
    private javax.swing.JButton logout;
    
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    
    private javax.swing.JPanel jPanel1;
    
    private javax.swing.JTextField product_name;
    private javax.swing.JTextField product_quantity;
    private javax.swing.JTextField price;
    private javax.swing.JTextField category;
    private javax.swing.JTextField product_id;
    
    // End of variables declaration//GEN-END:variables
}
