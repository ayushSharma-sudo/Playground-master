#include <stdio.h>
int main() {
	//Type your code
  int num, sum = 0;
  scanf("%d",&num);
  //printf("%d",num);
  while (num >0)
  {
    sum = sum + (num%10);
	num=num/10;
  }
  printf("%d",sum);
      return 0;
}