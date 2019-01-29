#include<bits/stdc++.h>
using namespace std;

int a[30];

int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        int n,jmp=0;
        scanf("%d",&n);
        int i;
        for(i=0;i<n;i++){
            scanf("%d",&a[i]);
            }
        int j=0;
        while(j<n){
            if(a[j]>0){
                j+=a[j];
                jmp++;
            }
            else if(a[j]<0){
                if((j-1)>0){
                    j--;
                }
                else if((j-1)<0){
                    j++;
                }
                jmp++;

            }
        }
        printf("%d\n",jmp);
        }
        return 0;
    }
