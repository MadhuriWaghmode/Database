package database;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
public class first extends javax.swing.JFrame implements CaretListener {
    JTextField jt;
    JPanel jp;
     public first() {
        initComponents();
         jt=new JTextField(10);
        jp=new JPanel();
        setLayout(null);jt.setBounds(50,20,50,30);
        jt.addCaretListener((CaretListener) this);
        jp.setBounds(50,80,200,200);
        jp.setOpaque(true);
        jp.setBackground(Color.yellow);
        add(jt);
        add(jp);
    }
      public void caretUpdate(CaretEvent ce) {
                String str=jt.getText();
        jp.removeAll();
        if(!str.equals(" "))
            
        {
          int num=Integer.parseInt(str);
          JLabel jl[]=new JLabel[num];
         
          for(int i=0;i<jl.length;i++)
         {
              jl[i]=new JLabel("");
              jp.add( jl[i]);
          }
        }
        jp.validate();
        jp.repaint();

       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        first c=new first();  
        c.setTitle("hii");
        c.setSize(300,350);
        c.setVisible(true);
        
    }

    
  
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
