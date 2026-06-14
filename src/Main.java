// text-to-morse
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
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
        convert.put('/'," ");


    }
}