package FinalExam;

public class Story {    
	public static void main(String[] args) {       
	   Detective duke = new Detective();
	   for (int i = 0; i < 3; i++) {  
		   duke.buildRobot(i);
	   }
	   System.out.println(duke.duke());
	}
}