    package array;

    import java.util.HashMap;

    public class FirstAndLastPositionOfElement {
        public static void main(String[] args) {
            int nums[]={5,7,7,8,8,10};
            int target=8;
            int count=0;
            HashMap<Integer,Integer> hs=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(target==nums[i] ){
                                                count++;
                    hs.put(i, count);

                }
            }
            System.out.println(hs);
            
        }
    }
