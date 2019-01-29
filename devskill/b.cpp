#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    scanf("%d",&t);
    int i;
    for(i=1;i<=t;i++){
        int n;
        //long long g;
        double p,q,pur=0,g;
        scanf("%d",&n);
        while(n--){
            scanf("%lf %lf",&p,&q);
            pur+=p*q;
        }
        scanf("%lf",&g);
        long long ans=(long long)g-pur;
        printf("Case %d: %lld\n",i,ans);
    }
    return 0;
}
