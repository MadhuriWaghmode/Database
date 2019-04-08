package database;
import static database.at.tab;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class mainct extends javax.swing.JFrame {
    private Container c;
       public mainct() {
        initComponents();
        c=getContentPane();
        c.setBackground(Color.pink);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        tab_name = new java.awt.TextField();
        label2 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        Back = new javax.swing.JToggleButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        tab_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tab_nameMousePressed(evt);
            }
        });
        tab_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab_nameActionPerformed(evt);
            }
        });

        label2.setText("Enter table Name");

        jButton1.setText("CREATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(tab_name, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jButton1)
                .addGap(48, 48, 48)
                .addComponent(Back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Back))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_nameActionPerformed
        
    }//GEN-LAST:event_tab_nameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(tab_name.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this,"please enter table name");
        }
        else if(tab_name.getText().startsWith("0"))
        {
            JOptionPane.showMessageDialog(this,"table name should not start with number");
        }
        else if(tab_name.getText().startsWith("1"))
        {
            JOptionPane.showMessageDialog(this,"table name should not start with number");
        }
        else if(tab_name.getText().startsWith("2"))
        {
            JOptionPane.showMessageDialog(this,"table name should not start with number");
        }
        else if(tab_name.getText().startsWith("3"))
        {
            JOptionPane.showMessageDialog(this,"table name should not start with number");
        }
        else if(tab_name.getText().startsWith("4"))
        {
            JOptionPane.showMessageDialog(this,"table name should not start with number");
        }
        else if(tab_name.getText().startsWith("5"))
        {
            JOptionPane.showMessageDialog(this,"table name should not start with number");
        }
        else if(tab_name.getText().startsWith("6"))
        {
            JOptionPane.showMessageDialog(this,"table name should not start with number");
        }
        else if(tab_name.getText().startsWith("7"))
        {
            JOptionPane.showMessageDialog(this,"table name should not start with number");
        }
        else if(tab_name.getText().startsWith("8"))
        {
            JOptionPane.showMessageDialog(this,"table name should not start with number");
        }
        else if(tab_name.getText().startsWith("9"))
        {
            JOptionPane.showMessageDialog(this,"table name should not start with number");
        }
        else 
        {
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
                String s=null;
                boolean found=false;
                while(rs.next())
                 {
                     s= rs.getString(1);
                     if(s.equals(tab_name.getText()))
                     found=true;
                 }
                System.out.println("found ="+found);
                if(found)   
                {
                    JOptionPane.showMessageDialog(this,"Already exixts please give another name or alter the same one ");
                    tab_name.setText("");
                } 
                else
                {
                   ct c=new ct();
                   c.setVisible(true);
                   String tname= tab_name.getText();
                   ct.tablename.setText(tname);
                }
            }
            catch(Exception e)
            {
            System.out.println(e);
            }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tab_nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_nameMousePressed
     
    }//GEN-LAST:event_tab_nameMousePressed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed
       public static void main(String args[]) {
               java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainct().setVisible(true);
            }
        });
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JToggleButton jToggleButton1;
    private java.awt.Label label2;
    public static java.awt.TextField tab_name;
    // End of variables declaration//GEN-END:variables
}
