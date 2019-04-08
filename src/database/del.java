package database;

import java.awt.Color;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class del extends javax.swing.JFrame {
private Container c;
    public del() {
        initComponents();
        c=getContentPane();
        c.setBackground(Color.pink);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        third = new javax.swing.JLabel();
        fourth = new javax.swing.JLabel();
        sn = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        save = new javax.swing.JToggleButton();
        cl1 = new javax.swing.JLabel();
        jToggleButton3 = new javax.swing.JToggleButton();
        cl2 = new javax.swing.JLabel();
        first = new javax.swing.JLabel();
        cl3 = new javax.swing.JLabel();
        cl4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        clt1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        clt2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        clt3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        clt4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        sn.setText("Delete &  next");
        sn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Back");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        save.setText("Delete & back");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jToggleButton3.setText("cancel");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("column_name");

        jLabel2.setText("column_type");

        jLabel3.setText("length");

        jLabel4.setText("where");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(sn)
                        .addGap(121, 121, 121)
                        .addComponent(third, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(clt4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cl4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(first, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(jTextField4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(save)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jToggleButton3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(8, 8, 8)
                        .addComponent(fourth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cl1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clt1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cl2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clt2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clt3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cl3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cl1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cl2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cl3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cl4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clt1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clt2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(clt3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clt4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(first, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(third, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fourth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sn)
                    .addComponent(jToggleButton3)
                    .addComponent(jToggleButton1)
                    .addComponent(save)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void snActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snActionPerformed
        String sql=null;
        String str1=null;
        String str2=null;
        String str3=null;
          String str4=null;
        sql="DELETE FROM "+jComboBox1.getSelectedItem()+" WHERE ";
//       
        
        if(jTextField1.getText().isEmpty() && jTextField2.getText().isEmpty() && jTextField3.getText().isEmpty() && jTextField4.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"where set can not be empty");
        }
        else
        {
            JTextField textbox[]=new JTextField[10];
            //sql="UPDATE "+jComboBox1.getSelectedItem()+" SET  "+"`"+cl1.getText()+"`"+"="+st1.getText()+" WHERE ";
            for(int i=0;i<=4;i++)
            {
                textbox[i]=new JTextField();
                boolean b=false;

                if(i==1)
                {
                    if(jTextField1.getText().isEmpty())
                    {
                    }
                    else
                    {
                        String str="`"+cl1.getText()+"`"+"="+jTextField1.getText();
                        str1= sql.concat(str);
                        sql=str1;
                        System.out.println(sql);
                    }
                }
                else if(i==2)
                {
                    if(jTextField2.getText().isEmpty())
                    {
                    }
                    else
                    {
                        if(sql==str1)
                        {
                            String str=" and "+"`"+cl1.getText()+"`"+"="+jTextField1.getText();
                            str2= sql.concat(str);
                            sql=str2;
                        }
                        else
                        {
                            String str="`"+cl2.getText()+"`"+"="+jTextField2.getText();
                            str2= sql.concat(str);
                            sql=str2;
                        }
                    }
                }
                else if(i==3)
                {
                    if(jTextField3.getText().isEmpty())
                    {
                    }
                    else
                    {
                        if(sql==str2)
                        {
                            String str=" and "+"`"+cl3.getText()+"`"+" = "+jTextField3.getText();
                            str3= sql.concat(str);
                            sql=str3;
                        }
                        else
                        {
                            String str="`"+cl3.getText()+"`"+" = "+jTextField3.getText();
                            str3= sql.concat(str);
                            sql=str3;
                        }
                    }

                }
                else if(i==4)
                {
                    if(jTextField4.getText().isEmpty())
                    {
                    }
                    else
                    {
                        if(sql==str3)
                        {
                            String str=" and "+"`"+cl4.getText()+"`"+" = "+jTextField4.getText();
                             str4 = sql.concat(str);
                            sql=str4;
                        }
                        else
                        {
                            String str="`"+cl4.getText()+"`"+" = "+jTextField4.getText();
                            str4 = sql.concat(str);
                            sql=str4;
                        }

                    }

                }
            }
            JOptionPane.showMessageDialog(this,sql);

            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea2g2","root","");
                Statement stmt = conn.createStatement();
                stmt.execute(sql);
                System.out.println("executed"+sql);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            jTextField1.setText(" ");
        jTextField2.setText(" ");
        jTextField3.setText(" ");
        jTextField4.setText(" ");
            
        }
    }//GEN-LAST:event_snActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
       String sql=null;
        String str1=null;
        String str2=null;
        String str3=null;
          String str4=null;
        sql="DELETE FROM "+jComboBox1.getSelectedItem()+" WHERE ";
//       
        
        if(jTextField1.getText().isEmpty() && jTextField2.getText().isEmpty() && jTextField3.getText().isEmpty() && jTextField4.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"where set can not be empty");
        }
        else
        {
            JTextField textbox[]=new JTextField[10];
            //sql="UPDATE "+jComboBox1.getSelectedItem()+" SET  "+"`"+cl1.getText()+"`"+"="+st1.getText()+" WHERE ";
            for(int i=0;i<=4;i++)
            {
                textbox[i]=new JTextField();
                boolean b=false;

                if(i==1)
                {
                    if(jTextField1.getText().isEmpty())
                    {
                    }
                    else
                    {
                        String str="`"+cl1.getText()+"`"+"="+jTextField1.getText();
                        str1= sql.concat(str);
                        sql=str1;
                        System.out.println(sql);
                    }
                }
                else if(i==2)
                {
                    if(jTextField2.getText().isEmpty())
                    {
                    }
                    else
                    {
                        if(sql==str1)
                        {
                            String str=" and "+"`"+cl2.getText()+"`"+"="+jTextField2.getText();
                            str2= sql.concat(str);
                            sql=str2;
                        }
                        else
                        {
                            String str="`"+cl2.getText()+"`"+"="+jTextField2.getText();
                            str2= sql.concat(str);
                            sql=str2;
                        }
                    }
                }
                else if(i==3)
                {
                    if(jTextField3.getText().isEmpty())
                    {
                    }
                    else
                    {
                        if(sql==str2)
                        {
                            String str=" and "+"`"+cl3.getText()+"`"+" = "+jTextField3.getText();
                            str3= sql.concat(str);
                            sql=str3;
                        }
                        else
                        {
                            String str="`"+cl3.getText()+"`"+" = "+jTextField3.getText();
                            str3= sql.concat(str);
                            sql=str3;
                        }
                    }

                }
                else if(i==4)
                {
                    if(jTextField4.getText().isEmpty())
                    {
                    }
                    else
                    {
                        if(sql==str3)
                        {
                            String str=" and "+"`"+cl4.getText()+"`"+" = "+jTextField4.getText();
                             str4 = sql.concat(str);
                            sql=str4;
                        }
                        else
                        {
                            String str="`"+cl4.getText()+"`"+" = "+jTextField4.getText();
                            str4 = sql.concat(str);
                            sql=str4;
                        }

                    }

                }
            }
            JOptionPane.showMessageDialog(this,sql);

            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea2g2","root","");
                Statement stmt = conn.createStatement();
                stmt.execute(sql);
                System.out.println("executed"+sql);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
             this.dispose();
        }
    }//GEN-LAST:event_saveActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        jTextField1.setText(" ");
        jTextField2.setText(" ");
        jTextField3.setText(" ");
        jTextField4.setText(" ");
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try
        {
            System.out.println("searching for count");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loader");
            Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea2g2","root","");
            System.out.println("connection");
            Statement stmt = conn.createStatement();
            System.out.println("creating satement");
            try
            {

                ResultSet rs=stmt.executeQuery("select * from "+jComboBox1.getSelectedItem());
                ResultSetMetaData rsMetaData = rs.getMetaData();
                int numberOfColumns = rsMetaData.getColumnCount();
                System.out.println("resultSet MetaData column Count=" + numberOfColumns);
                String[] clms=new String[4];
                String  clmt[]=new String [4];
                int len[]=new int[4];
                String name;
                for (int i = 1; i <= numberOfColumns; i++)
                {
                    name=rsMetaData.getColumnName(i);
                    System.out.println(rsMetaData.getColumnTypeName(i));
                    clmt[i-1]= rsMetaData.getColumnTypeName(i);
                    clms[i-1]=name;
                    len[i-1]= (rsMetaData.getColumnDisplaySize(i));
                    System.out.println(len[i-1]);
                }
                cl1.setText(clms[0]);
                cl2.setText(clms[1]);
                cl3.setText(clms[2]);
                cl4.setText(clms[3]);
                clt1.setText(clmt[0]);
                clt2.setText(clmt[1]);
                clt3.setText(clmt[2]);
                clt4.setText(clmt[3]);
                c1.setText( Integer.toString(len[0]));
                c2.setText( Integer.toString(len[1]));
                c3.setText( Integer.toString(len[2]));
                c4.setText( Integer.toString(len[3]));
            }
            catch(Exception r)
            {
                System.out.println(r);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new del().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel cl1;
    private javax.swing.JLabel cl2;
    private javax.swing.JLabel cl3;
    private javax.swing.JLabel cl4;
    private javax.swing.JLabel clt1;
    private javax.swing.JLabel clt2;
    private javax.swing.JLabel clt3;
    private javax.swing.JLabel clt4;
    private javax.swing.JLabel first;
    private javax.swing.JLabel fourth;
    public static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton save;
    private javax.swing.JToggleButton sn;
    private javax.swing.JLabel third;
    // End of variables declaration//GEN-END:variables
}
