#include "stdio.h"
void main()
{
    int i, j, n, k;
    printf("enter the no. of rows:");
    scanf("%d", &n);
    for (i = 1; i <= n / 2 + 1; i++)
    {
        for (j = 1; j <= n / 2 + 1 - i; j++)
        {
            printf(" ");
        }
        for (k = 1; k <= i; k++)
        {
            printf("* ");
        }

        printf("\n");
    }
    for (i = n / 2; i >= 1; i--)
    {
        for (j = 1; j <= n / 2 - i; j++)
        {
            printf(" ");
        }
        for (k = 1; k <= i; k++)
        {
            printf(" *");
        }

        printf("\n");
    }
}