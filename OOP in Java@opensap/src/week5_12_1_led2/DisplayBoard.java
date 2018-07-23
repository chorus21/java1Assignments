package week5_12_1_led2;

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
		int led = off;

/* algorithm 1 - Normal
		for(int i = 0; i < 16; i++) {
			for(int j = 0; j < 16; j++) {
				ledMatrix[i][j] = led;
 			}
		}
		
		//fill ledMatrix with RED
		led = red;
		for(int i = 0; i < ledMatrix.length; i++) {
			for(int j = 0; j < ledMatrix.length; j++) {
				ledMatrix[i][j] = led;
 			}
		}
		//fill ledMatrix with ORANGE
		led = orange;
		for(int i = 3; i < ledMatrix.length-3; i++) {
			for(int j = 3; j < ledMatrix.length-3; j++) {
				ledMatrix[i][j] = led;
 			}
		}
		//fill ledMatrix with GREEN
		led = green;
		for(int i = 6; i < ledMatrix.length-6; i++) {
			for(int j = 6; j < ledMatrix.length-6; j++) {
				ledMatrix[i][j] = led;
 			}
		}
*/

// algorithm 2 - Short
		for(int i = 0; i < ledMatrix.length; i++) {
			for(int j = 0; j < ledMatrix.length; j++) {
				led = red;
				if(((i >= 3) && (i < ledMatrix.length-3)) && ((j >= 3) && (j < ledMatrix.length-3))) {
	  				led = orange;
	  				if(((i >= 6) && (i < ledMatrix.length-6)) && ((j >= 6) && (j < ledMatrix.length-6))) {
	  					led = green;
	  				}
				}
				ledMatrix[i][j] = led;
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