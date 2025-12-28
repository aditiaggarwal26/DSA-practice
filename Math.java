public class Math {
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
    public static void main(String args[]){
        System.out.println(reverse(1234));
        System.out.println(isPalindrone(121));
        System.out.println(isArmstrong(153));
        
    }
}
