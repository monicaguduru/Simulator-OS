package os;
import java.util.*;
import java.lang.*;
public class Look {
	public int main(int queue[],int numberOfRequests,int head) {
        int i,j1,j2,totalHeadMovements,count,maxi,mini,ind,positives;
        Random rand=new Random();
        //int queue[]=new int[numberOfRequests]; 
        Integer lesserHead[]=new Integer[numberOfRequests];
        Integer greaterHead[]=new Integer[numberOfRequests];
        int prevState;

        //for(i=0;i<numberOfRequests;i++)
          //  queue[i]=rand.nextInt(200);
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
            for(i=0;i<j2;i++){
                totalHeadMovements+=Math.abs(head-greaterHead[i]);
                head=greaterHead[i];
            }
        }
        else{
            for(i=0;i<j2;i++){
                totalHeadMovements+=Math.abs(greaterHead[i]-head);
                head=greaterHead[i];
            }

            for(i=j1-1;i>=0;i--){
                totalHeadMovements+=Math.abs(lesserHead[i]-head);
                head=lesserHead[i];
            }   
        }
        return totalHeadMovements;
    }
}
