package book;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Arrays;

/*
6 5
1 1 0 1 1
1 0 1 1 1
1 0 1 0 0
1 0 1 1 1
1 1 1 0 1
1 1 1 1 1
0 0              //起点
0 3              //终点
*/
public class 广搜 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
                int n=scanner.nextInt();
                int m=scanner.nextInt();
                int [][]maze=new int[n][m];
                int [][]visited=new int[n][m];
                int [][]fa=new int[n][m];		//记录到该节点的上一个节点的坐标
                int [][]last_dir=new int[n][m];
                int []dx={-1,1,0,0};			//四个方向
                int []dy={0,0,-1,1};
                char []dir={'U','D','L','R'};
                for(int i=0;i<n;i++){
                    Arrays.fill(visited[i], 0);
                }
                for(int i=0;i<n;i++)
                    for(int j=0;j<m;j++)
                        maze[i][j]=scanner.nextInt();
                int src_x=scanner.nextInt();	//起点
                int src_y=scanner.nextInt();
                int des_x=scanner.nextInt();	//终点
                int des_y=scanner.nextInt();
                if(maze[src_x][src_y]!=1)
                   return;
                Queue<Integer> queue=new LinkedList<Integer>();
                queue.offer(src_x*m+src_y);			//矩阵数组按0,1,2...n*m编号
                fa[src_x][src_y]=src_x*m+src_y;
                visited[src_x][src_y]=1;
                while(!queue.isEmpty()){
                    int index=queue.poll();
                    if(des_x*m+des_y==index)break;
                    int x=index/m;
                    int y=index%m;
                    for(int i=0;i<4;i++){
                        int nx=x+dx[i];
                        int ny=y+dy[i];
                        if(nx>=0&&nx<n&&ny>=0&&ny<m&&maze[nx][ny]==1&&visited[nx][ny]==0){
                            queue.offer(nx*m+ny);
                            visited[nx][ny]=1;
                            fa[nx][ny]=index;
                            last_dir[nx][ny]=i;
                        }
                    }
                }
                StringBuffer path=new StringBuffer();
                int fx=des_x;
                int fy=des_y;
                int index=des_x*m+des_y;
                while(fa[fx][fy]!=index){
                    path.append(dir[last_dir[fx][fy]]);
                    int x=fa[fx][fy]/m;
                    int y=fa[fx][fy]%m;
                    fx=x;
                    fy=y;
                    index=fx*m+fy;
                }
                System.out.println(path.reverse().toString());
            }


}
