import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {
	
    Random myRandom = new Random();
    int intRandomX = myRandom.nextInt((400 - 50 + 1) + 50);
    int intRandomY = myRandom.nextInt(100 + 1);
      
  public void settings() {
	  // Size of canvas
    size(400, 400);
    
  }

  public void setup() {

    // Background colour based on the location of the sun.
    if (intRandomX >= 200 && intRandomY <= 200){
    background(19, 24, 98);
    }
    else{
    background(173, 216, 230);
    }
  
    // Sum/Moon drawing
    if (intRandomX >= 200 && intRandomY <= 200){
      stroke(201);
      ellipse(intRandomX, intRandomY, 50, 50);
    }
    else{
     stroke(255, 255, 0); 
     ellipse(intRandomX, intRandomY, 100, 100);
    }
    
    if (intRandomX >= 200 && intRandomY <= 200){
      fill(201);
      ellipse(intRandomX, intRandomY, 50, 50);
    }
    else{
      fill(255, 255, 0);
      ellipse(intRandomX, intRandomY, 100, 100);
    }
 
    // Time of when the program is run
    int m = minute();    
    int h = hour();  
    int se = second();   
    if (intRandomX >= 200 && intRandomY <= 200){
      fill(255);
    }
    else{
      fill(0);
    }
    String s = String.valueOf(h);
    text(s, 10, 28);
    s = String.valueOf(m);
    text(s, 30, 28); 
    s = String.valueOf(se);
    text (s,50,28);
    
  }
    
  public void draw() {
	  
    // Rectangle Grass floor
    if (intRandomX >= 200 && intRandomY <= 200){
      stroke(1, 50, 32);
      fill(1, 50, 32);
    }
    else{
     stroke(86, 125, 70); 
     fill(86, 125, 70);
    }
    
    rect(0, 350, 400, 50);
    
    // Rectangle House base
    stroke(0);
    if (intRandomX >= 200 && intRandomY <= 200){
      fill(43, 29, 20);
    }
    else{
      fill(168, 86, 50);
    }
    
    rect(100, 150, 200, 200);  
  
    // Traingle House roof
    stroke(0);
    if (intRandomX >= 200 && intRandomY <= 200){
      fill(43, 29, 20);
    }
    else{
      fill(168, 86, 50);
    }
    
    triangle(100, 150, 200, 50, 300, 150);

    // Rectangle House door
    stroke(0);
    if (intRandomX >= 200 && intRandomY <= 200){
      fill(155);
    }
    else{
      fill(255);
    }
    
    rect(185, 300, 30, 50);

    // Rectangle House steps
    stroke(0);
    if (intRandomX >= 200 && intRandomY <= 200){
      fill(55);
    }
    else{
      fill(211);
    }
    
    rect(175, 350, 50, 25);
  
    stroke(0);
    if (intRandomX >= 200 && intRandomY <= 200){
      fill(55);
    }
    else{
      fill(211);
    }
    
    rect(175, 375, 50, 25);

    // Rectangle House base windows
    // Left window
    stroke(0);
    if (intRandomX >= 200 && intRandomY <= 200){
      fill(255, 198, 88);
    }
    else{
      fill(255); 
    }
    
    rect(120, 170, 50, 50);

    // Right Window
    stroke(0);
    if (intRandomX >= 200 && intRandomY <= 200){
      fill(255, 198, 88);
    }
    else{
      fill(255); 
    }
    
    rect(230, 170, 50, 50);

    // Rectangle House base window lines
    // Left Window lines
    stroke(0);
    line(145, 170, 145, 220);

    stroke(0);
    line(120, 195, 170, 195);

    // Right Window Lines
    stroke(0);
    line(255, 170, 255, 220);
    
    stroke(0);
    line(230, 195, 280, 195);    

    // Circle House roof window
    stroke(0);
    if (intRandomX >= 200 && intRandomY <= 200){
      fill(255, 198, 88);
    }
    else{
      fill(255); 
    }
    
    ellipse(200, 110, 50, 50);

    // House roof window lines
    stroke(0);
    line(200, 85, 200, 135);

    stroke(0);
    line(175, 110, 225, 110);
    

  } 

}
    