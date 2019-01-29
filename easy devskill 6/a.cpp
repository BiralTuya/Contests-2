#include<bits/stdc++.h>
using namespace std;

int main(){
    int t=0;
    scanf("%d",&t);
    while(t--){
        double v=0,t=0;
        scanf("%lf %lf",&v,&t);
        double ans=v/t;
        printf("-%.2lf\n",ans);
    }
    return 0;
}
