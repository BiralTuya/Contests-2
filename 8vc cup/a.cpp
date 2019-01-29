#include<bits/stdc++.h>
using namespace std;

int main(){
    int m=0,d=0;
    scanf("%d %d",&m,&d);
    if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
        if(d>=1 && d<6) printf("5\n");
        else if(d==6 || d==7) printf("6\n");
    }
    else if(m==4 || m==6 || m==9 || m==11){
        if(d==7) printf("6\n");
        else if(d<7 && d>=1) printf("5\n");
    }
    else if(m==2){
        if(d==1) printf("4\n");
        else if(d>1 && d<=7) printf("5\n");
    }
    return 0;
}
