import java.io.PrintStream;

public class Main {
    public static void main(String[] args){
        int InitialAccount = 200;
        int replenishment = 300;
        int EndAccount = InitialAccount+ replenishment;
        if (EndAccount >= 1000) {
            int BonusRubles = 1000+10;
            System.out.println(BonusRubles);
        }
        System.out.println(EndAccount);
    }
}
