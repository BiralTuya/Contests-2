#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    scanf("%d",&t);
    int i;
    for(i=1;i<=t;i++){
        int n,ans=0;
        scanf("%d",&n);
        int j;
        for(j=1;j<=n;j++){
            ans+=j*j*j;
        }
        printf("Case %d: %d\n",i,ans);
    }
    return 0;
}
