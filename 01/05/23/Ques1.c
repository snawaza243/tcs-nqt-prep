/*
TCS Slot 1

1. You have given an input N, you have to print the sum of value of multiple of N are table multiplication.

Input: n = 10
Output: 550
Explanation: 10*1 + 10*2 + 10*3 + ...+ 10*10 = 550

*/

#include <stdio.h>
#include <conio.h>

int main()
{
    int n;

    printf("Enter the number: ");
    scanf("%d", &n);

    int sum = 0;
    for (int i = 1; i <= n; i++)
    {
        sum = sum + n * i;
    }

    printf("Sum will be %d", sum);
}
