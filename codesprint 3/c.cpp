#include<bits/stdc++.h>
using namespace std;

long long an[500009];
set<long long>av;

int main(){
    int q;
    scanf("%d",&q);
    while(q--){
        int n;
        scanf("%d",&n);
        int i;
        for(i=0;i<n;i++){
            scanf("%lld",&an[i]);
        }
        int v;
        scanf("%d",&v);
        int j,s=0,c=0;
        long long lr,sm;
        for(j=0;j<v;j++){
            scanf("%lld %lld",&sm,&lr);
            for(s=0;s<n;s++){
                if(an[s]>=sm && an[s]<=lr){
                    c++;
                    an[s]=0;
                }
            }
        }
        printf("%d\n",c);
    }
    return 0;
}
