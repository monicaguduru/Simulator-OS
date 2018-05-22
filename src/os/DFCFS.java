package os;

import java.util.Scanner;
import java.util.*;
public class DFCFS{
	public int main(int queue[],int numberOfRequests,int head)
	{
		/*Random x = new Random();
		int temp=Math.abs(head-A[0]);
		for(int i=1;i<n;i++)
		{
			temp=temp+Math.abs(A[i]-A[i-1]);	
		}
		return temp;*/
		int i,totalHeadMovements;
        Random rand=new Random();
        
        //numberOfRequests=rand.nextInt(3)+8;
        //int queue[] = new int[numberOfRequests];
		
		//for(i=0;i<numberOfRequests;i++)
			//queue[i]=rand.nextInt(200);
		//head=rand.nextInt(200);
		
		System.out.println("This is 200 requestIDs architecture\n");
		System.out.println("We have "+numberOfRequests+" number of requests.");
		for(i=0;i<numberOfRequests;i++)
			System.out.print(queue[i]+" ");
		System.out.println("\nAnd our head pointer is at "+head);

		totalHeadMovements=0;
		totalHeadMovements+=Math.abs(head-queue[0]);
		for(i=1;i<numberOfRequests;i++)
		    totalHeadMovements+=Math.abs(queue[i]-queue[i-1]);
		return totalHeadMovements;
	}
}
