#include "stdio.h"
#include "string.h"
void main()
{
    int i, j, n, k;

    char a[100];
    printf("enter the string:");
    scanf("%s", a);
    n = strlen(a);
    for (i = 0; i <= n - 1; i++)
    {
        for (j = 1; j <= n - i - 1; j++)
        {
            printf(" ");
        }
        for (k = 0; k <= i; k++)
        {
            printf("%c ", a[k]);
        }

        printf("\n");
    }
}