package course;

public class Main {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase(); //td minusculo
        String s02 = original.toUpperCase(); //td maiusculo
        String s03 = original.trim(); //elimina os espaços
        String s04 = original.substring(2); // recorta a partir do caracter 2
        String s05 = original.substring(2, 9);
        String s06 =  original.replace('a', 'x'); //troca o caractter
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc"); //qual a primeira posição de bc na string
        int j = original.lastIndexOf("bc"); // qual a ultima posição de bc na string

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last Index of 'bc': " + j);


        //--- SPLIT -----
        String s = "potato apple lemon";

        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
        System.out.println(s);
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}