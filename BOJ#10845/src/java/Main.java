package java;

/*
 * @author MS
 * @date 2021. 11. 01.
 * 큐
 * https://www.acmicpc.net/problem/10845
 * 
 * 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
      명령은 총 여섯 가지이다.

   push X: 정수 X를 큐에 넣는 연산이다.
   pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
   size: 큐에 들어있는 정수의 개수를 출력한다.
   empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
   front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
   back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
   
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(N-- != 0) {
			String cmd = br.readLine();
			
			if(cmd.equals("pop")) {
				if(!list.isEmpty()){
					sb.append(list.get(0)).append('\n');
					list.remove(0);
				}
				else
					sb.append(-1).append('\n');
				
			}else if(cmd.equals("size")) {
				sb.append(list.size()).append('\n');
			
			}else if(cmd.equals("empty")) {
				sb.append(list.isEmpty() ? 1 : 0).append('\n');			
					
			}else if(cmd.equals("front")) {
				sb.append(list.isEmpty() ? -1 : list.get(0)).append('\n');
			
			}else if(cmd.equals("back")) {
				sb.append(list.isEmpty() ? -1 : list.get(list.size()-1)).append('\n');
			
			}else {
				list.add(Integer.parseInt(cmd.substring(5)));
				
			}
		}
		System.out.println(sb);
	}
	
}



