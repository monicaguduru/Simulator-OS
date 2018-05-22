package os;

import java.util.Scanner;
import java.util.*;
public class SSTF{
	public int main(int queue[],int numberOfRequests,int head)
	{
		/*Random x = new Random();
		int  head = x.nextInt(200) + 0;
		System.out.print("Head:- ");
		System.out.println(head);
		int num=x.nextInt(10)+5;
		System.out.print("n:- ");
		System.out.println(num);
		int [] queue=new int[num+1];
		System.out.print("Queue contains:- ");
		int i;
		for(i=1;i<=num;i++)
		{
			int use=x.nextInt(200)+0;
			System.out.print(use);
			System.out.print(" ");
			queue[i]=use;
		}
			System.out.println("");
		
		int temp=0;
			int [] use=new int[num];
			for(int j=0;j<num;j++)
			{
					use[j]=Math.abs(queue[j]-head);
			}
			for(int j=0;j<num;j++)
			{
				for(int k=0;k<num;k++)
				{
					if(use[k]>use[j])
					{
						int t=use[k];
						use[k]=use[j];
						use[j]=t;
						t=queue[k];
						queue[k]=queue[j];
						queue[j]=t;
					}
				}
			}
			temp=Math.abs(queue[1]-head);
			for(int j=1;j<num;j++)
			{
			//	System.out.println(queue[j]);
				temp=temp+Math.abs(queue[j]-queue[j-1]);
			}
		return temp;*/
		int i,j,totalHeadMovements,size,mini,ind;
        Random rand=new Random();
        
        //numberOfRequests=rand.nextInt(3)+8;
        //int queue[]=new int[numberOfRequests];
		int queue2[]=new int[numberOfRequests];

		//for(i=0;i<numberOfRequests;i++)
			//queue[i]=rand.nextInt(200);
		//head=rand.nextInt(200);
		
		//All data
		System.out.println("This is 200 requestIDs architecture\n");
		System.out.println("We have "+numberOfRequests+" number of requests.");
		for(i=0;i<numberOfRequests;i++)
			System.out.print(queue[i]+" ");
		System.out.println("\nAnd our head pointer is at "+head);

		totalHeadMovements=0;
		size=numberOfRequests;
		while(size>0){
			mini=Math.abs(head-queue[0]);
			ind=0;
			for(i=1;i<size;i++)
				if(mini>Math.abs(head-queue[i])){
					mini=Math.abs(head-queue[i]);
					ind=i;
				}
			head=queue[ind];
			totalHeadMovements+=mini;
			for(i=j=0;i<size;i++)
				if(i!=ind)
					queue2[j++]=queue[i];
			size--;
			for(i=0;i<size;i++)
				queue[i]=queue2[i];
		}
		return totalHeadMovements;
	}
}
