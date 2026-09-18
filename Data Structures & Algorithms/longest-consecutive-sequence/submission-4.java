class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        // Add all numbers to the set
        for (int num : nums) {
            set.add(num);
        }
        
        int longest = 0;
        // Check every number
        // int length  = 0;
        for (int num : set) {
            // Start only if the number is beginning with a num
            if (!set.contains(num - 1)) {

                int length = 1;
                int current = num;
//dskdsod - odnskd skdmsdlmsldsldsld - |fikesjfpnesfkndkfndkf|
                // Find consecutive numbers
                // while (set.contains(current + 1)) {
                //     current++;
                //     length++;
                // }

                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                // dskjfdofljfnfslmdskndkdslfnkfnskfns
                // dknfkdnfjdfnslfslgnmefkefnm  
                // dsodfssldmlsnskndksnsajlfoidsidkognsodkfssopdkfjsipdskdiffiskjdpdnisfsjd
                // fjiswdsldnsdijsidn - djsodjsdojdosdn - ofjsjfgsoijdghskdjidjs -ojojfspfjs
                // ooljdosjjdodsdjsodjosdjsodjsodjpdksodwdjso 
                /// sdnsodspdjddisjdjs;djpsdjspojdiosijd kndskdksjd
                // india-djsicksdjsldk - diw
                longest = Math.max(longest, length);

            }
        }

        return longest;
    }
}