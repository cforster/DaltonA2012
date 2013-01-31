import java.util.*;
//tyler
class FreqDict {
    public static void main(String[] args) {
	//declarations:
	String document = args[0];
	Map<String, Integer> dict = new TreeMap<String, Integer>();
	
	String[] words = args[0].split(" ");
	
	for(String word : words) {
	    if(word.length()<=0) continue;
	   

	    if(dict.containsKey(word)) 
		{
		    dict.put(word, dict.get(word)+1);
		}
		else
		{
		    dict.put(word, 1);
		}
		    

	    //check to see if the word is in the dict
	         //add one to the value
	    //otherwise
	         //put in the key, with integer 1
	}


	for(Map.Entry e : dict.entrySet()) {
	    System.out.println(e.getKey() + ":" + e.getValue());
	}
	//for every key in the dict
	     //print the key and the value


	//sample code:
	/*
	dict.put("Charlie", new Integer(23));
	System.out.println(dict.get("Charlie"));
	*/

    }
}
