public class Main {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSum(nums, target);

        if(result != null){
            System.out.println("Two Sum indices: " + result[0] + " , " + result[1]);
        }else {
            System.out.println("No solution found .");
        }
    }

    public static int[] findTwoSum(int[] nums, int target){
        //Diziyi iki farklı indis üzerinde dönmek için iki iç içe döngü kullanıyoruz.

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                //İki sayının toplamı hedef değere eşitse, bu iki sayıyı döndürüyoruz
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        // Eğer çözüm bulunamassa, null döndürüyoruz
        return null;
    }


}

