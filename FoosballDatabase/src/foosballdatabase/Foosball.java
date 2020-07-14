package foosballdatabase;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.PopupMenu;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

/**
 *
 * @author Enzo
 */
public class Foosball implements Runnable{

    private JFrame  frame;
    private JPanel  databasesPanel;
    
    public class Database extends JPanel {
    public Database() {
        
        String [][] rec = {
            {"Table Tennis", "15"},
            {"Foosball", "9"},
            {"Rugby", "30"}
        };
        String [] header = {"Sport", "Age"};
        
        JComboBox cmbSport = new JComboBox();
        
        cmbSport.addItem("Table Tennis");
        cmbSport.addItem("Foosball");
        cmbSport.addItem("Rugby");
        
        JTable tblSports = new JTable(rec, header);
        
        JRadioButton rbtAge = new JRadioButton("7 - 13");
        JRadioButton rbtAge1 = new JRadioButton("14 - 17");
        JRadioButton rbtAge2 = new JRadioButton("18 - 25");
        JRadioButton rbtAge3 = new JRadioButton("26 - 40");

        setPreferredSize(new Dimension(1000, 1000));
        add(new JLabel("Foosball Database"));
        add(new JScrollPane(tblSports));
        add(cmbSport);
        add(rbtAge);
        add(rbtAge1);
        add(rbtAge2);
        add(rbtAge3);
    }
}
    
    public class LoginDlg extends JDialog implements ActionListener {
    private JPasswordField  edtPassword;
    private JTextField  edtUsername;

    public LoginDlg(JFrame owner) {
        super(owner, "Login", true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(createLoginPanel(), BorderLayout.CENTER);
        add(createButtonsPanel(), BorderLayout.PAGE_END);
        pack();
        setLocationRelativeTo(owner);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        dispose();
    }

    public String getEdtUsername() {
        return edtUsername.getText();
    }
    
    public String getEdtPassword() {
        return edtPassword.getText();
    }

    private JPanel createButtonsPanel() {
        JPanel buttonsPanel = new JPanel();
        JButton button = new JButton("Login");
        button.addActionListener(this);
        buttonsPanel.add(button);
        return buttonsPanel;
    }

    private JPanel createLoginPanel() {
        JPanel loginPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets.bottom = 5;
        gbc.insets.left = 20;
        gbc.insets.right = 5;
        gbc.insets.top = 20;
        JLabel usrLabel = new JLabel("Username:");
        loginPanel.add(usrLabel, gbc);

        gbc.gridx = 1;
        gbc.insets.left = 5;
        gbc.insets.right = 20;
        edtUsername = new JTextField(15);
        loginPanel.add(edtUsername, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets.bottom = 20;
        gbc.insets.left = 20;
        gbc.insets.right = 5;
        gbc.insets.top = 5;
        JLabel pwLabel = new JLabel("Password");
        loginPanel.add(pwLabel, gbc);

        gbc.gridx = 1;
        gbc.insets.left = 5;
        gbc.insets.right = 20;
        edtPassword = new JPasswordField(15);
        loginPanel.add(edtPassword, gbc);
        return loginPanel;
    }
}
    
    @Override
    public void run() {
        showGui();
    }
    
    private JPanel createDatabasesPanel() {
        databasesPanel = new JPanel(new CardLayout());
        databasesPanel.add(new Database(), "Foosball Database");
        return databasesPanel;
    }
    
    private void showGui() {
        frame = new JFrame("Foosball Database");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(createDatabasesPanel());
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        LoginDlg loginDlg = new LoginDlg(frame);
        
        Boolean login = false;
        
        CardLayout layout = (CardLayout) databasesPanel.getLayout();
        if (loginDlg.getEdtUsername().equals("Michael") && loginDlg.getEdtPassword().equals("MichaelPassword")) {
           login = true;
        }
        if (login) {
        layout.show(databasesPanel, "Foosball Database"); 
        } else if (login == false) {
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
            frame.dispose();
        }     
    }
    
    
    
    
    
  public static void main(String[] args) {
        EventQueue.invokeLater(new Foosball());
    }   
}
