import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.sound.sampled.*;


public class Demo {

    public static void main(String[] args) {
        String filePath = "D:/music/Ram.mp3";

        File file = new File(filePath);
        if(file.exists()) {
            System.out.println("File exist");
            
            try {

                Media hit = new Media(file.toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(hit);
                mediaPlayer.play();

            } catch(Exception exc) {
                System.out.println(exc.getLocalizedMessage());
            }
        }
        else {
            System.out.println("File not exist");
        }
    }
}