//package statement
package cpt_chess;

//imports
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Handles File creation, writing, and reading 
public class io 
{
    
    /* 
     * Creates a new file in local directory
     * Pre: Formal argument contians a valid file format
     * Post: File of whatever file format is created and saved in local directory
     */
    public static void createFile(String filename)
    {
        
        File file = new File (filename);
        try
        {
            
        file.createNewFile();
                 
        }
        
        catch (IOException e)
        {
            System.out.print("An IO exception occurred");
        }
    
    }
    /* read to file 
     * Pre: File exists and valid format
     * Post: First line of file will be returned 
     */
    public static String read_file (String filename) throws FileNotFoundException, IOException 
    {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();
        br.close();
        
        if(line == null){
            line = "0";
            
        }
        
        return line;
    }
    
    /* write to a file
     * Pre: File exists and valid format
     * Post: First line of file will be written over
     */
    public static void write_file (String filename, String str_to_write) throws IOException
    {
        FileWriter fw = new FileWriter(filename);
            
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write(str_to_write);
        
        bw.close();
            
        fw.close();
    }
    
    
    
    
    
}
