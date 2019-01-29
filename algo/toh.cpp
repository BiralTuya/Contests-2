#include<iostream>
#include<cstdio>
#include<math.h>
using namespace std;

void toh(int n,char s,char i,char d){
    if(n<1)
        return;
    toh(n-1,s,i,d);
    printf("%d :: %c -> %c\n",n,s,d);
    toh(n-1,i,s,d);
}

int main(){
    int n=0,m=0;
    scanf("%d",&n);
    toh(n,'S','I','D');
    m=pow(2,n)-1;
    printf("%d",m);
    return 0;
}
