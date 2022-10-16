package Noyau;

public class Kernel implements Graphique,Physique,In_Out{

    private String log="";

    public Object Sprite; // je sais pas trop comment introduire ça

    public Object Coord; //créer une classe coordonnée ?

    private Object Pressed;

    private Object Objet;

    public Kernel(){
    }

    public Object getPressedKey(){
        //Pressed=nom de la fonction de In_Out
        log=log+"Kernel asked for pressed keys \n";
        return Pressed;
    }
    public Object getAllPosition(){
        log=log+"Kernel asked for all positions \n";
        return Coord;
    }

    public Object giveAllSprite(){
        log=log+"Graphic asked for all sprite \n";
        return Sprite;
    }

    public Object giveAllPosition(){
        Coord=getAllPosition();
        log=log+"Graphic asked for all positions \n";
        return Coord;
    }

    public Object getNewObject(){
        //Objet=nom de la fonction de gameplay
        log=log+"Kernel asked for the new Object \n";
        return Objet;
    }

    public String getLog() {
        return log;
    }
}
