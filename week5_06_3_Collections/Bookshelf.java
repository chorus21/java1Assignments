package week5_06_3_Collections;

import java.util.ArrayList;
import java.util.HashMap;

class Bookshelf {
    ArrayList<Clue> usedClues   = new ArrayList<>();
    ArrayList<Clue> unusedClues = new ArrayList<>();
    HashMap<String, ArrayList<Clue>> clueHashMap = new HashMap<>();

    public void saveClues(ArrayList<Clue> clues){
        for(int i=0; i < clues.size(); i++){
            Clue clue = clues.get(i);
            if(clue.getUsed()){
                usedClues.add(clue);
            }else{
                unusedClues.add(clue);
            }
        }
    }    

	void buildHashMap() {
	    clueHashMap.put("Used", usedClues);
	    clueHashMap.put("Unused", unusedClues);
	}
	
	
	// please just leave this code as it is,
	// it helps you to get an output if you run your code.
	// Also, it might server as a reference for using a foreach loop. ;-)
	void printHashMap(){
	    for (String key : clueHashMap.keySet()){
        System.out.println("The clue list \""  + key + "\" contains the clues:");
	        for(Clue clue : clueHashMap.get(key)){
	            System.out.println("\t" + clue);
	        }
	    }
	}

}
