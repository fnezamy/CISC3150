/*
 * I got a general idea of the problem from https://www.geeksforgeeks.org/backtracking-set-3-n-queen-problem/
 * 
 * I figured out how to check if the placement is in the same row, column, or either diagonal  by looking here https://gist.github.com/soundsmitten/4272446
 */

import java.util.*;

public class NQueens {
	static int numSol = 0;
	
	public static void queen(int [] board, int row, int n){
		for(int i = 0;i<n;i++){
			if(check(row,i,board)){
				board[row] = i;
				if(row==n-1){
					print(board);
					numSol++;
				}
				else
					queen(board,row+1,n);
			}
		}
	}
	
	public static Boolean check(int row, int column,int []board){
		for(int i = 0;i<row;i++){
			if(board[i]==column || ((i-row)==(board[i]-column))||((i-row)==(column-board[i]))){
				return false;
			}
		}
		return true;
	}
	
	private static void print(int[] board) {
		for(int i = 0;i<board.length;i++){
			for(int j = 0;j<board.length;j++){
				if(board[i]==j)
					System.out.print("Q");
				else
					System.out.print(".");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
    public static void main(String args[]) {
    	System.out.println("Enter a number to create an NxN chessboard");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	sc.close();
    	int []board = new int[n];
    	queen(board,0,n);
    	System.out.println("The number of solutions is " + numSol);
    	
    }
}