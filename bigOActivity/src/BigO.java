public class BigO {





    public void printNSquaredTimes(int n) {
        for (int i = 1; i <= Math.pow(n, 2); i++) {
            System.out.printf("I am %d years old\n", i);
        }
    }

    public void printNtimes(int n){
        for(int i = 1; i <= n; i++){
            System.out.printf("\nThis has been printed %d times.", n);
        }
    }
}
