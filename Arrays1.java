//Elements which have at-least two greater elements

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int count = 0;
        
        for(int i=0; i<A.size(); i++) {
            count = 0;
            for(int j=0; j<A.size(); j++) {
                if(A.get(j)>A.get(i))
                    count++;
                    
                if(count==2){
                    result.add(A.get(i));
                    break;
                }
            }
        }
        
        return result;
    }
}
