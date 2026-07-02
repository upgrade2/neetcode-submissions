class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqHm = new HashMap<>();
        for(int num : nums){
            freqHm.put(num,freqHm.getOrDefault(num,0)+1);
        }
        
        return freqHm.entrySet()
                    .stream()
                    .sorted((a,b)->b.getValue()-a.getValue())
                    .limit(k)
                    .mapToInt(entry->entry.getKey())
                    .toArray();
    }
}
