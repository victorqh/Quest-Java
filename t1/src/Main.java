//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// 7b {
public class Main {
    public static void main (String[]args){
        int numIni = 0;
        int numFin = 50;

        while (numIni < numFin){
            numIni ++;
            if (numIni % 2 == 0){
                System.out.println(numIni);
            }
        }
    }

}