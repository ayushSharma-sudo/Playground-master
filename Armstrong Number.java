#include <stdio.h>
int main() {
	//Type your code
  int n,dig=0,sum =0;
  scanf("%d",&n);
	int n1=n;	
  while(n1>0)
  {
    dig++;
  	n1/=10;
  }
  n1 = n;
  for(int i=0;i<dig;i++)
  {
    	int temp = 1;
  	for(int j=0;j<dig;j++)
    {
    	temp = temp * (n1 % 10);
          //n1/=10;
    }
    n1/=10;
    sum = sum + temp;
  }
  if(sum == n)
    printf("Armstrong Number");
    else
      printf("Not an Armstrong Number");

  return 0;
}