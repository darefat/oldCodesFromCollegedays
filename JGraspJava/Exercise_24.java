import java.awt.ToolKit;  

public class Exercise_24 {

  

    public static void main(String[] args) {
        //Toolkit MyCharacter = Toolkit.getDefaultToolkit(); 
        
        MyCharacter ch = new MyCharacter('L');
        System.out.println("ch = " + ch.getChar());
        System.out.println("Is a letter: " + ch.isLetter());
        System.out.println("Is a digit: " + ch.isDigit());
        System.out.println("L == L ?" + ch.equals(new MyCharacter('L')));
    }
}