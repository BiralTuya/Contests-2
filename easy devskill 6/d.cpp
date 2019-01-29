#include<bits/stdc++.h>
using namespace std;

int main(){
    int t=0;
    scanf("%d",&t);
    while(t--){
        int n=0;
        long long a=0,b=0;
        scanf("%d",&n);
        int i;
        for(i=1;i<=n;i++){
            a+=i*i;
            b+=i;
        }
        long long c=(b*b)-a;
        printf("%lld\n",c);
    }
    return 0;
}
