import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        // Örnek kullanım
        System.out.println(isValid("()"));       // true
        System.out.println(isValid("()[]{}"));   // true
        System.out.println(isValid("(]"));        // false
        System.out.println(isValid("([)]"));      // false
        System.out.println(isValid("{[]}"));      // true
        
    }

    public static boolean isValid(String s){
        // Bir Stack kullanarak parantezleri kontrol etmek için bir veri yapısı kullanacağız.
        Stack<Character> stack = new Stack<>();

        // Karakter dizisini gez
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                // Açma parantezi varsa, stack'e ekle
                stack.push(c);
            } else {
                // Kapatma parantezi varsa, stack boşsa false döndür
                if (stack.isEmpty()) {
                    return false;
                }

                // Parantez eşleşiyor mu kontrol et
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // Stack hala doluysa, kapanmamış bir açma parantezi var demektir
        return stack.isEmpty();
    }
}