 
import java.awt.*;
import java.awt.event.*;

class OBERFLÄCHE
{
    Frame fenster;
    Label fragetext;
    Label fertig;
    
    Label richtige;
    Button antwortA;
    Button antwortB;
    Button antwortC;
    Button antwortD;
    Button naechsteFrage;
    Button start;
    Button joker;
    boolean string;
    
    // Wichtigte Variable in dem Programm
    FRAGE[] fragen = new FRAGE[21];
    
    int fragenZaehler;
    int anzahlRichtige;

 
    int frageNummer;
    FRAGE frage1;
    

    /**
     * Konstruktor für Objekte der Klasse OBERFLÄCHE
     */

    
    private void ladeFragen() {
        
        String fragestellung0 = "Welche Farbe hat das Blut von Perlbooten?";
        String[] antworten0 = new String[] {"Blau", "Gelb", "Grün", "Rot"};
        fragen[0] = new FRAGE(fragestellung0, antworten0, 0);
        
        String fragestellung1 = "Wie hieß die Band, die 'Bohemian Rapsodie' geschrieben hat?";
        String[] antworten1 = new String[] {"Rolling Stones", "Queen", "ACDC", "Metallica"};
        fragen[1] = new FRAGE(fragestellung1, antworten1, 1);
        
        String fragestellung2 = "Welches ist das kleinste Bundesland Deutschlands?";
        String[] antworten2 = new String[] {"Berlin", "Bremen", "Saarland", "Hamburg"};
        fragen[2] = new FRAGE(fragestellung2, antworten2, 1);
        
        String fragestellung3 = "Was bedeutet der lateinische Ausdruck 'carpe diem'?";
        String[] antworten3 = new String[] {"Genieße das Leben", "Dein Tag wird toll werden", "Nutze den Tag", "Sei dir der Sterblichkeit bewusst"};
        fragen[3] = new FRAGE(fragestellung3, antworten3, 2);
        
        String fragestellung4 = "Welcher Pilz ist der giftigste der Welt'?";
        String[] antworten4 = new String[] {"Fliegenpilz", "grüner Knollenblätterpilz", "gemeiner Kartoffelbowist", "Satansröhrling"};
        fragen[4] = new FRAGE(fragestellung4, antworten4, 1);
        
        String fragestellung5 = "Welche Farbe gibt es nicht in der Kampfsportart Karate'?";
        String[] antworten5 = new String[] {"weiß", "schwarz", "grün", "lila"};
        fragen[5] = new FRAGE(fragestellung5, antworten5, 3);
        
        String fragestellung6 = "Welcher dieser Schauspieler verkörperte nie James Bond?";
        String[] antworten6 = new String[] {"Leonardo DiCaprio", "Timothy Dalton", "Daniel Craig", "Jarvier Bardem"};
        fragen[6] = new FRAGE(fragestellung6, antworten6, 0);
              
        String fragestellung7 = "Mit welcher Tiergruppe sind die Dinosaurier am engsten verwandt?";
        String[] antworten7 = new String[] {"Vögel", "Affen", "Eidechsen", "Alligatoren"};
        fragen[7] = new FRAGE(fragestellung7, antworten7, 3);
              
        String fragestellung8 = "Welches Metall leitet Wärme am besten?";
        String[] antworten8 = new String[] {"Silber", "Kupfer", "Aluminium", "Gold"};
        fragen[8] = new FRAGE(fragestellung8, antworten8, 2);
              
        String fragestellung9 = "Wo herrscht kein Linksverkehr?";
        String[] antworten9 = new String[] {"Indien", "Irland", "Island", "Großbritannien"};
        fragen[9] = new FRAGE(fragestellung9, antworten9, 2);
        
        String fragestellung10 = "In welchem Jahr wurde der Euro als Bargeld eingeführt?";
        String[] antworten10 = new String[] {"2000", "2002", "2003", "2005"};
        fragen[10] = new FRAGE(fragestellung10, antworten10, 1);
        
        String fragestellung11 = "Wann endete der 2. Weltkrieg?";
        String[] antworten11 = new String[] {"1945", "1916", "1950", "1935"};
        fragen[11] = new FRAGE(fragestellung11, antworten11, 0);
        
        String fragestellung12 = "In welcher Stadt lebt die Zeichentrick-Familie Simpsons?";
        String[] antworten12 = new String[] {"New York", "Chicago", "Quahog", "Springfield"};
        fragen[12] = new FRAGE(fragestellung12, antworten12, 3);
        
        String fragestellung13 = "Welches dieser Tiere hält keinen Winterschlaf?";
        String[] antworten13 = new String[] {"Eichhörnchen", "Fledermaus", "Igel", "Siebenschläfer"};
        fragen[13] = new FRAGE(fragestellung13, antworten13, 0);
        
        String fragestellung14 = "Wie lautet das chemische Symbol für Blei?";
        String[] antworten14 = new String[] {"Bl", "Pb", "Be", "Pt"};
        fragen[14] = new FRAGE(fragestellung14, antworten14, 1);
        
        String fragestellung15 = "Was ist ein Sonett?";
        String[] antworten15 = new String[] {"eine Stichwaffe", "ein Musikinstrument", "ein Pilz", "eine Gedichtsform"};
        fragen[15] = new FRAGE(fragestellung15, antworten15, 3);
        
        String fragestellung16 = "Welcher Ozean liegt zwischen Europa und Amerika?";
        String[] antworten16 = new String[] {"Atlantischer Ozean", "Indischer Ozean", "Karibisches Meer", "Pazifischer Ozean"};
        fragen[16] = new FRAGE(fragestellung16, antworten16, 0);
        
        String fragestellung17 = "Wie viele Tasten hat ein Klavier?";
        String[] antworten17 = new String[] {"88", "80", "70", "65"};
        fragen[17] = new FRAGE(fragestellung17, antworten17, 0);
        
        String fragestellung18 = "Was ist die Hauptstadt von Portugal?";
        String[] antworten18 = new String[] {"Porto", "Lissabon", "Lago", "Tavira"};
        fragen[18] = new FRAGE(fragestellung18, antworten18, 1);
        
        String fragestellung19 = "Wie viele Herzen hat ein Oktopus?";
        String[] antworten19 = new String[] {"2", "4", "3", "8"};
        fragen[19] = new FRAGE(fragestellung19, antworten19, 2);
        
        String fragestellung20 = "Wie viele Jahre hat Goethe an seinem Werk ´Faust´ gearbeitet?";
        String[] antworten20 = new String[] {"20", "36", "64", "10"};
        fragen[20] = new FRAGE(fragestellung20, antworten20, 1);
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
        Color hintergrundFarbe = new Color(130, 130, 250);
        
        fenster = new Frame("QUIZ");
        fenster.setSize(600,400);
        fenster.setLocation(0,30);
        fenster.setVisible(true);
        fenster.setLayout(null);
        fenster.setBackground(hintergrundFarbe);
        
        fragetext = new Label();
        fragetext.setVisible(false);
        fragetext.setLocation(80,50);
        fragetext.setSize(400,20);
        fenster.add(fragetext);
        
        fertig = new Label();
        fertig.setVisible(false);
        fertig.setLocation(230,150);
        fertig.setSize(400,20);
        fenster.add(fertig);
        
        richtige = new Label();
        richtige.setText("Anzahl richtige: ");
        richtige.setVisible(false);
        richtige.setLocation(80,75);
        richtige.setSize(400,20);
        fenster.add(richtige);
    
        naechsteFrage = new Button();
        naechsteFrage.setVisible(false);
        naechsteFrage.setLabel("Nächste Frage");
        naechsteFrage.setLocation(80,100);
        naechsteFrage.setSize(100,30);
        naechsteFrage.setEnabled(true);
        naechsteFrage.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fragenZaehler++;
                if(fragenZaehler < fragen.length) {
                    zeigeFrage(fragenZaehler);
                } else {
                    fragetext.setVisible(false);
                    richtige.setVisible(false);
                    antwortA.setVisible(false);
                    antwortB.setVisible(false);
                    antwortC.setVisible(false);
                    antwortD.setVisible(false);
                    joker.setVisible(false);
                    
                    fertig.setText("Ende! " + anzahlRichtige + " richtige Antwort(en)");
                    fertig.setVisible(true);
                    fertig.setLocation(220,200);
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
        antwortA.setLocation(80,180);
        antwortA.setVisible(false);
        antwortA.setSize(200,50);
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
        antwortB.setLocation(330,180);
        antwortB.setVisible(false);
        antwortB.setSize(200,50);
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
        antwortC.setLocation(80,280);
        antwortC.setVisible(false);
        antwortC.setSize(200,50);
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
        antwortD.setLocation(330,280);
        antwortD.setVisible(false);
        antwortD.setSize(200,50);
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
        joker.setLocation(490,40);
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
        
       