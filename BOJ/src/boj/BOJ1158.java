package boj;

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
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1158 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder("<");
		Queue<Integer> list = new LinkedList<>();
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=N; i++)
			list.add(i);
		
		while(!list.isEmpty()) {
			
		}
		System.out.println(sb);
		
	}
	
}
