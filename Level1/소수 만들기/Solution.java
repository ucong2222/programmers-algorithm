
class Solution {
    public int solution(int[] nums) {
        int cnt = 0;
        
        for(int i=0; i< nums.length-2;i++){
            for( int j = i+1; j < nums.length-1; j++){
                for (int k = j+1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    // 소수점인지 아닌지 확인
                    int num = 0;
                    for(int n = 2 ; n<=Math.sqrt(sum) ; n++){
                        if ( sum % n == 0){
                            num++;
                        }
                    }
                    
                    if( num == 0 ) {
                        cnt++;
                    }
                }
            }
        }
        
        return cnt;
    }
}