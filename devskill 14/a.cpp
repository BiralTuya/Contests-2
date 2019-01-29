#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    scanf("%d",&t);
    int i;
    for(i=1;i<=t;i++){
        long long r,c,sum=0;
        scanf("%d %d",&r,&c);
        int j,k;
        for(j=r,k=c;;j--,k--){
            if(j==0 || k==0) break;
            sum+=j*k;
            //cout<<sum<<endl;
        }
        printf("Case %d: %lld\n",i,sum*15);
    }
    return 0;
}
