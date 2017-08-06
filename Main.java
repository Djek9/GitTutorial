/**
 * Created by Djek on 12.07.2017.
 */
public class Main {
    public static void main(String[] args) {



        for(int i=0; i<10000; i++){
            int a = (int)(Math.random() * 5);
            System.out.println(a);
            if(a==5) {
                System.out.println("finish");
                break;
            }
        }
    }
}