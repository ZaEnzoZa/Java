 // Java program to illustrate the GridLayout
package gridlayoutdemo;
import javax.swing.*;
import java.awt.*;

// class GridLayout extends JFrame
public class GridLayoutDemo extends JFrame {
    GridLayoutDemo() {
        
        // Creating Object of "GridLayout" class
         GridLayout gridLayout = new GridLayout();
        
         // Creating Object P1 of JPanel class
         JPanel p1 = new JPanel();
         
         // set the layout
         p1.setLayout(gridLayout);
         
         // Creating Object of "FlowLayout" class
         FlowLayout flowLayout = new FlowLayout();
         
         // creating Object P2 of JPanel class
         JPanel p2 = new JPanel();
         
         // set the layout
         p2.setLayout(flowLayout);
         
         // Declaration of objects of JLabel class
         JLabel one, two, three, four;
         
         // Declaration of objects of JTextField class
         JTextField tName, tSalary, tCode, tDesig;
         
         // Declaration of objects of JButton class
         JButton buttonSave, buttonExit;
          
         // Initialization of object
         // "one" of JLabel class
         one= new JLabel("NAME");
           
         // initialization of object
         // "tName" of JTextField class
         tName = new JTextField(20);
           
         // initialization of object
         // "two" of JLabel class
         two = new JLabel("CODE");
         
         // initialization of object
         // "tCode" of JTextField class  
         tCode = new JTextField(20);
         
         // Initialization of object
         // "three" of JLabel class
         three = new JLabel("DESIGNATION");
         
         // initialization of object
         // "tDesig" of JTextField class
         tDesig = new JTextField(20);
         
         // Initialization of object
         // "four" of JLabel class
         four = new JLabel("SALARY");
         
         // initialization of object
         // "tSalary" of JTextField class
         tSalary = new JTextField(20);
         
         // Initialization of object
         // "buttonSave" of JButton class
         buttonSave = new JButton("SAVE");
         
         // Initialization of object
         // "buttonExit" of JButton class
         buttonExit = new JButton("EXIT");
         
         // adding JLabel "one" on JFrame
         p1.add(one);
         
         // adding JTextField "one" on JFrame
         p1.add(tName);
         
         // adding JLabel "one" on JFrame
         p1.add(two);
         
         // adding JTextField "one" on JFrame
         p1.add(tCode);
         
         // adding JLabel "one" on JFrame
         p1.add(three);
         
         // adding JTextField "one" on JFrame
         p1.add(tDesig);
         
         // adding JLabel "one" on JFrame
         p1.add(four);
         
         // adding JTextField "one" on JFrame
         p1.add(tSalary);
         
         // adding JButton "one" on JFrame
         p2.add(buttonSave);
         
         // adding JButton "one" on JFrame
         p2.add(buttonExit);
         
         // add the p1 obkect which
         // refer to the JPanel
         add(p2, "North");
         
         // add the p2 object which
         // refers to the JPanel
         add(p2, "South");
         
         // function to set visible
         // status of JFrame
         setVisible(true);
         
         // this keyword refers to current
         // object. Function to set size of JFrame
         this.setSize(400, 180);
    }
    // main method
    public static void main(String[] args) {
        // calling the constructor
        GridLayoutDemo gridLayoutDemo = new GridLayoutDemo();
    }
    
}
