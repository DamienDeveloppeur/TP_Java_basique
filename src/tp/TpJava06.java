package tp;

public class TpJava06 {
    public static void main(String[] arg){
        int result = 1;
        int nbr = Integer.parseInt(arg[0]);
        for(int i = 1; i < nbr + 1;i++){
            result *= i;
        }
        System.out.print(result);
    }
//    public void tp(int nbr){
//        int result = 1;
//        for(int i = 1; i < nbr + 1;i++){
//            result *= i;
//        }
//        System.out.print(result);
//    }
}
