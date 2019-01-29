#include<iostream>
#include<cstdio>
using namespace std;

int main(){
    int t=0,v=0,r=0,sum=0;
    scanf("%d",&t);
    for(int i=1;i<=t;i++){
        scanf("%d",&v);
        while(v){
            r=v%10;
            v=v/10;
            sum=sum+r;
        }
        if(sum%3==0) printf("Case %d: Yes\n",i);
        else if(sum%3!=0) printf("Case %d: No\n",i);
        sum=0;r=0;
    }
    return 0;
}
