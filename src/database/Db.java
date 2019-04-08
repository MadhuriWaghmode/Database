package database;
import java.awt.*;
import java.sql.* ;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
import java.awt.Container;
public class Db extends javax.swing.JFrame {
private Container c;
    public Db() {
        initComponents();
        c=getContentPane();
        c.setBackground(Color.pink);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jTextField1.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Database");
        setBackground(new java.awt.Color(153, 0, 153));
        setForeground(java.awt.Color.pink);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("DDL");
        editMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuActionPerformed(evt);
            }
        });

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Create Table");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Create View");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Alter Table");
        pasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Drop Table");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(deleteMenuItem);

        jMenuItem1.setText("List Of Tables");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem1);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("DML");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Insert Tuple");
        contentsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentsMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Update Tuple");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        jMenuItem2.setText("Delete Tuple");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem2);

        jMenuItem3.setText("Select Query");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem3);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    try {
        conn.close();
    } catch (SQLException ex) 
    {
        Logger.getLogger(Db.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void pasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuItemActionPerformed
        
        at a=new at();
        a.setVisible(true);
              try
      {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea2g2","root","");
          Statement stmt = conn.createStatement();
          String query="select table_name from information_schema.tables where TABLE_SCHEMA='tea2g2'";
          ResultSet rs=null;
          rs=stmt.executeQuery(query);
          System.out.println("stmts created");
          System.out.println(query);
          while(rs.next())
          {
               String s= rs.getString(1);
               at.tab.addItem(s);
          }
      }
      catch(Exception e)
      {
         System.out.println(e);
      }

    }//GEN-LAST:event_pasteMenuItemActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        mainct m =new mainct();
        m.setVisible(true);
        Db d=new Db();
        d.setVisible(false);
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        
        cv c=new cv();
        c.setVisible(true);
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
         dt d=new dt();
        d.setVisible(true);
              try
      {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea2g2","root","");
          Statement stmt = conn.createStatement();
          String query="select table_name from information_schema.tables where TABLE_SCHEMA='tea2g2'";
          ResultSet rs=null;
          rs=stmt.executeQuery(query);
          System.out.println("stmts created");
          System.out.println(query);
          while(rs.next())
          {
               String s= rs.getString(1);
               dt.tab.addItem(s);
          }
      }
      catch(Exception e)
      {
         System.out.println(e);
      }

    }//GEN-LAST:event_deleteMenuItemActionPerformed

    private void contentsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentsMenuItemActionPerformed

        it i=new it();
        i.setVisible(true);
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea2g2","root","");
            Statement stmt = conn.createStatement();
            String query="select table_name from information_schema.tables where TABLE_SCHEMA='tea2g2'";
            ResultSet rs=stmt.executeQuery(query);
            System.out.println("stmts created");
            System.out.println(query);
            while(rs.next())
            {
                String s= rs.getString(1);
               it.jComboBox1.addItem(s);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_contentsMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed

         ut u=new ut();
        u.setVisible(true);
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea2g2","root","");
            Statement stmt = conn.createStatement();
            String query="select table_name from information_schema.tables where TABLE_SCHEMA='tea2g2'";
            ResultSet rs=stmt.executeQuery(query);
            System.out.println("stmts created");
            System.out.println(query);
            while(rs.next())
            {
                String s= rs.getString(1);
               ut.jComboBox1.addItem(s);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
 
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
         del dl=new del();
        dl.setVisible(true);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea2g2","root","");
            Statement stmt = conn.createStatement();
            String query="select table_name from information_schema.tables where TABLE_SCHEMA='tea2g2'";
            ResultSet rs=stmt.executeQuery(query);
            System.out.println("stmts created");
            System.out.println(query);
            while(rs.next())
            {
                String s= rs.getString(1);
               del.jComboBox1.addItem(s);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       
         sq s=new sq();
        s.setVisible(true);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea2g2","root","");
            Statement stmt = conn.createStatement();
            String query="select table_name from information_schema.tables where TABLE_SCHEMA='tea2g2'";
            ResultSet rs=stmt.executeQuery(query);
            System.out.println("stmts created");
            System.out.println(query);
            while(rs.next())
            {
                String s1= rs.getString(1);
               sq.jComboBox1.addItem(s1);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
 
 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void editMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuActionPerformed
        
    }//GEN-LAST:event_editMenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       lot t=new lot();
       t.setVisible(true);
       try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea2g2","root","");
            Statement stmt = conn.createStatement();
            String query="select table_name from information_schema.tables where TABLE_SCHEMA='tea2g2'";
            ResultSet rs=stmt.executeQuery(query);
            System.out.println("stmts created");
            System.out.println(query);
            while(rs.next())
            {
                String s= rs.getString(1);
                lot.list.addItem(s);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed
        static  int flag=0;
        static Connection conn = null;
        static Statement stmt = null;
        public static void main(String args[]) {
        int flag=0;
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Db.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Db.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Db.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Db.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>
                String url = "jdbc:mysql://127.0.0.1:3306/tea2g2";
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("driver loaded");
        
        }
        catch(Exception e)
        {
            System.out.println("error in loading driver");
            return;
        }
        try
        {
        System.out.println("Connecting to a selected database...");
      
         conn = DriverManager.getConnection (url, "root", "");
         System.out.println("Connected database successfully...");
        }
        catch(Exception e)
        {
            System.out.println("Error in connection creation");
            return;
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Db().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables

}
