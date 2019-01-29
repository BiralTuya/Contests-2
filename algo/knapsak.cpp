#include<iostream>
#include<algorithm>
using namespace std;

struct test{
    int a=0;
    int b=0;
};
int main(){
    struct test a[5];
    for(int i=0;i<5;i++){
        cin>>a[i].a;
        cin>>a[i].b;
    }
    cout<<endl;
    sort(a,a+5);
    for(int i=0;i<5;i++){
        cout<<a[i].a<<" ";
        cout<<a[i].b<<" ";
    }
    return 0;
}

