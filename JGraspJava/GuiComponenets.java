import javax.swing.*;

public class GuiComponenets {

   
      static final int EXIT_ON_CLOSE = 1;
      

   public static void main(String[] args) {
   
      JButton ok = new JButton("Ok");
      JButton cancel = new JButton("Cancel");
      
      JLabel name = new JLabel("Enter your name: ");
      
      JTextField textField = new JTextField("Type your name here: ");
      
      JCheckBox bold = new JCheckBox("bold");
      JCheckBox italic = new JCheckBox("italic");
      
      JRadioButton redBtn = new JRadioButton("Red");
      JRadioButton yellowBtn = new JRadioButton("Yellow");
      
      JComboBox schoolyear = new JComboBox(new String[] {"Freshman", "Sophmore", "Junior", "Senior"});
      
      JPanel panel = new JPanel();
         panel.add(ok);
         panel.add(cancel);
         panel.add(name);
         panel.add(textField);
         panel.add(bold);
         panel.add(italic);
         panel.add(redBtn);
         panel.add(yellowBtn);
         panel.add(schoolyear);
         
         
       JFrame frame = new JFrame();
        frame.add(panel);
        frame.setTitle("Show GUI Components");
        frame.setSize(450, 100);
        frame.setLocation(200, 100); 
        frame.setDefaultCloseOperation(1);
        frame.setVisible(true);
   
   
   }


}