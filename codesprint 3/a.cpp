#include<bits/stdc++.h>
using namespace std;

int arr[110];

int main(){
    int n,m,d;
    scanf("%d",&n);
    int i;
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    scanf("%d %d",&d,&m);
    int j,k,c=0,s=0;
    for(j=0;j<n;j++){
        for(k=j;k<m+j;k++){
            s+=arr[k];
        }
       // cout<<s<<endl;
        if(s==d) c++;
        s=0;
    }
    printf("%d\n",c);
    return 0;
}
