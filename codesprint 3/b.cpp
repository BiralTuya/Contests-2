#include<bits/stdc++.h>
using namespace std;

int main(){
    int r,c;
    scanf("%d %d",&r,&c);
    int i,j;
    for(i=1;i<=r;i++){
        for(j=1;j<=c;j++){
            printf("..O..");
            if(j==c) printf("\n");
        }
        for(int k=1;k<=c;k++){
            printf("O.o.O");
            if(k==c) printf("\n");
        }
        for(int l=1;l<=c;l++){
            printf("..O..");
            if(l==c) printf("\n");
        }
    }
    return 0;
}
