
#include<stdio.h>
int zdgys(int a, int b)
{
	int temp;
	if (a < b)
	{
		temp = a; a = b; b = temp;
	}
	temp = a%b;
	if (temp == 0)
		return b;
	else
		return zdgys(b, temp);
}
int zdgbs(int a, int b)
{
	return a*b / zdgys(a, b);
}
int main()
{
	int m, n, r;
	printf("����������������\n");
	scanf_s("%d%d", &m, &n);
	r = zdgbs(m, n);
	printf("%d��%d����������С�������ǣ�%d\n", m, n, r);
	return 0;
}



