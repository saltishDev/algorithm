package java;

/*
 * @author MS
 * @date 2021. 11. 02.
 * �似Ǫ�� ����
 * https://www.acmicpc.net/problem/1158
 * 	�似Ǫ�� ������ ������ ����.
 * 
	1������ N������ N���� ����� ���� �̷�鼭 �ɾ��ְ�, ���� ���� K(�� N)�� �־�����. 
	���� ������� K��° ����� �����Ѵ�. 
	�� ����� ���ŵǸ� ���� ������ �̷���� ���� ���� �� ������ ����� ������. 
	�� ������ N���� ����� ��� ���ŵ� ������ ��ӵȴ�. 
	������ ������� ���ŵǴ� ������ (N, K)-�似Ǫ�� �����̶�� �Ѵ�. 
	���� ��� (7, 3)-�似Ǫ�� ������ <3, 6, 2, 7, 5, 1, 4>�̴�.

	N�� K�� �־����� (N, K)-�似Ǫ�� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ1158 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder("<");
		List<Integer> list = new ArrayList<>();
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int idx = -1;
		
		for(int i=1; i<=N; i++)
			list.add(i);
		
		while(!list.isEmpty()) {			
			for(int i=0; i<K; i++) 
				idx++;
					
			if(idx >= list.size())
				idx %= list.size();		
			sb.append(list.get(idx)).append(list.size() == 1 ? ">" : ", " );
			list.remove(idx--);
		}
		System.out.println(sb);
		
	}
	
}
