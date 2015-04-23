/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;

import java.util.HashSet;

/**
 *
 * @author bharath
 */
public class JumperGame {
    static class Position {
		int r;
		int c;
		public Position(int r, int c) {
			this.r = r;
			this.c = c;
		}
		public int hashCode() {
			return 1001*r + c;
		}
		public boolean equals(Position p) {
			return r == p.r && c == p.c;
		}
	}

	static int maxJumps(int[][] grid, int r, int c) {
		int numRows = grid.length;
		int numCols = grid[0].length;
		// create new grid that contains an extra 'fence'
		// with value -1 to help check for boundary conditions
		int[][] newGrid = new int[numRows+4][numCols+4];
		for(int i=0; i<numRows+4; i++) {
			for(int j=0; j<numCols+4; j++) {
				if(i <= 1 || i >= numRows+2 || j <= 1 || j >= numCols+2)
					newGrid[i][j] = -1;
				else newGrid[i][j] = grid[i-2][j-2];
			}
		}
		r++;
		c++;
		HashSet<Position> seen = new HashSet<Position>();
		seen.add(new Position(r, c));
		return helper(grid, r, c, seen);
	}

	static int helper(int[][] grid, int r, int c, HashSet<Position> seen) {
		int max = 0;
		for(int k=0; k<4; k++)
			max = Math.max(max, helper2(grid, r, c, seen, k));
		return max; 
	}

	static int helper2(int[][] grid, int r, int c, HashSet<Position> seen, int direction) {
		int orig = grid[r][c];
		int opponent = (orig == 1 ? 2 : 1);
		int over;
		int land;
		Position p;
		if(direction == 0) {
			over = grid[r-1][c-1];
			land = grid[r-2][c-2];
			p = new Position(r-1, c-1);
		} else if(direction == 1) {
			over = grid[r-1][c+1];
			land = grid[r-2][c+2];
			p = new Position(r-1, c+1);
		} else if(direction == 2) {
			over = grid[r+1][c-1];
			land = grid[r+2][c-2];
			p = new Position(r+1, c-1);
		} else {
			over = grid[r+1][c+1];
			land = grid[r+2][c+2];
			p = new Position(r+1, c+1);
		}
		if(over != opponent || land != 0 || seen.contains(p))
			return 0;
		seen.add(p);
		int jumps = 1 + helper(grid, p.r, p.c, seen);
		seen.remove(p);
		return jumps;
	}
        
        public static void main(String args[])
        {
          int [][]grid =  {   {1, 0, 0, 0, 0, 0},
                        {0, 0, 2, 0, 2, 0},
                        {2, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 2, 0},
                        {2, 0, 2, 0, 0, 0}, 
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0}};
          
          maxJumps(grid,5,5);
          
        }
                            



      
}
