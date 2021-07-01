 
import java.awt.*;
import java.awt.event.*;

class OBERFLÄCHE
{
    Frame fenster;
    Label fragetext;

    Label richtige;
    Button antwortA;
    Button antwortB;
    Button antwortC;
    Button antwortD;
    Button naechsteFrage;
    Button start;
    Button joker;
    boolean string;
    FRAGE[] fragen = new FRAGE[2];
    int fragenZaehler;
    int anzahlRichtige;

    //*Button antwortA;
    //Button antwortB;
    //Button antwortC;
    //Button antwortD;
    //Button start;
    //Button joker;
    //boolean string;
    //int frageNummer;
    //FRAGE frage1;
    

    /**
     * Konstruktor für Objekte der Klasse OBERFLÄCHE
     */

    
    private void ladeFragen() {
        
        String fragestellung0 = "Von welchem Kontinent aus begann die Verbreitung des Homo sapiens?";
        String[] antworten0 = new String[] {"Asien", "Afrika", "Amerika", "Europa"};
        fragen[0] = new FRAGE(fragestellung0, antworten0, 0);
        
        String fragestellung1 = "Welche Farbe hat Gras?";
        String[] antworten1 = new String[] {"Rot", "Grün", "Gelb", "Infrarot"};
        fragen[1] = new FRAGE(fragestellung1, antworten1, 1);
        
        String fragestellung2 = "Welches ist das kleinste Bundesland Deutschlands?";
        String[] antworten2 = new String[] {"Berlin", "Bremen", "Saarland", "Hamburg"};
        fragen[2] = new FRAGE(fragestellung2, antworten2, 1);
    }
    
    private void zeigeFrage(int frageNummer) {
        FRAGE frage = fragen[frageNummer];
        fragetext.setText(frage.fragestellung);
        antwortA.setLabel(frage.antworten[0]);
        antwortB.setLabel(frage.antworten[1]);
        antwortC.setLabel(frage.antworten[2]);
        antwortD.setLabel(frage.antworten[3]);
    }
    
    private boolean pruefeFrage(int antwort, int frageNummer) {
        FRAGE frage = fragen[frageNummer];
        if(frage.richtig == antwort) {
            anzahlRichtige++;
            richtige.setText("Anzahl Richtige: " + anzahlRichtige);
            return true;
        } else {
            return false;
        }
    }    
    OBERFLÄCHE()
    {

        
        fenster = new Frame("QUIZ");
        fenster.setSize(600,400);
        fenster.setLocation(0,30);
        fenster.setVisible(true);
        fenster.setLayout(null);
        
        fragetext = new Label();
        fragetext.setVisible(false);
        fragetext.setLocation(100,50);
        fragetext.setSize(400,20);
        fenster.add(fragetext);
        
        richtige = new Label();
        richtige.setText("Anzahl richtige: ");
        richtige.setVisible(false);
        richtige.setLocation(100,75);
        richtige.setSize(400,20);
        fenster.add(richtige);
    
        naechsteFrage = new Button();
        naechsteFrage.setVisible(false);
        naechsteFrage.setLabel("Nächste Frage");
        naechsteFrage.setLocation(100,100);
        naechsteFrage.setSize(100,30);
        naechsteFrage.setEnabled(true);
        naechsteFrage.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fragenZaehler++;
                if(fragenZaehler < fragen.length) {
                    zeigeFrage(fragenZaehler);
                }
                Color standardFarbe = new Color(240, 240, 240);
                antwortA.setBackground(standardFarbe);
                antwortB.setBackground(standardFarbe);
                antwortC.setBackground(standardFarbe);
                antwortD.setBackground(standardFarbe);
                naechsteFrage.setVisible(false);
            }
        });
        fenster.add(naechsteFrage);
        
        antwortA = new Button();
        antwortA.setLocation(100,180);
        antwortA.setVisible(false);
        antwortA.setSize(100,30);
        antwortA.setEnabled(true);
        //*Farbe setzen
        antwortA.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               //*if actionPerformed = ("true") boolean 
               //* anwortA.setColour("
               if(pruefeFrage(0, fragenZaehler)) {
                   antwortA.setBackground(Color.green);
               } else {
                   antwortA.setBackground(Color.red);
               }
               naechsteFrage.setVisible(true);
            }
        }); 
        fenster.add(antwortA);
        
        antwortB = new Button();
        antwortB.setLocation(400,180);
        antwortB.setVisible(false);
        antwortB.setSize(100,30);
        antwortB.setEnabled(true);
        antwortB.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                 if(pruefeFrage(1, fragenZaehler)) {
                   antwortB.setBackground(Color.green);
               } else {
                   antwortB.setBackground(Color.red);
               }
               naechsteFrage.setVisible(true);
                 
            }
        }); 
        fenster.add(antwortB); 
        
        antwortC = new Button();
        antwortC.setLocation(100,280);
        antwortC.setVisible(false);
        antwortC.setSize(100,30);
        antwortC.setEnabled(true);
        antwortC.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                 //Hier wird die Antwort C ausgewählt       
                if(pruefeFrage(2, fragenZaehler)) {
                   antwortC.setBackground(Color.green);
               } else {
                   antwortC.setBackground(Color.red);
               }
               naechsteFrage.setVisible(true);
                
          }
        }); 
        fenster.add(antwortC);
        
        antwortD = new Button();
        antwortD.setLocation(400,280);
        antwortD.setVisible(false);
        antwortD.setSize(100,30);
        antwortD.setEnabled(true);
        antwortD.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                 //Hier wird die Antwort D ausgewählt       
                if(pruefeFrage(3, fragenZaehler)) {
                   antwortD.setBackground(Color.green);
               } else {
                   antwortD.setBackground(Color.red);
               }
               naechsteFrage.setVisible(true);
                
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
                 
                 fragetext.setVisible(true);
                 richtige.setVisible(true);
                 antwortA.setVisible(true);
                 antwortB.setVisible(true);
                 antwortC.setVisible(true);
                 antwortD.setVisible(true);
                 joker.setVisible(true);
                
                 
                 // Starte das Spiel
                 ladeFragen();
                 fragenZaehler = 0;
                 zeigeFrage(fragenZaehler);
        }
        }); 
        fenster.add(start);
        
        joker= new Button();
        joker.setLocation(500,40);
        joker.setLabel("JOKER");
        joker.setVisible(false);
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

        
        
        
   }
}  
        
       