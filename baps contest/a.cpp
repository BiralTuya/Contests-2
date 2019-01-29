#include<bits/stdc++.h>
using namespace std;

int main(){
    int t,k;
    long long n,a=0,b=0,c=0,d=0,e=0,f=0,x=0;
    scanf("%d",&t);
    int i;
    for(i=1;i<=t;i++){
        scanf("%d %lld",&k,&n);
        if(k==0){
            a=n/3;
            b=((n-a)/3)*2;
            c=(n-a)/3;
            printf("Case %d:\n%lld\n%lld\n%lld\n",i,a,b,c);
        }
        if(k==1){
            e=n*2;
            x=(n*3)/2;
            f=(n*3)+x;
            d=f/3;
            printf("Case %d:\n%lld\n%lld\n%lld\n",i,d,e,f);
        }
        a=0;b=0;c=0;d=0;e=0;f=0;x=0;
    }
    return 0;
}
