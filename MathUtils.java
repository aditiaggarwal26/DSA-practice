public class MathUtils {
    public static int reverse(int n){
        int rev=0;
        while(n!=0){
            int lastDigit = n%10;
            rev = rev*10+lastDigit;
            n=n/10;
        }
        return rev;
    }

    public static boolean isPalindrone(int n){
        int rev=0;
        int num=n;
        while(n!=0){
            int lastDigit = n%10;
            rev = rev*10+lastDigit;
            n=n/10;
        }
        if(num==rev){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isArmstrong(int n){
        int sum=0;
        int num =n;
        while(n!=0){
            int lastDigit = n%10;
            sum = sum + lastDigit*lastDigit*lastDigit;
            n=n/10;
        }
        if(sum==num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void allDivisors(int n){
        if(n==1){
            System.out.print(1);
        }
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
            if(i!=n/i){
                System.out.print(n/i+" ");
            }
        }
    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        // System.out.println(reverse(1234));
        // System.out.println(isPalindrone(121));
        // System.out.println(isArmstrong(153));
        // allDivisors(1);
        System.out.println(isPrime(1));
    }
}
