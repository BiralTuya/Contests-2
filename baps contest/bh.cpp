#include <iostream>
#include <map>
#include <string>
#include<cstdio>
using namespace std;

int main() {
    int t;
    scanf("%d",&t);
    for(int i=1;i<=t;i++){
    map<string, int> freq;
    string word;
        int n;
        scanf("%d",&n);
        int j;
        for(j=0;j<n;j++){
            cin>>word;
            freq[word]++;
        }
        int max=-99,a=0;
        string b;
        map<string, int>::iterator iter;
        for (iter=freq.begin(); iter != freq.end(); ++iter) {
            a=iter->second;
            if(a>max) {
                max=a;
                b=iter->first;
            }
        }
        //cout<<max<<endl;
        cout<<"Case "<<i<<": "<<b<<endl;
    }
    return 0;
}
