 
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
    boolean string;
    int frageNummer;
    FRAGE frage1;
    

    /**
     * Konstruktor für Objekte der Klasse OBERFLÄCHE
     */
    OBERFLÄCHE()
    {
        frage1=new FRAGE();
        frage1.fragestellung="Welche Farbe hat Gras?";
        frage1.antwortA = "Rot";
        frage1.antwortB = "Grün";
        frage1.antwortC = "Gelb";
        frage1.antwortD = "Infrarot";
        equals(antwortB);
        
        frageNummer = 1;
        fenster = new Frame("OB");
        fenster.setSize(600,400);
        fenster.setLocation(0,30);
        fenster.setVisible(true);
        fenster.setLayout(null);
        
        String[] frage = new String[] 
        {
            "TEst",
            "TEst2"
        };
        
        fragetext = new Label();
        fragetext.setText(frage1.fragestellung);
        fragetext.setVisible(true);
        fragetext.setLocation(100,50);
        fragetext.setSize(400,50);
        fenster.add(fragetext);
    
        
        antwortA = new Button();
        antwortA.setLocation(100,180);
        antwortA.setLabel(frage1.antwortA);
        antwortA.setVisible(true);
        antwortA.setSize(100,30);
        antwortA.setEnabled(true);
        //*Farbe setzen
        antwortA.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               //*if actionPerformed = ("true") boolean 
               //* anwortA.setColour("
               
                
                
        }
        }); 
        fenster.add(antwortA);
        
        antwortB = new Button();
        antwortB.setLocation(400,180);
        antwortB.setLabel(frage1.antwortB);
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
        antwortC.setLabel(frage1.antwortC);
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
        antwortD.setLabel(frage1.antwortD);
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
                
        // frage2=new FRAGE();
        // frage2.fragestellung="Wie hieß das Forschungsschiff von Charles Darwin?";
        // frage2.antwortA = "Dove";
        // frage2.antwortB = "Dolphin";
        // frage2.antwortC = "Beagle";
        // frage2.antwortD = "Calypso";
        
        // frage3=new FRAGE();
        // frage3.fragestellung="Wie heißt das flächenmäßig kleinste Bundesland Deutschlands?";
        // frage3.antwortA = "Berlin";
        // frage3.antwortB = "Bremen";
        // frage3.antwortC = "Saarland";
        // frage3.antwortD = "Hamburg";
        
        // frage4=new FRAGE();
        // frage4.fragestellung="Was bedeutet der lateiniche Ausdruck ´carpe diem´?";
        // frage4.antwortA = "Genieße das Leben";
        // frage4.antwortB = "Nutze den Tag";
        // frage4.antwortC = "Dein Tag wird toll werden";
        // frage4.antwortD = "Man sieht sich immer zweimal im Leben";
        
        
        
        
        
    
}
      //Hintergrund gestallten,färben*/
  
     //*wie verbinde ich frage mit den buttons/Feldern
     //* Wie schaffe ich es dass die Frage + Antwort aufgerufen wird  
      //festlegen wie oft man Joker verwenden kann und was beim Auswählen passiert*/
     //*Startbutton einfügen und überlegen wie Oberfläche entscheidet wann nächste Frage geöffnet oder angezeigt wird
}
   
    