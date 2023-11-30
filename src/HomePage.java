
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author edwin
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
	initComponents();
	setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebarPanel = new javax.swing.JPanel();
        dashboardButton = new javax.swing.JButton();
        transactionHistoryButton = new javax.swing.JButton();
        viewTenantButton = new javax.swing.JButton();
        viewRoomButton = new javax.swing.JButton();
        incomeReportButton = new javax.swing.JButton();
        pendingPaymentButton = new javax.swing.JButton();
        titlebarPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidebarPanel.setBackground(new java.awt.Color(52, 68, 77));

        dashboardButton.setBackground(new java.awt.Color(52, 68, 77));
        dashboardButton.setFont(new java.awt.Font("Archivo SemiBold", 0, 18)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(175, 190, 203));
        dashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icons/sidebar_icons/dashboard_icon.png"))); // NOI18N
        dashboardButton.setText("Dashboard");
        dashboardButton.setBorderPainted(false);
        dashboardButton.setFocusable(false);
        dashboardButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dashboardButton.setIconTextGap(10);
        dashboardButton.setInheritsPopupMenu(true);
        dashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardButtonActionPerformed(evt);
            }
        });

        transactionHistoryButton.setBackground(new java.awt.Color(52, 68, 77));
        transactionHistoryButton.setFont(new java.awt.Font("Archivo SemiBold", 0, 18)); // NOI18N
        transactionHistoryButton.setForeground(new java.awt.Color(175, 190, 203));
        transactionHistoryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icons/sidebar_icons/transaction_history_icon.png"))); // NOI18N
        transactionHistoryButton.setText("Transaction History");
        transactionHistoryButton.setBorderPainted(false);
        transactionHistoryButton.setFocusable(false);
        transactionHistoryButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        transactionHistoryButton.setIconTextGap(10);
        transactionHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionHistoryButtonActionPerformed(evt);
            }
        });

        viewTenantButton.setBackground(new java.awt.Color(52, 68, 77));
        viewTenantButton.setFont(new java.awt.Font("Archivo SemiBold", 0, 18)); // NOI18N
        viewTenantButton.setForeground(new java.awt.Color(175, 190, 203));
        viewTenantButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icons/sidebar_icons/view_tenants_icon.png"))); // NOI18N
        viewTenantButton.setText("View Registered Tenants");
        viewTenantButton.setToolTipText("");
        viewTenantButton.setBorderPainted(false);
        viewTenantButton.setFocusable(false);
        viewTenantButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        viewTenantButton.setIconTextGap(10);
        viewTenantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTenantButtonActionPerformed(evt);
            }
        });

        viewRoomButton.setBackground(new java.awt.Color(52, 68, 77));
        viewRoomButton.setFont(new java.awt.Font("Archivo SemiBold", 0, 18)); // NOI18N
        viewRoomButton.setForeground(new java.awt.Color(175, 190, 203));
        viewRoomButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icons/sidebar_icons/view_rooms_icon.png"))); // NOI18N
        viewRoomButton.setText("View Registered Rooms");
        viewRoomButton.setBorderPainted(false);
        viewRoomButton.setFocusable(false);
        viewRoomButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        viewRoomButton.setIconTextGap(10);
        viewRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRoomButtonActionPerformed(evt);
            }
        });

        incomeReportButton.setBackground(new java.awt.Color(52, 68, 77));
        incomeReportButton.setFont(new java.awt.Font("Archivo SemiBold", 0, 18)); // NOI18N
        incomeReportButton.setForeground(new java.awt.Color(175, 190, 203));
        incomeReportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icons/sidebar_icons/money_icon.png"))); // NOI18N
        incomeReportButton.setText("Income Report");
        incomeReportButton.setBorderPainted(false);
        incomeReportButton.setFocusable(false);
        incomeReportButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        incomeReportButton.setIconTextGap(10);
        incomeReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeReportButtonActionPerformed(evt);
            }
        });

        pendingPaymentButton.setBackground(new java.awt.Color(52, 68, 77));
        pendingPaymentButton.setFont(new java.awt.Font("Archivo SemiBold", 0, 18)); // NOI18N
        pendingPaymentButton.setForeground(new java.awt.Color(175, 190, 203));
        pendingPaymentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icons/sidebar_icons/pending_payment_icon.png"))); // NOI18N
        pendingPaymentButton.setText("Pending Payment");
        pendingPaymentButton.setBorderPainted(false);
        pendingPaymentButton.setFocusable(false);
        pendingPaymentButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pendingPaymentButton.setIconTextGap(10);
        pendingPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendingPaymentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewTenantButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(transactionHistoryButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewRoomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(incomeReportButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pendingPaymentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
            .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sidebarPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(dashboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(viewTenantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(viewRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(incomeReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pendingPaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(transactionHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
            .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sidebarPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(dashboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 515, Short.MAX_VALUE)))
        );

        titlebarPanel.setBackground(new java.awt.Color(239, 134, 128));

        javax.swing.GroupLayout titlebarPanelLayout = new javax.swing.GroupLayout(titlebarPanel);
        titlebarPanel.setLayout(titlebarPanelLayout);
        titlebarPanelLayout.setHorizontalGroup(
            titlebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        titlebarPanelLayout.setVerticalGroup(
            titlebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(184, 208, 201));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 982, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlebarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlebarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sidebarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboardButtonActionPerformed

    private void transactionHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionHistoryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transactionHistoryButtonActionPerformed

    private void viewTenantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTenantButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewTenantButtonActionPerformed

    private void viewRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRoomButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewRoomButtonActionPerformed

    private void incomeReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeReportButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incomeReportButtonActionPerformed

    private void pendingPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendingPaymentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pendingPaymentButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	try {
	UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
	    // Handle any exceptions
	     ex.printStackTrace();
	}

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new HomePage().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboardButton;
    private javax.swing.JButton incomeReportButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pendingPaymentButton;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JPanel titlebarPanel;
    private javax.swing.JButton transactionHistoryButton;
    private javax.swing.JButton viewRoomButton;
    private javax.swing.JButton viewTenantButton;
    // End of variables declaration//GEN-END:variables
}
