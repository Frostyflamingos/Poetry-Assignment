/**
Taliesin Yip Hoi-Lee
A program that predicts the type of poem inputted
*/

import java.util.Scanner;
 class Main{
   public static void main(String[]args){
     int syllables = 0;
     Scanner input = new Scanner(System.in);
     String word = input.next();
     //Finding syllables----------------------------------------
     for (int i = 0; i < (word.length()); i++){
       if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'y'){
         syllables = syllables + 1;}
     }//end of syllable counting loop}
     if(word.charAt(word.length()-1) == 'e'){
       syllables = syllables - 1;}
     //if 2 vowels are next to each other
//--------------------------------------------------------------
     System.out.println(syllables);
     input.close();//end of input
   }
 }