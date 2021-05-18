
import java.awt.*;
import java.awt.event.*;

class OBERFLÄCHE
{
    Frame fenster;
    Label fragetext;
    Button antwortA;
    Button antwortB;
    Button antwortC;
    Button antwortd;

    /**
     * Constructor for objects of class OBERFLAECHE
     */
    public OBERFLÄCHE()
    {
        fenster = new Frame("OB");
        fenster.setSize(600,400);
        fenster.setLocation(0,30);
        fenster.setVisible(true);
        fenster.setLayout(null);
        
        fragetext = new Label();
        fragetext.setText("Hier steht später die Frage und ggf. die Antworten.");
        fragetext.setVisible(true);
        fragetext.setLocation(200,50);
        fragetext.setSize(400,50);
        fenster.add(fragetext);
        
        antwortA = new Button();
        antwortA.setLocation(10,250);
        antwortA.setLabel("A");
        antwortA.setVisible(true);
        antwortA.setSize(100,30);
        antwortA.setEnabled(true);
        antwortA.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Hier wird Frage A ausgewählt
            }
        });
        fenster.add(antwortA);
        
        fenster.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(1);
            }
        });
    }
}

