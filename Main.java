#include<stdio.h>
int main()
{
  //Type your code here
  int num,sum13;
  scanf("%d",&num);
  sum13 = (num%10) + (num/100);
  printf("%d",sum13);
  return 0;
}