
package database;
import static database.atmain.selectedtab;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Container;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class at extends javax.swing.JFrame {
    private Container c;
    public at() {
        initComponents();
        c=getContentPane();
        c.setBackground(Color.pink);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tab = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        tab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Alter selected table");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabActionPerformed
        String str=(String) tab.getSelectedItem();
        System.out.println("selected table"+str);
      
    }//GEN-LAST:event_tabActionPerformed

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        
    
    }//GEN-LAST:event_tabMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        String str=(String) tab.getSelectedItem();
        System.out.println("selected table=>" +str);
        atmain at=new atmain();
        at.setVisible(true);
        atmain.selectedtab.setText(str);
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
                
                ResultSet rs=stmt.executeQuery("select * from "+selectedtab.getText());
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
                atmain.cl1.setText(clms[0]);
                atmain.cl2.setText(clms[1]);
                atmain.cl3.setText(clms[2]);
                atmain.cl4.setText(clms[3]);
                atmain.clt1.addItem(clmt[0]);
                atmain.clt2.addItem(clmt[1]);
                atmain.clt3.addItem(clmt[2]);
                atmain.clt4.addItem(clmt[3]);
               
               
                atmain.col_length1.setText( Integer.toString(len[0]));
                atmain.col_length2.setText( Integer.toString(len[1]));
                atmain.col_length3.setText( Integer.toString(len[2]));
                atmain.col_length4.setText( Integer.toString(len[3]));             
                System.out.println("**********");
                
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
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new at().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    public static javax.swing.JComboBox<String> tab;
    // End of variables declaration//GEN-END:variables
}
