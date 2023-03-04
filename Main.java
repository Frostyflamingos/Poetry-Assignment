/**
Taliesin Yip Hoi-Lee
A program that predicts the type of poem inputted
*/


import java.util.Scanner;
class Main{
  public static void main(String[]args){
//Variables----------------------------------------------------- 
    Scanner input = new Scanner(System.in);
    boolean quit = false;
    int lineTotal = 0;
    int firstBehind = 0;
    int secondBehind = 0;
    int thirdBehind = 0;
    int fourthBehind = 0;
    int syllableTotal = 0;
    String sentence = "";
    String prediction = " ";
    String pattern = "";
    int syllableAmount = 0;
    String vowelList = "aeiouy";
    
//--------------------------------------------------------------
//Main code-----------------------------------------------------
    while(quit == false){//inputing lines
      lineTotal = lineTotal + 1;
      sentence = input.nextLine();
      sentence = sentence.toLowerCase();
      sentence = " " + sentence + " ";//adds a space at beginning and end of line to make syllable counting code easier
      syllableAmount = 0;
//counting for syllables loop
      for(int i = 0; i < sentence.length(); i++){
        char messageAtChar = sentence.charAt(i);
        if(sentence.charAt(i) == ','){//getting rid if commas and periods and replacing them with space
          messageAtChar = ' ';
        }else if(sentence.charAt(i) == '.'){
          messageAtChar = ' ';}
        if(vowelList.indexOf(messageAtChar) != -1){
              syllableAmount++;
        }
  //special cases
          if((vowelList.indexOf(firstBehind) != -1)&&(vowelList.indexOf(messageAtChar) != -1)){
              syllableAmount=syllableAmount-1;}

          //silent e
          if((messageAtChar == ' ') && (firstBehind == 'e') && (secondBehind != 'e') && (secondBehind != 'm') && (secondBehind != 'w')){
            syllableAmount--;}

          //silent es
          if((messageAtChar == ' ') && (firstBehind == 's') && (secondBehind == 'e') && (thirdBehind != 'a') && (thirdBehind != 'e') && (thirdBehind != 'i') && (thirdBehind != 'o') && (thirdBehind != 'u') && (thirdBehind != 'y')){
            syllableAmount--;}

          //extra syllable for ending with eate
          if((messageAtChar == ' ') && (firstBehind == 'e') && (secondBehind == 't') && (thirdBehind == 'a') && (fourthBehind == 'e')){
            syllableAmount++;}
          
          //extra syllable with le
          if((messageAtChar == ' ') && (firstBehind == 'e') && (secondBehind == 'l')){
            syllableAmount++;}

          //extra syllable with ion endings
          if((messageAtChar == ' ') && (firstBehind == 'n') && (secondBehind == 'o') && (thirdBehind == 'i')){
            syllableAmount++;}

          //extra syllable with io endings
          if((messageAtChar == ' ') && (firstBehind == 'o') && (secondBehind == 'i')){
            syllableAmount++;}

          //extra syllable for the
          if((messageAtChar == ' ') && (firstBehind == 'e') && (secondBehind == 'h') && (thirdBehind == 't') && (fourthBehind == ' ')){
            syllableAmount++;}

          //extra syllable for ending with ed
          if((messageAtChar == ' ') && (firstBehind == 'd') && (secondBehind == 'e') && (thirdBehind != 'a') && (thirdBehind != 'e') && (thirdBehind != 'i') && (thirdBehind != 'o') && (thirdBehind != 'u') && (thirdBehind != 'y') && (thirdBehind != 't')){
            syllableAmount--;}

      //reseting variables for checkers
      firstBehind = sentence.charAt(i);
      if(i>=1){
        secondBehind = sentence.charAt(i-1);}
      if(i>=2){
        thirdBehind = sentence.charAt(i-2);}
      if(i>=3){
        fourthBehind = sentence.charAt(i-3);}
      }//end of special cases + syllable counting loop
      syllableTotal = syllableTotal + syllableAmount;
      if(sentence.equals(" quit ") == false){
      pattern = pattern + (syllableAmount + "") + " " ;}
//end of syllable counting
    
      if(sentence.equals(" quit ")){//stopping input with ("quit")
        quit = true;
        lineTotal = lineTotal - 1;
        syllableTotal--;}

      
  }
//--------------------------------------------------------------
//Output--------------------------------------------------------
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
    if(pattern.equals("9 8 7 6 5 4 3 2 1 ")){
      prediction = "Nonet";}//45 syllables
    System.out.println(prediction);
//--------------------------------------------------------------
    input.close();
  }
}