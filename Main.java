/**
Taliesin Yip Hoi-Lee
A program that predicts the type of poem inputted
*/


import java.util.Scanner;
class Main{
  public static void main(String[]args){
//Variables----------------------------------------------
    Scanner input = new Scanner(System.in);
    boolean quit = false;
    int lineTotal = 0;
    int syllableTotal = 0;
    String sentence;
    String currentWord = "";
    String prediction = " ";
    String pattern = "";
    String word = "";
    int syllableAmount;
    
//-------------------------------------------------------
//Main code----------------------------------------------
    while(quit == false){//line inputing
      lineTotal = lineTotal + 1;
      sentence = input.nextLine();
      sentence = sentence.toLowerCase();
      syllableAmount = 0;

      for(int i = 0; i < sentence.length(); i++){//separates words from sentences

//counting for syllables loop
  //last word

//end of counting syllables
      syllableTotal = syllableTotal + syllableAmount;
      if(sentence.equals("quit") == false){
        pattern = pattern + (syllableAmount + "") + " ";}
//end of syllable counting
    
      if(sentence.equals("quit")){//stopping input with ("quit")
        quit = true;
        lineTotal = lineTotal - 1;}
}
//-------------------------------------------------------
//Output-------------------------------------------------
    System.out.println(lineTotal + " lines");
    System.out.println(syllableTotal + " syllables");
    System.out.println(pattern);
    //predicting the type of poem
    if(lineTotal == 3){
      if(pattern.equals("5 7 5 ")){
        prediction = "Haiku";
      }else if(syllableTotal > 42 && syllableTotal < 48){
        prediction = "Sijo";}}
    if(lineTotal == 5){
      if(pattern.equals("5 7 5 7 7 ")){
        prediction = "Tanka";//31 syllables
      }else if(pattern.equals("2 4 6 8 2 ")){
        prediction = "Cinquain";}}//22 syllables
    if(pattern.equals("9 8 7 6 5 4 3 2 1")){
      prediction = "Nonet";}//45 syllables
    System.out.println(prediction);
//--------------------------------------------------------
    input.close();
  }
}