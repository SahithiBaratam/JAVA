import java.awt.*;
import java.awt.event.*;
public class TextFieldEx extends Frame implements ActionListener
{
    TextField field;
    Label l1,l2;
    TextFieldEx()
    {
        l1 = new Label();
        l1.setBounds(50,50,100,30);
        l2 = new Label();
        l2.setBounds(160,50,100,30);
        field = new TextField();
        field.setBounds(20,100,300,300);
        field.addActionListener(this);
        add(l1);
        add(l2);
        add(field);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String text = field.getText();
        String words[] = text.split("\\s");
        l1.setText("Words = "+words.length);
        l2.setText("Characters = "+text.length());
    }
    public static void main(String args[])
    {
        new TextFieldEx();
    }
}