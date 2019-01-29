#include<iostream>
#include<cstdio>
using namespace std;

int main(){
    int a=0,b=0,c=0,number=0,average=0;
    int i;
    for(i=1;i<=50;i++){
        scanf("%d %d %d",&a,&b,&c);
        number=(a/2)+(b/4)+(c/4);
        average=number/3;
        printf("Roll %d: number: %d and average: %d",i,number,average);
    }
    return 0;
}
