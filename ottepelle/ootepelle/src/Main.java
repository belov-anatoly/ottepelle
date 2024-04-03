import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] temp=inputTempFromConsole();
        System.out.println("Самая длинная оттепель была "+calcMaxOttepel(temp)+" дней");
    }
    public static int[] inputTempFromConsole() {
        System.out.println("За какое количество дней вести наблюдение?");
        Scanner sc = new Scanner(System.in);
        int cDays = sc.nextInt();
        int[] temp = new int[cDays];
        for (int i = 0; i < cDays; i++) {
            System.out.println("Какова была температура в " + (i + 1) + " день?");
            temp[i] = sc.nextInt();
        }
        for (int i = 0; i < cDays; i++) System.out.print(temp[i] + " ; ");
        System.out.println();
        return temp;
    }
    public static int calcMaxOttepel(int[] temper){
        int maxOttepel=0;
        int tecOttepel=0;
        for (int j : temper) {
            if (j > 0) {
                tecOttepel++;
                if (tecOttepel > maxOttepel)
                    maxOttepel = tecOttepel;
            } else
                tecOttepel = 0;

        }
        return maxOttepel;
    }
}