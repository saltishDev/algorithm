package boj;

/*
 * 	@author MS
 * 	@date 2021. 11. 02.
 *	 ��
 * 	https://www.acmicpc.net/problem/1158
 * 	������ �����ϴ� ��(Deque)�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	����� �� ���� �����̴�.

	push_front X: ���� X�� ���� �տ� �ִ´�.
	push_back X: ���� X�� ���� �ڿ� �ִ´�.
	pop_front: ���� ���� �տ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	pop_back: ���� ���� �ڿ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	size: ���� ����ִ� ������ ������ ����Ѵ�.
	empty: ���� ��������� 1��, �ƴϸ� 0�� ����Ѵ�.
	front: ���� ���� �տ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	back: ���� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	
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
