public class Main {
    public static void main(String[] args) {
        //Örnek kullanım
        String[] words = {"flower","flow","flight"};
        String result = longestCommonPrefix(words);
        System.out.println("Longest common Prefix :" + result);

    }

    public  static String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }

        //İlk kelimeyi başlangıç örnek olarak alıyoruz .
        String prefix = strs[0];

        // Diğer kelimeleri kontrol ediyoruz .
        for(int i = 1; i < strs.length;i++){
            int j = 0;
            //Her iki kelimenin karşılık gelen karakterlerini kontrol ediyoruz
            while(j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)){
                j++;
            }
            //Ortak örnek olmazsa prefix i güncelliyoruz
            prefix = prefix.substring(0, j);
            //Eğer prefix boş ise, ortak örnek yok demektir.
            if(prefix.isEmpty()){
                break;
            }
        }return  prefix;
    }

}