public class ifconditions {
    public static void main(String[] args) {
        
        //if is used to either print/skip the code
        boolean isRaining = false;

        if(isRaining){
            System.out.println("Bring the Umbrella!");
        }
        else{
            System.out.println("It's Clear for now!");
        }


        //if,else if, else conditions
        int weather = 2;

        if (weather == 1) {
            System.out.println(" Few chances for rain");    
        }
        else if (weather == 2) {
            System.out.println("It's Drizzling here");
        }
        else{
            System.out.println("It's Clear for now!");
        }
    }
}
