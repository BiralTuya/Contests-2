#include<bits/stdc++.h>
using namespace std;

int a[10005];

int main(){
    int n;
    scanf("%d",&n);
    int i;
    for(i=1;i<=n;i++)
        scanf("%d",&a[i]);
    int j;
    for(j=n;j>0;j--){
        printf("%d",a[j]);
        if(j==1) printf("\n");
        else printf(" ");
    }
    return 0;
}
