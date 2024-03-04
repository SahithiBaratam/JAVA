import java.awt.*;
import java.awt.event.*;
public class TextFieldEx1 extends Frame implements ActionListener 
{
    TextField t1,t2,text;
    Button b;
    TextFieldEx1()
    {
          t1 = new TextField();
          t1.setBounds(50,50,100,130);
          t2 = new TextField();
          t2.setBounds(50,50,100,130);
          text = new TextField();
          text.setBounds(20,100,300,300);
          b=new Button("SUM");
          b.setBounds(50,50,100,130);
          b.addActionListener(this);
          add(t1);
          add(t2);
          add(text);
          add(b);
          setSize(300,300);
          setLayout(null);
          setVisible(true);
    }
    public void actionPerformed(ActionEvent event)
    {
          int n1 = Integer.parseInt(t1.getText());
          int n2 = Integer.parseInt(t2.getText());
          text.setText(" " +(n1 + n2));
    }
    public static void main(String args[])
    {
        new TextFieldEx1();
    }
}