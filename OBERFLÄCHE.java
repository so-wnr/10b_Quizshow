
import java.awt.*;
import java.awt.event.*;

class OBERFLÄCHE
{
    Frame fenster;
    Label fragetext;
    Button antwortA;
    Button antwortB;
    Button antwortC;
    Button antwortD;
    
    FRAGE frage1;
    

    /**
     * Konstruktor für Objekte der Klasse OBERFLÄCHE
     */
    OBERFLÄCHE()
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
                 //Hier wird die Antwort A ausgewählt       
                
                
        }
        }); 
        fenster.add(antwortA);
        
        antwortB = new Button();
        antwortB.setLocation(30,100);
        antwortB.setLabel("B");
        antwortB.setVisible(true);
        antwortB.setSize(100,30);
        antwortB.setEnabled(true);
        antwortB.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                 //Hier wird die Antwort B ausgewählt       
                
                
        }
        }); 
        fenster.add(antwortB); 
        
        antwortC = new Button();
        antwortC.setLocation(60,150);
        antwortC.setLabel("C");
        antwortC.setVisible(true);
        antwortC.setSize(100,30);
        antwortC.setEnabled(true);
        antwortC.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                 //Hier wird die Antwort C ausgewählt       
                
                
          }
        }); 
        fenster.add(antwortC);
        
        antwortD = new Button();
        antwortD.setLocation(40,120);
        antwortD.setLabel("D");
        antwortD.setVisible(true);
        antwortD.setSize(100,30);
        antwortD.setEnabled(true);
        antwortD.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                 //Hier wird die Antwort D ausgewählt       
                
                
        }
        }); 
        fenster.add(antwortD);
        
        //*Fragenliste
        frage1=new FRAGE();
        frage1.fragestellung="Welche Farbe hat Gras?";
        frage1.antwortA = "Rot";
        frage1.antwortB = "Grün";
        frage1.antwortC = "Gelb";
        frage1.antwortD = "Infrarot";
        
    
}
     /*Labels an einen schönen Platz tun und groß genug machen */
     //*Startbutton einfügen und überlegen wie Oberfläche entscheidet wann nächste Frage geöffnet oder angezeigt wird
}
   
    