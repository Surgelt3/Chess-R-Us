// package statement
package cpt_chess;

// class for handling experience points and leveling up

import static cpt_chess.CPT_Chess.level_str;

public class Experience {

//vars
public static int XPtot = 0;
public static int level = 0;

/* level the user up
 * Pre: n/a
 * Post: player's level will be assgined based on total exp
 */
public static int levelUp() 
{
    level = (int) Math.floor(XPtot/100);
    
    return level;
}

/* return the amount of xp towards the current level
 * Pre: n/a
 * Post: amount of xp towards currrent level returned 
 */
public static int get_remainder ()
{
    return (int) XPtot % 100;
}

/* add experince points to user 
 * Pre: game_state is either w (win), d (draw), or anytrhing else (lost)
 * Post: Exp based on user performance will be assigned 
 */
public static void add_exp (String game_state)
{
    if (!test_chess.Multiplayer.equals("m"))
        switch (game_state)
        {
            case "w":
                XPtot += Integer.valueOf(level_str) * (3);

            case "d":
                XPtot+= Integer.valueOf(level_str) * (2);

            default:
                XPtot += Integer.valueOf(level_str);

        }
    
    else
    {
        XPtot+= 20;
    }
}
}

