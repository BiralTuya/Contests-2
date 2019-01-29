#include<bits/stdc++.h>
using namespace std;


string A,B;
int lenA;
int lenB;
int memo[1000][1000];

int lcs(int i,int j){
    if(i==lenA || j==lenB) return 0;
    if(memo[i][j]!=0) return memo[i][j];
    int res=0;
    if(A[i]==B[j]) res=1+lcs(i+1,j+1);
    else{
        int a=lcs(i+1,j);
        int b=lcs(i,j+1);
        res=max(a,b);
    }
    memo[i][j]=res;
    return res;
}

int main(){
    while(getline(cin,A)){
        getline(cin,B);
        memset(memo,0,sizeof(memo));
        lenA=A.length();
        lenB=B.length();
        //if(lenA==0 || lenB==0) printf("0\n");
        cout<<lcs(0,0)<<endl;
    }
    return 0;
    }
