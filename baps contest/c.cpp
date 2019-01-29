#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    scanf("%d",&t);
    int i;
    for(i=1;i<=t;i++){
        vector<long long>a;
        vector<long long>b;
        vector<long long>x;
        long long c1,c2;
        int n,m;
        scanf("%d %d",&n,&m);
        int j;
        for(j=0;j<n;j++){
            scanf("%lld",&c1);
            a.push_back(c1);
        }
        int k;
        for(k=0;k<m;k++){
            scanf("%lld",&c2);
            b.push_back(c2);
        }
        x.reserve(a.size()+b.size());
        x.insert(x.end(),a.begin(),a.end());
        x.insert(x.end(),b.begin(),b.end());

        sort (x.begin(),x.end());

        long long ans=0;
        vector<long long>::iterator it;
        for(it=x.begin();it!=x.end()-1;++it){
            ans+=*it;
            //cout<<" "<<*it<<endl;
        }
        printf("Case %d: %lld\n",i,ans);

    }
    return 0;
}
