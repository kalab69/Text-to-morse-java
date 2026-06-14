import java.util.HashMap;
import java.util.Scanner;
public class Main {
    // word to Morse
    public static String charToMorse(char x){
        HashMap<Character,String> convert = new HashMap<>();
        convert.put('0',"-----");
        convert.put('1',".----");
        convert.put('2',"..---");
        convert.put('3',"...--");
        convert.put('4',"....-");
        convert.put('5',".....");
        convert.put('6',"-....");
        convert.put('7',"--...");
        convert.put('8',"---..");
        convert.put('9',"----.");
        convert.put('A', ".-");
        convert.put('B', "-...");
        convert.put('C', "-.-.");
        convert.put('D', "-..");
        convert.put('E', ".");
        convert.put('F', "..-.");
        convert.put('G', "--.");
        convert.put('H', "....");
        convert.put('I', "..");
        convert.put('J', ".---");
        convert.put('K', "-.-");
        convert.put('L', ".-..");
        convert.put('M', "--");
        convert.put('N', "-.");
        convert.put('O', "---");
        convert.put('P', ".--.");
        convert.put('Q', "--.-");
        convert.put('R', ".-.");
        convert.put('S', "...");
        convert.put('T', "-");
        convert.put('U', "..-");
        convert.put('V', "...-");
        convert.put('W', ".--");
        convert.put('X', "-..-");
        convert.put('Y', "-.--");
        convert.put('Z', "--..");
        convert.put(' ',"/");
        return convert.get(x);
    }
    // Morse to word
    public static char MorseTochar(String x){
        HashMap<String,Character> rechange = new HashMap<>();
        rechange.put("/",' ');
        rechange.put(".-", 'A');
        rechange.put("-...", 'B');
        rechange.put("-.-.", 'C');
        rechange.put("-..", 'D');
        rechange.put(".", 'E');
        rechange.put("..-.", 'F');
        rechange.put("--.", 'G');
        rechange.put("....", 'H');
        rechange.put("..", 'I');
        rechange.put(".---", 'J');
        rechange.put("-.-", 'K');
        rechange.put(".-..", 'L');
        rechange.put("--", 'M');
        rechange.put("-.", 'N');
        rechange.put("---", 'O');
        rechange.put(".--.", 'P');
        rechange.put("--.-", 'Q');
        rechange.put(".-.", 'R');
        rechange.put("...", 'S');
        rechange.put("-", 'T');
        rechange.put("..-", 'U');
        rechange.put("...-", 'V');
        rechange.put(".--", 'W');
        rechange.put("-..-", 'X');
        rechange.put("-.--", 'Y');
        rechange.put("--..", 'Z');
        rechange.put("-----", '0');
        rechange.put(".----", '1');
        rechange.put("..---", '2');
        rechange.put("...--", '3');
        rechange.put("....-", '4');
        rechange.put(".....", '5');
        rechange.put("-....", '6');
        rechange.put("--...", '7');
        rechange.put("---..", '8');
        rechange.put("----.", '9');
        return rechange.get(x);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String answer="";
        do {
            System.out.println("==========Morse to sentence and sentence to Morse===========");
            System.out.println("1 change Morse to words\n2 change words to Morse");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    try {
                        System.out.println("enter Morse code to be translated");
                        String code = sc.nextLine();
                        String icode = "";
                        int p = 0;
                        char last[] = new char[1000];
                        for (int i = 0; i < code.length(); i++) {

                            if (' ' == code.charAt(i)) {

                                last[p] = MorseTochar(icode);
                                icode = "";
                                p++;
                            } else {
                                icode = icode + code.charAt(i);
                            }

                        }
                        last[p] = MorseTochar(icode);

                        System.out.println(new String(last, 0, p + 1));


                    } catch (NullPointerException e) {
                        System.out.println("Didn't enter a propre Morse code!!!");

                    }
                    finally {
                        System.out.println("Do you wanna exit?");
                        answer = sc.nextLine();
                    }

                    break;
                case 2:

                    System.out.println("enter a word and digits to be converted to Morse code");
                    String word = sc.nextLine();
                    String Morse = "";
                    for (int i = 0; i < word.length(); i++) {
                        Morse += charToMorse(word.toUpperCase().charAt(i)) + " ";
                    }
                    System.out.println(Morse);
                    System.out.println("Do you wanna exit?");
                    answer = sc.nextLine();

                    break;
                default:
                    System.out.println("Didn't enter a proper choise (1-2) only");
                    break;

            }





        }while ( !answer.equals("yes"));
    }
}