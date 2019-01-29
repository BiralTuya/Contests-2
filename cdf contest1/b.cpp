#include<bits/stdc++.h>
using namespace std;

int ar[510];

int main(){
    int n,k,a=0,b=0,ans=0;
    scanf("%d %d",&n,&k);
    int i;
    for(i=0;i<n;i++){
        scanf("%d",&ar[i]);
        a+=ar[i];
    }
    int j;
    for(j=0;j<n;j++){
        if(ar[j]+ar[j+1]!=k){
            ar[j+1]=k-ar[j];
        }
    }
    int t;
    for(t=0;t<n;t++){
        b+=ar[t];
    }
    printf("%d\n",b-a);
    int p;
    for(p=1;p<=n;p++){
        printf("%d",ar[p]);
        if(p<n) printf(" ");
        else if(p==n) printf("\n");
    }
    return 0;
}
