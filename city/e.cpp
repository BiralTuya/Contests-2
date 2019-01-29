#include<bits/stdc++.h>
using namespace std;
int main()
{
    int test,N;

    cin>>test;
    for(int i=1;i<=test;i++)
    {
        cin>>N;
        cout<<"Case "<<i<<":"<<endl;
        for(int j=1;j<=10;j++)
        {
            cout<<N<<" X "<<j<<" = "<<N*j<<endl;
        }
    }
    return 0;
}
