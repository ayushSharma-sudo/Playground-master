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
    int n2=n1%10,fact = 1;
      for(int i=1;i<=n2;i++)
      fact = fact * i;      
    n1/=10;
    sum = sum + fact;
  }
  if(sum == n)
    printf("Yes");
    else
      printf("No");
  return 0;
}