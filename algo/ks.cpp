#include<iostream>
#include<algorithm>
using namespace std;

struct T{
    int a,b;
    double pr;
    };
    bool mycmp(T A,T B){
        return A.pr<B.pr;
        }

int main(){
    int itm=5;
    T p[itm];
    for(int i=0;i<itm;i++){
        cin>>p[i].a>>p[i].b;
        p[i].pr=(double)p[i].b/(double)p[i].a;
    }
    sort(p,p+itm,mycmp);
    double ans=0;
    int k=2,i=0;
    while(k>0 && k<=itm){
        if(k>=p[i].b){
            ans+=p[i].pr*p[i].a;
            k-=p[i].a;
        }
        else{
            ans+=(k+p[i].pr);
            k=0;
        }
        i++;
    }
    cout<<ans<<endl;
    return 0;
}
