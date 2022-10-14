package cs1302.game;

import cs1302.gameutil.GamePhase;
import cs1302.gameutil.Token;
import cs1302.gameutil.TokenGrid;

/**                                                                                                                                                           
 * {@code ConnectFour} represents a two-player connection game involving a two-dimensional grid of                                                            
 * {@linkplain cs1302.gameutil.Token tokens}. When a {@code ConnectFour} game object is                                                                       
 * constructed, several instance variables representing the game's state are initialized and                                                                  
 * subsequently accessible, either directly or indirectly, via "getter" methods. Over time, the                                                               
 * values assigned to these instance variables should change so that they always reflect the                                                                  
 * latest information about the state of the game. Most of these changes are described in the                                                                 
 * project's <a href="https://github.com/cs1302uga/cs1302-c4-alpha#functional-requirements">                                                                  
 * functional requirements</a>.                                                                                                                               
 */
public class ConnectFour {

    //----------------------------------------------------------------------------------------------                                                          
    // INSTANCE VARIABLES: You should NOT modify the instance variable declarations below.                                                                    
    // You should also NOT add any additional instance variables. Static variables should                                                                     
    // also NOT be added.                                                                                                                                     
    //----------------------------------------------------------------------------------------------                                                          

    private int rows;        // number of grid rows                                                                                                           
    private int cols;        // number of grid columns                                                                                                        
    private Token[][] grid;  // 2D array of tokens in the grid                                                                                                
    private Token[] player;  // 1D array of player tokens (length 2)                                                                                          
    private int numDropped;  // number of tokens dropped so far                                                                                               
    private int lastDropRow; // row index of the most recent drop                                                                                             
    private int lastDropCol; // column index of the most recent drop                                                                                          
    private GamePhase phase; // current game phase                                                                                                            

    //----------------------------------------------------------------------------------------------                                                          
    // CONSTRUCTOR                                                                                                                                            
    //----------------------------------------------------------------------------------------------                                                          

    /**                                                                                                                                                       
     * Constructs a {@link cs1302.game.ConnectFour} game with a grid that has {@code rows}-many                                                               
     * rows and {@code cols}-many columns. All of the game's instance variables are expected to                                                               
     * be initialized by this constructor as described in the project's                                                                                       
     * <a href="https://github.com/cs1302uga/cs1302-c4-alpha#functional-requirements">functional                                                              
     * requirements</a>.                                                                                                                                      
     *                                            
      * @param rows the number of grid rows                                                                                                                    
     * @param cols the number of grid columns                                                                                                                 
     * @throws IllegalArgumentException if the value supplied for {@code rows} or {@code cols} is                                                             
     *     not supported. The following values are supported: {@code 6 <= rows <= 9} and                                                                      
     *     {@code 7 <= cols <= 9}.                                                                                                                            
     */
    public ConnectFour(int rows, int cols)  {
        //                                                                                                                                                    
        // replace the entire contents of this constructor with your implementation                                                                           
        //                                                                                                                                                    
       // throw new UnsupportedOperationException("constructor: not yet implemented.");                                                                       
        if (rows < 6 || rows > 9 || cols < 7 || cols > 9) {
            throw new IllegalArgumentException ("ConnectFour:Not allowed in rows/cols constructor");
        }

        this.rows = rows;
        this.cols = cols;
        this.grid = new Token[rows][cols];
        this.player = new Token[2];
        this.numDropped = 0;
        this.lastDropRow = -1;
 this.lastDropRow = -1;
        this. lastDropCol = -1;
        this.phase = GamePhase.NEW;
    } // ConnectFour                                                                                                                                          

    //----------------------------------------------------------------------------------------------                                                          
    // INSTANCE METHODS                                                                                                                                       
    //----------------------------------------------------------------------------------------------                                                          

    /**                                                                                                                                                       
     * Return the number of rows in the game's grid.                                                                                                          
     *                                                                                                                                                        
     * @return the number of rows                                                                                                                             
     */
    public int getRows() {
        //                                                                                                                                                    
        // replace the entire contents of this method with your implementation                                                                                
        //                                                                                                                                                    
        //throw new UnsupportedOperationException("getRows: not yet implemented.");                                                                           
        return this.rows;

    } // getRows     
      /**                                                                                                                                                       
     * Return the number of columns in the game's grid.                                                                                                       
     *                                                                                                                                                        
     * @return the number of columns                                                                                                                          
     */
    public int getCols() {
        return this.cols;
        //                                                                                                                                                    
        // replace the entire contents of this method with your implementation                                                                                
        //                                                                                                                                                    
        //throw new UnsupportedOperationException("getCols: not yet implemented.");                                                                           
    } // getCols                                                                                                                                              

    /**                                                                                                                                                       
     * Return whether {@code row} and {@code col} specify a location inside this game's grid.                                                                 
     *                                                                                                                                                        
     * @param row the position's row index                                                                                                                    
     * @param col the positions's column index                                                                                                                
     * @return {@code true} if {@code row} and {@code col} specify a location inside this game's                                                              
     *     grid and {@code false} otherwise    
     */
    public boolean isInBounds(int row, int col) {
        //                                                                                                                                                    
        // replace the entire contents of this method with your implementation                                                                                
        //                                                                                                                                                    
       // throw new UnsupportedOperationException("isInBounds: not yet implemented.");                                                                        

        if (row >= this.rows || row < 0 || col >= this.cols || col < 0) {
            return false;
        }
        return true;
    } // isInBounds                                                                                                                                           

    /**                                                                                                                                                       
     * Return the grid {@linkplain cs1302.gameutil.Token token} located at the specified position                                                             
     * or {@code null} if no token has been dropped into that position.                                                                                       
     *                                                                                                                                                        
     * @param row the token's row index                                                                                                                       
     * @param col the token's column index                                                                                                                    
     * @return the grid token located in row {@code row} and column {@code col}, if it exists;                                                                
     *     otherwise, the value {@code null}     
      * @throws IndexOutOfBoundsException if {@code row} and {@code col} specify a position that is                                                            
     *     not inside this game's grid.                                                                                                                       
     */
    public Token getTokenAt(int row, int col) {
        //                                                                                                                                                    
        // replace the entire contents of this method with your implementation                                                                                
        //                                                                                                                                                    
        //throw new UnsupportedOperationException("getTokenAt: not yet implemented.");                                                                        
        if (row > this.rows || row < 0 || col > this.cols || col < 0) {
            throw new IndexOutOfBoundsException("getTokenAt:Position is not inside game's grid");
        }
        if (!this.isInBounds (row,col)) {
            return null;
        } else {
            try {
                return this.grid [row][col];
            } catch (NullPointerException e) {
                return null;
            }
        }
 } // getTokenAt                                                                                                                                           

    /**                                                                                                                                                       
     * Set the first player token and second player token to {@code token0} and {@code token1},                                                               
     * respectively. If the current game phase is {@link cs1302.gameutil.GamePhase#NEW}, then                                                                 
     * this method changes the game phase to {@link cs1302.gameutil.GamePhase#READY}, but only                                                                
     * if no exceptions are thrown.                                                                                                                           
     *.                                                                                                                                                       
     * @param token0 token for first player                                                                                                                   
     * @param token1 token for second player                                                                                                                  
     * @throws NullPointerException if {@code token0} or {@code token1} is {@code null}.                                                                      
     * @throws IllegalArgumentException if {@code token0 == token1}.                                                                                          
     * @throws IllegalStateException if {@link #getPhase getPhase()} returns                                                                                  
     *     {@link cs1302.gameutil.GamePhase#PLAYABLE} or {@link cs1302.gameutil.GamePhase#OVER}.                                                              
     */
    public void setPlayerTokens(Token token0, Token token1) {
        //                                                                                                                                                    
        // replace the entire contents of this method with your implementation                                                                                
        //                                                                                                                                                    
       // throw new UnsupportedOperationException("setPlayerTokens: not yet implemented.");                                                                   
	if (token0 == null || token1 == null) {
            throw new NullPointerException ("setPlayerTokens: token0 or token1 is null");
        }
        if (token0 == token1) {
            throw new IllegalArgumentException ("setPlayerTokens: token0 and token1 are equal");
        }
        if (getPhase() == GamePhase.PLAYABLE || getPhase() == GamePhase.OVER) {
            throw new IllegalStateException ("setPlayerTokens:PLAYABLE or OVER states not allowed");
        }
        this.player[0] = token0;
        this.player[1] = token1;
        this.phase = GamePhase.READY;

    }

    /**                                                                                                                                                       
     * Return a player's token.                                                                                                                               
     *                                                                                                                                                        
     * @param player the player ({@code 0} for first player and {@code 1} for second player)                                                                  
     * @return the token for the specified player                                                                                                             
     * @throws IllegalArgumentException if {@code player} is neither {@code 0} nor {@code 1}                                                                  
     * @throws IllegalStateException if {@link #getPhase getPhase()} returns                                                                                  
     *     {@link cs1302.gameutil.GamePhase#NEW}.                                                                                                             
     */
public Token getPlayerToken(int player) {
        //                                                                                                                                                    
        // replace the entire contents of this method with your implementation                                                                                
        //                                                                                                                                                    
       // throw new UnsupportedOperationException("getPlayerToken: not yet implemented.");                                                                    
        if (player != 0 && player != 1) {
            throw new IllegalArgumentException ("getPlayerToken:neither player0 nor player1");
        }
        if (getPhase() == GamePhase.NEW) {
            throw new IllegalStateException ("getPlayerToken: NEW state not allowed");
        }
        return this.player[player];
    } // getPlayerToken                                                                                                                                       

    /**                                                                                                                                                       
     * Return the number of tokens that have been dropped into this game's grid so far.                                                                       
     *                                                                                                                                                        
     * @return the number of dropped tokens                                                                                                                   
     * @throws IllegalStateException if {@link #getPhase getPhase()} returns                                                                                  
     *     {@link cs1302.gameutil.GamePhase#NEW} or {@link cs1302.gameutil.GamePhase#READY}.
      */
    public int getNumDropped() {
        //                                                                                                                                                    
        // replace the entire contents of this method with your implementation                                                                                
        //                                                                                                                                                    

      //throw new UnsupportedOperationException("getNumDropped: not yet implemented.");                                                                       
        if (getPhase() == GamePhase.NEW || getPhase() == GamePhase.READY) {
            throw new IllegalStateException ("getNumDropped: NEW state not allowed");
        }
        return this.numDropped;
    } // getNumDropped                                                                                                                                        

    /**                                                                                                                                                       
     * Return the row index of the last (i.e., the most recent) token dropped into this                                                                       
     * game's grid.                                                                                                                                           
     *                                                                                                                                                        
     * @return the row index of the last drop                                                                                                                 
     * @throws IllegalStateException if {@link #getPhase getPhase()} returns                                                                                  
     *     {@link cs1302.gameutil.GamePhase#NEW} or {@link cs1302.gameutil.GamePhase#READY}.                                                                  
     */
    public int getLastDropRow() {
        if (getPhase() == GamePhase.NEW || getPhase() == GamePhase.READY) {
             throw new IllegalStateException ("getPlayerToken: NEW state not allowed");
        }

        //                                                                                                                                                    
        // replace the entire contents of this method with your implementation                                                                                
        //                                                                                                                                                    
        //throw new UnsupportedOperationException("getLastDropRow: not yet implemented.");                                                                    
        return this.lastDropRow;

    } // getLastDropRow                                                                                                                                       

    /**                                                                                                                                                       
     * Return the col index of the last (i.e., the most recent) token dropped into this                                                                       
     * game's grid.                                                                                                                                           
     *                                                                                                                                                        
     * @return the column index of the last drop                                                                                                              
     * @throws IllegalStateException if {@link #getPhase getPhase()} returns                                                                                  
     *     {@link cs1302.gameutil.GamePhase#NEW} or {@link cs1302.gameutil.GamePhase#READY}.                                                                  
     */
    public int getLastDropCol() {
        //                                                                                                                                                    
        // replace the entire contents of this method with your implementation   
        //                                                                                                                                                    
        //throw new UnsupportedOperationException("getLastDropCol: not yet implemented.");                                                                    
        if (getPhase() == GamePhase.NEW || getPhase() == GamePhase.READY) {
            throw new IllegalStateException ("getLastDropCol: NEW state not allowed");
        }
        return this.lastDropCol;
    } // getLastDropCol                                                                                                                                       

    /**                                                                                                                                                       
     * Return the current game phase.                                                                                                                         
     *                                                                                                                                                        
     * @return current game phase                                                                                                                             
     */
    public GamePhase getPhase() {
        //                                                                                                                                                    
        // replace the entire contents of this method with your implementation                                                                                
        //                                                                                                                                                    
        //throw new UnsupportedOperationException("getPhase: not yet implemented.");                                                                          
        return this.phase;

    } // getPhase       
    /**                                                                                                                                                       
     * Drop a player's token into a specific column in the grid. This method should not enforce turn                                                          
     * order -- that is the players' responsibility should they desire an polite and honest game.                                                             
     *                                                                                                                                                        
     * @param player the player ({@code 0} for first player and {@code 1} for second player)                                                                  
     * @param col the grid column where the token will be dropped                                                                                             
     * @throws IndexOutOfBoundsException if {@code col} is not a valid column index                                                                           
     * @throws IllegalArgumentException if {@code player} is neither {@code 0} nor {@code 1}                                                                  
     * @throws IllegalStateException if {@link #getPhase getPhase()} does not return                                                                          
     *    {@link cs1302.gameutil.GamePhase#READY} or {@link cs1302.gameutil.GamePhase#PLAYABLE}                                                               
     * @throws IllegalStateException if the specified column in the grid is full                                                                              
     */
    public void dropToken(int player, int col) {
        //                                                                                                                                                    
        // replace the entire contents of this method with your implementation                                                                                
        //                                                                                                                                                    
        //throw new UnsupportedOperationException("dropToken: not yet implemented.");                                                                         
        if (col >= 9 && col <= 0) {
            throw new IndexOutOfBoundsException ("dropToken: columns is not 0-8");
        }
        if (player != 0 && player != 1) {
 throw new IllegalArgumentException ("dropToken:neither player0 nor player1");
        }
        if (getPhase() == GamePhase.NEW || getPhase() == GamePhase.OVER) {
            throw new IllegalStateException ("dropToken: NEW state not allowed");
        }
        this.phase = GamePhase.PLAYABLE;
        for (int row = this.rows - 1; row >= 0; row--) {

            if (this.grid[row][col] == null) {

                this.grid[row][col] = getPlayerToken(player);


                this.lastDropRow = row;

                this.lastDropCol = col;

                this.numDropped++;

                if (this.numDropped == (this.rows * this.cols)) {

                    this.phase = GamePhase.OVER;
                    //throw new IllegalStateException ("dropToken: grid is full");                                                                                                
                }

                break;

            }

        }
    }

    // dropToken                                                                                                                                              

    /**                                                                                                                                                       
     * Return {@code true} if the last token dropped via {@link #dropToken} created a                                                                         
     * <em>connect four</em>. A <em>connect four</em> is a sequence of four equal tokens (i.e., they                                                          
     * have the same color) -- this sequence can occur horizontally, vertically, or diagonally.                                                               
     * If the grid is full or the last drop created a <em>connect four</em>, then this method                                                                 
     * changes the game's phase to {@link cs1302.gameutil.GamePhase#OVER}.                                                                                    
     *                                                                                                                                                        
     * <p>                                                                                                                                                    
     * <strong>NOTE:</strong> The only instance variable that this method might change, if                                                                    
     * applicable, is ``phase``.                  
      *                                                                                                                                                        
     * <p>                                                                                                                                                    
     * <strong>NOTE:</strong> If you want to use this method to determin a winner, then you must                                                              
     * call it after each call to {@link #dropToken}.                                                                                                         
     *                                                                                                                                                        
     * @return {@code true} if the last token dropped created a <em>connect four</em>, else                                                                   
     *     {@code false}                                                                                                                                      
     */
    public boolean isLastDropConnectFour() {
        //                                                                                                                                                    
        // replace the entire contents of this method with your implementation                                                                                
        //                                                                                                                                                    
// throw new UnsupportedOperationException("isWinner: not yet implemented.");                                                                                 
        Token lastToken = getTokenAt(getLastDropRow(), getLastDropCol());

// check for 4 across                                                                                                                                         
        for (int row = this.rows - 1; row >= 0; row--) {
            for (int col = this.cols - 4; col >= 0; col--) {
                if (this.grid[row][col] == lastToken &&
                    this.grid[row][col + 1] == lastToken &&
                    this.grid[row][col + 2] == lastToken &&
                    this.grid[row][col + 3] == lastToken) {
                        this.phase = GamePhase.OVER;
                    return true;
                }
            }
        }
// check for 4 up and down                                                                                                                                    
        for (int row = this.rows - 4; row >= 0; row--) {
            for (int col = this.cols - 1; col >= 0; col--) {
                if (this.grid[row][col] == lastToken &&
                    this.grid[row + 1][col] == lastToken &&
                    this.grid[row + 2][col] == lastToken &&
                    this.grid[row + 3][col] == lastToken) {
                    this.phase = GamePhase.OVER;
                    return true;
                }
            }
        }
// check upward diagonal                                                                                                                                      
        for (int row = this.rows - 1; row >= 3; row--) { // 6 ; 6 , 5 , 4                                                                                     
            for (int col = this.cols - 4; col >= 0; col--) { // 5 ; 5,4,3,2,1                                                                                 
                if (this.grid[row][col] == lastToken && // 6,5                                                                                                
                                this.grid[row - 1][col + 1] == lastToken && // 5,6 
                                 this.grid[row - 2][col + 2] == lastToken && // 4,7                                                                            
                                this.grid[row - 3][col + 3] == lastToken) { // 3,8                                                                            
                    this.phase = GamePhase.OVER;
                    return true;
                }
            }
        }
// check downward diagonal                                                                                                                                    
        for (int row = this.rows - 4; row >= 0; row--) { // 3 ; 3 , 2 , 1                                                                                     
            for (int col = this.cols - 4; col >= 0; col--) { // 5 ; 5 , 4 , 3 , 2 , 1                                                                         
                if (this.grid[row][col] == lastToken && // 3,5                                                                                                
                    this.grid[row + 1][col + 1] == lastToken && // 4,6                                                                                        
                    this.grid[row + 2][col + 2] == lastToken && // 5,7                                                                                        
                    this.grid[row + 3][col + 3] == lastToken) { // 6,8                                                                                        
                    this.phase = GamePhase.OVER;
                    return true;
                }
            }
        }
        return false;
    } // isLastDropConnectFour           
     //----------------------------------------------------------------------------------------------                                                          
    // ADDITIONAL METHODS: If you create any additional methods, then they should be placed in the                                                            
    // space provided below.                                                                                                                                  
    //----------------------------------------------------------------------------------------------                                                          




    //----------------------------------------------------------------------------------------------                                                          
    // DO NOT MODIFY THE METHODS BELOW!                                                                                                                       
    //----------------------------------------------------------------------------------------------                                                          

    /**                                                                                                                                                       
     * <strong>DO NOT MODIFY:</strong>                                                                                                                        
     * Print the game grid to standard output. This method assumes that the constructor                                                                       
     * is implemented correctly.                                                                                                                              
     *                                                                                                                                                        
     * <p>                                                                                                                                                    
     * <strong>NOTE:</strong> This method should not be modified!                                                                                             
     */
    public void printGrid() {
         TokenGrid.println(this.grid);
    } // printGrid                                                                                                                                            

    /**                                                                                                                                                       
     * <strong>DO NOT MODIFY:</strong>                                                                                                                        
     * Construct a {@link cs1302.game.ConnectFour} game object from the description provided in the                                                           
     * the specified file. This method assumes the following about the contents of the file:                                                                  
     *                                                                                                                                                        
     * 1) the first two entries in the file denote the {@code rows} and {@code cols} that should be                                                           
     *    passed into the {@link cs1302.game.ConnectFour} constructor;                                                                                        
     * 2) the next two entries denote the token names for the first and second player;                                                                        
     * 3) if present, the next {@code (rows * cols + 2)}-many entries specify the contents of the                                                             
     *    grid and the location of the last drop -- of these, the first {@code (rows * cols)}-many                                                            
     *    entries denote the grid and the last two entries denote the row and column index of the                                                             
     *    last drop.                                                                                                                                          
     *                                                                                                                                                        
     * The descriptions are assumed to be always be valid. If the game is won, then it must due to                                                            
     * the last drop.                                                                                                                                         
     *                                                                                                                                                        
     * <p> Here is an example of what the contents of a valid file might look like for a game with a                                                          
     * 6-by-7 grid:                                                                                                                                           
     *                          
      * <pre>                                                                                                                                                  
     * 6 7 RED BLUE                                                                                                                                           
     * 3 3 3 3 3 3 3                                                                                                                                          
     * 3 3 3 3 3 3 3                                                                                                                                          
     * 3 3 0 3 3 3 3                                                                                                                                          
     * 3 3 0 3 3 3 3                                                                                                                                          
     * 1 3 0 3 3 3 3                                                                                                                                          
     * 0 1 0 1 1 3 3                                                                                                                                          
     * 2 2                                                                                                                                                    
     * </pre>                                                                                                                                                 
     *                                                                                                                                                        
     * <p>                                                                                                                                                    
     * <strong>NOTE:</strong> This method should not be modified!                                                                                             
     *                                                                                                                                                        
     * @param filename path to a file describing a game                                                                                                       
     * @return game object constructed from the file                                                                                                          
     * @throws java.io.FileNotFoundException if the specified file cannot be found                                                                            
     */
    public static ConnectFour fromFile(String filename) throws java.io.FileNotFoundException {
        java.io.File file = new java.io.File(filename);
        java.util.Scanner fileScanner = new java.util.Scanner(file);
        // first two entries in file specify the grid size   
         int rows = fileScanner.nextInt();
        int cols = fileScanner.nextInt();
        // next two entries are the player's token names                                                                                                      
        Token token0 = Token.valueOf(fileScanner.next());
        Token token1 = Token.valueOf(fileScanner.next());
        // construct the game object and set the player tokens                                                                                                
        ConnectFour game = new ConnectFour(rows, cols);
        game.setPlayerTokens(token0, token1);
        if (fileScanner.hasNext()) {
            // next (rows * cols)-many entries denote the grid                                                                                                
            for (int row = rows - 1; row >= 0; row--) {
                for (int col = 0; col < cols; col++) {
                    int player = fileScanner.nextInt();
                    if (player != 3) {
                        game.dropToken(player, col);
                    } // if                                                                                                                                   
                } // for                                                                                                                                      
            } // for                                                                                                                                          
            // last two entries denote the position of the latest drop                                                                                        
            game.lastDropRow = fileScanner.nextInt();
            game.lastDropCol = fileScanner.nextInt();
            // trigger phase change if game is won or full 
               game.isLastDropConnectFour();
               } // if                                                                                                                                          
          return game;
          } // fromFile                                                                                                                                        
      }