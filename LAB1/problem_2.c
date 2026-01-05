#include "stdio.h"
void main()
{
    int n, i, sum = 0;
    printf("enter the no.:");
    scanf("%d", &n);
    while (n != 0)
    {
        i = n % 10;
        n = n / 10;
        sum = sum + i;
    }
    printf("the sum of digits is:%d", sum);
}