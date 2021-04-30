

// package statement
package cpt_chess;

// imports
import java.lang.Math;
import java.io.IOException;
import java.util.Scanner;
import com.github.bhlangonijr.chesslib.*;
import com.github.bhlangonijr.chesslib.move.Move;
import static cpt_chess.Main_Game.amount_bishop_Black;
import static cpt_chess.Main_Game.amount_bishop_White;
import static cpt_chess.Main_Game.amount_knight_Black;
import static cpt_chess.Main_Game.amount_knight_White;
import static cpt_chess.Main_Game.amount_pawn_Black;
import static cpt_chess.Main_Game.amount_pawn_White;
import static cpt_chess.Main_Game.amount_queen_Black;
import static cpt_chess.Main_Game.amount_queen_White;
import static cpt_chess.Main_Game.amount_rook_Black;
import static cpt_chess.Main_Game.amount_rook_White;
import static cpt_chess.Main_Game.has_moved;
import static cpt_chess.Main_Game.promotion_possible;
import static cpt_chess.Chess_Board_Panel.board_2;
import static cpt_chess.Chess_Board_Panel.promotion__piece;
import static cpt_chess.Chess_Board_Panel.side_Panel.captured_pieces;
import static cpt_chess.Chess_Board_Panel.side_Panel_west;
import static cpt_chess.Chess_Board_Panel.side__Panel;
import static cpt_chess.Chess_Board_Panel.x_1;
import static cpt_chess.Chess_Board_Panel.x_2;
import static cpt_chess.Chess_Board_Panel.y_1;
import static cpt_chess.Chess_Board_Panel.y_2;
import static cpt_chess.Chess_Board_Panel.board;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import static cpt_chess.Main_Game.White_turn;


public class test_chess

{
        //vars
	
	static boolean kmove = false;
	public static String engine_move;
        
	/* pre: enter rook command
	 * post: determine if it's valid
	 */
	public static boolean rookcheck(int num1a, int num1b, int num2a, int num2b, String r, String[][] board) {
            int i;
	    if (num1a == num2a && num1b == num2b)
	        return false;

	    // Check collision
	    if (num1a == num2a) {
	        // x-axis
	        if (num1b < num2b) {
	            for (i = num1b + 1; i != num2b; ++i) // Right
	                if (board[num1a][i] != "E" ) {
	                	
	                	// checks if peice is capurable
	                	if(capture(num1a,i,r, board) == true) {
	                		return false;
	                	}
	                	return false;
	                }
	                	
	        } else {
	            for (i = num1b - 1; i != num2b; --i) // Left
	                if (board[num1a][i] != "E") {
	                	
	                	// checks if peice is capurable
	                	if(capture(num1a,i,r, board) == true) {
	                		return false;
	                	}
	                    return false;
	                }
	        }
	    }else if (num1b == num2b) {
	        // y-axis
	        if (num1a < num2a) {
	            for (i = num1a + 1; i != num2a; ++i) // Up
	                if (board[i][num1b] != "E") {
	                	
	                	// checks if peice is capurable
	                	if(capture(i,num1b,r, board)== true) {
	                		return false;
	                	}
	                    return false;
	                }
	        } else {
	            for (i = num1a - 1; i != num2a; --i) // Down
	                if (board[i][num1b] != "E") {
	                	
	                	// checks if peice is capurable
	                	if(capture(i,num1b,r, board) == true) {
	       
	                		return false;
	                	}
	                    return false;
	                }
	        }
	        
	    } else {
	        return false;
	    }
	    
	    // checks last spot to see if peice is capturable provided the move is legal 
	    if(board[num2a][num2b] != "E"){
			if(capture(num2a,num2b,r, board) == true) {
                                
        		return true;
        	}
			else {
				return false;
			}
		}
	    
	    // if there is no colision there is nothing so return true
	    return true;
		
		
		
	}
	
	
	
	/* pre: eneter bishop command
	 * post: is it valid 
	 */
	public static boolean bishop_Collision(int num1a, int num1b, int num2a, int num2b,String b, String[][] board) {
		
		
		// determining if the move is legal 
		
		if(num1a == num2a || num1b == num2b){
			return false;
		}
		
		if(Math.abs(num2a - num1a) != Math.abs(num2b - num1b)){
			return false;
		}
		
		
		// get direction for for loop, wether it's going up left, down right etc
		int row, col;
		
		if(num1a < num2a){
			row = 1;
		}else{
			row = -1;
		}
		
		if(num1b < num2b){
			col = 1;
		}else{
			col = -1;
		}
		
		
		
		//loop through move and check for colision using vairbles form above that determine path
		int y = num1b + col;
		
		
		for(int x = num1a + row; x != num2a; x += row){
			if(board[x][y] != "E"){
				if(capture(x,y,b, board) == true) {
            		return false;
            	}
				else {
					return false;
				}
		
				
			}
			
			
			y += col;
		}
		
		// check last spot for capture/ colllsion 
		if(board[num2a][num2b] != "E"){
			if(capture(num2a,num2b,b, board) == true) {	
        		return true;
        	}
			else {
				return false;
			}
		}
		
		// didn't see anything
		return true;
		
	}
	
	
	/* pre: eneter coordiantes 
	 * post: can it capture 
	 */
	public static boolean capture(int x2,int y2, String peice, String[][] board) {
		
		// setting of vairbles, "parsing" string to char 
		boolean capital = false;
		char peicea = peice.charAt(0);
		
		if (Character.isUpperCase(peicea) == true) {
			capital = true;
			
		}
		// is it the same as it's type
		if(Character.isUpperCase(board[x2][y2].charAt(0)) == capital & board[x2][y2].equalsIgnoreCase("e") == false )  {
//                        System.out.print("here1");
			return false;
			
		}
		// if not
		else {
//                        System.out.print("here2");
			return true;
		}
				
		
	}
	
        /* pre: king coordinates
	 * post: is there something there
	 */
	public static boolean king_Collision(int num2a, int num2b,String k, String[][] board) {
                // is there something 
		if (board[num2a][num2b] == "E") {
			return true;
		}
		else {
                        // is it allied or enemey
			if(capture(num2a,num2b,k, board)== true) {
        		return true;
        	}
			return false;
		}
	}
	
	/* pre:enter knight command
	 * post : is it valid
	 */
	public static boolean knightcheck(int num1a, int num1b, int num2a, int num2b, String[][] board) {
                // checking move validility
		if(board[num1a][num1b].equalsIgnoreCase("N") | board[num1a][num1b].equalsIgnoreCase("n")) {
			int nx = (Math.abs(num1a - num2a)) ;
			int ny = (Math.abs(num1b - num2b));
			if ((nx == 1 & ny ==2)|(nx == 2 & ny == 1)) {
                                
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		// no capture as knight goes over peices
	}

        
        /* pre: king command 
	 * post: validity
	 */
	public static boolean kingcheck(int num1a, int num1b, int num2a, int num2b, String[][] board) {
                // checking move validity
		if(board[num1a][num1b].equalsIgnoreCase("K") | board[num1a][num1b].equalsIgnoreCase("k")) {
			if (Math.abs(num1a - num2a) <= 1 & Math.abs(num1b - num2b) <= 1) {
				
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	


        /* pre: enetr a king move
         * Post: k or q returned if possible (king or queen side), n if not
         */
        public static String castle(int x1, int y1,int x2,int y2, String colour, String[][] board){

                        // white side castle 
                        if (colour.equalsIgnoreCase("w")) {

                                //castle permameters 
                                
                                //kingside
                                if ((x1 == 7 & y1 == 4)&(x2 == 7 & y2 == 6) ) {
                                        if(board[7][5].equalsIgnoreCase("E") & board[7][6].equalsIgnoreCase("E") & board[7][7].equals("R")& kmove == false) {

                                                return "k";

                                        }
                                        else {
                                                return "n";
                                        }

                                }
                                //queenside
                                else if((x1 == 7 & y1 == 4)&(x2 == 7 & y2 == 2) ){
                                        if(board[7][3].equalsIgnoreCase("E") & board[7][2].equalsIgnoreCase("E") & board[7][1].equalsIgnoreCase("E")& board[7][0].equals("R")& kmove == false) {
                                        
                                                return "q";
                                        }
                                        else {
                                                return "n";
                                        }

                                }


                                
                        }
                        // black
                        else {
                                //kingside
                                if ((x1 == 0 & y1 == 4)&(x2 == 0 & y2 == 6) ) {

                                        // parameters 
                                        if(board[0][5].equalsIgnoreCase("E") & board[0][6].equalsIgnoreCase("E") & board[0][7].equals("r")& kmove == false) {

                                                return "k";
                                        }

                                }
                                // queenside
                                else if((x1 == 0 & y1 == 4)&(x2 == 0 & y2 == 2) ){
                                        // parameters
                                        if(board[0][3].equalsIgnoreCase("E") & board[0][2].equalsIgnoreCase("E") & board[0][1].equalsIgnoreCase("E")& board[0][0].equals("r") & kmove == false) {

                                                return "q";
                                        }
                                        else {
                                                return "n";
                                        }

                                }


                        }

                        return "n"; 
                }
                
               
	/* pre: n/a
	 * post: prints board
	 * not really used anymore as graphics does this
	 */
	public static void boardprint(int x1, int y1, String[][] board) {
		// run through board with loop and print it 
              
		System.out.println("  " + "a" +  " " + "b" +  " " + "c" +  " " + "d" + " " + "e" +  " " +"f" +  " " +"g" +  " " +"h");
		for(int i = 0 ; i < 8; i ++) {
			System.out.println( (8 - i)+ " " + board[i][0] + " " + board[i][1] + " " + board[i][2] +" " + board[i][3] +" " + board[i][4] +" " + board[i][5] +" " + board[i][6]+ " " +board[i][7]);
		}
		
		
		
		System.out.println(" ");
		
		
	}
	
        /* pre:  enter queen command 
	 * post: validity
	 */
	public static boolean queencheck(int num1a, int num1b, int num2a, int num2b, String q, String[][] board) {
		if(board[num1a][num1b].equalsIgnoreCase("q") | board[num1a][num1b].equalsIgnoreCase("Q")) {
			int i;
			
			// determining if it's similar to rook move
			if(num2a == num1a | num2b == num1b) {
				
				//see rook for more in-depth comenting, at is is the same code , only slightly ajusted
				
			    if (num1a == num2a && num1b == num2b)
			        return false;

			    // Check collision
			    if (num1a == num2a) {
			        // x-axis
			        if (num1b < num2b) {
			            for (i = num1b + 1; i != num2b; ++i) // Right
			                if (board[num1a][i] != "E" ) {
			                	if(capture(num1a,i,q, board) == true) {
			                		return false;
			                	}
			                	return false;
			                }
			                	
			        } else {
			            for (i = num1b - 1; i != num2b; --i) // Left
			                if (board[num1a][i] != "E") {
			                	if(capture(num1a,i,q, board) == true) {
			                		return false;
			                	}
			                    return false;
			                }
			        }
			    }else if (num1b == num2b) {
			        // y-axis
			        if (num1a < num2a) {
			            for (i = num1a + 1; i != num2a; ++i) // Up
			                if (board[i][num1b] != "E") {
			                	if(capture(i,num1b,q, board)== true) {
			                		return false;
			                	}
			                    return false;
			                }
			        } else {
			            for (i = num1a - 1; i != num2a; --i) // Down
			                if (board[i][num1b] != "E") {
			                	if(capture(i,num1b,q, board) == true) {
			       
			                		return false;
			                	}
			                    return false;
			                }
			        }
			        
			    } else {
			        return false;
			    }
			    if(board[num2a][num2b] != "E"){
					if(capture(num2a,num2b,q, board) == true) {
		        		return true;
		        	}
					else {
						return false;
					}
				}

			    return true;
			}
			
			// checking to see if it's the bishop move
			else if (Math.abs(num1a - num2a) == Math.abs(num1b - num2b)) {
				
				
				// see bishop for comments as it's the roughly the same code.
				if(num1a == num2a || num1b == num2b){
					
					return false;
				}
				
				if(Math.abs(num2a - num1a) != Math.abs(num2b - num1b)){
					return false;
				}
				
				int row, col;
				
				if(num1a < num2a){
					row = 1;
				}else{
					row = -1;
				}
				
				if(num1b < num2b){
					col = 1;
				}else{
					col = -1;
				}
				
				
				int y = num1b + col;
				
				
				for(int x = num1a + row; x != num2a; x += row){
					if(board[x][y] != "E"){
						if(capture(x,y,q, board) == true) {
		            		return false;
		            	}
						else {
							return false;
						}
				
						
					}
					
					
					y += col;
				}
				if(board[num2a][num2b] != "E"){
					if(capture(num2a,num2b,q, board) == true) {
		        		return true;
		        	}
					else {
						return false;
					}
				}
				
				return true;
			
		}
		
			
			else {
			return false;
		}
	}
		else {
			return false;
		}
		
		
	}
        
        /* Translate chess notation into array location
         * Pre: valid position and in lower case
         * Post: array location returned
         */
	public static int pos_translate (String pos)
    {
       // simply takes a relgular chess move and makes it an arry corridiante
        switch (pos)
       {
           case "a":
               return 0;
           case "b":
               return 1;
           case "c":
               return 2;
           case "d":
               return 3;
           case "e":
               return 4;
           case "f":
               return 5;
           case "g":
               return 6;
           case "h":
               return 7;
           default:
               return 8-Integer.parseInt(pos);
                  
       }
                
    }
        
    /*
        pre: int x_pos, int y_pos
        post: returns trasnlated cordinate
        */
    public static String pos_translate_reverse (int x_pos, int y_pos)
        {
            String ypos_final = "";
            String xpos_final = String.valueOf(Math.abs(x_pos - 8));
            
	    // same thing as above, just reverse
            switch (y_pos)
            {
                case 0:
                    ypos_final = "A";
                    break;
                    
                case 1:
                    ypos_final = "B";
                    break;
                    
                case 2:
                    ypos_final = "C";
                    break;
                    
                case 3:
                    ypos_final = "D";
                    break;
                    
                case 4:
                    ypos_final = "E";
                    break;
                
                case 5:
                    ypos_final = "F";
                    break;
                
                case 6:
                    ypos_final = "G";
                    break;
                
                case 7:
                    ypos_final = "H";
                    break;
                    
            }
            
            return ypos_final + xpos_final;
        }
        
        
        /* Move piece to location on board
         * Pre: place1, place2, valid piece 
         * Post: piece moved
         */
	public static void move(int x1, int y1,int x2,int y2,String piece, String[][] board) {
		board[x1][y1] = "E";
		board[x2][y2] = piece;
		
	}
	
	
    /* Determine if pawn move is legal
     * Pre: valid cords
     * Post: boolean representing if move is valid returned
     * X = row, y = coll
     */
    public static boolean pawncheck (int x1, int y1, int x2, int y2, String current_colour, String[][] board)
    {
       if (current_colour.equals("w"))
       {
           if (x1 == 6 && x1-2 == x2 && y1 == y2 && board[x1-2][y1].equals("E") && board[x1-1][y1].equals("E"))
           {
              return true;  
           }
           
           if (x1-1 == x2 && y1 == y2 && board[x1-1][y1].equals("E"))
           {
               return true;
           }
           
           if (x1-1 == x2 && y1+1 == y2)
           {
               return ((!board[x1-1][y1+1].equals("E")) && Character.isLowerCase(board[x1-1][y1+1].charAt(0)));
           }
           
           if (x1-1 == x2 && y1-1 == y2)
           {
               return ((!board[x1-1][y1-1].equals("E")) && Character.isLowerCase(board[x1-1][y1-1].charAt(0)));
           }
           
        
       }
       
       else
       {
           if (x1 == 1 && x1+2 == x2 && y1 == y2 && board[x1+2][y1].equals("E") && board[x1+1][y1].equals("E"))
           {
               return true; 
           }
           
           if (x1+1 == x2 && y1 == y2 && board[x1+1][y1].equals("E"))
           {      
               return true;
           }
           
           if (x1+1 == x2 && y1+1 == y2) 
           {
               return ((!board[x1+1][y1+1].equals("E")) && Character.isUpperCase(board[x1+1][y1+1].charAt(0)));
           }
           
           if (x1+1 == x2 && y1-1 == y2) 
           {
               return ((!board[x1+1][y1-1].equals("E")) && Character.isUpperCase(board[x1+1][y1-1].charAt(0)));
           }
           
       }
       
       return false;
    }
    
    /*
    pre: none
    post: finds out how many pieces were taken or added to total for ai promotion
    */
    public void minus_AI(){
        
        if(promoted_piece_ai.equals("p")){
            amount_pawn_Black -= 1;
            amount_pawn_Black += 1;
        }else if(promoted_piece_ai.equals("P")){
            amount_pawn_White -= 1;
            amount_pawn_White += 1;
        }else if(promoted_piece_ai.equals("r")){
            amount_pawn_Black -= 1;
            amount_rook_Black += 1;
        }else if(promoted_piece_ai.equals("R")){
            amount_pawn_White -= 1;
            amount_rook_White += 1;
        }else if(promoted_piece_ai.equals("n")){
            amount_pawn_Black -= 1;
            amount_knight_Black += 1;
        }else if(promoted_piece_ai.equals("N")){
            amount_pawn_White -= 1;
            amount_knight_White += 1;
        }else if(promoted_piece_ai.equals("b")){
            amount_pawn_Black -= 1;
            amount_bishop_Black += 1;
        }else if(promoted_piece_ai.equals("B")){
            amount_pawn_White -= 1;
            amount_bishop_White += 1;
        }else if(promoted_piece_ai.equals("q")){
            amount_pawn_Black -= 1;
            amount_queen_Black += 1;
        }else if(promoted_piece_ai.equals("Q")){
            amount_pawn_White -= 1;
            amount_queen_White += 1;
        }   
    }
    
    /*
    pre: String piece
    post: finds remaining pieces on board of inputed piece
    */
    public int remaining_pieces(String piece, String[][] board){
          
          int amountonBoard = 0;
          int amount_captured = 0;
          
          for(int i = 0; i < 8; i++){
              for(int j = 0; j < 8; j++){
                  String wanted = board[i][j];
                  
                  if(piece.equals(wanted)){
                      amountonBoard += 1;
                  }
                  
              }
          }
          
          minus_AI();
          if(piece.equals("P")){
              amount_captured = amount_pawn_White - amountonBoard;
          }else if(piece.equals("R")){
              amount_captured = amount_rook_White - amountonBoard;
          }else if(piece.equals("N")){
              amount_captured = amount_knight_White - amountonBoard;
          }else if(piece.equals("B")){
              amount_captured = amount_bishop_White - amountonBoard;
          }else if(piece.equals("Q")){
              amount_captured = amount_queen_White - amountonBoard;
          }else if(piece.equalsIgnoreCase("K")){
              amount_captured = 1 - amountonBoard;
          }else if(piece.equals("p")){
              amount_captured = amount_pawn_Black - amountonBoard;
          }else if(piece.equals("r")){
              amount_captured = amount_rook_Black - amountonBoard;
          }else if(piece.equals("n")){
              amount_captured = amount_knight_Black - amountonBoard;
          }else if(piece.equals("b")){
              amount_captured = amount_bishop_Black - amountonBoard;
          }else if(piece.equals("q")){
              amount_captured = amount_queen_Black - amountonBoard;
          }
          
          return amount_captured;
      }
    

    /* Promote a pawn on the 8th or 1st rank
     * Pre: Pawn move is legal, valid piece given to promote to (defualt queen)
     * Post: Pawn will be promoted to piece of your choice 
     */
    public static boolean promotion( int x2, int y2, String promote_Piece, String[][] board) {
                    boolean return_variable = true;
                        for (y2 = 0; y2 < 8; y2++) {
                            if (board[0][y2].equals("P")) {
                                    
                                    Main_Game.promotion_possible = true;
                                
                                    if (promote_Piece.equalsIgnoreCase("R")) {
                                            board[0][y2] = "R";
                                            amount_pawn_White -= 1;
                                            amount_rook_White += 1;
                                            
                                            return_variable = false;
                                            promotion_possible = false;
                                    } else if (promote_Piece.equalsIgnoreCase("N")) {
                                            board[0][y2] = "N";
                                            amount_pawn_White -= 1;
                                            amount_knight_White += 1;
                                            
                                            return_variable = false;
                                            promotion_possible = false;
                                    } else if (promote_Piece.equalsIgnoreCase("B")) {
                                            board[0][y2] = "B";
                                            amount_pawn_White -= 1;
                                            amount_bishop_White += 1;
                                            
                                            return_variable = false;
                                            promotion_possible = false;
                                    } else if (promote_Piece.equalsIgnoreCase("Q")) {
                                            board[0][y2] = "Q";
                                            amount_pawn_White -= 1;
                                            amount_queen_White += 1;
                                            
                                            return_variable = false;
                                            promotion_possible = false;
                                    }  
                            }
                            if (board[7][y2].equals("p")) {

                                    Main_Game.promotion_possible = true;
                                
                                    if (promote_Piece.equalsIgnoreCase("R")) {
                                            board[7][y2] = "r";
                                            amount_pawn_Black -= 1;
                                            amount_rook_Black +=1;
                                            
                                            return_variable = false;
                                            promotion_possible = false;
                                    } else if (promote_Piece.equalsIgnoreCase("N")) {
                                            board[7][y2] = "n";
                                            amount_pawn_Black -= 1;
                                            amount_knight_Black += 1;
                                            
                                            return_variable = false;
                                            promotion_possible = false;
                                    } else if (promote_Piece.equalsIgnoreCase("B")) {
                                            board[7][y2] = "b";
                                            amount_pawn_Black -= 1;
                                            amount_bishop_Black += 1;
                                            
                                            return_variable = false;
                                            promotion_possible = false;
                                    } else if (promote_Piece.equalsIgnoreCase("Q")) {
                                            board[7][y2] = "q";
                                            amount_pawn_Black -= 1;
                                            amount_queen_Black += 1;
                                            
                                            return_variable = false;
                                            promotion_possible = false;
                                    }
                            }
                    }
                    return return_variable;
    }
	
    
       /* Find attacking pieces of a given square
        * Pre: valid position, direction, and colour
        * Post: location in terms of array of first attacking piece of square is returned 
        */
        public static String ray_trace (int posx, int posy, String direction, String colour, String[][] board)
      {
          
        int xpos;
        int ypos;
        
        if (colour.equals("w"))
        {   //down left
            if (direction.equals("dl"))  
            {
               xpos = posx + 1;
               ypos = posy - 1;    
               while (xpos != 8 && ypos >= 0)
               {
                   if (!board[xpos][ypos].equals("E") && Character.isUpperCase(board[xpos][ypos].charAt(0)))
                   {
                       return Integer.toString(xpos) + Integer.toString(ypos);
                   }

                   xpos++;
                   ypos--;
               }

            }

            //down right
            if (direction.equals("dr"))
            {
               xpos = posx + 1;
               ypos = posy + 1;    
               while (xpos != 8 && ypos != 8)
               {
                   if (!board[xpos][ypos].equals("E") && Character.isUpperCase(board[xpos][ypos].charAt(0)))
                   {
                       return Integer.toString(xpos) + Integer.toString(ypos);
                   }

                   xpos++;
                   ypos++;
               }
            }

            //up left
            if (direction.equals("ul"))
            {
               xpos = posx - 1;
               ypos = posy - 1;    
               while (xpos >= 0 && ypos >= 0)
               {
                   if (!board[xpos][ypos].equals("E") && Character.isUpperCase(board[xpos][ypos].charAt(0)))
                   {
                       return Integer.toString(xpos) + Integer.toString(ypos);
                   }

                   xpos--;
                   ypos--;
               }
            }

            //up right
            if (direction.equals("ur"))
            {
               xpos = posx - 1;
               ypos = posy + 1;    
               while (xpos >= 0 && ypos != 8)
               {
                   if (!board[xpos][ypos].equals("E") && Character.isUpperCase(board[xpos][ypos].charAt(0)))
                   {
                       return Integer.toString(xpos) + Integer.toString(ypos);
                   }

                   xpos--;
                   ypos++;
               }
            }

            //up
            if (direction.equals("u"))
            {
               xpos = posx - 1;
               ypos = posy;
               while (xpos >= 0 )
               {
                   if (!board[xpos][ypos].equals("E") && Character.isUpperCase(board[xpos][ypos].charAt(0)))
                   {
                       return Integer.toString(xpos) + Integer.toString(ypos);
                   }

                   xpos--;
               }
            }

            //down
            if (direction.equals("d"))
            {
               xpos = posx + 1;
               ypos = posy;
               while (xpos != 8 )
               {
                   if (!board[xpos][ypos].equals("E") && Character.isUpperCase(board[xpos][ypos].charAt(0)))
                   {
                       return Integer.toString(xpos) + Integer.toString(ypos);
                   }

                   xpos++;
               }
            }

            //left
            if (direction.equals("l"))
            {
               xpos = posx;
               ypos = posy - 1;
               while (ypos >= 0 )
               {
                   if (!board[xpos][ypos].equals("E") && Character.isUpperCase(board[xpos][ypos].charAt(0)))
                   {
                       return Integer.toString(xpos) + Integer.toString(ypos);
                   }

                   ypos--;
               }
            }

            //right
            if (direction.equals("r"))
            {
               xpos = posx;
               ypos = posy + 1;
               while (ypos != 8 )
               {
                   if (!board[xpos][ypos].equals("E") && Character.isUpperCase(board[xpos][ypos].charAt(0)))
                   {
                       return Integer.toString(xpos) + Integer.toString(ypos);
                   }

                   ypos++;
               }
        
            }
        
        }
        
        else
        {
                //down left
            if (direction.equals("dl"))  
            {
               xpos = posx + 1;
               ypos = posy - 1;    
               while (xpos != 8 && ypos >= 0)
               {
                   if (!board[xpos][ypos].equals("E") && Character.isLowerCase(board[xpos][ypos].charAt(0)))
                   {
                       return Integer.toString(xpos) + Integer.toString(ypos);
                   }

                   xpos++;
                   ypos--;
               }

            }

            //down right
            if (direction.equals("dr"))
            {
               xpos = posx + 1;
               ypos = posy + 1;    
               while (xpos != 8 && ypos != 8)
               {
                   if (!board[xpos][ypos].equals("E") && Character.isLowerCase(board[xpos][ypos].charAt(0)))
                   {
                       return Integer.toString(xpos) + Integer.toString(ypos);
                   }

                   xpos++;
                   ypos++;
               }
            }

            //up left
            if (direction.equals("ul"))
            {
               xpos = posx - 1;
               ypos = posy - 1;    
               while (xpos >= 0 && ypos >= 0)
               {
                   if (!board[xpos][ypos].equals("E") && Character.isLowerCase(board[xpos][ypos].charAt(0)))
                   {
                       return Integer.toString(xpos) + Integer.toString(ypos);
                   }

                   xpos--;
                   ypos--;
               }
            }

            //up right
            if (direction.equals("ur"))
            {
               xpos = posx - 1;
               ypos = posy + 1;    
               while (xpos >= 0 && ypos != 8)
               {
                   if (!board[xpos][ypos].equals("E") && Character.isLowerCase(board[xpos][ypos].charAt(0)))
                   {
                       return Integer.toString(xpos) + Integer.toString(ypos);
                   }

                   xpos--;
                   ypos++;
               }
            }

            //up
            if (direction.equals("u"))
            {
               xpos = posx - 1;
               ypos = posy;
               while (xpos >= 0 )
               {
                   if (!board[xpos][ypos].equals("E") && Character.isLowerCase(board[xpos][ypos].charAt(0)))
                   {
                       return Integer.toString(xpos) + Integer.toString(ypos);
                   }

                   xpos--;
               }
            }

            //down
            if (direction.equals("d"))
            {
               xpos = posx + 1;
               ypos = posy;
               while (xpos != 8 )
               {
                   if (!board[xpos][ypos].equals("E") && Character.isLowerCase(board[xpos][ypos].charAt(0)))
                   {
                       return Integer.toString(xpos) + Integer.toString(ypos);
                   }

                   xpos++;
               }
            }

            //left
            if (direction.equals("l"))
            {
               xpos = posx;
               ypos = posy - 1;
               while (ypos >= 0 )
               {
                   if (!board[xpos][ypos].equals("E") && Character.isLowerCase(board[xpos][ypos].charAt(0)))
                   {
                       return Integer.toString(xpos) + Integer.toString(ypos);
                   }

                   ypos--;
               }
            }

            //right
            if (direction.equals("r"))
            {
               xpos = posx;
               ypos = posy + 1;
               while (ypos != 8 )
               {
                   if (!board[xpos][ypos].equals("E") && Character.isLowerCase(board[xpos][ypos].charAt(0)))
                   {
                       return Integer.toString(xpos) + Integer.toString(ypos);
                   }

                   ypos++;
               }
            }
        
        }
            
        return Integer.toString(posx) + Integer.toString(posy);
      }
        
        
        /* Determine if king is in check
         * Pre: valid colour
         * Post: boolean returned true if check, false if not
         */
        public static boolean is_check (String colour, String[][] board)
      {
            String [] positions = new String [10];
            
            // find king loc
            String king;
            if(colour.equals("w")) {
                    king = "k";
            }
            else {
                    king = "K";
            }
            int kingposx=1;
            int kingposy=1;
            for(int j = 0; j<= 7; j++) {
                    for (int x =0; x <= 7 ; x++) {
                            if(board[j][x].equals(king)) {
                                    kingposx = j;
                                    kingposy = x;
                            }
                    }
            }
            
                //find knights
                String knight;
                int knight1posx = kingposx;
                int knight1posy = kingposy;
                int knight2posx = kingposx;
                int knight2posy = kingposy;
                
                if(colour.equals("w")) {
                    knight = "N";
                }
                else {
                        knight = "n";
                }

                for(int j = 0; j<= 7; j++) {
                        for (int x =0; x <= 7 ; x++) {
                                if(board[j][x].equals(knight)) {
                                        knight1posx = j;
                                        knight1posy = x;
                                }
                        }
                }
                
                for(int j = 7; j >= 0; j--) {
                        for (int x = 7; x >= 0 ; x--) {
                                if(board[j][x].equals(knight)) {
                                        knight2posx = j;
                                        knight2posy = x;
                                }
                        }
                }
                
                positions [8] = Integer.toString(knight1posx)+Integer.toString(knight1posy);
                positions [9] = Integer.toString(knight2posx)+Integer.toString(knight2posy);
                
                
            if (colour.equals("w"))  
            {
                positions[0] = ray_trace(kingposx,kingposy,"u",colour, board);
                positions[1] = ray_trace(kingposx,kingposy,"d",colour, board);
                positions[2] = ray_trace(kingposx,kingposy,"l",colour, board);
                positions[3] = ray_trace(kingposx,kingposy,"r",colour, board);
                positions[4] = ray_trace(kingposx,kingposy,"ul",colour, board);
                positions[5] = ray_trace(kingposx,kingposy,"ur",colour, board);
                positions[6] = ray_trace(kingposx,kingposy,"dl",colour, board);
                positions[7] = ray_trace(kingposx,kingposy,"dr",colour, board);
                
                
                for (String elems : positions)
                {
                    
                    if (board[Integer.parseInt(elems.split("")[0])][Integer.parseInt(elems.split("")[1])].equals("P"))
                    {
                        if (pawncheck(Integer.parseInt(elems.split("")[0]),Integer.parseInt(elems.split("")[1]),kingposx,kingposy,colour, board))
                        {
                            return true;
                        }
                        
                    }

                    else if (board[Integer.parseInt(elems.split("")[0])][Integer.parseInt(elems.split("")[1])].equals("R"))
                    {
                        if (rookcheck(Integer.parseInt(elems.split("")[0]),Integer.parseInt(elems.split("")[1]),kingposx,kingposy,"R", board))
                        {
                            return true;
                        }
                    }
                    
                    else if (board[Integer.parseInt(elems.split("")[0])][Integer.parseInt(elems.split("")[1])].equals("B"))
                    {
                        if (bishop_Collision(Integer.parseInt(elems.split("")[0]),Integer.parseInt(elems.split("")[1]),kingposx,kingposy,"B", board))
                        {
                            return true;
                        }
                    }
                    
                    else if (board[Integer.parseInt(elems.split("")[0])][Integer.parseInt(elems.split("")[1])].equals("N"))
                    {
                        if (knightcheck(Integer.parseInt(elems.split("")[0]),Integer.parseInt(elems.split("")[1]),kingposx,kingposy, board))
                        {
                            return true;
                        }
                    }
                    
                    else if (board[Integer.parseInt(elems.split("")[0])][Integer.parseInt(elems.split("")[1])].equals("Q"))
                    {
                        if (queencheck(Integer.parseInt(elems.split("")[0]),Integer.parseInt(elems.split("")[1]),kingposx,kingposy,"Q", board))
                        {
                            return true;
                        }
                    }
                    
                
                } 

            }
            
            else
            {
                positions[0] = ray_trace(kingposx,kingposy,"u",colour, board);
                positions[1] = ray_trace(kingposx,kingposy,"d",colour, board);
                positions[2] = ray_trace(kingposx,kingposy,"l",colour, board);
                positions[3] = ray_trace(kingposx,kingposy,"r",colour, board);
                positions[4] = ray_trace(kingposx,kingposy,"ul",colour, board);
                positions[5] = ray_trace(kingposx,kingposy,"ur",colour, board);
                positions[6] = ray_trace(kingposx,kingposy,"dl",colour, board);
                positions[7] = ray_trace(kingposx,kingposy,"dr",colour, board);
                
                for (String elems : positions)
                {
                    
                    if (board[Integer.parseInt(elems.split("")[0])][Integer.parseInt(elems.split("")[1])].equals("p"))
                    {
                         if (pawncheck(Integer.parseInt(elems.split("")[0]),Integer.parseInt(elems.split("")[1]),kingposx,kingposy,colour, board))
                         {
                      
                             return true;
                         }
                    }

                    else if (board[Integer.parseInt(elems.split("")[0])][Integer.parseInt(elems.split("")[1])].equals("r"))
                    {
                        if (rookcheck(Integer.parseInt(elems.split("")[0]),Integer.parseInt(elems.split("")[1]),kingposx,kingposy,"r", board))
                        {   
                            return true;
                        }
                    }
                    
                    else if (board[Integer.parseInt(elems.split("")[0])][Integer.parseInt(elems.split("")[1])].equals("b"))
                    {
                        if (bishop_Collision(Integer.parseInt(elems.split("")[0]),Integer.parseInt(elems.split("")[1]),kingposx,kingposy,"b", board))
                        {
                            
                            return true;
                        }
                    }
                    
                    else if (board[Integer.parseInt(elems.split("")[0])][Integer.parseInt(elems.split("")[1])].equals("n"))
                    {
                        if (knightcheck(Integer.parseInt(elems.split("")[0]),Integer.parseInt(elems.split("")[1]),kingposx,kingposy, board))
                        {
                            
                            return true;
                        }
                        
                    }
                    
                    else if (board[Integer.parseInt(elems.split("")[0])][Integer.parseInt(elems.split("")[1])].equals("q"))
                    {
                        if (queencheck(Integer.parseInt(elems.split("")[0]),Integer.parseInt(elems.split("")[1]),kingposx,kingposy,"q", board))
                        {
                       
                            return true;
                        }
                    }
                    
                    
                    
                
                }
            }
      
        
        return false;
         
      }
      
      public static String promoted_piece_ai = "";
     /* pre: enter command and coordinates, main game function
      * post: makes the move and uses other functions to check the validity
      */
	public static boolean move(String colour, int x1, int y1, int x2, int y2, String[][] board) {
                // colour set up
		String r;
		String n;
		String b;
		String k;
		String q;
		String p;
		String opposite_colour;
                String promotion_piece = "L";
                
		if(colour.equalsIgnoreCase("w") == true) {
			r = "R";
			n = "N";
			b = "B";
			k = "K";
			q = "Q";
			p = "P";
			opposite_colour = "b";
		}
		else {
			r = "r";
			n = "n";
			b = "b";
			k = "k";
			q = "q";
			p = "p";
                        opposite_colour = "w";
			
		}
		
                
                
                // if it is a pawn promotion
                String y__2 = Integer.toString(y2);
                if (y__2.length() == 2)
                {
                    if (y__2.split("")[1].matches("[qnrbQNRB]"))
                    {
                        promotion_piece = y__2.split("")[1];
                        y__2 = y__2.split("")[0];
                        promoted_piece_ai = y__2;
                    }
                }
                
                // setting up vairbles for use in the array
		int x1a = y1;
		int y1a = x1;
		int x2a = y2;
		int y2a = x2;
                
		// which perice are they selecting
		if (board[x1a][y1a].equals(r) == true) {
                        //checking validinlty of move
			if (rookcheck(x1a, y1a, x2a, y2a,r, board) == true) {
                                move(x1a,y1a,x2a,y2a,r, board);
				if (!is_check(opposite_colour, board))
                                {
                                    System.out.println("this move works");
                                    return true;
                                }
                                
                                else
                                {
                                    move(x2a,y2a,x1a,y1a,r, board);
                                }
			}
			else {
				System.out.println("you cannot move this peice here");
			}
		}
		else if (board[x1a][y1a].equals(n) == true) {
                        //checking validinlty of move
			if (knightcheck(x1a, y1a, x2a, y2a, board)== true & capture(x2a, y2a,n, board)== true) {
				move(x1a,y1a,x2a,y2a,n, board);
				if (!is_check(opposite_colour, board))
                                {
                                    System.out.println("this move works");
                                    return true;
                                }
                                
                                else
                                {
                                    move(x2a,y2a,x1a,y1a,n, board);
                                }
			}
			else {
				System.out.println("you cannot move this peice here");
			}
		}
		else if (board[x1a][y1a].equals(b) == true) {
                        //checking validinlty of move
			if (bishop_Collision(x1a, y1a, x2a, y2a,b, board)) {
                                move(x1a,y1a,x2a,y2a,b, board);
				if (!is_check(opposite_colour, board))
                                {
                                    System.out.println("this move works");
                                    return true;
                                }
                                
                                else
                                {
                                    move(x2a,y2a,x1a,y1a,b, board);
                                }
			}
			else {
				System.out.println("you cannot move this peice here");
			}
		}
		else if (board[x1a][y1a].equals(k) == true) {
			if (kingcheck(x1a, y1a, x2a, y2a, board)== true ) {
				
				//checking validinlty of move
				
				if (king_Collision(x2a,y2a,k, board)) {
                                        move(x1a,y1a,x2a,y2a,k, board);
                                        if (!is_check(opposite_colour, board))
                                        {
                                            System.out.println("this move works");
                                            kmove = true;
                                            return true;
                                        }
                                        
                                        else
                                        {
                                            move(x2a,y2a,x1a,y1a,k, board);
                                        }
				}
				else {
					System.out.println("you cannot move this peice here");
				}
			}
			else {
                                if (colour.equals("w")){
                                    if (castle(x1a,y1a,x2a,y2a,colour, board).equals("k")) {
                                            move(7,7,7,5,"R", board);
                                            move(7,4,7,6,"K", board);
                                            if (!is_check(opposite_colour, board))
                                            {
                                            System.out.println("castled");
                                            kmove = true;
                                            return true;
                                            }

                                            else
                                            {
                                                move(7,5,7,7,"R", board);
                                                move(7,6,7,4,"K", board);
                                            }
                                    }
                                    
                                    else if (castle(x1a,y1a,x2a,y2a,colour, board).equals("q"))
                                    {
                                            move(7,0,7,3,"R", board);
                                            move(7,4,7,2,"K", board);
                                            if (!is_check(opposite_colour, board))
                                            {
                                            System.out.println("castled");
                                            kmove = true;
                                            return true;
                                            }

                                            else
                                            {
                                                move(7,3,7,0,"R", board);
                                                move(7,2,7,4,"K", board);
                                            }
                                    }
                                    else {
                                            System.out.println("castle failed");
                                            System.out.println("you cannot move this peice here");

                                    }
                                }
                                
                                else
                                {
                                    if (castle(x1a,y1a,x2a,y2a,colour,board).equals("k")) {
                                            move(0,7,0,5,"r", board);
                                            move(0,4,0,6,"k", board);
                                            if (!is_check(opposite_colour, board))
                                            {
                                            System.out.println("castled");
                                            kmove = true;
                                            return true;
                                            }

                                            else
                                            {
                                                move(0,5,0,7,"r", board);
                                                move(0,6,0,4,"k", board);
                                            }
                                    }
                                    
                                    else if (castle(x1a,y1a,x2a,y2a,colour, board).equals("q"))
                                    {
                                            move(0,0,0,3,"r", board);
                                            move(0,4,0,2,"k", board);
                                            if (!is_check(opposite_colour, board))
                                            {
                                            System.out.println("castled");
                                            kmove = true;
                                            return true;
                                            }

                                            else
                                            {
                                                move(0,3,0,0,"r", board);
                                                move(0,2,0,4,"k", board);
                                            }
                                    }
                                    else {
                                            System.out.println("castle failed");
                                            System.out.println("you cannot move this peice here");
                                }
			}
		}
            }
		else if (board[x1a][y1a].equals(q) == true) {
                        //checking validinlty of move
			if (queencheck(x1a, y1a, x2a, y2a,q, board)== true) {
				move(x1a,y1a,x2a,y2a,q, board);
				if (!is_check(opposite_colour, board))
                                {
                                    System.out.println("this move works");
                                    return true;
                                }
                                
                                else
                                {
                                    move(x2a,y2a,x1a,y1a,q, board);
                                }
			}
			else {
				System.out.println("you cannot move this peice here");
			}
		}
		else if (board[x1a][y1a].equals(p) == true) {
                        //checking validinlty of move
			if (pawncheck(x1a, y1a,x2a, y2a,colour, board)== true) {
				move(x1a,y1a,x2a,y2a,p, board);
                                if (!is_check(opposite_colour, board))
                                {
                                    
                                    System.out.println("this move works");
                                    promotion(x2a,y2a,promotion__piece, board);
                                        
                                    
                                    return true;
                                    
                                }else
                                {
                                    move(x2a,y2a,x1a,y1a,p, board);
                                }
                                
                                
                                
			}
			else {
				System.out.println("you cannot move this peice here");
			}
		}
		else {
			System.out.println("this is not a valid peice");
		}
		return false; 
	}
        
         /* Give all legal moves of a given piece
         * Pre: valid colour and x1, and y1 cords
         * Post: String containing all possible moves in format x,y returned
         */
        public static String highlight_squares (int x1,int y1, String colour, String[][] board)
        {
            String square_pos = "";
            Board bor_t = new Board();
            // white pieces
            if (colour.equals("w"))
            {
                //rook
                if (board[x1][y1].equals("R")){
                for(int j = 0; j<= 7; j++) {
                            for (int x =0; x <= 7 ; x++){
                                
                                if (rookcheck(x1,y1,x,j,board[x1][y1], board))
                                {    
                                    bor_t.loadFromFen(FEN_Thing.return_FEN(board, "w"));
                                    bor_t.doMove(new Move(Square.valueOf(pos_translate_reverse(x1,y1)),Square.valueOf(pos_translate_reverse(x,j)))) ;
                                    if(bor_t.squareAttackedBy(bor_t.getKingSquare(Side.WHITE), Side.BLACK) == 0 && !bor_t.getKingSquare(Side.WHITE).equals(Square.valueOf(pos_translate_reverse(x1,y1))))
                                    {
                                        square_pos = square_pos + Integer.toString(x) + Integer.toString(j);
                                    }
                                }
                                
                            }
                        }
                }
                
                //pawn
                if (board[x1][y1].equals("P")){
                for(int j = 0; j<= 7; j++) {
                            for (int x =0; x <= 7 ; x++){
                                
                                if (pawncheck(x1,y1,x,j,colour, board))
                                {   
                                    bor_t.loadFromFen(FEN_Thing.return_FEN(board, "w"));
                                    bor_t.doMove(new Move(Square.valueOf(pos_translate_reverse(x1,y1)),Square.valueOf(pos_translate_reverse(x,j)))) ;
                                    if(bor_t.squareAttackedBy(bor_t.getKingSquare(Side.WHITE), Side.BLACK)== 0 && !bor_t.getKingSquare(Side.WHITE).equals(Square.valueOf(pos_translate_reverse(x1,y1))))
                                    {
                                        square_pos = square_pos + Integer.toString(x) + Integer.toString(j);
                                    }
                                }
                                
                            }
                        }
                }
                
                //bishop
                if (board[x1][y1].equals("B")){
                for(int j = 0; j<= 7; j++) {
                            for (int x =0; x <= 7 ; x++){
                                
                                if (bishop_Collision(x1,y1,x,j,board[x1][y1], board))
                                {   
                                    bor_t.loadFromFen(FEN_Thing.return_FEN(board, "w"));
                                    bor_t.doMove(new Move(Square.valueOf(pos_translate_reverse(x1,y1)),Square.valueOf(pos_translate_reverse(x,j)))) ;
                                    if(bor_t.squareAttackedBy(bor_t.getKingSquare(Side.WHITE), Side.BLACK)== 0 && !bor_t.getKingSquare(Side.WHITE).equals(Square.valueOf(pos_translate_reverse(x1,y1))))
                                    {
                                        square_pos = square_pos + Integer.toString(x) + Integer.toString(j);
                                    }
                                }
                                
                            }
                        }
                }
                
                //knight
                if (board[x1][y1].equals("N")){
                for(int j = 0; j<= 7; j++) {
                            for (int x =0; x <= 7 ; x++){
                                
                                if (knightcheck(x1,y1,x,j, board) && capture (x,j,board[x1][y1], board))
                                {   
                                    bor_t.loadFromFen(FEN_Thing.return_FEN(board, "w"));
                                    bor_t.doMove(new Move(Square.valueOf(pos_translate_reverse(x1,y1)),Square.valueOf(pos_translate_reverse(x,j)))) ;
                                    if(bor_t.squareAttackedBy(bor_t.getKingSquare(Side.WHITE), Side.BLACK)== 0 && !bor_t.getKingSquare(Side.WHITE).equals(Square.valueOf(pos_translate_reverse(x1,y1))))
                                    {
                                        square_pos = square_pos + Integer.toString(x) + Integer.toString(j);
                                    }
                                }
                                
                            }
                        }
                }
                
                //queen
                if (board[x1][y1].equals("Q")){
                for(int j = 0; j<= 7; j++) {
                            for (int x =0; x <= 7 ; x++){
                                
                                if (queencheck(x1,y1,x,j,board[x1][y1], board))
                                {   
                                    bor_t.loadFromFen(FEN_Thing.return_FEN(board, "w"));
                                    bor_t.doMove(new Move(Square.valueOf(pos_translate_reverse(x1,y1)),Square.valueOf(pos_translate_reverse(x,j)))) ;
                                    if(bor_t.squareAttackedBy(bor_t.getKingSquare(Side.WHITE), Side.BLACK)== 0 && !bor_t.getKingSquare(Side.WHITE).equals(Square.valueOf(pos_translate_reverse(x1,y1))))
                                    {
                                        square_pos = square_pos + Integer.toString(x) + Integer.toString(j);
                                    }
                                }
                                
                            }
                        }
                }
                
                //king
                if (board[x1][y1].equals("K")){
                for(int j = 0; j<= 7; j++) {
                            for (int x =0; x <= 7 ; x++){
                                
                                if (((kingcheck(x1, y1,x,j, board) && king_Collision(x,j,board[x1][y1], board)) || ((castle(x1,y1,x,j,colour, board).equals("q") || castle(x1,y1,x,j,colour, board).equals("k")))))
                                {   
                                    bor_t.loadFromFen(FEN_Thing.return_FEN(board, "w"));
                                    bor_t.doMove(new Move(Square.valueOf(pos_translate_reverse(x1,y1)),Square.valueOf(pos_translate_reverse(x,j)))) ;
                                    if(bor_t.squareAttackedBy(bor_t.getKingSquare(Side.WHITE), Side.BLACK)== 0 && !bor_t.getKingSquare(Side.WHITE).equals(Square.valueOf(pos_translate_reverse(x1,y1))))
                                    {
                                        square_pos = square_pos + Integer.toString(x) + Integer.toString(j);
                                    }
                                }
                                
                            }
                        }
                }
                                

            }
                
                
            
            else
            {
                
                //rook
                if (board[x1][y1].equals("r")){
                for(int j = 0; j<= 7; j++) {
                            for (int x =0; x <= 7 ; x++){
                                
                                if (rookcheck(x1,y1,x,j,board[x1][y1], board))
                                {    
                                    bor_t.loadFromFen(FEN_Thing.return_FEN(board, "b"));
                                    bor_t.doMove(new Move(Square.valueOf(pos_translate_reverse(x1,y1)),Square.valueOf(pos_translate_reverse(x,j)))) ;
                                    if(bor_t.squareAttackedBy(bor_t.getKingSquare(Side.BLACK), Side.WHITE)== 0 && !bor_t.getKingSquare(Side.BLACK).equals(Square.valueOf(pos_translate_reverse(x1,y1))))
                                    {
                                        square_pos = square_pos + Integer.toString(x) + Integer.toString(j);
                                    }
                                }
                                
                            }
                        }
                }
                
                //pawn
                if (board[x1][y1].equals("p")){
                for(int j = 0; j<= 7; j++) {
                            for (int x =0; x <= 7 ; x++){
                                
                                if (pawncheck(x1,y1,x,j,colour, board))
                                {   
                                    bor_t.loadFromFen(FEN_Thing.return_FEN(board, "b"));
                                    bor_t.doMove(new Move(Square.valueOf(pos_translate_reverse(x1,y1)),Square.valueOf(pos_translate_reverse(x,j)))) ;
                                    if(bor_t.squareAttackedBy(bor_t.getKingSquare(Side.BLACK), Side.WHITE)== 0 && !bor_t.getKingSquare(Side.BLACK).equals(Square.valueOf(pos_translate_reverse(x1,y1))))
                                    {
                                        square_pos = square_pos + Integer.toString(x) + Integer.toString(j);
                                    }
                                }
                                
                            }
                        }
                }
                
                //bishop
                if (board[x1][y1].equals("b")){
                for(int j = 0; j<= 7; j++) {
                            for (int x =0; x <= 7 ; x++){
                                
                                if (bishop_Collision(x1,y1,x,j,board[x1][y1], board))
                                {   
                                    bor_t.loadFromFen(FEN_Thing.return_FEN(board, "b"));
                                    bor_t.doMove(new Move(Square.valueOf(pos_translate_reverse(x1,y1)),Square.valueOf(pos_translate_reverse(x,j)))) ;
                                    if(bor_t.squareAttackedBy(bor_t.getKingSquare(Side.BLACK), Side.WHITE)== 0 && !bor_t.getKingSquare(Side.BLACK).equals(Square.valueOf(pos_translate_reverse(x1,y1))))
                                    {
                                        square_pos = square_pos + Integer.toString(x) + Integer.toString(j);
                                    }
                                }
                                
                            }
                        }
                }
                
                //knight
                if (board[x1][y1].equals("n")){
                for(int j = 0; j<= 7; j++) {
                            for (int x =0; x <= 7 ; x++){
                                
                                if (knightcheck(x1,y1,x,j, board) && capture (x,j,board[x1][y1], board))
                                {   
                                    bor_t.loadFromFen(FEN_Thing.return_FEN(board, "b"));
                                    bor_t.doMove(new Move(Square.valueOf(pos_translate_reverse(x1,y1)),Square.valueOf(pos_translate_reverse(x,j)))) ;
                                    if(bor_t.squareAttackedBy(bor_t.getKingSquare(Side.BLACK), Side.WHITE)== 0 && !bor_t.getKingSquare(Side.BLACK).equals(Square.valueOf(pos_translate_reverse(x1,y1))))
                                    {
                                        square_pos = square_pos + Integer.toString(x) + Integer.toString(j);
                                    }
                                }
                                
                            }
                        }
                }
                
                //queen
                if (board[x1][y1].equals("q")){
                for(int j = 0; j<= 7; j++) {
                            for (int x =0; x <= 7 ; x++){
                                
                                if (queencheck(x1,y1,x,j,board[x1][y1], board))
                                {   
                                    bor_t.loadFromFen(FEN_Thing.return_FEN(board, "b"));
                                    bor_t.doMove(new Move(Square.valueOf(pos_translate_reverse(x1,y1)),Square.valueOf(pos_translate_reverse(x,j)))) ;
                                    if(bor_t.squareAttackedBy(bor_t.getKingSquare(Side.BLACK), Side.WHITE)== 0 && !bor_t.getKingSquare(Side.BLACK).equals(Square.valueOf(pos_translate_reverse(x1,y1))))
                                    {
                                        square_pos = square_pos + Integer.toString(x) + Integer.toString(j);
                                    }
                                }
                                
                            }
                        }
                }
                
                //king
                if (board[x1][y1].equals("k")){
                for(int j = 0; j<= 7; j++) {
                            for (int x =0; x <= 7 ; x++){
                                
                                if (((kingcheck(x1, y1,x,j, board) && king_Collision(x,j,board[x1][y1], board)) || ((castle(x1,y1,x,j,colour, board).equals("q") || castle(x1,y1,x,j,colour, board).equals("k")))))
                                {   
                                    bor_t.loadFromFen(FEN_Thing.return_FEN(board, "b"));
                                    bor_t.doMove(new Move(Square.valueOf(pos_translate_reverse(x1,y1)),Square.valueOf(pos_translate_reverse(x,j)))) ;
                                    if(bor_t.squareAttackedBy(bor_t.getKingSquare(Side.BLACK), Side.WHITE)== 0 && !bor_t.getKingSquare(Side.BLACK).equals(Square.valueOf(pos_translate_reverse(x1,y1))))
                                    {
                                        square_pos = square_pos + Integer.toString(x) + Integer.toString(j);
                                    }
                                 
                                }
                                
                            }
                        }
                }
                            
            
                            
        }
            if((White_turn == true && colour.equals("b"))||(White_turn == false && colour.equals(""))){
                square_pos = "";
            }
            
            return square_pos; 
                
    }
            
            
    public static String Multiplayer = "m"; 
        
       
	
}
        
