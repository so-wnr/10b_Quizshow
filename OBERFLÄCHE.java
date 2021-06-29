 
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
        mu
        
        
        fragex=new FRAGE();
        fragex.fragestellung="?";
        fragex.antwortA = "";
        fragex.antwortB = "";
        fragex.antwortC = "";
        fragex.antwortD = "";
        
        frage2=new FRAGE();
        frage2.fragestellung="Wie hieß das Forschungsschiff von Charles Darwin?";
        frage2.antwortA = "Dove";
        frage2.antwortB = "Dolphin";
        frage2.antwortC = "Beagle";
        frage2.antwortD = "Calypso";
        
        frage3=new FRAGE();
        frage3.fragestellung="Wie heißt das flächenmäßig kleinste Bundesland Deutschlands?";
        frage3.antwortA = "Berlin";
        frage3.antwortB = "Bremen";
        frage3.antwortC = "Saarland";
        frage3.antwortD = "Hamburg";
        
        frage4=new FRAGE();
        frage4.fragestellung="Was bedeutet der lateiniche Ausdruck ´carpe diem´?";
        frage4.antwortA = "Genieße das Leben";
        frage4.antwortB = "Nutze den Tag";
        frage4.antwortC = "Dein Tag wird toll werden";
        frage4.antwortD = "Man sieht sich immer zweimal im Leben";
        
        frage5=new FRAGE();
        frage5.fragestellung="Welcher Pilz ist einer der giftigsten der Welt?";
        frage5.antwortA = "Der Fliegenpilz";
        frage5.antwortB = "Der Grüne Knollenblätterpilz";
        frage5.antwortC = "Der Gemeine Kartoffelbowist";
        frage5.antwortD = "Der Satansröhrling";
        
        frage6=new FRAGE();
        frage6.fragestellung="Welche Gürtelfarbe existiert nicht im Kapmfsport Karate?";
        frage6.antwortA = "Schwarz";
        frage6.antwortB = "Weiß";
        frage6.antwortC = "Braun";
        frage6.antwortD = "Rot";
        
        frage7=new FRAGE();
        frage7.fragestellung="Einen Feinschmecker nennt man auch?";
        frage7.antwortA = "Gourmet";
        frage7.antwortB = "Gourmed";
        frage7.antwortC = "Genießer";
        frage7.antwortD = "Leckermäulchen";
        
        frage8=new FRAGE();
        frage8.fragestellung="Welcher Schauspieler hat nicht in einem James Bond-Film mitgespielt?";
        frage8.antwortA = "Timothy Dalton";
        frage8.antwortB = "Leonardo DiCaprio";
        frage8.antwortC = "Daniel Craig";
        frage8.antwortD = "Javier Bardem";
        
        frage9=new FRAGE();
        frage9.fragestellung="Mit welcher Tiergruppe sind die Dinosaurier am engsten verwandt?";
        frage9.antwortA = "Vögel";
        frage9.antwortB = "Eidechsen";
        frage9.antwortC = "Alligatoren";
        frage9.antwortD = "Affen";
        
        frage10=new FRAGE();
        frage10.fragestellung="Welches Metall leitet Wärme am besten?";
        frage10.antwortA = "Silber";
        frage10.antwortB = "Kupfer";
        frage10.antwortC = "Gold";
        frage10.antwortD = "Aluminium,";
        
        frage11=new FRAGE();
        frage11.fragestellung="Wo herrscht kein Linksverkehr?";
        frage11.antwortA = "Irland";
        frage11.antwortB = "Indien";
        frage11.antwortC = "Island";
        frage11.antwortD = "Großbritannien";
        
        frage12=new FRAGE();
        frage12.fragestellung="Wie lange geht ein Marathon?";
        frage12.antwortA = "10Kilometer";
        frage12.antwortB = "25 Kilometer";
        frage12.antwortC = "42,195 Kilometer";
        frage12.antwortD = "1000 Meter";
        
        frage13=new FRAGE();
        frage13.fragestellung="In welchem Jahr wurde der Euro als Bargeld eingeführt?";
        frage13.antwortA = "2000";
        frage13.antwortB = "2002";
        frage13.antwortC = "2003";
        frage13.antwortD = "2005";
        
        frage14=new FRAGE();
        frage14.fragestellung="Welches Vitamin wird mithilfe von Sonnenlicht im Körper gebildet?";
        frage14.antwortA = "Vitamin C";
        frage14.antwortB = "Vitamin E";
        frage14.antwortC = "Vitamin D";
        frage14.antwortD = "Vitamin A";
        
        frage15=new FRAGE();
        frage15.fragestellung="Wann endete der 2. Weltkrieg?";
        frage15.antwortA = "1916";
        frage15.antwortB = "1945";
        frage15.antwortC = "1950";
        frage15.antwortD = "1935";

        frage16=new FRAGE();
        frage16.fragestellung="In welcher Stadt lebt die Zeichentrick-Familie Simpsons?";
        frage16.antwortA = "New York";
        frage16.antwortB = "Springfield";
        frage16.antwortC = "Chicago";
        frage16.antwortD = "Minnesota";
        
        frage17=new FRAGE();
        frage17.fragestellung="Welches dieser Tiere hält keinen Winterschlaf?";
        frage17.antwortA = "Eichhörnchen";
        frage17.antwortB = "Fledermaus";
        frage17.antwortC = "Igel";
        frage17.antwortD = "Siebenschläfer";
        
        frage18=new FRAGE();
        frage18.fragestellung="Wer gilt als Verfasser der amerikanischen Unabhängigkeitserklärung?";
        frage18.antwortA = "Thomas Jefferson";
        frage18.antwortB = "Benjamin Franklin";
        frage18.antwortC = "George Washington";
        frage18.antwortD = "John Adams";
        
        frage19=new FRAGE();
        frage19.fragestellung="Wie lautet das chemische Symbol für Blei?";
        frage19.antwortA = "Bl";
        frage19.antwortB = "Pb";
        frage19.antwortC = "Be";
        frage19.antwortD = "Pt";
        
        frage20=new FRAGE();
        frage20.fragestellung="Was ist ein Sonett?";
        frage20.antwortA = "Eine Stichwaffe";
        frage20.antwortB = "Ein Musikinstrument";
        frage20.antwortC = "Ein Pilz";
        frage20.antwortD = "Eine Gedichtsform";

        frage21=new FRAGE();
        frage21.fragestellung="Welcher Ozean liegt zwischen Europa und Amerika?";
        frage21.antwortA = "Atlantischer Ozean";
        frage21.antwortB = "Indischer Ozean";
        frage21.antwortC = "Karibisches Meer";
        frage21.antwortD = "Pazifischer Ozean";
        
        frage22=new FRAGE();
        frage22.fragestellung="Wer schrieb die Harry Potter Bücher?";
        frage22.antwortA = "E.L. James";
        frage22.antwortB = "J.R.R. Tolkien";
        frage22.antwortC = "George R.R. Martin";
        frage22.antwortD = "Joanne K. Rowling";
        
        frage23=new FRAGE();
        frage23.fragestellung="Wie viele Tasten hat ein Klavier?";
        frage23.antwortA = "88";
        frage23.antwortB = "70";
        frage23.antwortC = "65";
        frage23.antwortD = "80";
        
        frage24=new FRAGE();
        frage24.fragestellung="Was ist die Hauptstadt von Portugal?";
        frage24.antwortA = "Porto";
        frage24.antwortB = "Lissabon";
        frage24.antwortC = "Lago";
        frage24.antwortD = "Tavira";
        
        frage25=new FRAGE();
        frage25.fragestellung="Wie viele Herzen hat ein Oktopus?";
        frage25.antwortA = "Zwei";
        frage25.antwortB = "Drei";
        frage25.antwortC = "Vier";
        frage25.antwortD = "Keines";
        
        frage26=new FRAGE();
        frage26.fragestellung="Wie lange hat Goethe an seinem Werk ´Faust´ gearbeitet?";
        frage26.antwortA = "20 Jahre";
        frage26.antwortB = "64 Jahre";
        frage26.antwortC = "34 Jahre";
        frage26.antwortD = "10 Jahre";
        
        frage27=new FRAGE();
        frage27.fragestellung="Welcher ist der längste Fluss der Welt?";
        frage27.antwortA = "Nil";
        frage27.antwortB = "Amazonas";
        frage27.antwortC = "Donau";
        frage27.antwortD = "Rhein";
        
        frage28=new FRAGE();
        frage28.fragestellung="In welchem Land wohnen die meißten Menschen?";
        frage28.antwortA = "China";
        frage28.antwortB = "USA";
        frage28.antwortC = "Russland";
        frage28.antwortD = "Kanada";
        
        frage29=new FRAGE();
        frage29.fragestellung="Wie viel Prozent der Erde sind circa von Wasser bedeckt?";
        frage29.antwortA = "50 Prozent";
        frage29.antwortB = "60 Prozent";
        frage29.antwortC = "70 Prozent";
        frage29.antwortD = "80 Prozent";
        
        frage30=new FRAGE();
        frage30.fragestellung="Von welchem Kontinent aus begann die Verbreitung des Homo sapiens?";
        frage30.antwortA = "Asien";
        frage30.antwortB = "Afrika";
        frage30.antwortC = "Amerika";
        frage30.antwortD = "Europa";
        
        
        
        
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
      //Hintergrund gestalten,färben*/
  
     //*Wie verbinde ich frage mit den buttons/Feldern
     //*Endbildschirm,wo Gesamtpunktzahl und maximal erreichbare Punkzahl angezeigt werden
     //*Wie schaffe ich es dass die Frage + Antwort aufgerufen wird  
      //festlegen wie oft man Joker verwenden kann und was beim Auswählen passiert*/
     //*Startbutton einfügen und überlegen wie Oberfläche entscheidet wann nächste Frage geöffnet oder angezeigt wird
}
   
    