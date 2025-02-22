class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();
        
        int i =0;
        int j = 0;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        while (true)
        {
            if (nums1[i] == nums2[j])
            {
                list.add(nums1[i]);
                i++;
                j++;
            }
            
         else 
             if(nums1[i] < nums2[j]) 
             {
                i++;
            }
            else {
                j++;
            }
            
            if(i == nums1.length || j == nums2.length)
                break;
        }
    
        int[] ans = new int[list.size()];
        
        for(int k=0; k<list.size(); k++)
            ans[k] = list.get(k);
        
        return ans;
    }
}
