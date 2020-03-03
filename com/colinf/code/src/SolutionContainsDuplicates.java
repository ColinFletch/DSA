
public class SolutionCountingDuplicates {

    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) {return false;}
         Set set = new HashSet<Integer>(nums.length-1);
         for (int i=0; i<nums.length; i++){
             set.add((Integer)nums[i]); }
         return (set.size() != nums.length);
     }
    public static void main (String[] args) {
        String s = new String("Hello, World!");
        HashSet<Character> hs = new HashSet<Character>();
        hs.add(s.toCharArray());
        if (s.length() == hs.size()) {
            System.out.println("The Chars are all Unique.");
        } else {
            System.out.println("Not Unique.");
        }
    }
}