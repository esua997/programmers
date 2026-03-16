class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a_string = String.valueOf(a); 
        
        String b_string = String.valueOf(b);
        
        if(Integer.parseInt(a_string+b_string) > 2 * a * b){
            answer = Integer.parseInt(a_string+b_string);
        }else{
            answer = 2 * a * b;
        }
        return answer;
    }
}