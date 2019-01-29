#include<bits/stdc++.h>
using namespace std;

int main(){
    int a,b;
    scanf("%d %d",&a,&b);
    int i;
    for(i=1;;i++){
        a=a*3;
        b=b*2;
        if(a>b) break;
    }
    printf("%d\n",i);
    return 0;
}
