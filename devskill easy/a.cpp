#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        string s;
        int a;
        cin>>s;
        scanf("%d",&a);
        if(s=="Shuvo nobo borsho"){
            //scanf("%d",&a);
            printf("Shuva naya barsha %d\n",a+650);
        }
        else if(s=="Shuva naya barsha"){
            //scanf("%d",&a);
            printf("Shuvo nobo borsho %d\n",a+650);
        }
    }
    return 0;
}
