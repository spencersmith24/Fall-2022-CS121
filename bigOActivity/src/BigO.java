public class BigO {

    public void printOnce (String n) {
        System.out.println(n);
    }
    public void printNSquaredTimes(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("\nHi hello :)");
            }
        }
    }

    public void printNTimes(int n){
        for(int i = 1; i <= n; i++){
            System.out.printf("\nThis has been printed %d times.", i);
        }
    }
}
