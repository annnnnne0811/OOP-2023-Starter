package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.StringList;

public class DANI extends PApplet {

	StringList Follow;
	String w;
	String s;




	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;
	//private String line;



    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
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
		print("small.txt");
        
		
	}





}
