#include<bits/stdc++.h>
using namespace std;

int main(){
    int k,r;
    scanf("%d %d",&k,&r);
    int i=1;
    while(1){
        int price=k*i;
        int a=price%10;
        //cout<<a<<endl;
        if(a==0){
            printf("%d\n",i);
            break;
        }
        else{
            int b=a-r;
            if(b==0){
                printf("%d\n",i);
                break;
            }
            else i++;
        }
    }
    return 0;
}
