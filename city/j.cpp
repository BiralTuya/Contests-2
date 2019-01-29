#include<bits/stdc++.h>
using namespace std;
int check_vowel(char c)
{
  switch(c) {
    case 'a':
    case 'A':
    case 'e':
    case 'E':
    case 'i':
    case 'I':
    case 'o':
    case 'O':
    case 'u':
    case 'U':
    case 'y':
    case 'Y':
      return 1;
    default:
      return 0;
  }
}
bool isVowel(char ch)
{
      if ((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')
         ||(ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='y')||(ch=='Y'))
   {
      //cout << isVowel << endl;
      return true;
   }
      else
   {
      return false;
   }
}
int main(){
    int t;
    cin>>t;
    cin.ignore();
    while(t--){
        int start=0,endd=0;
        char s[100],t[100],cp[100];
        gets(s);
        strcpy(cp,s);
        int len;
        len=strlen(s);
        //cout<<len;
        int i;
        for(i=0;i<len;i++){
            if(isVowel(s[i])==false){
                start=i;
                break;
            }

        }
        //cout<<start<<endl;
        for(int t=0;t<start;t++) cout<<s[t];


        int j;
        for(j=0;j<len;j++){
            if(isVowel(s[j])==false){
                endd=j;
            }
        }
        //cout<<endd<<endl;
        int q=0,u=0;
         for(q = start; q <endd; q++) {
            if(check_vowel(s[q]) == 0) {
                t[u] = s[q];
                u++;
            }
        }

        t[u] = '\0';

        strcpy(s, t);

    printf("%s", s);
    for(int r=endd;r<len;r++) cout<<cp[r];
    cout<<endl;
}
    return 0;
}
