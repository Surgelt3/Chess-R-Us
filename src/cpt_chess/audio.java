//package statement
package cpt_chess;

import java.applet.Applet;
import java.applet.AudioClip;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

// class for handling sound effects and audio
public class audio {
    static java.io.File file1 = new java.io.File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\piece_drop.wav");
    static java.io.File file2 = new java.io.File("C:\\Users\\asali\\OneDrive\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\piano.wav");
    public static boolean is_mute = false;
    
    /* Play the sound clip
     * Pre: clip is init
     * Post: sound played
     */
    public static AudioClip get_sound () throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException
    {
         AudioClip sound = Applet.newAudioClip(file1.toURL());
         return sound;
    }
    
    /* Loop sound continuously
     * Pre: clip is init
     * Post: sound looped continusouly 
     */
    public static AudioClip get_music () throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException
    {
       AudioClip sound = Applet.newAudioClip(file2.toURL());
       return sound;
    }
    
}
