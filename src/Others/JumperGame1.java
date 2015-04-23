/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;
import java.util.*;
/**
 *
 * @author bharath
 */
public class JumperGame1 {
    public static final int N = 3;
    public static int[][] board;
    public static boolean [][] visited;
    public static boolean flagOther;
    public static ArrayList<Integer> allPossibleLen;
    
    public static void initializeBoard(){
        Random rg = new Random();
        board = new int[N][N];
        visited = new boolean[N][N];
        allPossibleLen = new ArrayList ();
        flagOther = false;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int rndInt = rg.nextInt(5);
                board[i][j] = rndInt%3;
                visited[i][j] = false;
            }
        }
    }
    
    public static void displayBoard(){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void resetBookMarks(){
        flagOther = false;
        //Reset visited matrix
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
               visited[i][j] = false;
            }
        }
    }
    
    public static int findLength(int row, int col, int len, int playerCode){
        if(row<0 || row>=N)
            return len;
        else if (col<0 || col>=N)
            return len;
        else if(board[row][col]==0){
            visited[row][col] = true;
            //board[row][col] = playerCode;
            return len;
        }
        else if(visited[row][col])
            return len;
        else if(!flagOther && board[row][col]!=playerCode){ //Other players box can be visited only once
            flagOther = true;
            visited[row][col]=true;
            len = len+1;
        }
        else if(board[row][col]==playerCode){
            visited[row][col]=true;
            len = len+1;
        }
        int newLen = findLength(row-1, col, len, playerCode);
        allPossibleLen.add(newLen);
        newLen = findLength(row+1, col, len, playerCode);
        allPossibleLen.add(newLen);
        newLen = findLength(row, col-1, len, playerCode);
        allPossibleLen.add(newLen);
        newLen = findLength(row, col+1, len, playerCode);
        allPossibleLen.add(newLen);
        return len;
    }
    
    public static boolean isGameOver(){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(board[i][j]==0)
                    return false;
            }
        }
        return true;
    }
    
    public static void playGame(){
        Scanner in = new Scanner(System.in);
        int player=1;
        int row,col;
        
        while(!isGameOver()){
            System.out.println("Player "+player+" turn");
            System.out.println("Enter row index");
            row=in.nextInt();
            System.out.println("Enter col index");
            col=in.nextInt();
            int len = 0;
            len = findLength(row,col,len,player);
            allPossibleLen.add(len);
            //System.out.println("Possible lengths are");
            //for(int i=0;i<allPossibleLen.size();i++)
            //    System.out.println(allPossibleLen.get(i));
            System.out.println("Maximum length is:"+Collections.max(allPossibleLen));
            player = (player%2)+1;
            displayBoard();
            resetBookMarks();
        }
        
    }
    
    public static void main(String[] args){
        initializeBoard();
        displayBoard();
        playGame();
    } 
}
