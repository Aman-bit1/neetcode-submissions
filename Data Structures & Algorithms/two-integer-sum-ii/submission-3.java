class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int rem=target-numbers[i];
            if(mp.containsKey(rem)){
                return new int[] {mp.get(rem)+1,i+1};
            }
            else{
                mp.put(numbers[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}
