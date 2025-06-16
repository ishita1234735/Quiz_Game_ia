import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class QuizGame extends javax.swing.JFrame {

     JLabel lb;
    public QuizGame()
    {
        lb = new JLabel();
        initComponents();
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        int h=(int)d.getHeight();
        int w=(int)d.getWidth();
        setSize(w,h);
         lb.setBounds(0, 0, w, h);
        ImageIcon ic=new ImageIcon("src\\myuploads\\QUlZ1.jpg");
        Image img=ic.getImage().getScaledInstance(lb.getWidth(),lb.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon icl=new ImageIcon(img);
        lb.setIcon(icl);
        add(lb);
        setVisible(true);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("WELCOME TO QUIZ GAME !");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 40, 620, 64);

        jButton1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jButton1.setText("Start Quiz ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 450, 190, 60);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 30, 20, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Enter Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 170, 140, 40);

        jTextField1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(790, 180, 210, 30);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(790, 260, 210, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Enter Date-of-Birth");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 260, 210, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Start_Quiz st=new Start_Quiz();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
