public class arrays {
    public static void main(String[] args) {
        
        //creating an array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        //System.out.println(cars[0]);
        //System.out.println(cars[1]);
        //System.out.println(cars[2]);
        //System.out.println(cars[3]);

        int[] myNum = {10, -20, 30, -40};
        //System.out.println(myNum[0]);
        //System.out.println(myNum[1]);
        //System.out.println(myNum[2]);
        //System.out.println(myNum[3]);

        //changing an array element
        //cars[0] = "Mercedes";
        //System.out.println(cars[0]);

        //new keyword to create an array
        String[] myCars = new String[4];
        myCars[0] = "Volvo";
        myCars[1] = "BMW";
        myCars[2] = "Ford";
        myCars[3] = "Mazda";
        //System.out.println(myCars[0]);
        //System.out.println(myCars[1]);
        //System.out.println(myCars[2]);
       // System.out.println(myCars[3]);

        //loop in arrays
        for (int i = 0; i < cars.length; i++) {
            //System.out.println(cars[i]);
        }   

        //sum in arrays
        int sum = 0;
        for (int i = 0; i < myNum.length; i++) {
            sum += myNum[i];
        }
        System.out.println("the sum is " + sum);

        //for each loop in arrays
        for (String i : cars) { 
            //System.out.println(i);
        }

        for (int i = 0; i < cars.length; i++) {
            //System.out.println("the car no. " + i + " is of " + cars[i]);
        }
    }
}
