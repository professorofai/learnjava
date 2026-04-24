public class strings {
    public static void main(String[] args) {
        //strings in java
        String txt = "Akshat Jauhari";
        System.out.println( txt);

        // Length of String
        String test = " Btech CSE AIML 6A";
        System.out.println("Length of test is "+ test.length());

        //uppercase and lowercase
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"

        //INDEXOF()  ** IMPORTANT **
        System.out.println("Index of AIML is: " + test.indexOf("AIML"));

        //charAT in strings
        System.out.println("Char at 11th position is " + test.charAt(11));

        //concatenation in strings
        System.out.println(txt.concat(test));
        System.out.println("Concatinating both gives, " + txt.concat(test));
    
    }
}
