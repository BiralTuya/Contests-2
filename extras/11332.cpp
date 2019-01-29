#include<iostream>
#include<cstdio>
using namespace std;

int main(){
    long long int number=0,sum=0;
    while(scanf("%lld",&number)!=EOF){
    int i;
    if(number==0) break;
    for(i=0;;i++){
        while(number!=0){
            sum+=number%10;
            number=number/10;
        }
        if(sum<10) break;
        number=sum;sum=0;
    }
    printf("%lld\n",sum);sum=0;
    }
    return 0;
}
