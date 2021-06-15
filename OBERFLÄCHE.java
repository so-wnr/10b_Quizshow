 
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
    Button start;
    Button joker;
    
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
        fragetext.setLocation(100,50);
        fragetext.setSize(400,50);
        fenster.add(fragetext);
        
        antwortA = new Button();
        antwortA.setLocation(100,180);
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
        antwortB.setLocation(400,180);
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
        antwortC.setLocation(100,280);
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
        antwortD.setLocation(400,280);
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
        
        start = new Button();
        start.setLocation(200,150);
        start.setLabel("START");
        start.setVisible(true);
        start.setSize(200,100);
        start.setEnabled(true);
        start.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                 //Hier startet man das Spiel      
                start.setVisible(false);
                
        }
        }); 
        fenster.add(start);
        
        joker= new Button();
        joker.setLocation(500,40);
        joker.setLabel("JOKER");
        joker.setVisible(true);
        joker.setSize(50,50);
        joker.setEnabled(true);
        joker.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                 //Hier wählt man den Joker      
                
                
        }
        }); 
        fenster.add(joker);

        //*Fragenliste
        frage1=new FRAGE();
        frage1.fragestellung="Welche Farbe hat Gras?";
        frage1.antwortA = "Rot";
        frage1.antwortB = "Grün";
        frage1.antwortC = "Gelb";
        frage1.antwortD = "Infrarot";
        
    
}
      //Hintergrund gestallten,färben*/
      //festlegen wie oft man Joker verwenden kann und was beim Auswählen passiert*/
     //*Startbutton einfügen und überlegen wie Oberfläche entscheidet wann nächste Frage geöffnet oder angezeigt wird
}
   
    