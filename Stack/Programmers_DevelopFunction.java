package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class Programmers_DevelopFunction {
	public int[] solution(int[] progresses, int[] speeds) {
		
		Queue<Integer> qu= new LinkedList<Integer>();
		LinkedList<Integer> li=new LinkedList<Integer>();
        for (int i = 0; i < progresses.length; i++) {
			int tmp=(100-progresses[i])/speeds[i];
			if((100-progresses[i])%speeds[i]>0) {
				tmp+=1;
			}
			qu.add(tmp);
		}
        while(!qu.isEmpty()) {
        	int tmp=qu.poll();
        	int cnt=1;
        	while(!qu.isEmpty()&&qu.peek()<=tmp) {
        		cnt++;
        		qu.poll();
        	}
        	li.add(cnt);
        }
        
		int[] answer = new int[li.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i]=li.get(i);
		}
        return answer;
    }
	
	
}
