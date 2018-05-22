package os;
import java.util.*;
import java.lang.*;
public class CLook {

	public int main(int queue[],int numberOfRequests,int head)
	{	
		/*int minimum=func1(A,n);
		int maximum=func2(A,n);
		int ans;
		if(head<100)
		{	int ma=max(A,n,head);
			ans=(head-minimum)+(maximum-ma);
		}
		else
		{	int mi=min(A,n,head);
			ans=(maximum-head)+(mi-minimum);
		}
		return ans;
	}
	
	public static int func1(int A[],int n)
	{
		int result=A[0];
		for(int i=0;i<n;i++)
		{
			if(A[i]<result)
				result=A[i];
		}
		return result;
	}
	public static int func2(int A[],int n)
	{
		int result=A[0];
		for(int i=0;i<n;i++)
		{
			if(A[i]>result)
				result=A[i];
		}
		return result;
	}
	public static int max(int Ai[],int n,int head)
	{	int A[]=new int[n],k=0;
		for(int i=0;i<n;i++)
		{
			if(Ai[i]>head)
			{
				A[k]=Ai[i]; k++;
			}
		}
		if(k!=-1)
		{
		int ma=A[0];
		for(int i=1;i<n;i++)
		{
			if(A[i]<ma) ma=A[i];
		}
		return ma;
		}
		return 199;
	}
	public static int min(int Ai[],int n,int head)
	{	
		int A[]=new int[n],k=0;
		for(int i=0;i<n;i++)
		{
			if(Ai[i]<head)
			{
				A[k]=Ai[i]; k++;
			}
		}
		if(k!=-1)
		{
		int mi=A[0];
		for(int i=1;i<n;i++)
		{
			if(A[i]>mi) mi=A[i];
		}
		return mi;
		}
		return 0;*/
		
		int i,j1,j2,totalHeadMovements,count,maxi,mini,ind,positives;
        Random rand=new Random();

        //numberOfRequests=rand.nextInt(3)+8;
        //int queue[]=new int[numberOfRequests]; 
        Integer lesserHead[]=new Integer[numberOfRequests];
        Integer greaterHead[]=new Integer[numberOfRequests];
        int prevState;

        //for(i=0;i<numberOfRequests;i++)
            //queue[i]=rand.nextInt(200);
        //head=rand.nextInt(200);
        prevState=rand.nextInt(200);
        j1=0;
        j2=0;
        for(i=0;i<numberOfRequests;i++)
            if(queue[i]<=head){
                lesserHead[j1]=queue[i];
                j1++;
            }
            else{
                greaterHead[j2]=queue[i];
                j2++;
            }
        Arrays.sort(lesserHead,0,j1);
        Arrays.sort(greaterHead,0,j2);

        //All data
        System.out.println("This is 200 requestIDs architecture\n");
            System.out.println("We have "+numberOfRequests+" number of requests.");
        for(i=0;i<numberOfRequests;i++)
            System.out.print(queue[i]+" ");
        System.out.println("\nAnd our head pointer is at "+head);
        System.out.println("And our previous head pointer was at "+prevState);

        totalHeadMovements=0;
        if(prevState>head){
            for(i=j1-1;i>=0;i--){
                totalHeadMovements+=Math.abs(head-lesserHead[i]);
                head=lesserHead[i];
            }
            for(i=j2-1;i>=0;i--){
                totalHeadMovements+=Math.abs(head-greaterHead[i]);
                head=greaterHead[i];
            }
        }
        else{
            for(i=0;i<j2;i++){
                totalHeadMovements+=Math.abs(greaterHead[i]-head);
                head=greaterHead[i];
            }

            for(i=0;i<j1;i++){
                totalHeadMovements+=Math.abs(lesserHead[i]-head);
                head=lesserHead[i];
            }   
        }
       return totalHeadMovements;
	}
	
	}
