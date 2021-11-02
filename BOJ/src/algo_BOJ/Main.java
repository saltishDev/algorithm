package algo_BOJ;

/*
 * @author MS
 * @date 2021. 11. 01.
 * ť
 * https://www.acmicpc.net/problem/10845
 * 
 * ������ �����ϴ� ť�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
      ����� �� ���� �����̴�.

   push X: ���� X�� ť�� �ִ� �����̴�.
   pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
   size: ť�� ����ִ� ������ ������ ����Ѵ�.
   empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
   front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
   back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
   
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


