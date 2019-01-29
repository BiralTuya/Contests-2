#include<iostream>
using namespace std;

int main(){
    long long n=0;
    int status[10000];
    cin>>n;
    for(int i=2;i<=n;i++)
        status[i]=0;
    for(int i=2;i<=n;i++){
        if(status[i]==0){
            for(int j=2*i;j<=n;j+=i)
                status[j]=1;
        }
    }
    for(int i=2;i<=n;i++){
        if(status[i]==0){
            cout<<i<<endl;
        }
    }
    return 0;
}
