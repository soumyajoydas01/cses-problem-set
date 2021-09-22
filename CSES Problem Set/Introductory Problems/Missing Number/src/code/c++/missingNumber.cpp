#include<bits/stdc++.h>
using namespace std;

int main(){
    long n;
    cin>>n;
    long sum = n*(n+1)/2;
    long temp =0;
    for (int i = 1; i < n; i++)
    {
        long k;
        cin>>k;
        temp = temp+k;
    }
    long ans = sum-temp;
    cout<<ans;
    
}