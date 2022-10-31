package Noyau;

import java.io.File;
import java.util.ArrayList;

public class Kernel implements Graphique,Physique,In_Out{

    private String log="";

    public Object Sprite; // je sais pas trop comment introduire ça

    public Object Coord; //créer une classe coordonnée ?

    public ArrayList<Object> allCoord;

    private Object Pressed;

    private Object Objet;

    public Kernel(){
    }

    public Object getPressedKey(){
        //Pressed=nom de la fonction de In_Out
        log=log+"Kernel asked for pressed keys \n";
        return Pressed;
    }

    public void givePressdKey(){};
    public ArrayList<Object> getAllPosition(){
        //allCoord=nom de la fonction de physique qui envoie les coordonnés
        log=log+"Kernel asked for all positions \n";
        return allCoord;
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

    public Object sendASprite(int id_obj) {
        File dir = new File("C:\\Users\\PC\\Desktop\\Dossier");
        File[] liste = dir.listFiles();
        for (File item : liste) {
            if (item.isFile() && Integer.parseInt(item.getName()) == id_obj) {
                log = log + "Graphic asked for the new Object \n";
                return ("C:\\Users\\PC\\Desktop\\Dossier" + id_obj);

            }
        }
        return("Pas de sprite associé");
    }

    public Object sendASpriteBIS(int id_obj) {
        return ("C:\\Users\\PC\\Desktop\\Dossier" + id_obj);
    }

    public String getLog() {
        return log;
    }
}
