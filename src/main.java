public class main {
    public static void main(String[] args) {

        String reverseWord = "Bonjour est bienvenue !";

        String wordReversed = "";
        for (String s : reverseWord.split(" ")) {
            wordReversed = s + " " + wordReversed;
        }

        System.out.println("REVERSE 1 : " +wordReversed);

        wordReversed = "";
        for (String s : reverseWord.split(" ")) {
            wordReversed =  wordReversed+ " " + new StringBuilder(s).reverse().toString() ;
        }
        System.out.println("REVERSE 2 : " +wordReversed);
    }
}