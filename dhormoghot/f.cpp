#include<bits/stdc++.h>
using namespace std;

int main(){
    string s;
    cin>>s;
    int len=s.length();
    int i,c=0;
    for(i=0;i<len;i++){
        if(isupper(s[i])) c++;
    }
    cout<<c+1<<endl;
    return 0;
}
