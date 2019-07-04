package application;

import chess.chessmath;

public class program {

	public static void main(String[] args) {
		
		chessmath chessmath = new  chessmath();
		UI.printBoard(chessmath.getpieces());
		
	}

}
