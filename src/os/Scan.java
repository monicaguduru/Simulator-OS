package os;

import java.util.*;
public class Scan {
	public int main(int queue[],int numberOfRequests,int head)
	{	
	//	int next_to_m=find(A,n,m);
		/*int ans;
		if(head<100)
		{	int ma=max(A,n);
			ans=(head-0)+(ma-0);
		}
		else
		{	int mi=min(A,n);
			ans=(199-head)+(199-mi);
		}
		return ans;
	}
public static int max(int A[],int n)
{	int ma=A[0];
	for(int i=1;i<n;i++)
	{
		if(A[i]>ma) ma=A[i];
	}
	return ma;
}
public static int min(int A[],int n)
{	int mi=A[0];
	for(int i=1;i<n;i++)
	{
		if(A[i]<mi) mi=A[i];
	}
	return mi;*/
		int i,totalHeadMovements,count,maxi,mini,ind,positives;
		Random rand=new Random();

		//numberOfRequests=rand.nextInt(3)+8;
		//int queue[]=new int[numberOfRequests];
		int visited[]=new int[numberOfRequests];

		//for(i=0;i<numberOfRequests;i++)
			//queue[i]=rand.nextInt(200);
		//head=rand.nextInt(200);
		
		//All data
		System.out.println("This is 200 requestIDs architecture\n");
		System.out.println("We have "+numberOfRequests+" number of requests.");
		for(i=0;i<numberOfRequests;i++)
			System.out.print(queue[i]+" ");
		System.out.println("\nAnd our head pointer is at "+head);

		count=0;
		totalHeadMovements=0;
		positives=0;
		for(i=0;i<numberOfRequests;i++)
			if(queue[i]<=head)
				positives++;
		while(count<positives){
			maxi=0;
			ind=0;
			for(i=0;i<numberOfRequests;i++)
				if(visited[i]==0 && queue[i]<=head && maxi<queue[i]){
					maxi=queue[i];
					ind=i;
				}
			totalHeadMovements+=head-maxi;
			head=queue[ind];
			visited[ind]=1;
			count++;
		}
		totalHeadMovements+=2*head;
		while(count<numberOfRequests){
			mini=20000;
			ind=0;
			for(i=0;i<numberOfRequests;i++)
				if(visited[i]==0 && queue[i]>head && mini>queue[i]){
					mini=queue[i];
					ind=i;
				}
			totalHeadMovements+=mini-head;
			head=queue[ind];
			visited[ind]=1;
			count++;
		}
		return totalHeadMovements;
}
}
