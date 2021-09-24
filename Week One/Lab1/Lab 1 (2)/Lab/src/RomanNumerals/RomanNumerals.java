package RomanNumerals;
/*
Name: Haichuan Wei
Course: CS125
Lab #: Lab One
Submission Date: 9/23/21
Brief Description: This program take a number that is less then 10 from the user and convert it to a roman numeral.
*/
public class RomanNumerals { //start of class
    private int number;
    public String roman;
    public void setNumber( int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public void convertNum(int number) {// in order to convert a number to a numeral, I used a string and a integer array. These array check each other and calculate accordingly.
      
        int[] values = { 10, 9, 5, 4, 1};
        String[] numerals = { "X", "IX", "V", "IV", "I"};
        int i = 0;
        while (number > 0) {
            if (number >= values[i]) {
                number -= values[i];
                roman += numerals[i];
            } else {
                i++;
            }
            
        }
        
    }
public String displayResult(){ //display the result
    return roman;
}
}//end of class
