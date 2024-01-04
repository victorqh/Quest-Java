public class Main{
    public static void main (String []args){
        int numIni = 1;
        int numFin = 100;
        int suma = 0;
        for (int i = numIni; i <= numFin; i++) {
            if ( i % 2 != 0){
                System.out.println(i);
                suma += i;
            }
        }
        System.out.println("La suma de los números impares es: " + suma);
    }
}