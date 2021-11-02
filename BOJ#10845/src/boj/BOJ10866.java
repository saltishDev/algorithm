package boj;

/*
 * 	@author MS
 * 	@date 2021. 11. 02.
 *	 덱
 * 	https://www.acmicpc.net/problem/1158
 * 	정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

	명령은 총 여덟 가지이다.

	push_front X: 정수 X를 덱의 앞에 넣는다.
	push_back X: 정수 X를 덱의 뒤에 넣는다.
	pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	size: 덱에 들어있는 정수의 개수를 출력한다.
	empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
	front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class BOJ10866 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new LinkedList<>();
		
		while(N-- != 0) {
			String cmd = br.readLine();
			
			if(cmd.startsWith("push_front")) {
				list.add(0, Integer.parseInt(cmd.substring(11)));
			
			}else if(cmd.startsWith("push_back")) {
				list.add(Integer.parseInt(cmd.substring(10)));
				
			}else if(cmd.startsWith("pop_front")) {
				if(!list.isEmpty())
					sb.append(list.remove(0)).append('\n');
				else
					sb.append(-1).append('\n');
					
			}else if(cmd.startsWith("pop_back")) {
				if(!list.isEmpty())
					sb.append(list.remove(list.size()-1)).append('\n');
				else
					sb.append(-1).append('\n');
				
			}else if(cmd.equals("size")) {	
				sb.append(list.size()).append('\n');
				
			}else if(cmd.equals("empty")) {
				sb.append(list.isEmpty() ? 1 : 0).append('\n');
				
			}else if(cmd.equals("front")) {
				if(!list.isEmpty())
					sb.append(list.get(0)).append('\n');
				else
					sb.append(-1).append('\n');
			
			}else {
				if(!list.isEmpty())
					sb.append(list.get(list.size()-1)).append('\n');
				else
					sb.append(-1).append('\n');
				
			}
			
		}
		System.out.println(sb);
	}
}
