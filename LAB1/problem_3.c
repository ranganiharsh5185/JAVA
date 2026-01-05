#include "stdio.h"
void main()
{
   int n, i, sum = 0;
   printf("enter the no of elements in array:");
   scanf("%d", &n);
   int a[n];
   for (i = 1; i <= n; i++)
   {
      printf("enter the element:");
      scanf("%d", &a[i]);
      if (a[i] % 2 == 0)
      {
         sum += a[i];
      }
   }
   printf("the sum of even element is:%d", sum);
}