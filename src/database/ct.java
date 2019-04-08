package database;
import java.sql.*;
import java.util.logging.Level;
import java.awt.Color;
import java.awt.Container;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;import javax.swing.JPanel;
public class ct extends javax.swing.JFrame 
{
    private Container c;
    public ct() 
    {
        initComponents();
        c=getContentPane();
        c.setBackground(Color.pink);

    } @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        col_val = new javax.swing.JTextField();
        col_dtype = new javax.swing.JComboBox<>();
        col_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tablename = new javax.swing.JLabel();
        col_name1 = new javax.swing.JTextField();
        col_name2 = new javax.swing.JTextField();
        col_name3 = new javax.swing.JTextField();
        col_dtype1 = new javax.swing.JComboBox<>();
        col_dtype2 = new javax.swing.JComboBox<>();
        col_dtype3 = new javax.swing.JComboBox<>();
        col_val1 = new javax.swing.JTextField();
        col_val2 = new javax.swing.JTextField();
        col_val3 = new javax.swing.JTextField();
        key3 = new javax.swing.JCheckBox();
        key2 = new javax.swing.JCheckBox();
        key4 = new javax.swing.JCheckBox();
        key1 = new javax.swing.JCheckBox();

        jTextField1.setText("jTextField1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField3.setText("jTextField3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jButton1.setText("jButton1");

        jToggleButton4.setText("jToggleButton4");

        jCheckBox1.setText("jCheckBox1");

        jCheckBox3.setText("jCheckBox3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToggleButton1.setText("save");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("back");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        col_val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_valActionPerformed(evt);
            }
        });

        col_dtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Int", "Varchar", "Float", "char" }));
        col_dtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_dtypeActionPerformed(evt);
            }
        });

        col_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_nameActionPerformed(evt);
            }
        });

        jLabel1.setText("Column Name");

        jLabel3.setText("Column Type");

        jLabel2.setText("Length");

        tablename.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablenameMouseReleased(evt);
            }
        });

        col_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_name1ActionPerformed(evt);
            }
        });

        col_name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_name2ActionPerformed(evt);
            }
        });

        col_name3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_name3ActionPerformed(evt);
            }
        });

        col_dtype1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Int", "Varchar", "Float", "char" }));
        col_dtype1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_dtype1ActionPerformed(evt);
            }
        });

        col_dtype2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Int", "Varchar", "Float", "char" }));
        col_dtype2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_dtype2ActionPerformed(evt);
            }
        });

        col_dtype3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Int", "Varchar", "Float", "char" }));
        col_dtype3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_dtype3ActionPerformed(evt);
            }
        });

        col_val1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_val1ActionPerformed(evt);
            }
        });

        col_val2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_val2ActionPerformed(evt);
            }
        });

        col_val3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                col_val3ActionPerformed(evt);
            }
        });

        key3.setText("primery key");

        key2.setText("primery key");
        key2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key2ActionPerformed(evt);
            }
        });

        key4.setText("primery key");
        key4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key4ActionPerformed(evt);
            }
        });

        key1.setText("primery key");
        key1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(tablename, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(key4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(col_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(key3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(col_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(key2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(col_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(key1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(col_name, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(col_dtype, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(col_dtype1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(col_dtype2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(col_dtype3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton1)
                                .addGap(61, 61, 61)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jToggleButton3)
                                .addGap(67, 67, 67)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(col_val, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(col_val1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(col_val2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(col_val3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tablename, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(col_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(col_val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(col_dtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(key1))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(col_val1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(col_dtype1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(col_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(key2))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(col_dtype2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(col_val2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(col_name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(key3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(col_dtype3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(col_val3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(col_name3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(key4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton3))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
            this.dispose();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String query="create table  "+ tablename.getText().toString()+"("+col_name.getText().toString()+" "+col_dtype.getSelectedItem().toString()+"  ("+col_val.getText()+")"
             +"not null"+","+col_name1.getText().toString()+" " +col_dtype1.getSelectedItem().toString()+"  ("+col_val1.getText()+")"+"not null"+","+col_name2.getText().toString()+" "+col_dtype2.getSelectedItem().toString()+"  ("+col_val2.getText()+")"+"not null"+","+col_name3.getText().toString()+" "+col_dtype3.getSelectedItem().toString()+"  ("+col_val3.getText()+")"+"not null"+")";
           
        System.out.println(query);
           String sql=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea2g2","root","");
            Statement stmt = conn.createStatement();
            stmt.execute(query);
            System.out.println("stmts created");
            if(key1.isSelected()==true&& key2.isSelected()==false && key3.isSelected()==false  && key4.isSelected()==false ){
               sql ="ALTER TABLE  "+ tablename.getText().toString()+"  ADD PRIMARY KEY"+"("+col_name.getText().toString()+")";
               System.out.println(sql);
               stmt.execute(sql);
            }
            else if(key1.isSelected()==true && key2.isSelected()==true &&key3.isSelected()==false &&key4.isSelected()==false){
               sql ="ALTER TABLE  "+ tablename.getText().toString()+"  ADD PRIMARY KEY"+"("+col_name.getText().toString()+")"+","+col_name1.getText()+")"+")";
               System.out.println(sql);
               stmt.execute(sql);
            }
            else if(key1.isSelected()==true && key2.isSelected()==true && key3.isSelected()==true && key4.isSelected()==false){
               sql ="ALTER TABLE  "+ tablename.getText().toString()+"  ADD PRIMARY KEY"+"("+col_name.getText().toString()+","+col_name1.getText().toString()+","+col_name2.getText().toString()+")";
               System.out.println(sql);
               stmt.execute(sql);
            }
            else if(key1.isSelected()==true && key2.isSelected()==true && key3.isSelected()==true &&  key4.isSelected()==true){
               sql ="ALTER TABLE  "+ tablename.getText().toString()+"  ADD PRIMARY KEY"+"("+col_name.getText().toString()+")"+","+col_name1.getText().toString()+","+col_name2.getText().toString()+")"+","+col_name3.getText().toString()+")"+")";
               System.out.println(sql);
               stmt.execute(sql);
            }
            else if(key2.isSelected()==true&& key1.isSelected()==false && key3.isSelected()==false  && key4.isSelected()==false ){
               sql ="ALTER TABLE  "+ tablename.getText().toString()+"  ADD PRIMARY KEY"+"("+col_name1.getText().toString()+")";
               System.out.println(sql);
               stmt.execute(sql);
            }else if(key3.isSelected()==true&& key2.isSelected()==false && key1.isSelected()==false  && key4.isSelected()==false ){
               sql ="ALTER TABLE  "+ tablename.getText().toString()+"  ADD PRIMARY KEY"+"("+col_name2.getText().toString()+")";
               System.out.println(sql);
               stmt.execute(sql);
            }
            else if(key4.isSelected()==true&& key2.isSelected()==false && key3.isSelected()==false  && key1.isSelected()==false ){
               sql ="ALTER TABLE  "+ tablename.getText().toString()+"  ADD PRIMARY KEY"+"("+col_name3.getText().toString()+")";
               System.out.println(sql);
               stmt.execute(sql);
            } else if(key1.isSelected()==true && key3.isSelected()==true &&key2.isSelected()==false &&key4.isSelected()==false){
               sql ="ALTER TABLE  "+ tablename.getText().toString()+"  ADD PRIMARY KEY "+"("+col_name.getText().toString()+","+col_name2.getText()+")";
               System.out.println(sql);
               stmt.execute(sql);
            }
             else if(key1.isSelected()==true && key4.isSelected()==true &&key3.isSelected()==false &&key2.isSelected()==false){
               sql ="ALTER TABLE  "+ tablename.getText().toString()+"  ADD PRIMARY KEY "+"("+col_name.getText().toString()+","+col_name3.getText()+")";
               System.out.println(sql);
               stmt.execute(sql);
            }
             else if(key2.isSelected()==true && key3.isSelected()==true &&key1.isSelected()==false &&key4.isSelected()==false){
               sql ="ALTER TABLE  "+ tablename.getText().toString()+"  ADD PRIMARY KEY "+"("+col_name1.getText().toString()+","+col_name2.getText()+")";
               System.out.println(sql);
               stmt.execute(sql);
            }
             else if(key2.isSelected()==true && key4.isSelected()==true &&key3.isSelected()==false &&key1.isSelected()==false){
               sql ="ALTER TABLE  "+ tablename.getText().toString()+"  ADD PRIMARY KEY "+"("+col_name1.getText().toString()+"("+Integer.parseInt(col_val1.getText())+")"+","+col_name3.getText()+")";
               System.out.println(sql);
               stmt.execute(sql);
            }
             else if(key3.isSelected()==true && key4.isSelected()==true &&key1.isSelected()==false &&key2.isSelected()==false){
               sql ="ALTER TABLE  "+ tablename.getText().toString()+"  ADD PRIMARY KEY "+"("+col_name2.getText().toString()+","+col_name3.getText()+")";
               System.out.println(sql);
               stmt.execute(sql);
            }
             else if(key1.isSelected()==true && key2.isSelected()==true && key4.isSelected()==true && key3.isSelected()==false){
               sql ="ALTER TABLE  "+ tablename.getText().toString()+"  ADD PRIMARY KEY"+"("+col_name.getText().toString()+","+col_name1.getText().toString()+","+col_name3.getText().toString()+")";
               System.out.println(sql);
               stmt.execute(sql);
            }
             else if(key1.isSelected()==true && key3.isSelected()==true && key4.isSelected()==true && key2.isSelected()==false){
               sql ="ALTER TABLE  "+ tablename.getText().toString()+"  ADD PRIMARY KEY"+"("+col_name.getText().toString()+","+col_name2.getText().toString()+","+col_name3.getText().toString()+")";
               System.out.println(sql);
               stmt.execute(sql);
            }
             else if(key2.isSelected()==true && key3.isSelected()==true && key4.isSelected()==true && key1.isSelected()==false){
               sql ="ALTER TABLE  "+ tablename.getText().toString()+"  ADD PRIMARY KEY"+"("+col_name1.getText().toString()+","+col_name2.getText().toString()+","+col_name3.getText().toString()+")";
               System.out.println(sql);
               stmt.execute(sql);
            }
            JOptionPane.showMessageDialog(this,"table created");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void col_dtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_dtypeActionPerformed
        if(col_dtype.getSelectedIndex()==0)
        {
            col_val.setVisible(false);
            col_val.setText("2");
        }
    }//GEN-LAST:event_col_dtypeActionPerformed

    private void col_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_nameActionPerformed

    }//GEN-LAST:event_col_nameActionPerformed

    private void tablenameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablenameMouseReleased
  
    }//GEN-LAST:event_tablenameMouseReleased

    private void col_valActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_valActionPerformed
    
    }//GEN-LAST:event_col_valActionPerformed

    private void col_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_name1ActionPerformed
   
    }//GEN-LAST:event_col_name1ActionPerformed

    private void col_name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_name2ActionPerformed
    
    }//GEN-LAST:event_col_name2ActionPerformed

    private void col_name3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_name3ActionPerformed
     
    }//GEN-LAST:event_col_name3ActionPerformed

    private void col_dtype1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_dtype1ActionPerformed
        if(col_dtype1.getSelectedIndex()==0)
        {
            col_val1.setVisible(false);
            col_val1.setText("2");
        }
    }//GEN-LAST:event_col_dtype1ActionPerformed

    private void col_dtype2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_dtype2ActionPerformed
        if(col_dtype2.getSelectedIndex()==0)
        {
            col_val2.setVisible(false);
            col_val2.setText("2");
        }
        
    }//GEN-LAST:event_col_dtype2ActionPerformed

    private void col_dtype3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_dtype3ActionPerformed
        if(col_dtype3.getSelectedIndex()==0)
        {
            col_val3.setVisible(false);
            col_val3.setText("2");
        }
    }//GEN-LAST:event_col_dtype3ActionPerformed

    private void col_val1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_val1ActionPerformed

    }//GEN-LAST:event_col_val1ActionPerformed

    private void col_val2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_val2ActionPerformed
    
    }//GEN-LAST:event_col_val2ActionPerformed

    private void col_val3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_col_val3ActionPerformed

    }//GEN-LAST:event_col_val3ActionPerformed

    private void key2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key2ActionPerformed
   
    }//GEN-LAST:event_key2ActionPerformed

    private void key4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key4ActionPerformed
     
    }//GEN-LAST:event_key4ActionPerformed

    private void key1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key1ActionPerformed

    }//GEN-LAST:event_key1ActionPerformed
    public static void main(String args[]) 
        {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> col_dtype;
    private javax.swing.JComboBox<String> col_dtype1;
    private javax.swing.JComboBox<String> col_dtype2;
    private javax.swing.JComboBox<String> col_dtype3;
    private javax.swing.JTextField col_name;
    private javax.swing.JTextField col_name1;
    private javax.swing.JTextField col_name2;
    private javax.swing.JTextField col_name3;
    private javax.swing.JTextField col_val;
    private javax.swing.JTextField col_val1;
    private javax.swing.JTextField col_val2;
    private javax.swing.JTextField col_val3;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JCheckBox key1;
    private javax.swing.JCheckBox key2;
    private javax.swing.JCheckBox key3;
    private javax.swing.JCheckBox key4;
    public static javax.swing.JLabel tablename;
    // End of variables declaration//GEN-END:variables
}
