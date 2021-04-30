//package statement
package cpt_chess;

//imports
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


// Handles engine calls and communication
public class Engine 

{
    static BufferedWriter b_w;
    static BufferedReader b_r;
    static ProcessBuilder builder;
    static Process process;
    public static boolean is_mate;
    public static boolean is_stalemate;
    
    
    /* Constructor
     * Pre: n/a
     * Post: New engine object created
     */
    public Engine()
    {
         builder = new ProcessBuilder(location.getdir());
         builder.redirectErrorStream(true);
    }
    
    /* Start engine
     * Pre: process built
     * Post: Engine will be started
     */
    public void start_process()
    {
        try 
        {
            process = builder.start();
            
        } 
        catch (IOException e) 
        {
            System.out.print("error");
        }
    }
    
    
    
    /* Read output
     * Pre: n/a
     * Post: Reading engine output
     */
    public void read () 
    {
        BufferedReader stdInput = new BufferedReader(new 
        InputStreamReader(process.getInputStream()));
        
        new Thread ()
        {
            public void run ()
            {
                try {
                    String line =  stdInput.readLine();
                 
                    while (line != null)
                    {
                        if (line.contains("bestmove"))
                        {
                            test_chess.engine_move = line;
                        }
                        line =  stdInput.readLine();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Engine.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }.start();
    }
    
    /* Get bestmove from engine 
     * Pres: Engine is started and not stopped
     * Post: String of best move will be returned 
     */
    static String get_bestmove() throws IOException
    {
        
        BufferedReader stdInput = new BufferedReader(new 
        InputStreamReader(process.getInputStream()));
       
        String line = stdInput.readLine();
        while ((line != null))
        {
           System.out.println(line);
           
           if (line.contains("bestmove"))
           {
               break;
           }
           line = stdInput.readLine();
        }
        
        return line.split(" ")[1];
    }
    
    /* Stop engine function 
     * Pre: n/a
     * Post: Engine will be terminated 
     */
    public void stop_processs()
    {
        executeCommand("quit");
        process.destroyForcibly();
    }
    
    /* Sent call to engine
     * Pre: Engine is running and not stopped
     * Post Command will be executed 
     */
     public static void executeCommand(String command) {
        try {
            BufferedWriter b = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
            b.write(command);
            b.newLine();
            b.flush();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
     
     /* Change skill lvl of engine (0-20)
      * Pre: Engine is running and not stopped
      * Post: Skill level set to specified value
      */
     public void set_skill (String skill_lvl)
     {
         executeCommand("setoption name Skill Level value " + skill_lvl);
     }
     
     /* Determine the bestmove in a position given amount of time to calculate 
      * Pre: Engine is running and not stopped
      * Post: bestmove calculated 
      */
     public String evaluate_position(String fen, String time) throws IOException
     {
        executeCommand("isready");
        executeCommand("ucinewgame");
        executeCommand("position fen " + fen);
        executeCommand("d");
        executeCommand("go movetime " + time);
        BufferedReader stdInput = new BufferedReader(new 
        InputStreamReader(process.getInputStream()));
       
        String line = stdInput.readLine();
        while ((line != null))
        {
           System.out.println(line);
           if (line.contains("bestmove"))
           {
               break;
           }
           line = stdInput.readLine();
        }
        
        return line.split(" ")[1];
     }
    
     /* @overload
      * depth instead of time
      */
     public String evaluate_position(String fen, int depth) throws IOException
     {
        executeCommand("isready");
        executeCommand("ucinewgame");
        executeCommand("position fen " + fen);
        executeCommand("go depth " + Integer.toString(depth));
        BufferedReader stdInput = new BufferedReader(new 
        InputStreamReader(process.getInputStream()));
       
        String line = stdInput.readLine();
        while ((line != null))
        {
           System.out.println(line);
           if (line.contains("bestmove"))
           {
               break;
           }
           line = stdInput.readLine();
        }
        
        return line.split(" ")[1];
     }
}     
     

     
     
    

     
     
     
     
     
     
     
     
     


