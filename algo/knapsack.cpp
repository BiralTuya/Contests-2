#include<iostream>
#include<algorithm>
using namespace std;

struct test{
    int a,b;
    };
    bool mycmp(test A,test B){
        double ratio1=(A.a*1.0)/(A.b*1.0);
        double ratio2=(B.a*1.0)/(B.b*1.0);
        if(ratio1<ratio2)
            return true;
        else if(ratio1>ratio2)
            return false;
        }

int main(){
    int items;
    cin>>items;
    test p[items];
    for(int i=0;i<items;i++){
        cin>>p[i].a>>p[i].b;
    }
    sort(p,p+items,mycmp());
    int n=0;
    cin>>n;
    double value=0.0;
    int nw=0;
    for(int i=0;i<items;i++){
        if(nw+p[i].a<n){
            nw=nw+p[i].a;
            nw+=p[i].b;
        }
        else{
            int remaining=n-nw;
            value+=p[i].b*remaining*1.0/p[i].a;
            break;
        }
    }
    cout<<"Is: "<<value;
    return 0;
}
