/**
Taliesin Yip Hoi-Lee
A program that predicts the type of poem inputted
*/

import java.util.Scanner;
 class Main{
   public static void main(String[]args){
     int syllables = 0;
     int words = 1;
     Scanner input = new Scanner(System.in);
     String sentence = input.nextLine();
     //finding # of words in sentence
    // for(int i = 0; i<sentence.length(); i++){
      // if(sentence.charAt(i) == ' '){
        // words = words + 1;}}
     //System.out.println(words);
     //for (int wordsAmount = 0; wordsAmount<words; wordsAmount++){
     //Finding syllables in 1 word------------------------------
    // String word = input.next();
     //for (int i = 0; i < (word.length()); i++){
       //if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'y'){
      //   syllables = syllables + 1;}
  // }//end of syllable counting loop}
   //  if(word.charAt(word.length()-1) == 'e'){
   //    syllables = syllables - 1;}
     //if 2 vowels are next to each other (diphthong,triphthong)

    //if there is an 'le' or 'les' at the end of the word
  //   if(word.charAt(word.length()-1) == 'e'){            
   //     if(word.charAt(word.length()-2) == 'l'){
     //     syllables = syllables + 1;}}

//--------------------------------------------------------------
}
     System.out.println(syllables);
     input.close();//end of input
   }
 }