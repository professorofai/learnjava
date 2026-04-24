public class variable {
    public static void main(String[] args) {
        int myNum = 21;               // Integer (whole number)
        float myheight = 5.99f;    // Floating point number
        char myLetter = 'A';         // Character
        boolean myBool = true;       // Boolean
        String name = "Akshat Jauhari";     // String
        
        System.out.println(myNum);
        System.out.println(myheight);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(name);

        int a = 10, b = 20, c = 30; // Multiple variables of the same type
        System.out.println(a + b - c);
        System.out.println(a + b * c);
        System.out.println("The result is: " + (a + b * c)); 
        //printing the result of an expression with a string
        
        int p, q, r; // Multiple variables declared in one line
        p = q = r = 15;
        System.out.println(p + q + r);
        
    }
}
