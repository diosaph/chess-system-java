package chess;

import boardgame.board;

public class chessmath {

	private board board;
	
	public chessmath() {
		board = new board(8, 8);
	}
	
	public chesspiece[][] getpieces() {
		chesspiece[][] mat = new chesspiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for  (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (chesspiece) board.piece(i, j);
			}
		}
		return mat;
	}
}
