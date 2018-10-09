#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int arr[26]={0},x,count=0;
        string str;
        cin>>str;
        for(int i=0;i<str.size();i++)
        {
         x=str[i]-'a';
         arr[x]++;
        }
        for(int j=0;j<26;j++)
        {
            if(arr[j]==0)
                count++;
        }
sort(arr,arr+26);
float e=(float)str.size()/2;
if(arr[25]==e)
    cout<<"YES"<<endl;
else if(count==25)
        cout<<"YES"<<endl;
else
    cout<<"NO"<<endl;
    }
    return 0;
}
