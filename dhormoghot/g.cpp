#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    scanf("%d",&t);
    int i;
    for(i=1;i<=t;i++){
        long long a,b;
        scanf("%lld %lld",&a,&b);
        long long p=a/2;
        long long ans=p*b;
        printf("Case %d: %lld\n",i,ans);
    }
    return 0;
}
