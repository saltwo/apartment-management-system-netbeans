import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;

public class LoginPage extends javax.swing.JFrame {
    static Connection conn;
    static PreparedStatement pst;

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
	initComponents();
	setVisible(true);
	setLocationRelativeTo(null);
    }
    
    // Run SQL queries here
    public void runSqlQuery(String query, String message) {
	conn = ConnectXamppMySQL.conn();

	try {
	    pst = conn.prepareStatement(query);
	    pst.execute();
	    JOptionPane.showMessageDialog(null, message);
	    } catch(SQLException e) {
		    JOptionPane.showMessageDialog(null, e);
		}
	    }
    
    // Run SQL queries to retrieve data
    public void getSystemConfig(String query) {
	conn = ConnectXamppMySQL.conn();
	
	try {
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                // Retrieve data from the result set
                int system_id = rs.getInt("system_id");
                String system_pin = rs.getString("system_pin");
                // Retrieve other columns as needed
		    
                // Process the retrieved data
                System.out.println("System id: " + system_id);
                System.out.println("System pin: " + system_pin);
                // Process other columns as needed
            }
            JOptionPane.showMessageDialog(null, "Retrieve Data succesfully!");
            rs.close();
            pst.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    // Function when login button is clicked
    public String login() {
	String userID = userIdInput.getText();
	String userPin = userPinInput.getText();
	
	return userID + "," + userPin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        loginInputPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        userIdInput = new javax.swing.JTextField();
        userIdLabel = new javax.swing.JLabel();
        userPinLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        userPinInput = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginInputPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginInputPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLabel.setFont(new java.awt.Font("Archivo SemiBold", 0, 28)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(51, 51, 51));
        loginLabel.setText("Login to your account");
        loginInputPanel.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 50));
        loginInputPanel.add(userIdInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 420, 50));

        userIdLabel.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        userIdLabel.setText("User ID");
        loginInputPanel.add(userIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 30));

        userPinLabel.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        userPinLabel.setText("User PIN");
        loginInputPanel.add(userPinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, 30));

        loginButton.setBackground(new java.awt.Color(239, 134, 128));
        loginButton.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setFocusable(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginInputPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 420, 60));
        loginInputPanel.add(userPinInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 420, 50));

        bgPanel.add(loginInputPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 460, 420));

        jLabel5.setFont(new java.awt.Font("Poppins ExtraBold", 0, 80)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Profiles/rent_ez_White.png"))); // NOI18N
        jLabel5.setText("RentEZ");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        bgPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 460, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login/apartment.png"))); // NOI18N
        bgPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(bgPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        login();
//	runSqlQuery("UPDATE users SET name='sal' WHERE id=2", "Update user's name");
	getSystemConfig("SELECT system_id, system_pin FROM system_configuration");

    }//GEN-LAST:event_loginButtonActionPerformed

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
	    java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new LoginPage().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginInputPanel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField userIdInput;
    private javax.swing.JLabel userIdLabel;
    private javax.swing.JPasswordField userPinInput;
    private javax.swing.JLabel userPinLabel;
    // End of variables declaration//GEN-END:variables
}
