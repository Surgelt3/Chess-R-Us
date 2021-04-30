
package cpt_chess;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static java.lang.Math.abs;
import java.util.logging.Level;
import java.util.logging.Logger;
import static cpt_chess.Main_Game.index_highlight;
import static cpt_chess.Main_Game.White_turn;
import static cpt_chess.Main_Game.has_moved;
import static cpt_chess.Chess_Board_Panel.side_Panel.captured_pieces;
import static cpt_chess.CPT_Chess.level_str;
import static cpt_chess.Chess_Board_Panel.side_Panel_west;
import static cpt_chess.Chess_Board_Panel.side__Panel;
import static cpt_chess.Java_main_panel.CardLayout;
import static cpt_chess.Main_Game.promotion_possible;
import static cpt_chess.Main_Game.turn_counter;
import static cpt_chess.Main_Java_Frame.main_frame;
import static cpt_chess.Main_Java_Frame.parent;
import static cpt_chess.test_chess.Multiplayer;
import static cpt_chess.test_chess.boardprint;
import static cpt_chess.test_chess.engine_move;
import static cpt_chess.test_chess.promotion;
import static cpt_chess.test_chess.pos_translate;
import static cpt_chess.test_chess.promoted_piece_ai;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



/**
 *
 * @author lucas
 */
//Board panel class
public class Chess_Board_Panel extends JPanel{
    
    //static variables
    public static String promotion__piece = "L";
    public static Board board_2;
    public static JPanel game_panel;
    public static side_Panel side__Panel;
    public static side_Panel side_Panel_west;
    public static String [][] board = {{"r","n","b","q","k","b","n","r"},{"p","p","p","p","p","p","p","p"},{"E","E","E","E","E","E","E","E"},{"E","E","E","E","E","E","E","E"},{"E","E","E","E","E","E","E","E"},{"E","E","E","E","E","E","E","E"},{"P","P","P","P","P","P","P","P"},{"R","N","B","Q","K","B","N","R"}};

    //constructor
    /*
    pre: none
    post: running board and adding it to panel
    */
    public Chess_Board_Panel() throws IOException, InterruptedException{
    
        
        String [][] board_2 = {{"r","n","b","q","k","b","n","r"},{"p","p","p","p","p","p","p","p"},{"E","E","E","E","E","E","E","E"},{"E","E","E","E","E","E","E","E"},{"E","E","E","E","E","E","E","E"},{"E","E","E","E","E","E","E","E"},{"P","P","P","P","P","P","P","P"},{"R","N","B","Q","K","B","N","R"}};
        board = board_2;
        
        //adding panels to a single panel
        this.game_panel = new JPanel();
        this.setSize(750, 500);
        this.setLayout(new BorderLayout());
        this.board_2 = new Board();
        this.side__Panel = new side_Panel("b");
        this.side_Panel_west = new side_Panel("w");
        this.add(this.side__Panel, BorderLayout.EAST);
        this.add(this.side_Panel_west, BorderLayout.WEST);
        this.add(this.board_2, BorderLayout.CENTER);
        this.setVisible(true);
        index_highlight.removeAll(index_highlight);
        is_new_move = -1;
        
        //running the second thread for opponenet opening move
        thread();
        
    }
    
    //thread function
    /*
    pre: none
    post: creates new thread to make ai move
    */
    public void thread(){
        
        //if the player is playing single player and as black
        if(cpt_chess.CPT_Chess.colour_select.equals("b") || Multiplayer.equals("b")){
            
            //creating new thread
            new Thread(){
              public void run(){

                  
                  //sleeping thread
                  try {
                      Thread.sleep(2000);
                  } catch (InterruptedException ex) {
                      Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                  }

                  //starting engine to make mvoe
                  Engine engine = new Engine();
                  engine.start_process();
                  engine.read();

                  //inputing the level
                  engine.executeCommand("setoption name Skill Level value " + level_str);
                  
                  //makeing move
                  Engine.executeCommand("position fen " + FEN_Thing.return_FEN(board, "w"));
                  Engine.executeCommand("go depth 10");
                  
                  //jpanel array
                  JPanel[][] chess_blocks = new JPanel[8][8];
                  
                 //sleeping thread
                  try {
                      Thread.sleep(500);
                  } catch (InterruptedException ex) {
                      Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  
                  try {
                      audio.get_sound().play();
                  } catch (InterruptedException ex) {
                      Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (UnsupportedAudioFileException ex) {
                      Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (IOException ex) {
                      Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (LineUnavailableException ex) {
                      Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  //executing move with engine
                  test_chess.move("w", pos_translate(engine_move.split(" ")[1].split("")[0]), abs(Integer.parseInt(engine_move.split(" ")[1].split("")[1]) - 8), pos_translate(engine_move.split(" ")[1].split("")[2]), abs(Integer.parseInt(engine_move.split(" ")[1].split("")[3]) - 8), board);
                  
                  //redrawing board        
                  board_2.removeAll();
                            
                    try {
                        board_2.drawBoard(chess_blocks);
                   } catch (IOException ex) {
                          Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                   }

                    board_2.revalidate();
                    board_2.repaint();
                    turn_counter = 1;

              }

              //running thread
            }.start();

        }else{
            White_turn = true;
            turn_counter = 0;
            
        }
    }
    
    
    
    //dimenesion of side panel
    static Dimension side_Panel_Dimension = new Dimension(125, 500);

    //class for side panels
    public static class side_Panel extends JPanel{
        
        //constructor for side panels
        /*
        pre: String colour
        post: adding panels to side panel
        */
        side_Panel(String colour) throws IOException{
            
            removeAll();
            
            //setting background colour
            setBackground(new Color(194,194,194));
            
            back_button(this, colour);
            promoiton_graphics(this, colour);
            captured_pieces(this, colour);
            
            
            setPreferredSize(side_Panel_Dimension);
            validate();
            
            
        }
        
        /*
        pre: side_Panel class, String colour
        post: adds back button to the side panel
        */
        public void back_button(side_Panel sidePanel, String colour){
            
            JPanel panel = new JPanel();
            panel.removeAll();
            panel.setBackground(Color.white);
            panel.setPreferredSize(new Dimension(125, 30));
            
            //creating button and changing apearance
            javax.swing.JButton Back_Bttn_Game = new javax.swing.JButton();
            Back_Bttn_Game.setBackground(new java.awt.Color(51, 51, 51));
            Back_Bttn_Game.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
            Back_Bttn_Game.setForeground(new java.awt.Color(204, 204, 204));
            Back_Bttn_Game.setText("Return to Menu");
            Back_Bttn_Game.setBorder(null);
            Back_Bttn_Game.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            
            //button action listener
            Back_Bttn_Game.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Back_Bttn_GameActionPerformed(evt);
                }
            });
            
            //if the panel is on the left add the button
            if(colour.equals("w")){
                panel.add(Back_Bttn_Game);
            }
            
            
            //setting background
            panel.setBackground(new Color(65,68,70));
            
            //adding panel with button to sidePanel
            sidePanel.add(panel);
            
        }
        
        /*
        pre: ActionEvent evt
        post: running end code to reutn to main menu
        */
        private void Back_Bttn_GameActionPerformed(java.awt.event.ActionEvent evt) {                                                                    

            //stopping engine process
            if(Multiplayer.equals("m") != true){
                engine.stop_processs();
            }
            
            //removing everything in panel and readding                
            main_frame.getContentPane().removeAll();
            parent = new Java_main_panel();
            CardLayout.show(parent, "card2");
            
            main_frame.add(parent);
            main_frame.revalidate();
            main_frame.repaint();
            
        }
        
        /*
        pre: String piece, JPanel large_panel
        post: adding piece on piece for promotion panel and to click on it
        post: adding piece with evt to promotion panel
        */
        public void clickable_jpanel(String piece, JPanel large_panel) throws IOException{
            
            Dimension panel_dimension = new Dimension(10, 10);
            
            JPanel panel = new JPanel();
            panel.setLayout(new GridBagLayout());
            
            panel.setPreferredSize(panel_dimension);
            
            panel.removeAll();
            
            BufferedImage image;
            
            
            if(piece.equals("R")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\whiteRook.png"));
                panel.add(new JLabel(new ImageIcon(image)));
            }
            else if(piece.equals("N")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\whiteKnight.png"));
                panel.add(new JLabel(new ImageIcon(image)));
            }
            else if(piece.equals("B")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\whiteBishop.png"));
                panel.add(new JLabel(new ImageIcon(image)));
            }
            else if(piece.equals("Q")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\whiteQueen.png"));
                panel.add(new JLabel(new ImageIcon(image)));
            }
            else if(piece.equals("r")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\blackRook.png"));
                panel.add(new JLabel(new ImageIcon(image)));
            }
            else if(piece.equals("n")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\blackKnight.png"));
                panel.add(new JLabel(new ImageIcon(image)));
            }
            else if(piece.equals("b")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\blackBishop.png"));
                panel.add(new JLabel(new ImageIcon(image)));
            }else if(piece.equals("q")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\blackQueen.png"));
                panel.add(new JLabel(new ImageIcon(image)));
            }else{

            }
            
            panel.addMouseListener(new MouseListener() {        
                
                @Override
                public void mouseClicked(final MouseEvent e){
                    promotion__piece = piece;
                    
                }
                
                @Override
                public void mousePressed(MouseEvent e){
                    
                }
                
                @Override
                public void mouseReleased(MouseEvent e){
                    
                }
                
                @Override
                public void mouseEntered(MouseEvent e){
                    
                }
                
                @Override
                public void mouseExited(MouseEvent e){
                    
                }
                
            }); 
            
            large_panel.add(panel);
            
        }
        
        /*
        pre: side_Panel sidePanel, String colour
        post: adding contents to promotion panel
        */
        public void promoiton_graphics(side_Panel sidePanel, String colour) throws IOException{
            
            //
            test_chess testing = new test_chess();
            JPanel panel = new JPanel();
            
            //setting settting to panel
            panel.setBackground(Color.white);
            panel.setPreferredSize(new Dimension(125, 210));
            panel.setLayout(new GridLayout(2, 2));
            
            //piece in promotion panel
            String contents_W[][] = {{"R", "N"},{"B", "Q"}};
            String contents_B[][] = {{"r", "n"},{"b", "q"}};
            
            String[][] contents;
            
            //determing what colour will be on promotion panel
            if(colour.equals("b")){
                contents = contents_B;
            }else{
                contents = contents_W;
            }
            
            JPanel buttons[][] = new JPanel[2][2];
            
            //for loop to go through all pieces
            for(int i = 0; i < 2; i++){
                for(int j = 0; j < 2; j++){
                    clickable_jpanel(contents[i][j], panel);
                }
            }
            
            //adding panel to side panel
            sidePanel.add(panel, BorderLayout.PAGE_END);
            
            //setting panel as not visible
            panel.setVisible(false);
            
            //if promotion is possible is true set the panel as visible
            if(Main_Game.promotion_possible == true){
                panel.setVisible(true);
            }
            
        }
        
        /*
        pre: side_Panel side_Panel, String colour
        post: updating side panel
        */
        public void update(side_Panel side_Panel, String colour) throws IOException{
        
            side_Panel.removeAll();            
                

                side_Panel.setBackground(Color.white);

                captured_pieces(side_Panel, colour);
                captured_pieces(side_Panel, colour);

                side_Panel.setPreferredSize(side_Panel_Dimension);
                
            revalidate();
            repaint();

        }
        
        /*
        pre: side_Panel sidePanel, String colour
        post: adding capture pieces to panel
        */
        public static void captured_pieces(side_Panel sidePanel, String colour) throws IOException{
            
            
            test_chess test = new test_chess();
            JPanel panel = new JPanel();
            panel.removeAll();
            
            //setting background and dimension
            panel.setBackground(Color.white);
            panel.setPreferredSize(new Dimension(125, 250));
            panel.setLayout(new GridLayout(4, 2));
            
            //all pieces
            String contents_W[] = {"P", "R", "N", "B", "Q", "K"};
            String contents_B[] = {"p", "r", "n", "b", "q", "k"};
            
            
            String[] contents;
            
            //determining what colour the pieces for captured panel
            if(colour.equals("w")){
                contents = contents_B;
            }else{
                contents = contents_W;
            }
            
            //for loop to go through every piece
            for(String piece : contents){
                
                //determing how many of the specific piece were captured
                int amount_captured = test.remaining_pieces(piece, board);
                
                //adding pieces that were captured
                for(int i = 0; i < amount_captured; i++){
                  
                    BufferedImage image;

                    //if statement for all pieces and adding icons
                    if(piece.equals("R")){
                        image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\whiteRook.png"));
                        panel.add(new JLabel(new ImageIcon(image)));
                    }
                    else if(piece.equals("N")){
                        image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\whiteKnight.png"));
                        panel.add(new JLabel(new ImageIcon(image)));
                    }
                    else if(piece.equals("B")){
                        image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\whiteBishop.png"));
                        panel.add(new JLabel(new ImageIcon(image)));
                    }
                    else if(piece.equals("K")){
                        image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\whiteKing.png"));
                        panel.add(new JLabel(new ImageIcon(image)));
                    }
                    else if(piece.equals("Q")){
                        image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\whiteQueen.png"));
                        panel.add(new JLabel(new ImageIcon(image)));
                    }
                    else if(piece.equals("P")){
                        image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\whitePawn.png"));
                        panel.add(new JLabel(new ImageIcon(image)));
                    }
                    else if(piece.equals("r")){
                        image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\blackRook.png"));
                        panel.add(new JLabel(new ImageIcon(image)));
                    }
                    else if(piece.equals("n")){
                        image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\blackKnight.png"));
                        panel.add(new JLabel(new ImageIcon(image)));
                    }
                    else if(piece.equals("b")){
                        image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\blackBishop.png"));
                        panel.add(new JLabel(new ImageIcon(image)));
                    }
                    else if(piece.equals("k")){
                        image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\blackKing.png"));
                        panel.add(new JLabel(new ImageIcon(image)));
                    }
                    else if(piece.equals("q")){
                        image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\blackQueen.png"));
                        panel.add(new JLabel(new ImageIcon(image)));
                    }
                    else if(piece.equals("p")){
                        image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\blackPawn.png"));
                        panel.add(new JLabel(new ImageIcon(image)));
                    }
                    else{

                    }
                    
                }
            }
            
            
            panel.setBackground(new Color(65,68,70));
            
            
            
            //adding panel to sidePanel 
            sidePanel.add(panel);
            
            
        }

    }
    
    //static variable for board panel dimensions
    static Dimension Board_Panel_Dimension = new Dimension(450, 450);
    static Dimension Tile_Panel_Dimension = new Dimension(10, 10);
    
    //board panel
    public class Board extends JPanel{
        
        //list of tiles
        final List<TilePanel> boardTiles;
        
        /*
        pre: none
        post: adding all board pieces to panel
        */
        public Board() throws IOException{
            
            //grid layout
            super(new GridLayout(8, 8));
            this.boardTiles = new ArrayList<>();
            
            JPanel[][] chess_blocks = new JPanel[8][8];
            
            int counter = 0;
            int row = 1;
            
                
            drawBoard(chess_blocks);
                
            setPreferredSize(Board_Panel_Dimension);
            validate();
        
        }
        
        /*
        pre: JPanel chess_blocks[][]
        post: drawing board and adding all tiles
        */
        public void drawBoard(JPanel chess_blocks[][]) throws IOException {
            
            removeAll();
            
            int counter = 0;
            int row = 1;
            
            //for loop to find row and counter for colour
            for(int i = 0; i < 64; i++){
                
                if(counter == 8){
                    counter = 0;
                    row += 1; 
                }
                
                //counter
                counter += 1;
                
                //finding the index of row and coloumn
                int l = i / 8;
                int k = i % 8;
                
                //adding tile panel
                TilePanel tilePanel = new TilePanel(this, i, row, board[l][k], chess_blocks);
                
                chess_blocks[l][k] = tilePanel;
                add(tilePanel);
                
            }
            
        }
    }
    
    
    
    public boolean correct_move = false;
    
    //static variables
        public static int x_1;
        public static int y_1;
        public static int x_2;
        public static int y_2;
        int is_new_move = -1;
        public static Engine engine;
        public static int can_move = 1;
        

    //class that extends JPanel class
    public class TilePanel extends javax.swing.JPanel{
        
        int tileID;
        public boolean will_move;


        /*
        pre: Board boardPanel, int tileID, int row, String piece, JPanel chess_blocks[][]
        post: creating tiles with icons
        post: adding mouse listener to move piece
        */
        TilePanel(Board boardPanel, int tileID, int row, String piece, JPanel chess_blocks[][]) throws IOException{
            
            //grid layout to add icon on tiles
            super(new GridBagLayout());
            
            this.tileID = tileID;
            setPreferredSize(Tile_Panel_Dimension);
            
            //drawing tile
            draw_tile(row, piece, this);
            
            //mouse listener
            addMouseListener(new MouseListener() {
                
                @Override
                @SuppressWarnings("empty-statement")
                /*
                pre: MouseEvent e
                post: running audtio on second click that moves piece
                post: checking to see if moves are legal
                */
                public void mouseClicked(final MouseEvent e){

                    //if game is multiplayer
                    if(Multiplayer.equals("m")){

                        //if there is second move
                        if(is_new_move == 1){
                            
                            //creating audio when tile is clicked
                            try {
                                audio.get_sound().play();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (UnsupportedAudioFileException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (LineUnavailableException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            //board class
                            com.github.bhlangonijr.chesslib.Board bor = new com.github.bhlangonijr.chesslib.Board();
                            
                            //removing everything from arraylist for all indexes that are highlighted 
                            index_highlight.removeAll(index_highlight);

                            //indexes for array
                            x_2 = tileID % 8;
                            y_2 = tileID / 8;
                            
                            //turn tracker
                            String turn = "w";

                            //determing turn
                            if(turn_counter % 2 == 0){
                                White_turn = true;
                                turn = "w";
                            }else{
                                turn = "b";
                                White_turn = false;
                            }

                            //checking for pormotion
                            if(promotion_possible == false){
                                
                                //moving piece and seeign if false
                                if(test_chess.move(turn, x_1, y_1, x_2, y_2, board) == false){
                                    
                                    //subtracting from turn counter to repeat move
                                    turn_counter -= 1;
                                }
                            }
                            
                            //if promotion is possible repeat move
                            if(promotion_possible == false){
                                is_new_move = -1;
                            }
                            
                            //redrawing boardPanel
                            boardPanel.removeAll();

                            try {
                                boardPanel.drawBoard(chess_blocks);
                                
                            } catch (IOException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            }


                            boardPanel.revalidate();
                            boardPanel.repaint();
                            
                            //function to promote
                            promotion(x_2, y_2, promotion__piece, board);
                            
                            //redrawing side panel
                            side__Panel.removeAll(); 
                            side_Panel_west.removeAll();
                            
                        
                            try { 
                                side_Panel_west.back_button(side_Panel_west, "w");
                                side__Panel.back_button(side__Panel, "b");
                                captured_pieces(side__Panel, "b");
                                captured_pieces(side_Panel_west, "w");
                                
                                //depending on turn side panel would change
                                if(turn_counter % 2 == 0){
                                    side__Panel.promoiton_graphics(side_Panel_west, "w");
                                }else{
                                    side__Panel.promoiton_graphics(side__Panel, "b");
                                    
                                }
                                
                            } catch (IOException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            
                            side__Panel.revalidate();
                            side__Panel.repaint();
                            side_Panel_west.revalidate();
                            side_Panel_west.repaint();
                            
                            //checking for checkmate
                            if(White_turn == true){
                                bor.loadFromFen(FEN_Thing.return_FEN(board, "b"));
                            }else{
                                bor.loadFromFen(FEN_Thing.return_FEN(board, "w"));
                            }
                            
                            //checking for checkmate
                            if (bor.isMated())
                            {
                                
                                if(White_turn == true){
                                    
                                    //checking who won
                                    System.out.print("Checkmate White Wins");
                                    cpt_chess.Experience.add_exp("w");
                                    cpt_chess.Experience.levelUp();
                                    
                                    //going to main menu
                                    main_frame.getContentPane().removeAll();
                                    parent = new Java_main_panel();
                                    cpt_chess.CPT_Chess.colour_select = "Checkmate White Wins";
                                    cpt_chess.Game_Over_Panel.Winner_Title.setText(cpt_chess.CPT_Chess.colour_select);
                                    CardLayout.show(parent, "game_over");
                                    
                                    main_frame.add(parent);
                                    main_frame.revalidate();
                                    main_frame.repaint();
                                    
                                }else{
                                    
                                    //checking who won
                                    System.out.print("Checkmate Black wins!");
                                    cpt_chess.Experience.add_exp("l");
                                    cpt_chess.Experience.levelUp();
                                    
                                    //going to main menu
                                    cpt_chess.CPT_Chess.colour_select = "Checkmate Black wins!";
                                    main_frame.getContentPane().removeAll();
                                    parent = new Java_main_panel();
                                    cpt_chess.Game_Over_Panel.Winner_Title.setText(cpt_chess.CPT_Chess.colour_select);
                                    CardLayout.show(parent, "game_over");

                                    main_frame.add(parent);
                                    main_frame.revalidate();
                                    main_frame.repaint();
                                    
                                }
                                
                            }

                            //checking if there is a stalemate or draw
                            if (bor.isStaleMate() || bor.isDraw())
                            {
                                //adding experience
                                cpt_chess.Experience.add_exp("d");
                                cpt_chess.Experience.levelUp();
                                
                                //changing panels
                                System.out.print("Stalemate it's a draw");
                                cpt_chess.CPT_Chess.colour_select = "It's a Draw";
                                main_frame.getContentPane().removeAll();
                                parent = new Java_main_panel();
                                cpt_chess.Game_Over_Panel.Winner_Title.setText(cpt_chess.CPT_Chess.colour_select);
                                CardLayout.show(parent, "game_over");

                                main_frame.add(parent);
                                main_frame.revalidate();
                                main_frame.repaint();
                            }

                            //checking for promotion to add to turn
                            if(promotion_possible == false){
                                
                                turn_counter += 1;

                                if(turn_counter % 2 == 0){
                                    White_turn = true;
                                    turn = "w";
                                }else{
                                    turn = "b";
                                    White_turn = false;
                                }
                            }
                            is_new_move = -1;

                        }

                        //checking if user is clicking on piece and checking for turn
                        if((piece != "E")&&(White_turn == true && Character.isUpperCase(piece.charAt(0)) == true)||(White_turn == false && Character.isUpperCase(piece.charAt(0)) == false)){

                            //removing everthing from arraylist
                            index_highlight.removeAll(index_highlight);

                            x_1 = tileID % 8;
                            y_1 = tileID / 8;

                            //changing variable to make new move
                            is_new_move = 1;

                            String colour;
                            test_chess testing = new test_chess();

                            char charxy = board[y_1][x_1].charAt(0);

                            //checking for colour when piece is clicked
                            if(Character.isUpperCase(charxy) == true){

                                colour = "w";

                            }else{
                                colour = "b";
                            }

                            String[] stuff;

                            //finding all possible moves
                            String thing = test_chess.highlight_squares (y_1,x_1, colour, board);

                            //adding all possible moves to array
                            stuff = thing.split("");

                            //going through array to find all possible moves
                            for(String q : stuff){

                                System.out.print(q);
                                index_highlight.add(q);

                            }    

                            //redrawing side panel and boardPanel
                            side__Panel.removeAll(); 
                            side_Panel_west.removeAll();

                            try {
                                side_Panel_west.back_button(side_Panel_west, "w");
                                side__Panel.back_button(side__Panel, "b");
                                captured_pieces(side__Panel, "b");
                                captured_pieces(side_Panel_west, "w");
                            } catch (IOException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            side__Panel.revalidate();
                            side__Panel.repaint();
                            side_Panel_west.revalidate();
                            side_Panel_west.repaint();

                            boardPanel.removeAll();

                            try {
                                boardPanel.drawBoard(chess_blocks);
                            } catch (IOException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            boardPanel.revalidate();
                            boardPanel.repaint();

                        }
                        
                    //for when user is playing single player and selects white
                    }else if(cpt_chess.CPT_Chess.colour_select.equals("w")){
                        
                        //runing engine class
                        engine = new Engine();
                        engine.start_process();
                        engine.read();
                        
                        //changing engine level
                        engine.executeCommand("setoption name Skill Level value " + level_str);
                        
                        //if it is a mvoe
                         if(is_new_move == 1 && can_move == 1){
                             
                             //playing move
                             try {
                                audio.get_sound().play();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (UnsupportedAudioFileException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (LineUnavailableException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                             //runing class for checking if there is checkmate
                            com.github.bhlangonijr.chesslib.Board bor = new com.github.bhlangonijr.chesslib.Board();
                            
                            //removing everything from arraylist
                            index_highlight.removeAll(index_highlight);

                            //finding indexes of tile that was clicked
                            x_2 = tileID % 8;
                            y_2 = tileID / 8;

                            //making turn variable white
                            String turn = "w";

                            //checking variable for turn
                            if(turn_counter % 2 == 0){
                                White_turn = true;
                                turn = "w";
                            }else{
                                turn = "b";
                                White_turn = false;
                            }

                            //checking for pormotion to move
                            if(promotion_possible == false){
                                
                                //checking if move is possible
                                if(test_chess.move("w", x_1, y_1, x_2, y_2, board ) == false){
                                    
                                    //if not subtract from turn_counter
                                    turn_counter -= 1;
                                }
                            }
                            
                            //checking if promotion is possible
                            if(promotion_possible == false){
                                is_new_move = -1;
                            }
                            
                            
                            //redrawing board panel
                            boardPanel.removeAll();

                            try {
                                boardPanel.drawBoard(chess_blocks);
                                
                            } catch (IOException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            }


                            boardPanel.revalidate();
                            boardPanel.repaint();
                            
                            //promotion piece
                            promotion(x_2, y_2, promotion__piece, board);
                            
                            //redrawing side panels
                            side__Panel.removeAll(); 
                            side_Panel_west.removeAll();
                        
                            try { 
                                side_Panel_west.back_button(side_Panel_west, "w");
                                side__Panel.back_button(side__Panel, "b");
                                captured_pieces(side__Panel, "b");
                                captured_pieces(side_Panel_west, "w");
                                
                                if(turn_counter % 2 == 0){
                                    side_Panel_west.promoiton_graphics(side_Panel_west, "w");
                                }else{
                                    side__Panel.promoiton_graphics(side__Panel, "b");
                                    
                                }
                                
                            } catch (IOException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            side__Panel.revalidate();
                            side__Panel.repaint();
                            side_Panel_west.revalidate();
                            side_Panel_west.repaint();
                            
                            //looking for checkmate
                            bor.loadFromFen(FEN_Thing.return_FEN(board, "b"));

                            //checking if board is mated
                            if (bor.isMated())
                            {
                                
                                //checking if white turn is true
                                if(White_turn == true){
                                    
                                    //adding xp
                                    System.out.print("Checkmate White Wins");
                                    cpt_chess.Experience.add_exp("w");
                                    cpt_chess.Experience.levelUp();
                                    engine.stop_processs();
                                    
                                    //refreshing going to menu
                                    main_frame.getContentPane().removeAll();
                                    parent = new Java_main_panel();
                                    cpt_chess.CPT_Chess.colour_select = "Checkmate White Wins";
                                    cpt_chess.Game_Over_Panel.Winner_Title.setText(cpt_chess.CPT_Chess.colour_select);
                                    CardLayout.show(parent, "game_over");

                                    main_frame.add(parent);
                                    main_frame.revalidate();
                                    main_frame.repaint();
                                    
                                }else{
                                    
                                    //adding xp
                                    System.out.print("Checkmate Black wins!");
                                    cpt_chess.Experience.add_exp("l");
                                    cpt_chess.Experience.levelUp();
                                    engine.stop_processs();
                                    
                                    //refreshing going to menu
                                    cpt_chess.CPT_Chess.colour_select = "Checkmate Black wins!";
                                    main_frame.getContentPane().removeAll();
                                    parent = new Java_main_panel();
                                    cpt_chess.Game_Over_Panel.Winner_Title.setText(cpt_chess.CPT_Chess.colour_select);
                                    CardLayout.show(parent, "game_over");

                                    main_frame.add(parent);
                                    main_frame.revalidate();
                                    main_frame.repaint();
                                    
                                }
                                
                                
                            }

                            //if board is stale mated and draw
                            if (bor.isStaleMate() || bor.isDraw())
                            {
                                
                                //adding xp
                                cpt_chess.Experience.add_exp("d");
                                cpt_chess.Experience.levelUp();
                                engine.stop_processs();
                                System.out.print("Stalemate it's a draw");
                                cpt_chess.CPT_Chess.colour_select = ("It's a Draw");
                                
                                //returning to menu
                                main_frame.getContentPane().removeAll();
                                parent = new Java_main_panel();
                                cpt_chess.Game_Over_Panel.Winner_Title.setText(cpt_chess.CPT_Chess.colour_select);
                                CardLayout.show(parent, "game_over");

                                main_frame.add(parent);
                                main_frame.revalidate();
                                main_frame.repaint();
                            }

                            //changing turn                         
                            if(promotion_possible == false){
                                turn_counter +=1;
                            
                                if(turn_counter % 2 == 0){
                                    White_turn = true;
                                    turn = "w";
                                }else{
                                    turn = "b";
                                    can_move = 0;
                                    White_turn = false;
                                }
                            }
                            
                            
                            //if white is not moving
                            if(White_turn == false){
                                
                                AI_Move("b");
                                
                                //ading to turn counter
                                turn_counter += 1;

                                //checking turn
                                if(turn_counter % 2 == 0){
                                    White_turn = true;
                                    turn = "w";
                                }else{
                                     turn = "b";
                                    White_turn = false;
                                }

                                //loading board to check for checkmate
                                bor.loadFromFen(FEN_Thing.return_FEN(board, "w"));

                                //if hame is in chechmate
                                if (bor.isMated())
                                {

                                    //if white turn
                                    if(White_turn == true){
                                        
                                        //adding xp
                                        System.out.print("Checkmate White Wins");
                                        cpt_chess.Experience.add_exp("w");
                                        cpt_chess.Experience.levelUp();
                                        engine.stop_processs();
                                        
                                        //going back to menu
                                        main_frame.getContentPane().removeAll();
                                        parent = new Java_main_panel();
                                        cpt_chess.CPT_Chess.colour_select = "Checkmate White Wins";
                                        cpt_chess.Game_Over_Panel.Winner_Title.setText(cpt_chess.CPT_Chess.colour_select);
                                        CardLayout.show(parent, "game_over");

                                        main_frame.add(parent);
                                        main_frame.revalidate();
                                        main_frame.repaint();

                                    }else{

                                        //adding xp
                                        System.out.print("Checkmate Black wins!");
                                        cpt_chess.Experience.add_exp("l");
                                        cpt_chess.Experience.levelUp();
                                        engine.stop_processs();
                                        
                                        //returning to menu
                                        cpt_chess.CPT_Chess.colour_select = "Checkmate Black wins!";
                                        main_frame.getContentPane().removeAll();
                                        parent = new Java_main_panel();
                                        cpt_chess.Game_Over_Panel.Winner_Title.setText(cpt_chess.CPT_Chess.colour_select);
                                        CardLayout.show(parent, "game_over");

                                        main_frame.add(parent);
                                        main_frame.revalidate();
                                        main_frame.repaint();
                                        
                                    }


                                }

                                //if board is in stalemate or draw
                                if (bor.isStaleMate() || bor.isDraw())
                                {
                                    
                                    //adding xp
                                    cpt_chess.Experience.add_exp("d");
                                    cpt_chess.Experience.levelUp();
                                    System.out.print("Stalemate it's a draw");
                                    cpt_chess.CPT_Chess.colour_select = ("It's a Draw");
                                    engine.stop_processs();
                                    
                                    //returning to menu
                                    main_frame.getContentPane().removeAll();
                                    parent = new Java_main_panel();
                                    cpt_chess.Game_Over_Panel.Winner_Title.setText(cpt_chess.CPT_Chess.colour_select);
                                    CardLayout.show(parent, "game_over");

                                    main_frame.add(parent);
                                    main_frame.revalidate();
                                    main_frame.repaint();
                                    
                                }
                            
                            }
                            
                            
                        }

                         //if piece is clicked and correct turn
                        if((can_move == 1)&&(piece != "E")&&(White_turn == true && Character.isUpperCase(piece.charAt(0)) == true)||(White_turn == false && Character.isUpperCase(piece.charAt(0)) == false)){

                            //removing everything from index_highlight
                            index_highlight.removeAll(index_highlight);

                            //finding index
                            x_1 = tileID % 8;
                            y_1 = tileID / 8;

                            //
                            is_new_move = 1;

                            
                            String colour;
                            test_chess testing = new test_chess();

                            //checking for colour of piece
                            char charxy = board[y_1][x_1].charAt(0);

                            if(Character.isUpperCase(charxy) == true){

                                colour = "w";

                            }else{
                                colour = "b";
                            }


                            //adding all possible moves to array
                            String[] stuff;

                            String thing = test_chess.highlight_squares (y_1,x_1, "w", board);

                            stuff = thing.split("");

                            //For loop to go through all possible moves and to add them to arraylsit
                            for(String q : stuff){

                                System.out.print(q);
                                index_highlight.add(q);

                            }    

                            //refreshing side panel
                            side__Panel.removeAll(); 
                            side_Panel_west.removeAll();

                            try {
                                side_Panel_west.back_button(side_Panel_west, "w");
                                side__Panel.back_button(side__Panel, "b");
                                captured_pieces(side__Panel, "b");
                                captured_pieces(side_Panel_west, "w");
                            } catch (IOException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            side__Panel.revalidate();
                            side__Panel.repaint();
                            side_Panel_west.revalidate();
                            side_Panel_west.repaint();

                            //refreshing boardPanel
                            boardPanel.removeAll();

                            try {
                                boardPanel.drawBoard(chess_blocks);
                            } catch (IOException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            boardPanel.revalidate();
                            boardPanel.repaint();

                        }

                        //if it is ai vs black
                    }else if(cpt_chess.CPT_Chess.colour_select.equals("b")){
                                                
                        //running engine class
                        engine = new Engine();
                        engine.start_process();
                        engine.read();
                        
                        White_turn = false;
                        
                        //changing engine level
                        engine.executeCommand("setoption name Skill Level value " + level_str);
                        
                        if(turn_counter == 0 || can_move == 0){
                            try {
                                Thread.sleep(2500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                        }
                        
                        //if it is second click
                         if((can_move == 1)&&(is_new_move == 1)){
                             
                             //play sound
                             try {
                                audio.get_sound().play();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (UnsupportedAudioFileException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (LineUnavailableException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                             //class to check if game is over
                            com.github.bhlangonijr.chesslib.Board bor = new com.github.bhlangonijr.chesslib.Board();
                            
                            //removing everything from index_highlight
                            index_highlight.removeAll(index_highlight);

                            System.out.println("adasf");
                            
                            //finding index for tile clikde
                            x_2 = tileID % 8;
                            y_2 = tileID / 8;

                            //assigning colour for turn
                            String turn = "b";

                            if(turn_counter % 2 == 0){
                                White_turn = true;
                                turn = "w";
                            }else{
                                turn = "b";
                                White_turn = false;
                            }
                            
                            
                            
                            //if promotion is not possible
                            if(promotion_possible == false){
                                //if move is not legal
                                if(test_chess.move(turn, x_1, y_1, x_2, y_2 , board) == false){
                                    
                                    //repeat turn
                                    turn_counter -= 1;
                                    
                                }
                            }
                            
                            //if promotion possible is jot false repeat move
                            if(promotion_possible == false){
                                is_new_move = -1;
                            }
                            
                            
                            //refreshing game panel
                            boardPanel.removeAll();

                            try {
                                boardPanel.drawBoard(chess_blocks);
                                
                            } catch (IOException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            boardPanel.revalidate();
                            boardPanel.repaint();
                            
                            //promoting piece
                            promotion(x_2, y_2, promotion__piece, board);
                            
                            //refreshing side panel
                            side__Panel.removeAll(); 
                            side_Panel_west.removeAll();
                            
                            try {
                                side_Panel_west.back_button(side_Panel_west, "w");
                                side__Panel.back_button(side__Panel, "b");
                                captured_pieces(side__Panel, "b");
                                captured_pieces(side_Panel_west, "w");
                                if(turn_counter % 2 == 0){
                                    side__Panel.promoiton_graphics(side_Panel_west, "w");
                                }else{
                                    side__Panel.promoiton_graphics(side__Panel, "b");
                                    
                                }
                                
                                
                            } catch (IOException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            side__Panel.revalidate();
                            side__Panel.repaint();
                            side_Panel_west.revalidate();
                            side_Panel_west.repaint();
                            
                            //loading fen string of game
                            bor.loadFromFen(FEN_Thing.return_FEN(board, "b"));

                            //if game is mated
                            if (bor.isMated())
                            {
                                
                                //if it is white turn
                                if(White_turn == true){
                                    
                                    //add xp
                                    System.out.print("Checkmate White Wins");
                                    cpt_chess.Experience.add_exp("l");
                                    cpt_chess.Experience.levelUp();
                                    engine.stop_processs();
                                    
                                    //return to menu
                                    main_frame.getContentPane().removeAll();
                                    parent = new Java_main_panel();
                                    cpt_chess.CPT_Chess.colour_select = "Checkmate White Wins";
                                    cpt_chess.Game_Over_Panel.Winner_Title.setText(cpt_chess.CPT_Chess.colour_select);
                                    CardLayout.show(parent, "game_over");

                                    main_frame.add(parent);
                                    main_frame.revalidate();
                                    main_frame.repaint();
                                    
                                }else{
                                    
                                    //add xy
                                    System.out.print("Checkmate Black wins!");
                                    cpt_chess.Experience.add_exp("w");
                                    cpt_chess.Experience.levelUp();
                                    engine.stop_processs();
                                    
                                    //return to menu
                                    cpt_chess.CPT_Chess.colour_select = "Checkmate Black wins!";
                                    main_frame.getContentPane().removeAll();
                                    parent = new Java_main_panel();
                                    cpt_chess.Game_Over_Panel.Winner_Title.setText(cpt_chess.CPT_Chess.colour_select);
                                    CardLayout.show(parent, "game_over");

                                    main_frame.add(parent);
                                    main_frame.revalidate();
                                    main_frame.repaint();
                                    
                                }
                                
                            }

                            //if there is stalemate or draw
                            if (bor.isStaleMate() || bor.isDraw())
                            {
                                
                                //add xp
                                cpt_chess.Experience.add_exp("d");
                                cpt_chess.Experience.levelUp();
                                engine.stop_processs();
                                System.out.print("Stalemate it's a draw");
                                cpt_chess.CPT_Chess.colour_select = ("It's a Draw");
                                
                                //return to menu
                                main_frame.getContentPane().removeAll();
                                parent = new Java_main_panel();
                                cpt_chess.Game_Over_Panel.Winner_Title.setText(cpt_chess.CPT_Chess.colour_select);
                                CardLayout.show(parent, "game_over");

                                main_frame.add(parent);
                                main_frame.revalidate();
                                main_frame.repaint();
                                
                            }

                            //determine turn                                
                            if(promotion_possible == false){
                                turn_counter +=1;
                            
                                if(turn_counter % 2 == 0){
                                    White_turn = true;
                                    turn = "w";
                                    can_move = 0;
                                }else{
                                    turn = "b";
                                    White_turn = false;
                                }
                            }
                            
                            //if it is ai turn
                            if(White_turn == true){
                                     
                                AI_Move("w");
                                
                                //determine turn
                                turn_counter += 1;

                                if(turn_counter % 2 == 0){
                                    White_turn = true;
                                    turn = "w";
                                }else{
                                     turn = "b";
                                    White_turn = false;
                                }

                                //check for ai checkmate
                                bor.loadFromFen(FEN_Thing.return_FEN(board, "b"));

                                //if board is mated
                                if (bor.isMated())
                                {

                                    //if white turn
                                    if(White_turn == true){
                                        
                                        //add xp
                                        System.out.print("Checkmate White Wins");
                                        cpt_chess.Experience.add_exp("l");
                                        cpt_chess.Experience.levelUp();
                                        engine.stop_processs();
                                        
                                        //return to menu
                                        main_frame.getContentPane().removeAll();
                                        parent = new Java_main_panel();
                                        cpt_chess.CPT_Chess.colour_select = "Checkmate White Wins";
                                        cpt_chess.Game_Over_Panel.Winner_Title.setText(cpt_chess.CPT_Chess.colour_select);
                                        CardLayout.show(parent, "game_over");

                                        main_frame.add(parent);
                                        main_frame.revalidate();
                                        main_frame.repaint();

                                    }else{

                                        //add xp
                                        System.out.print("Checkmate Black wins!");
                                        cpt_chess.Experience.add_exp("w");
                                        cpt_chess.Experience.levelUp();
                                        engine.stop_processs();
                                        
                                        //return to menu
                                        cpt_chess.CPT_Chess.colour_select = "Checkmate Black wins!";
                                        main_frame.getContentPane().removeAll();
                                        parent = new Java_main_panel();
                                        cpt_chess.Game_Over_Panel.Winner_Title.setText(cpt_chess.CPT_Chess.colour_select);
                                        CardLayout.show(parent, "game_over");

                                        main_frame.add(parent);
                                        main_frame.revalidate();
                                        main_frame.repaint();
                                        
                                    }


                                }

                                //if game is stalemate or draw
                                if (bor.isStaleMate() || bor.isDraw())
                                {
                                    
                                    //add xp
                                    cpt_chess.Experience.add_exp("d");
                                    cpt_chess.Experience.levelUp();
                                    System.out.print("Stalemate it's a draw");
                                    cpt_chess.CPT_Chess.colour_select = ("It's a Draw");
                                    engine.stop_processs();
                                    
                                    //return to menu
                                    main_frame.getContentPane().removeAll();
                                    parent = new Java_main_panel();
                                    cpt_chess.Game_Over_Panel.Winner_Title.setText(cpt_chess.CPT_Chess.colour_select);
                                    CardLayout.show(parent, "game_over");

                                    main_frame.add(parent);
                                    main_frame.revalidate();
                                    main_frame.repaint();
                                    
                                }
                            
                            }
                            
                        }

                         //if clicking on correct piece
                        
                        if((can_move == 1)&&(piece != "E")&&(White_turn == true && Character.isUpperCase(piece.charAt(0)) == true)||(White_turn == false && Character.isUpperCase(piece.charAt(0)) == false)){

                            
                            index_highlight.removeAll(index_highlight);

                            //finding index for tile clicked
                            x_1 = tileID % 8;
                            y_1 = tileID / 8;


                            is_new_move = 1;

                            String colour;
                            test_chess testing = new test_chess();

                            //finding piece colour
                            char charxy = board[y_1][x_1].charAt(0);

                            if(Character.isUpperCase(charxy) == true){

                                colour = "w";

                            }else{
                                colour = "b";
                            }

                            //finding highlighted squares
                            String[] stuff;

                            String thing = test_chess.highlight_squares(y_1,x_1, "b", board);

                            stuff = thing.split("");


                            for(String q : stuff){

                                System.out.print(q);
                                index_highlight.add(q);

                            }    

                            //refreshing side panel 
                            side__Panel.removeAll(); 
                            side_Panel_west.removeAll();

                            try {
                                side_Panel_west.back_button(side_Panel_west, "w");
                                side__Panel.back_button(side__Panel, "b");
                                captured_pieces(side__Panel, "b");
                                captured_pieces(side_Panel_west, "w");
                            } catch (IOException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            side__Panel.revalidate();
                            side__Panel.repaint();
                            side_Panel_west.revalidate();
                            side_Panel_west.repaint();

                            //refreshing boardPanel
                            boardPanel.removeAll();

                            try {
                                boardPanel.drawBoard(chess_blocks);
                            } catch (IOException ex) {
                                Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            boardPanel.revalidate();
                            boardPanel.repaint();
                        
                    }
                    }
                    
                }
                
                @Override
                public void mousePressed(MouseEvent e){
                    
                }
                
                @Override
                public void mouseReleased(MouseEvent e){
                    
                }
                
                @Override
                public void mouseEntered(MouseEvent e){
                    
                }
                
                @Override
                public void mouseExited(MouseEvent e){
                    
                }
                
            }); 
                
            
            
            validate();
            
            repaint();

            
            
        }
        
        /*
        pre: String colour
        post: creates new thread, generates an AI move and the runs it
        post: refreshes board and side panel
        */
        public void AI_Move(String colour){
            
            new Thread(){
              public void run(){

                  
                  //sleeping thread
                  try {
                      Thread.sleep(2000);
                  } catch (InterruptedException ex) {
                      Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                  }

                  //starting engine to make mvoe
                  engine = new Engine();
                  engine.start_process();
                  engine.read();

                  //inputing the level
                  engine.executeCommand("setoption name Skill Level value " + level_str);
                  
                  //makeing move
                  Engine.executeCommand("position fen " + FEN_Thing.return_FEN(board, colour));
                  Engine.executeCommand("go depth 10");
                  
                  //jpanel array
                  JPanel[][] chess_blocks = new JPanel[8][8];
                  
                 //sleeping thread
                  try {
                      Thread.sleep(500);
                  } catch (InterruptedException ex) {
                      Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  
                  //executing move with engine
                  test_chess.move(colour, pos_translate(engine_move.split(" ")[1].split("")[0]), abs(Integer.parseInt(engine_move.split(" ")[1].split("")[1]) - 8), pos_translate(engine_move.split(" ")[1].split("")[2]), abs(Integer.parseInt(engine_move.split(" ")[1].split("")[3]) - 8), board);
                  
                  //promotion function
                  promotion(pos_translate(engine_move.split(" ")[1].split("")[2]), abs(Integer.parseInt(engine_move.split(" ")[1].split("")[3]) - 8), "q", board);
                  
                  try {
                      audio.get_sound().play();
                  } catch (InterruptedException ex) {
                      Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (UnsupportedAudioFileException ex) {
                      Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (IOException ex) {
                      Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (LineUnavailableException ex) {
                      Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                  }
                            
                  
                  //redrawing board        
                  board_2.removeAll();
                            
                    try {
                        board_2.drawBoard(chess_blocks);
                   } catch (IOException ex) {
                          Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                   }

                    board_2.revalidate();
                    board_2.repaint();
                    
                    side__Panel.removeAll(); 
                    side_Panel_west.removeAll();

                    try {
                        side_Panel_west.back_button(side_Panel_west, "w");
                        side__Panel.back_button(side__Panel, "b");
                        captured_pieces(side__Panel, "b");
                        captured_pieces(side_Panel_west, "w");
                    } catch (IOException ex) {
                        Logger.getLogger(Chess_Board_Panel.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    side__Panel.revalidate();
                    side__Panel.repaint();
                    side_Panel_west.revalidate();
                    side_Panel_west.repaint();

                    //can_move is assigned value of 1
                    can_move = 1;
                    
              }

              //running thread
            }.start();
            
        }
       
        /*
        pre: int row, String piece, TilePanel panel
        post: drawing tile
        */
        public void draw_tile(int row, String piece, TilePanel panel) throws IOException{
            
            assignTileColor(row);
            assignTilePieceIcon(piece, panel);
            
        }
        
       
        
        //pre: Board class
        //Post: reads and add image
        public void assignTilePieceIcon(String piece, TilePanel panel) throws IOException{
            removeAll();
            
            BufferedImage image;
            
            
            if(piece.equals("R")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\whiteRook.png"));
                add(new JLabel(new ImageIcon(image)));
            }
            else if(piece.equals("N")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\whiteKnight.png"));
                add(new JLabel(new ImageIcon(image)));
            }
            else if(piece.equals("B")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\whiteBishop.png"));
                add(new JLabel(new ImageIcon(image)));
            }
            else if(piece.equals("K")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\whiteKing.png"));
                add(new JLabel(new ImageIcon(image)));
            }
            else if(piece.equals("Q")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\whiteQueen.png"));
                add(new JLabel(new ImageIcon(image)));
            }
            else if(piece.equals("P")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\whitePawn.png"));
                add(new JLabel(new ImageIcon(image)));
            }
            else if(piece.equals("r")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\blackRook.png"));
                add(new JLabel(new ImageIcon(image)));
            }
            else if(piece.equals("n")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\blackKnight.png"));
                add(new JLabel(new ImageIcon(image)));
            }
            else if(piece.equals("b")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\blackBishop.png"));
                add(new JLabel(new ImageIcon(image)));
            }
            else if(piece.equals("k")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\blackKing.png"));
                add(new JLabel(new ImageIcon(image)));
            }
            else if(piece.equals("q")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\blackQueen.png"));
                add(new JLabel(new ImageIcon(image)));
            }
            else if(piece.equals("p")){
                image = ImageIO.read(new File("C:\\Users\\lucas\\Documents\\NetBeansProjects\\CPT_Chess\\src\\cpt_chess\\Images\\blackPawn.png"));
                add(new JLabel(new ImageIcon(image)));
            }
            else{

            }
            
            
        }
        
        

        //pre: row to work on
        //post: assign checkered colors
        public void assignTileColor(int row){
            
            //setting colour of tile
             if (row % 2 == 0){

                if(tileID % 2 == 0){

                    setBackground(Color.white);

                }else{

                    setBackground(Color.darkGray);

                }

            }else{
                
                if(tileID % 2 == 0){

                    setBackground(Color.darkGray);

                }else{

                    setBackground(Color.white);

                }
                
            }
            
            int x_highlight = 0;
            int y_highlight;
             
            //adding higligted squares for clicked piece
            if(index_highlight.isEmpty() != true){

                for(int l = 0; l < index_highlight.size(); l++){

                    if(l % 2 == 0){

                        try{
                            x_highlight = Integer.valueOf(index_highlight.get(l));
                        }catch(NumberFormatException exception){
                            break;
                        }
                        

                    }else{

                        y_highlight = Integer.valueOf(index_highlight.get(l));

                        if(tileID % 8 == y_highlight && tileID / 8 == x_highlight){

                            setBackground(Color.YELLOW);
                        }

                    }

                }
             
            }
        }
        
        
    
    }
    
    
    
}


