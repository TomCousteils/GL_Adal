package InAndOut;

import java.awt.event.KeyEvent;

public class IAndO {

    private Object kernel =  new Object();

    public void handleKeyPressed(KeyEvent keyEvent){
        switch (keyEvent.getKeyChar()){
            case 'K' -> {
            }
            case 'M' -> {
                System.out.println("Niques ta mère");
            }
        }
    }

    public void handleKeyReleased(KeyEvent keyEvent){
        switch (keyEvent.getKeyChar()){
            case 'K' -> {
            }
            case 'M' -> {
                System.out.println("En fait elle est gentille ta grosse daronne");
            }
        }
    }

}
