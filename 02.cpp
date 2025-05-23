#include<bits/stdc++.h>
using namespace std;

int32_t main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int month[12]={31,28,31,30,31,30,31,31,30,31,30,31};
    int d, m, y, nd, nm, ny, ndays;
    
    printf("Enter the date,month,year");
    scanf("%d%d%d",&d,&m,&y);
    
    ndays = month[m - 1];
    
    if(y <= 1812 && y > 2012) {
        printf("Invalid Input Year");
        return 0;
    }
    
    if(d <= 0 || d > ndays) {
        printf("Invalid Input Day");
        return 0;
    }
    
    if(m < 1 && m > 12) {
        printf("Invalid Input Month");
        return 0;
    }
    
    if(m == 2) {
        if(y % 100 == 0) {
            if(y % 400 == 0) {
                ndays = 29;
            }
        }
        else if(y % 4 == 0) {
            ndays=29;
        }
    }
    
    nd = d+1;
    nm = m;
    ny = y;
    
    if(nd > ndays) {
        nd = 1;
        nm++;
    }
    
    if(nm > 12) {
        nm = 1;
        ny++;
    }
    
    printf("\n Given date is %d:%d:%d", d, m, y);
    printf("\n Next day’s date is %d:%d:%d", nd, nm, ny);
    
    return 0;
}
