public class PPS_ID {
   public static void main(String args[]){
        int min = 199999;
        int max = 555555;
        int min1 = 19999;
        int max2 = 55555;

        //generates an 11 digit number
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        int random_int1 = (int)Math.floor(Math.random()*(max2-min1+1)+min1);
        System.out.println(random_int);
    }


}
