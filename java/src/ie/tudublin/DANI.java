package ie.tudublin;

//import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	String w;
	String s;

	private void loadStrings(String string, String string2) 
	{
		
	}




	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;
	private String line;



    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	// added the load file method
	public void loadfile(String string, String string2)
	{
		// Load a text file into a String array
		loadStrings("shakespere.txt", "small.txt"); 
		
		// Split a string into an array of words
		split(line, ' '); 
		
		// Remove punction characters
		w.replaceAll("[^\\w\\s]",""); 

		// Convert a string to lower case 
		s.toLowerCase() ;
	}



	public void keyPressed() 
	{

	}

	// Adding printmodel
	public void printmodel()
	{
		print("small.txt");
	}
	

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}





}
