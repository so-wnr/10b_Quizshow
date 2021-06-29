
/**
 * Beschreiben Sie hier die Klasse OBERFLÄCHE.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
class OBERFLÄCHE
{
   
       Frame fenster;
       Label fragetext;
       Button antwortA;
       Button antwortB;
       Button antwortC;
       Button antwortD;
       
       /**
        * Konstruktor für Objekte der Klasse OBERFLÄCHE 
        */
       OBERFLÄCHE() 
       {
           fenster = new Frame(Frage);
           fenster.setSize(700,500);
           
       }  
}

