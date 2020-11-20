public class CountPrimes204 {
    public static void main(String[] args) {
        System.out.println(countPrimes(100000000));
    }
    public static int countPrimes(int n) {
        int result = 0;
        if(n <= 1){
            return 0;
        }
        for (int i = 2; i < n; i++) {
            if(isPrime(i)){
                result++;
            }
        }
        return result;
    }
    public static boolean isPrime(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(i == num){
                return true;
            }
            if(num %i == 0){
                return false;
            }
        }
        return true;
    }
}
