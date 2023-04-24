public class Playing {

    static boolean isCatPlaying(boolean summer, int temperature){
            return summer && temperature >=25 || temperature <=35 ;
        }
    
    public static void main(String[] args) {
        boolean summer = false;
        int temperature = 35;
        boolean isCatPlaying = isCatPlaying(summer, temperature);
        System.out.println(isCatPlaying);
    }
}
