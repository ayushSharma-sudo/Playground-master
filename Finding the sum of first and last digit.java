#include <stdio.h>
int main() {
	//Type your code
  int num, sum = 0, last_digit, first_digit, copy_of_num,div=1;
  scanf("%d",&num);
  copy_of_num = num;
  last_digit = num % 10;
  while(copy_of_num > 0)
  {
  	div = 10 * div;
    copy_of_num /= 10;
  }
  div = div / 10;
  //printf("%d",div);
  first_digit = num / div;
  printf("%d", last_digit + first_digit);
	return 0;
}