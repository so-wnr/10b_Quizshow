 
//die Klasse Frage dreht sich um die einzelnen Fragefelder und legt fest, wie es funktioniert*/
class FRAGE
{
    String fragestellung;
    String[] antworten;
    int richtig;

    String antwortA;
    String antwortB;
    String antwortC;
    String antwortD;

    
    
    FRAGE(String _fragestellung, String[] _antworten, int _richtig)
    {

        fragestellung = _fragestellung;
        antworten = _antworten;
        richtig = _richtig;

        fragestellung = "";
        antwortA = "";
        antwortB = "";
        antwortC = "";
        antwortD = "";

    }
    
    
    
}
