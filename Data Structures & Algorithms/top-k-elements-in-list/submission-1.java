class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        ans.addAll(mp.keySet());
        ans.sort((a, b) -> mp.get(b) - mp.get(a));
        int[] res=new int[k];
       
        for(int i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}
