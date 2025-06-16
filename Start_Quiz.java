
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Start_Quiz extends javax.swing.JFrame {

    JLabel lb;
    public Start_Quiz() {
        lb=new JLabel();
        initComponents();
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        int h=(int)d.getHeight();
        int w=(int)d.getWidth();
        setSize(w,h);
         buttonGroup1.add(op1);
         buttonGroup1.add(op2);
         buttonGroup1.add(op3);
         buttonGroup1.add(op4);
           for(int i=0;i<selectedAnswers.length;i++)
                    {
                          selectedAnswers[i]=-1;
                            
                    }
        loadQuestion(currentQuestion);
         lb.setBounds(0, 0, w, h);
        ImageIcon ic=new ImageIcon("src\\myuploads\\Qulz.jpg");
        Image img=ic.getImage().getScaledInstance(lb.getWidth(),lb.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon icl=new ImageIcon(img);
        lb.setIcon(icl);
        add(lb);
        setVisible(true);
        
    }
     
     int currentQuestion=0;
     int score=0;
     String[] questions={"What is the Capital of India?" ,"Which Planet is known as Red Planet?","Who wrote"
             + " Power of Subconcious Mind?","Which company developed Chatgpt?","Which is the smallest Prime"
             + "Number?","Who was the First Female President of India?"};
     String options[][]={{"Mumbai","Chennai","New Delhi","Kolkata"},{"Earth","Mars","Jupiter","Saturn"},
         {"Joseph Murphy","Chetan Bhagat","APJ Abdul Kalam","James Clear"},{"Google","Meta","Amazon","OpenAI"}
             ,{"0","1","2","3"},{"Sarojini Naidu","Pratibha Patil","Indira Gandhi","Sushma Swaraj"}};
       int answers[]={2,1,0,3,2,1};   
        int selectedAnswers[]=new int[questions.length];
                    
          void loadQuestion(int index)
          {
                  Ques.setText("Question "+(index+1)+" of 6"+ " :-"+questions[index]);
                  op1.setText(options[index][0]);
                  op2.setText(options[index][1]);
                  op3.setText(options[index][2]);
                  op4.setText(options[index][3]);
                  buttonGroup1.clearSelection();
                  
                  if(selectedAnswers[index]==0)      op1.setSelected(true);
                  else if(selectedAnswers[index]==1) op2.setSelected(true);
                  else if(selectedAnswers[index]==2) op3.setSelected(true);
                  else if(selectedAnswers[index]==3) op4.setSelected(true);
          }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        bt1 = new javax.swing.JButton();
        Ques = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText(" QUIZ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(710, 10, 150, 50);

        op1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });
        getContentPane().add(op1);
        op1.setBounds(510, 270, 370, 30);

        op2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });
        getContentPane().add(op2);
        op2.setBounds(510, 340, 380, 30);

        op3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });
        getContentPane().add(op3);
        op3.setBounds(510, 400, 380, 30);

        op4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });
        getContentPane().add(op4);
        op4.setBounds(510, 470, 380, 30);

        bt1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        bt1.setText("Next->");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(800, 550, 150, 40);

        Ques.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Ques.setForeground(new java.awt.Color(204, 255, 204));
        getContentPane().add(Ques);
        Ques.setBounds(420, 190, 760, 30);

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButton1.setText("<-Previous");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(530, 550, 160, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
  
    }//GEN-LAST:event_op2ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
          int selectedAnswer = -1;

            if(op1.isSelected())      selectedAnswer=0;
            else if(op2.isSelected()) selectedAnswer=1;
            else if(op3.isSelected()) selectedAnswer=2;
            else if(op4.isSelected()) selectedAnswer=3;
   
             if(selectedAnswer==-1)
             {
                    JOptionPane.showMessageDialog(this, "Select an option before proceeding!");
                      return;
             }
             
              selectedAnswers[currentQuestion]=selectedAnswer;
          if(selectedAnswer==answers[currentQuestion]) 
          score++; 
          if(currentQuestion < questions.length-1)
             {
                      currentQuestion++;
                      loadQuestion(currentQuestion);
                      buttonGroup1.clearSelection();
             }
             else
             {
                    int final_score=0;
                    for(int i=0;i<questions.length;i++)
                    {
                          if(selectedAnswers[i]==answers[i])
                              final_score++;
                    }
                    JOptionPane.showMessageDialog(this,"Quiz Finished!\nYour Score is:-" + final_score + "/"+ questions.length);
                    buttonGroup1.clearSelection();
             }
    }//GEN-LAST:event_bt1ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op3ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op4ActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    if (currentQuestion > 0) {
        currentQuestion--;
        loadQuestion(currentQuestion);
        buttonGroup1.clearSelection(); // Clear selection
    } else {
        JOptionPane.showMessageDialog(this, "This is the first question");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start_Quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ques;
    private javax.swing.JButton bt1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    // End of variables declaration//GEN-END:variables
}
