
import javax.swing.JOptionPane;
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
public class AddExpensePage extends javax.swing.JFrame {
    private double electricBill;
    private double waterBill;
    private double internetBill;
    private double maintenanceBill;
    private double totalBill;
    
    public AddExpensePage() {
	initComponents();
	setLocationRelativeTo(null);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    // Set the value of electric bill
    public void setElectricBill() {
	electricBill = (double) ((int) electricBillInput.getValue());
    }
    
    // Set the value of electric bill
    public void setWaterBill() {
	waterBill = (double) ((int) waterBillInput.getValue());
    }
    
    // Set the value of electric bill
    public void setInternetBill() {
	internetBill = (double) ((int) internetBillInput.getValue());
    }
    
    // Set the value of maintenance bill
    public void setMaintenanceBill() {
	maintenanceBill = (double) ((int) maintenanceBillInput.getValue());
    }
    
    // Set the value of total bill
    public void setTotalBill() {
	totalBill = electricBill + waterBill + internetBill + maintenanceBill;
    }
    
    // Return value of electric bill
    public double getElectricBill() {
	return electricBill;
    }
    
    // Return value of water bill
    public double getWaterBill() {
	return waterBill;
    }
    
    // Return value of internet bill
    public double getInternetBill() {
	return internetBill;
    }
    
    // Return value of maintenancec bill
    public double getMaintenanceBill() {
	return maintenanceBill;
    }
    
    // Return value of maintenancec bill
    public double getTotalBill() {
	return totalBill;
    }
    
    // Method for adding expenses
    public void addExpenses() {
	setElectricBill();
	setWaterBill();
	setInternetBill();
	setMaintenanceBill();
	setTotalBill();
	
	String query = "UPDATE system_configuration SET expenses=" + getTotalBill()+ " WHERE config_id = 1";
	new Main().runSqlQuery(query);
	JOptionPane.showMessageDialog(null, "Expenses succesfully added!");
	
	electricBillInput.setValue(0);
	waterBillInput.setValue(0);
	internetBillInput.setValue(0);
	maintenanceBillInput.setValue(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        expenseInputPanel = new javax.swing.JPanel();
        electricBillInput = new javax.swing.JSpinner();
        electricBillLabel = new javax.swing.JLabel();
        waterBillLabel = new javax.swing.JLabel();
        waterBillInput = new javax.swing.JSpinner();
        internetBillLabel = new javax.swing.JLabel();
        internetBillInput = new javax.swing.JSpinner();
        maintenanceBillLabel = new javax.swing.JLabel();
        maintenanceBillInput = new javax.swing.JSpinner();
        expenseInputLabel = new javax.swing.JLabel();
        addExpenseGoBackButton = new javax.swing.JButton();
        addExpenseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        expenseInputPanel.setBackground(new java.awt.Color(255, 255, 255));
        expenseInputPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        expenseInputPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        electricBillInput.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        expenseInputPanel.add(electricBillInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 340, 40));

        electricBillLabel.setFont(new java.awt.Font("Archivo SemiBold", 0, 15)); // NOI18N
        electricBillLabel.setText("Electricity bill");
        expenseInputPanel.add(electricBillLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 30));

        waterBillLabel.setFont(new java.awt.Font("Archivo SemiBold", 0, 15)); // NOI18N
        waterBillLabel.setText("Water bill");
        expenseInputPanel.add(waterBillLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 30));

        waterBillInput.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        expenseInputPanel.add(waterBillInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 340, 40));

        internetBillLabel.setFont(new java.awt.Font("Archivo SemiBold", 0, 15)); // NOI18N
        internetBillLabel.setText("Internet bill");
        expenseInputPanel.add(internetBillLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, 30));

        internetBillInput.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        expenseInputPanel.add(internetBillInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 340, 40));

        maintenanceBillLabel.setFont(new java.awt.Font("Archivo SemiBold", 0, 15)); // NOI18N
        maintenanceBillLabel.setText("Maintenance bill");
        expenseInputPanel.add(maintenanceBillLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 120, 30));

        maintenanceBillInput.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        expenseInputPanel.add(maintenanceBillInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 340, 40));

        expenseInputLabel.setFont(new java.awt.Font("Archivo SemiBold", 0, 28)); // NOI18N
        expenseInputLabel.setText("Add Expenses");

        addExpenseGoBackButton.setBackground(new java.awt.Color(254, 254, 254));
        addExpenseGoBackButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        addExpenseGoBackButton.setForeground(new java.awt.Color(204, 0, 0));
        addExpenseGoBackButton.setText("Back");
        addExpenseGoBackButton.setFocusable(false);
        addExpenseGoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExpenseGoBackButtonActionPerformed(evt);
            }
        });

        addExpenseButton.setBackground(new java.awt.Color(254, 254, 254));
        addExpenseButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        addExpenseButton.setForeground(new java.awt.Color(0, 153, 0));
        addExpenseButton.setText("Add");
        addExpenseButton.setFocusable(false);
        addExpenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExpenseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expenseInputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(addExpenseGoBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(addExpenseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(expenseInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(expenseInputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expenseInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addExpenseGoBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addExpenseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addExpenseGoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExpenseGoBackButtonActionPerformed
        // TODO add your handling code here:
	dispose();
    }//GEN-LAST:event_addExpenseGoBackButtonActionPerformed

    private void addExpenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExpenseButtonActionPerformed
        // TODO add your handling code here:
	addExpenses();
	
    }//GEN-LAST:event_addExpenseButtonActionPerformed

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
		new AddExpensePage().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addExpenseButton;
    private javax.swing.JButton addExpenseGoBackButton;
    private javax.swing.JSpinner electricBillInput;
    private javax.swing.JLabel electricBillLabel;
    private javax.swing.JLabel expenseInputLabel;
    private javax.swing.JPanel expenseInputPanel;
    private javax.swing.JSpinner internetBillInput;
    private javax.swing.JLabel internetBillLabel;
    private javax.swing.JSpinner maintenanceBillInput;
    private javax.swing.JLabel maintenanceBillLabel;
    private javax.swing.JSpinner waterBillInput;
    private javax.swing.JLabel waterBillLabel;
    // End of variables declaration//GEN-END:variables
}
