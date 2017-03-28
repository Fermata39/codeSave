import java.util.*;

public class bfs {
	//인접행렬(연결되어 있는 것) 저장
	static int[][] ad;
	//방문체크
	static boolean[] visit;
	//정점과 간선의 개수 저장
	static int vCnt, eCnt;
	//큐객체 생성 
	static Queue queue;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		queue = new LinkedList<Integer>();

		System.out.println("정점의 개수 간선개수 입력:");
		vCnt = sc.nextInt();
		eCnt = sc.nextInt();

		ad = new int[vCnt][vCnt];
		visit = new boolean[vCnt];

		for(int i =0; i<eCnt; i++){
			int t1,t2;
			System.out.println("연결될 간선 입력:");
			t1 = sc.nextInt();
			t2 = sc.nextInt();

			ad[t1-1][t2-1] = ad[t2-1][t1-1] = 1;

		}

		bfs(1);

	}

	public static void bfs(int v){
		visit[v-1] = true;
		queue.add(v);

		while(!queue.isEmpty()){
			v = (int)queue.poll();
			for(int i=1; i<=vCnt;i++){
				if(ad[v-1][i-1]==1 && !visit[i-1]){
					System.out.println("v" + "->" + i);
					visit[i-1] = true;
					queue.add(i);
				}
			}
		}
	}
}
