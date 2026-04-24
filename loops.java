public class loops {
    public static void main(String[] args) {
        //while loop
        int i = 0;
        while(i < 7){
            //System.out.println(i);
            i++;
        }

        //countdown
        int countdown = 3;
        while(countdown > 0){
            //System.out.println(countdown);
            countdown--;
        }

        //System.out.println("Happy New Year");

        //do while loop
        int j = 0;
        do{
            //System.out.println(j);
            j++;
        }while(j < 5);  

        //do while false loop
        int k = 10;
        do{
            //System.out.println("k is " + k);
            k++;
        }while(k < 5);

        //for loop
        for(int m = 7; m > 0; m--){
            //System.out.println(m);
        }

        //false for loop
        for(int n = 10; n < 5; n++){
            //System.out.println("not printed");  
        }

        //nested for loop
        for(int p = 0; p < 3; p++){
            for(int q = 0; q < 3; q++){
                //System.out.println("p is " + p + " and q is " + q);
            }
        }

        //for each loop
        String[] fruits = {"BMW", "BUGATTI", "chevrolet", "dodge", "DEFENDER"};
        for(@SuppressWarnings("unused")
        String fruit : fruits){
            //System.out.println(fruit);
        }

        //break statement AND continue statement
        for(int r = 0; r < 12; r++){
            if(r == 5 || r == 7){  //[ r == 5 || r == 7 ] is the condition to skip the numbers 5 and 7
                continue; //REPLACE continue with break to see the difference
            }

            if( r == 10){ //this condition will stop the loop when r is equal to 8
                break; //REPLACE break with continue to see the difference
            }
            System.out.println(r);
        }
    }
}
