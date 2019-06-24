#include <stdio.h>
int main() {
	//Type your code
  int num, second_digit, copy_of_num,div=1;
  scanf("%d",&num);
  copy_of_num = num;
  while(copy_of_num > 0)
  {
  	div = 10 * div;
    copy_of_num /= 10;
  }
  div = div / 100;
  //printf("%d",div);
  second_digit = (num / div) % 10;
  printf("%d", second_digit);
	return 0;
}