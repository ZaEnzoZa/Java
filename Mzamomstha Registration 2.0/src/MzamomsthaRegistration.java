/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

public class MzamomsthaRegistration extends javax.swing.JFrame implements Runnable{  
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    
    private JFrame frame;
    private JPanel databasesPanel;
    JTable tblTeacher = new JTable();
    JTable tblParent = new JTable();
    JTable tblLearner = new JTable();
    
    
    public class TeacherDb extends JPanel {
        public TeacherDb() {
            
            JPanel leftPanel = new JPanel();
            BoxLayout leftPanelBoxLayout = new BoxLayout(leftPanel, BoxLayout.Y_AXIS);
            leftPanel.setLayout(leftPanelBoxLayout); 
            
            JPanel centerPanel = new JPanel();
            BoxLayout centerPanelBoxLayout = new BoxLayout(centerPanel, BoxLayout.Y_AXIS);
            centerPanel.setLayout(centerPanelBoxLayout);
            
            JPanel topPanel = new JPanel();
            BoxLayout topPanelBoxLayout = new BoxLayout(topPanel, BoxLayout.Y_AXIS);
            topPanel.setLayout(topPanelBoxLayout);
            
            JPanel buttonPanel = new JPanel();
            BoxLayout buttonPanelBoxLayout = new BoxLayout(buttonPanel, BoxLayout.X_AXIS);
            buttonPanel.setLayout(buttonPanelBoxLayout);
            
            JPanel tablePanel = new JPanel();
            BoxLayout tablePanelBoxLayout = new BoxLayout(tablePanel, BoxLayout.Y_AXIS);
            tablePanel.setLayout(tablePanelBoxLayout);
            
            BoxLayout mainPanelLayout = new BoxLayout(this, BoxLayout.X_AXIS);
            
            JLabel teacherLabel = new JLabel();
            teacherLabel.setText("Teacher Database");
            
            JButton parentButton = new JButton();
            parentButton.setText("Parent Database");
            
            JButton learnerButton = new JButton();
            learnerButton.setText("Learner Database");
            
            JButton addUserButton = new JButton();
            addUserButton.setText("Add User Page");
            
            JComboBox subjects = new JComboBox();
            subjects.setSize(100, 50);
            subjects.addItem("Afrikaans");
            subjects.addItem("English");
            subjects.addItem("mathematics Lit.");
            subjects.addItem("Mathematics");
            subjects.addItem("Life Skills");
            subjects.addItem("Arts");
            subjects.addItem("Drama");
            subjects.addItem("IT");
            
            JRadioButton sixToNine = new JRadioButton();
            sixToNine.setText("6 - 9");
            
            JRadioButton tenToFourteen = new JRadioButton();
            tenToFourteen.setText("10 -14");
            
            JRadioButton fifteenToSeventeen = new JRadioButton();
            fifteenToSeventeen.setText("15 - 17");
            
            JButton buttonSort = new JButton();
            buttonSort.setText("Sort");
            
            
//            int n = JOptionPane.showConfirmDialog(
//            frame,
//            "Do you want to set a background for the Database Panel?",
//            "Background",
//            JOptionPane.YES_NO_OPTION);
//            
//            JFileChooser chooser = new JFileChooser();
//            chooser.showOpenDialog(null);
//            File f = chooser.getSelectedFile();
//            String filePath = f.getAbsolutePath();
//            JOptionPane.showMessageDialog(null, "The path you selected was: "+ filePath);
//            JLabel image = new JLabel("", new ImageIcon(filePath), JLabel.CENTER);
//            image.setPreferredSize(new Dimension(900, 400));

  
//            JOptionPane.showMessageDialog(null, "The Backround function will be implemented at a later stage");

            
            setPreferredSize(new Dimension(1000, 500));
            setLayout(mainPanelLayout);
            add(leftPanel);
            add(centerPanel);

            centerPanel.add(topPanel);
            topPanel.add(teacherLabel);
            centerPanel.add(buttonPanel);
            centerPanel.add(tablePanel);  
            buttonPanel.add(learnerButton);
            buttonPanel.add(parentButton);
            buttonPanel.add(addUserButton);
            tablePanel.add(new JScrollPane(tblTeacher));
            leftPanel.add(new JLabel("Sort By"));   
            leftPanel.add(new JLabel("Subjects"));
            leftPanel.add(subjects);
            leftPanel.add(new JLabel("Age Group & Phases"));
            leftPanel.add(sixToNine);
            leftPanel.add(tenToFourteen);
            leftPanel.add(fifteenToSeventeen);
            leftPanel.add(buttonSort);
//            add(image, BorderLayout.CENTER);
//            revalidate(); 
//            repaint();
            setVisible(true);
            pack();
            
            learnerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnerButtonActionPerformed(evt);
            }
            });
            
            parentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentButtonActionPerformed(evt);
            }
            }); 
            
            addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
            });
            
    }
    }
    
    //display teacher database data into JTable
    private void updateTeacherTable() {
        try {
            String sql = "SELECT * FROM teacher";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tblTeacher.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(MzamomsthaRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //end of JTable display magic
    
    public class LearnerDb extends JPanel {
        public LearnerDb() {
            JPanel leftPanel = new JPanel();
            BoxLayout leftPanelBoxLayout = new BoxLayout(leftPanel, BoxLayout.Y_AXIS);
            leftPanel.setLayout(leftPanelBoxLayout); 
            
            JPanel centerPanel = new JPanel();
            BoxLayout centerPanelBoxLayout = new BoxLayout(centerPanel, BoxLayout.Y_AXIS);
            centerPanel.setLayout(centerPanelBoxLayout);
            
            JPanel topPanel = new JPanel();
            BoxLayout topPanelBoxLayout = new BoxLayout(topPanel, BoxLayout.Y_AXIS);
            topPanel.setLayout(topPanelBoxLayout);
            
            JPanel buttonPanel = new JPanel();
            BoxLayout buttonPanelBoxLayout = new BoxLayout(buttonPanel, BoxLayout.X_AXIS);
            buttonPanel.setLayout(buttonPanelBoxLayout);
            
            JPanel tablePanel = new JPanel();
            BoxLayout tablePanelBoxLayout = new BoxLayout(tablePanel, BoxLayout.Y_AXIS);
            tablePanel.setLayout(tablePanelBoxLayout);
            
            BoxLayout mainPanelLayout = new BoxLayout(this, BoxLayout.X_AXIS);
            
            JLabel teacherLabel = new JLabel();
            teacherLabel.setText("Learner Database");
            
            JButton parentButton = new JButton();
            parentButton.setText("Parent Database");
            
            JButton teacherButton = new JButton();
            teacherButton.setText("Teacher Database");
            
            JButton addUserButton = new JButton();
            addUserButton.setText("Add User Page");
            
            JComboBox subjects = new JComboBox();
            subjects.setSize(100, 50);
            subjects.addItem("Afrikaans");
            subjects.addItem("English");
            subjects.addItem("mathematics Lit.");
            subjects.addItem("Mathematics");
            subjects.addItem("Life Skills");
            subjects.addItem("Arts");
            subjects.addItem("Drama");
            subjects.addItem("IT");
            
            JRadioButton sixToNine = new JRadioButton();
            sixToNine.setText("6 - 9");
            
            JRadioButton tenToFourteen = new JRadioButton();
            tenToFourteen.setText("10 -14");
            
            JRadioButton fifteenToSeventeen = new JRadioButton();
            fifteenToSeventeen.setText("15 - 17");
            
            JButton buttonSort = new JButton();
            buttonSort.setText("Sort");
            
            setPreferredSize(new Dimension(1000, 500));
            setLayout(mainPanelLayout);
            add(leftPanel);
            add(centerPanel);
            centerPanel.add(topPanel);
            topPanel.add(teacherLabel);
            centerPanel.add(buttonPanel);
            centerPanel.add(tablePanel);  
            buttonPanel.add(teacherButton);
            buttonPanel.add(parentButton);
            buttonPanel.add(addUserButton);
            tablePanel.add(new JScrollPane(tblLearner));
            leftPanel.add(new JLabel("Sort By"));   
            leftPanel.add(new JLabel("Subjects"));
            leftPanel.add(subjects);
            leftPanel.add(new JLabel("Age Group & Phases"));
            leftPanel.add(sixToNine);
            leftPanel.add(tenToFourteen);
            leftPanel.add(fifteenToSeventeen);
            leftPanel.add(buttonSort);
            setVisible(true);
            pack();
            
            teacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherButtonActionPerformed(evt);
            }
            });
            
            parentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentButtonActionPerformed(evt);
            }
            });
            
            addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
            });
            
        }
    }
    
    //display learner database data into JTable
    private void updateLearnerTable() {
        try {
            String sql = "SELECT * FROM learner";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tblLearner.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(MzamomsthaRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //end of JTable display magic
    
    public class ParentDb extends JPanel {
        public ParentDb() {
            JPanel leftPanel = new JPanel();
            BoxLayout leftPanelBoxLayout = new BoxLayout(leftPanel, BoxLayout.Y_AXIS);
            leftPanel.setLayout(leftPanelBoxLayout); 
            
            JPanel centerPanel = new JPanel();
            BoxLayout centerPanelBoxLayout = new BoxLayout(centerPanel, BoxLayout.Y_AXIS);
            centerPanel.setLayout(centerPanelBoxLayout);
            
            JPanel topPanel = new JPanel();
            BoxLayout topPanelBoxLayout = new BoxLayout(topPanel, BoxLayout.Y_AXIS);
            topPanel.setLayout(topPanelBoxLayout);
            
            JPanel buttonPanel = new JPanel();
            BoxLayout buttonPanelBoxLayout = new BoxLayout(buttonPanel, BoxLayout.X_AXIS);
            buttonPanel.setLayout(buttonPanelBoxLayout);
            
            JPanel tablePanel = new JPanel();
            BoxLayout tablePanelBoxLayout = new BoxLayout(tablePanel, BoxLayout.Y_AXIS);
            tablePanel.setLayout(tablePanelBoxLayout);
            
            BoxLayout mainPanelLayout = new BoxLayout(this, BoxLayout.X_AXIS);
            
            JLabel teacherLabel = new JLabel();
            teacherLabel.setText("Parent Database");
            
            JButton teacherButton = new JButton();
            teacherButton.setText("Teacher Database");
            
            JButton learnerButton = new JButton();
            learnerButton.setText("Learner Database");
            
            JButton addUserButton = new JButton();
            addUserButton.setText("Add User Page");
            
            JComboBox subjects = new JComboBox();
            subjects.setSize(100, 50);
            subjects.addItem("Afrikaans");
            subjects.addItem("English");
            subjects.addItem("mathematics Lit.");
            subjects.addItem("Mathematics");
            subjects.addItem("Life Skills");
            subjects.addItem("Arts");
            subjects.addItem("Drama");
            subjects.addItem("IT");
            
            JRadioButton sixToNine = new JRadioButton();
            sixToNine.setText("6 - 9");
            
            JRadioButton tenToFourteen = new JRadioButton();
            tenToFourteen.setText("10 -14");
            
            JRadioButton fifteenToSeventeen = new JRadioButton();
            fifteenToSeventeen.setText("15 - 17");
            
            JButton buttonSort = new JButton();
            buttonSort.setText("Sort");
            
            setPreferredSize(new Dimension(500, 500));
            setLayout(mainPanelLayout);
            add(leftPanel);
            add(centerPanel);
            centerPanel.add(topPanel);
            topPanel.add(teacherLabel);
            centerPanel.add(buttonPanel);
            centerPanel.add(tablePanel);  
            buttonPanel.add(learnerButton);
            buttonPanel.add(teacherButton);
            buttonPanel.add(addUserButton);
            tablePanel.add(new JScrollPane(tblParent));
            leftPanel.add(new JLabel("Sort By"));   
            leftPanel.add(new JLabel("Subjects"));
            leftPanel.add(subjects);
            leftPanel.add(new JLabel("Age Group & Phases"));
            leftPanel.add(sixToNine);
            leftPanel.add(tenToFourteen);
            leftPanel.add(fifteenToSeventeen);
            leftPanel.add(buttonSort);
            setVisible(true);
            pack();
            
            learnerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnerButtonActionPerformed(evt);
            }
            });
            
            teacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherButtonActionPerformed(evt);
            }
            });
            
            addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
            });
            
        }
    }    
    
    //display parent database data into JTable
    private void updateParentTable() {
        try {
            String sql = "SELECT * FROM parent";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tblParent.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(MzamomsthaRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //end of JTable display magic
    
    public class AddUserPage extends JPanel {
        public AddUserPage() {
            SpringLayout layout = new SpringLayout();
            
//            JPanel rightPanel = new JPanel();
//            BoxLayout rightPanelBoxLayout = new BoxLayout(rightPanel, BoxLayout.Y_AXIS);
//            rightPanel.setLayout(rightPanelBoxLayout);
//            
//            JPanel leftPanel = new JPanel();
//            BoxLayout leftPanelBoxLayout = new BoxLayout(leftPanel, BoxLayout.Y_AXIS);
//            leftPanel.setLayout(leftPanelBoxLayout);
            
            JTextField edtID = new JTextField("");
            JTextField edtName = new JTextField("");
            JTextField edtSurname = new JTextField("");
            JTextField edtGender = new JTextField("");
            JTextField edtDoB = new JTextField("");
            JTextField edtNumber = new JTextField("");
            JTextField edtChildID = new JTextField("");
            JTextField edtEmail = new JTextField("");
            
            JLabel lblID = new JLabel();
            lblID.setText("ID:");
            JLabel lblName = new JLabel();
            lblName.setText("Name:");
            JLabel lblSurname = new JLabel();
            lblSurname.setText("Surname:");
            JLabel lblGender = new JLabel();
            lblGender.setText("Gender:");
            JLabel lblDoB = new JLabel();
            lblDoB.setText("Date of Birth:");
            JLabel lblNumber = new JLabel();
            lblNumber.setText("Cell Phone Number:");
            JLabel lblChildID = new JLabel();
            lblChildID.setText("Child ID:");
            JLabel lblEmail = new JLabel();
            lblEmail.setText("Email Address:");
            
            JButton addUser = new JButton();
            addUser.setText("Add User");
            
            JButton deleteUser = new JButton();
            deleteUser.setText("Delete User");
            
//            layout.putConstraint(SpringLayout.EAST, this, 5, SpringLayout.EAST, edtEmail);
            
            layout.putConstraint(SpringLayout.WEST, lblID, 5, SpringLayout.WEST, this);
            layout.putConstraint(SpringLayout.NORTH, lblID, 5, SpringLayout.NORTH, this);
            layout.putConstraint(SpringLayout.WEST, edtID, 5, SpringLayout.EAST, lblID);
            layout.putConstraint(SpringLayout.NORTH, edtID, 5, SpringLayout.NORTH, this);
            
            layout.putConstraint(SpringLayout.WEST, lblName, 5, SpringLayout.WEST, this);
            layout.putConstraint(SpringLayout.NORTH, lblName, 5, SpringLayout.SOUTH, lblID);
            layout.putConstraint(SpringLayout.WEST, edtName, 5, SpringLayout.EAST, lblName);
            layout.putConstraint(SpringLayout.NORTH, edtName, 5, SpringLayout.SOUTH, edtID);
            
            layout.putConstraint(SpringLayout.WEST, lblSurname, 5, SpringLayout.WEST, this);
            layout.putConstraint(SpringLayout.NORTH, lblSurname, 5, SpringLayout.SOUTH, lblName);
            layout.putConstraint(SpringLayout.WEST, edtSurname, 5, SpringLayout.EAST, lblSurname);
            layout.putConstraint(SpringLayout.NORTH, edtSurname, 5, SpringLayout.SOUTH, edtName);
            
            layout.putConstraint(SpringLayout.WEST, lblGender, 5, SpringLayout.WEST, this);
            layout.putConstraint(SpringLayout.NORTH, lblGender, 5, SpringLayout.SOUTH, lblSurname);
            layout.putConstraint(SpringLayout.WEST, edtGender, 5, SpringLayout.EAST, lblGender);
            layout.putConstraint(SpringLayout.NORTH, edtGender, 5, SpringLayout.SOUTH, edtSurname);
            
            layout.putConstraint(SpringLayout.WEST, lblDoB, 5, SpringLayout.WEST, this);
            layout.putConstraint(SpringLayout.NORTH, lblDoB, 5, SpringLayout.SOUTH, lblGender);
            layout.putConstraint(SpringLayout.WEST, edtDoB, 5, SpringLayout.EAST, lblDoB);
            layout.putConstraint(SpringLayout.NORTH, edtDoB, 5, SpringLayout.SOUTH, edtGender);
            
            layout.putConstraint(SpringLayout.WEST, lblNumber, 5, SpringLayout.WEST, this);
            layout.putConstraint(SpringLayout.NORTH, lblNumber, 5, SpringLayout.SOUTH, lblDoB);
            layout.putConstraint(SpringLayout.WEST, edtNumber, 5, SpringLayout.EAST, lblNumber);
            layout.putConstraint(SpringLayout.NORTH, edtNumber, 5, SpringLayout.SOUTH, edtDoB);
            
            layout.putConstraint(SpringLayout.WEST, lblChildID, 5, SpringLayout.WEST, this);
            layout.putConstraint(SpringLayout.NORTH, lblChildID, 5, SpringLayout.SOUTH, lblNumber);
            layout.putConstraint(SpringLayout.WEST, edtChildID, 5, SpringLayout.EAST, lblChildID);
            layout.putConstraint(SpringLayout.NORTH, edtChildID, 5, SpringLayout.SOUTH, edtNumber);
            
            layout.putConstraint(SpringLayout.WEST, lblEmail, 5, SpringLayout.WEST, this);
            layout.putConstraint(SpringLayout.NORTH, lblEmail, 5, SpringLayout.SOUTH, lblChildID);
            layout.putConstraint(SpringLayout.WEST, edtEmail, 5, SpringLayout.EAST, lblEmail);
            layout.putConstraint(SpringLayout.NORTH, edtEmail, 5, SpringLayout.SOUTH, edtChildID);
            
            setPreferredSize(new Dimension(1000, 300));
            setLayout(layout);
            add(lblID);
            add(edtID);
            add(lblName);
            add(edtName);
            add(lblSurname);
            add(edtSurname);
            add(lblGender);
            add(edtGender);
            add(lblDoB);
            add(edtDoB);
            add(lblNumber);
            add(edtNumber);
            add(lblChildID);
            add(edtChildID);
            add(lblEmail);
            add(edtEmail);
            pack();
            setVisible(true);
            
        
        }
    }
    
    public class UnknownDb extends JPanel {
        public UnknownDb() {
            setPreferredSize(new Dimension(1000, 500));
        }
    }

    public MzamomsthaRegistration(JFrame frame, JPanel databasesPanel) throws HeadlessException {
        this.frame = frame;
        this.databasesPanel = databasesPanel;
    }
    
    
    
//    all buttons actions
        private void learnerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
            CardLayout layout = (CardLayout) databasesPanel.getLayout();
            
            layout.show(databasesPanel, "learner");
            updateLearnerTable();
        }
        
        private void parentButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
            CardLayout layout = (CardLayout) databasesPanel.getLayout();
            
            layout.show(databasesPanel, "parent");
            updateParentTable();
        }
        
        private void teacherButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
            CardLayout layout = (CardLayout) databasesPanel.getLayout();
            
            layout.show(databasesPanel, "teacher");
            updateTeacherTable();
        }
        
        private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
            CardLayout layout = (CardLayout) databasesPanel.getLayout();
            
            layout.show(databasesPanel, "addUser");
        }
//   end of all buttons actions 
      
    
    
    @Override
    public void run() {
        showGui();
    }

    private JPanel createDatabasesPanel() {
        databasesPanel = new JPanel(new CardLayout());
        databasesPanel.add(new UnknownDb(), "unknown");
        databasesPanel.add(new LearnerDb(), "learner");
        databasesPanel.add(new ParentDb(), "parent");
        databasesPanel.add(new TeacherDb(), "teacher");
        databasesPanel.add(new AddUserPage(), "addUser");
        return databasesPanel;
    }

    private void showGui() {
        frame = new JFrame("Database");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(createDatabasesPanel());
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        LoginDlg loginDlg = new LoginDlg(frame);
        Boolean loginLearner = false;
        Boolean loginTeacher = false;
        Boolean loginParent = false;
        Boolean commonLogin = false;
        
        CardLayout layout = (CardLayout) databasesPanel.getLayout();
    
        if (loginDlg.getEdtUsername().equals("Enzo") && loginDlg.getEdtPassword().equals("EnzoPassword")) {
           loginLearner = true;
           commonLogin = true;
        } else if (loginDlg.getEdtUsername().equals("1") && loginDlg.getEdtPassword().equals("2")) {
            loginTeacher = true;
            commonLogin = true;
        }else if (loginDlg.getEdtUsername().equals("Sharon") && loginDlg.getEdtPassword().equals("SharonPassword")) {
            loginParent = true;
            commonLogin = true;
        } else if (loginDlg.getEdtUsername().equals("add") && loginDlg.getEdtPassword().equals("add")) {
            commonLogin = true;
            layout.show(databasesPanel, "addUser");
        }
        
        
        if (loginLearner) {
            layout.show(databasesPanel, "learner");
            updateLearnerTable();
        } else if (loginTeacher) {
            layout.show(databasesPanel, "teacher");
            updateTeacherTable();
        } else if (loginParent) {
            layout.show(databasesPanel, "parent");
            updateParentTable();
        }      
        if (commonLogin == false) {
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
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
    
    
    /**
     * Creates new form MzamomsthaRegistration
     */
    public MzamomsthaRegistration() {
        initComponents();
        try {
            conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/mzamomtsha_registration","root", "root");
        } catch (SQLException e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MzamomsthaRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MzamomsthaRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MzamomsthaRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MzamomsthaRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new MzamomsthaRegistration());
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
