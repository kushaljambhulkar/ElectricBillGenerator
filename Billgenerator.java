import java.awt.*;
import java .awt.event.*;

public class Billgenerator extends Frame implements ActionListener
{
  Button b1;
  TextField t1;
  TextField t2;
  Frame mainFrame;
  Label headerLabel;
  Label statusLabel;
  Panel controlPanel;
  int ino1;
  int ino2;
  int iRet;
  int iAns;
  String s1;
  String s2;
  String s3;

public Billgenerator(String str, int x, int y)
{
    super();
    setTitle(str);
    setSize(x,y);

    addWindowListener(new WindowAdapter()
     {
        public void windowClosing(WindowEvent windowEvent)
        {
            System.exit(0);
        }
     });

     Font fnn = new Font("Calibri",Font.BOLD,20);
     b1 = new Button("Generat");
     t1 = new TextField();
     t2 = new TextField();
     headerLabel = new Label();
     headerLabel.setAlignment(Label.CENTER);
     headerLabel.setFont(fnn);

     Font fn = new Font("Arial Black",Font.BOLD,20);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setFont(fn);
        statusLabel.setSize(350,100);
       
        

     statusLabel = new Label();
     b1.setBounds(210,200,100,50);
     b1.setBackground(Color.LIGHT_GRAY);
     t1.setBounds(130,100,100,50);
     t1.setBackground(Color.BLUE);
    
     t2.setBounds(290,100,100,50);
     t2.setBackground(Color.MAGENTA);
     
     headerLabel.setBounds(100,400,300,50);
     add(t1);
     add(t2);
     add(b1);
    

     add(headerLabel);
     add(statusLabel);
     

     b1.addActionListener(this);
     
     setLayout(null);
     /*statusLabel name = new Label("Last");
     name.setBounds(100,100,100,10);
     add(name);*/
     setVisible(true);
    
  }

  public static void main(String[] args)
  {
      Billgenerator obj = new Billgenerator("Bill Generator",500,500);
      obj.Display();
  }

  private void Display()
  {
      headerLabel.setText("Electric Bill Generator");

      Button Start = new Button("Start\n");

      Start.setActionCommand("Start");

      Start.addActionListener(new MyListener());

      controlPanel.add(Start);

      mainFrame.setVisible(true);
  }

  public class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
      {
          String command = e.getActionCommand();
          if(command.equals("Start"))
          {
              statusLabel.setText("Please Enter Last Month Unit");
          }
      }
  }

  public void actionPerformed(ActionEvent e)
  {
      String command = e.getActionCommand();
      if(command.equals("Generat"))
      {
          s1 = t1.getText();
          s2 = t2.getText();

          ino1 = Integer.parseInt(s1);
          ino2 = Integer.parseInt(s2);

          iRet = ino1 - ino2;

          iAns = iRet * 9;

          s3 = Integer.toString(iAns);
          
          headerLabel.setText("Total Amount is : "+s3);
      }
  }

}

