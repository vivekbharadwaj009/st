#include<bits/stdc++.h>
using namespace std;

int32_t main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int a,b,c,c1,c2,c3;
    do {
        printf("enter  the side of triangle \n");
        scanf("%d%d%d",&a,&b,&c);
        c1=((a>=1)&&(a<=10));
        c2=((b>=1)&&(b<=10));
        c3=((c>1)&&(c<=10));
        if (!c1) {
            printf("value of a is out of range");
        }
        if(!c2) {
            printf("value of a is out of range");
        }
        if(!c3) {
            printf("value of a is out of range");
        }
    }
    
    while (!c || !c2 || !c3);
        if((a + b) > c && (b + c) > a && (c + a) > b) {
            if(a == b && b == c) {
                printf ("triangle is equilateral \n");
            }
            else if(a!=b&& b!=c&& c!=a) {
                printf("triangle is scaler \n");
            }
            else {
                printf ("triangle is isoceles \n");
            }
        }
        else {
            printf("triangle can't be formed \n");
        }
      
    return 0;
}
