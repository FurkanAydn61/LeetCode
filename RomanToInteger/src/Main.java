public class Main {
    public static void main(String[] args) {

        // Örnek kullanım
        String romanNumeral = "VII";
        int result = romanToInt(romanNumeral);
        System.out.println(romanNumeral + " = " + result);
    }
    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentSymbol = s.charAt(i);
            int currentValue = getRomanValue(currentSymbol);

            // Sonuncu sembol ya da sonraki sembol büyükse toplamı arttır
            if (i == s.length() - 1 || currentValue >= getRomanValue(s.charAt(i + 1))) {
                result += currentValue;
            } else {
                // Eğer bir önceki sembol, şu anki sembolün değerinden küçükse (örneğin, IV veya IX gibi)
                // farkı toplama ekle ve bir sonraki sembolü atla
                result += getRomanValue(s.charAt(i + 1)) - currentValue;
                i++; // Bir sonraki sembolü atlamak için i'yi bir arttır
            }
        }

        return result;
    }

    private static int getRomanValue(char symbol) {
        switch (symbol) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}