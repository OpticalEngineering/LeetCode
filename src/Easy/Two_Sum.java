package Easy;

public class Two_Sum
{

    public int[] twoSum(int[] nums, int target)
    {
        int[] result = new int[2];
        int size = nums.length;

        for (int i = 0; i < size; i++)
        {
            for (int k = i; k < size; k++)
            {
                if ((nums[i] + nums[k]) == target)
                {
                    result[0] = nums[i];
                    result[1] = nums[k];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 17;

        int[] result = new int[2];
        Two_Sum obj = new Two_Sum();
        result = obj.twoSum(nums, target);

        int[] result1 = new int[2];
        int[] nums1 = {2, 1, 0, 4097, 12292, 0, 4099, 4100};
        int target1 = 12293;
        result1 = obj.twoSum1(nums1, target1);

        for (int i : result1)
        {
             System.out.println(i + " -- ");
        }

    }

    public int[] twoSum1(int[] nums, int target) {
        int[] temp = new int[4096];
        for(int i = 1; i < nums.length; i++) {
            int complemento = target - nums[i];
            if(complemento == nums[0]) return new int[] { 0, i };
            int diffValue = temp[complemento & 4095];
            if(diffValue != 0) return new int[] {diffValue, i};
            temp[nums[i] & 4095]= i;
        }
        return null;
    }
}
