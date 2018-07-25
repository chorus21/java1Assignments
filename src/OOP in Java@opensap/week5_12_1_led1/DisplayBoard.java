package week5_12_1_led1;

public class DisplayBoard {

	public int[][] ledMatrix;

	public DisplayBoard(){
		
	    // write your code here
		final int off = 0;
		final int green = 1;
		final int red = 2;
		final int orange = 3;

	    ledMatrix = new int[16][16];

	    //initialize ledMatrix
		for(int i = 0; i < 16; i++) {
			for(int j = 0; j < 16; j++) {
				ledMatrix[i][j] = off;
 			}
		}
		
		//fill ledMatrix with RED
		for(int i = 0; i < ledMatrix.length; i++) {
			for(int j = 0; j < ledMatrix.length; j++) {
				if(i == j) {
				  ledMatrix[i][j] = red;
				}
 			}
		}

		//print to console
		String line = "";
		for(int i = 0; i < ledMatrix.length; i++) {
			for(int j = 0; j < ledMatrix.length; j++) {
				line = line + ledMatrix[i][j];
				if(j==ledMatrix.length-1) {
					System.out.println(line);
					line = "";
				}
 			}
		}
		
		//send to Board
//	    TCPClient.sentToBoard(ledMatrix);
		
	}

	public static void main(String[] args) {
		new DisplayBoard();
	}

}