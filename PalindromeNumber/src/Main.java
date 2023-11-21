public class Main {
    public static void main(String[] args) {
        //Palindrom testi için örnek kullanalım
        int number = 121;
        if(isPalindrome(number)){
            System.out.println(number + "bir palindrom sayıdır .");
        }else{
            System.out.println(number + "bir palindrom sayı değildir . ");
        }
        System.out.println("Hello world!");
    }
    public  static  boolean isPalindrome(int x){
        //Negatif sayılar palindrome olamaz
        if(x < 0){
            return false;
        }

        int originalNumber = x;
        int reversedNumber = 0;

        //Sayının tersini bulma
        while(x != 0){
            int digit = x % 10;

            reversedNumber = reversedNumber * 10 + digit;
            x /= 10;
        }
        //Ters çevrilmiş sayı ile orijinal sayı karşılaştırılması
        return originalNumber == reversedNumber;
    }
}