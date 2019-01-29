#include<iostream>
#include<cstdio>
using namespace std;

int MCM(int p[],int n);
int M[5][5];
int S[5][5];

int MCM(int p[],int n){
    int j=0,temp=0;
    for(int i=1;i<=n;i++){
        M[i][i]=0;
    }
    for(int len=2;len<=n;len++){
        for(int i=1;i<=n-len+1;i++){
            j=i+len-1;
            M[i][j]=9999;
            for(int k=i;k<=j-1;k++){
                temp=M[i][k]+M[k+1][j]+p[i-1]*p[k]*p[j];
                if(temp<M[i][j]){
                    M[i][j]=temp;
                    S[i][j]=k;
                }
            }
        }
    }
}

int main(){
    int p[11]={15,10,25,20,5,15};
    int n=5;

    for(int i=0;i<10;i++){
        for(int j=0;j<10;j++){
            M[i][j]=-1;
            S[i][j]=-1;
        }
    }

    MCM(p,n);

    for(int i=1;i<n+1;i++){
        for(int j=1;j<n+1;j++){
            printf("%5d ",M[i][j]);
        }
        printf("\n\n");
    }
    printf("\n");printf("\n");
    for(int i=1;i<n+1;i++){
        for(int j=1;j<n+1;j++){
            printf("%5d ",S[i][j]);
        }
        printf("\n\n");
    }
    printf("\t\t\t\t\t\t\t\t\t\t\t Tuya,Sanzila Hossain :)\n");
    return 0;
}

