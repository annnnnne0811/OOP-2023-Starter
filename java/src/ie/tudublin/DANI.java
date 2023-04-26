package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

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
		
		String line;
		// Split a string into an array of words
		split(line, ' '); 
		
		String w;
		// Remove punction characters
		w.replaceAll("[^\\w\\s]",""); 

		// Convert a string to lower case 
		s.toLowerCase() ;
	}

	public void keyPressed() {

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
