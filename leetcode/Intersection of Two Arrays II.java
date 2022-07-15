//https://leetcode.com/problems/intersection-of-two-arrays-ii/submissions/


class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    ArrayList <Integer> temp = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
    int i = 0; 
    int j = 0;
    while(i < nums1.length && j < nums2.length) {
        if(nums1[i] == nums2[j]) {
            temp.add(nums1[i]);
            j++;
            i++;
        }
        else if(nums1[i] > nums2[j]) {
            j++;
        }
        else 
            i++;
    }
        int[] ans = new int[temp.size()];
        for(int k = 0; k < ans.length; k++) {
            ans[k] = temp.get(k);
        }
    return ans;
}
}

//Another Approch to change likedlist to Array

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> li = new ArrayList<>();
        for(int i=0,j=0; i < n && j < m;){
            if(nums1[i] == nums2[j]){
                li.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] arr = li.stream().mapToInt(Integer::intValue).toArray();
         return arr;
    }
}
