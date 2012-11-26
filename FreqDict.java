import java.util.*;

class FreqDict {
    public static void main(String[] args) {
	//declarations:
	String document = args[0];
	Map<String, Integer> dict = new TreeMap<String, Integer>();
	
	String[] words = args[0].split(" ");
	
	for(String word : words) {
	    if(word.length()<=0) continue;

	    //check to see if the word is in the dict       
	    if(dict.containsKey(word)){
	         //add one to the value
		dict.put(word, dict.get(word)+1);
	    }
	    //otherwise
	    else {
	         //put in the key, with integer 1
		dict.put(word, 1);
	    }
	}
	
	//for every key in the dict
	for(String word : dict.keySet()){
	     //print the key and the value
	    System.out.println(word + ":" + dict.get(word));
	}

	//sample code:
	/*
	dict.put("Charlie", new Integer(23));
	System.out.println(dict.get("Charlie"));
	*/

    }
}