package hostelmanagement;
public class LoadingForm extends javax.swing.JFrame 
{
    public LoadingForm()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(600, 200, 1000, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 48)); // NOI18N
        jLabel1.setText("Wait for a second...");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 460, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmanagement/47a6071905fb34ee666fe9d6107fb346.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static void main(String args[])
{
        java.awt.EventQueue.invokeLater(new Runnable() {@Override
       public void run() { 
       new LoadingForm().setVisible(true);}});
                   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
