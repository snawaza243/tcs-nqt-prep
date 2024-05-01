/*

Given an integer, we need to find the sum of values of that table.

Input: 10
Output: 550
Explanation: 10*1 + 10*2+ ... + 10*10 = 550

*/

#include <stdio.h>

int main()
{
    int N;
    printf("Enter the integer N: ");
    scanf("%d", &N); // Input the integer

    int sum = 0;

    // Iterate over multiples of N up to 10 times N
    for (int i = 1; i <= 10; i++)
    {
        sum += N * i; // Add the multiple of N to the sum
    }

    // Print the sum
    printf("The sum of multiples of %d in its times table is: %d\n", N, sum);

    return 0;
}
