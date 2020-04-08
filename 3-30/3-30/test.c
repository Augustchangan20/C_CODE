#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>
//int main()
//{
//	char str[] = "hello bit";
//	printf("%d %d\n", sizeof(str), strlen(str));
//	return 0;
//}
//void BubbleSort(int arr[], int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz - 1; i++)
//	{
//		int flag = 1;
//		int j = 0;
//		for (j = 0; j < sz-1-i; j++)
//		{
//			if (arr[j] > arr[j + 1])
//			{
//				int tmp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = tmp;
//				flag = 0;
//			}
//		}
//		if (flag == 1)
//		{
//			break;
//		}
//	}
//}
//void PrintArr(int* arr, int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	printf("\n");
//}
//int main()
//{
//	int arr[10] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	PrintArr(arr, sz);
//	BubbleSort(arr, sz);
//	PrintArr(arr, sz);
//	return 0;
//}
//void init(int arr[], int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		arr[i] = 0;
//	}
//}
//void print(int arr[], int sz)
//{
//
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	printf("\n");
//}
//void reverse(int arr[], int sz)
//{
//	int left = 0;
//	int right = sz - 1;
//	while (left < right)
//	{
//	int tmp = arr[left];
//	arr[left] = arr[right];
//	arr[right] = tmp;
//	left++;
//	right--;
//	}
//}
//int main()
//{
//	int arr[10] = {9,8,7,6,5,4,3,2,1,0};
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	printf("原数组：\n");
//	print(arr, sz);
//	printf("逆置数组：\n");
//	reverse(arr, sz);
//	print(arr, sz);
//	printf("初始化数组：\n");
//	init(arr, sz);
//	print(arr, sz);
//	return 0;
//}
////
//void init(int arr[], int len)
//{
//	int i = 0;
//	printf("初始化数组->：");
//
//	for (i = 0; i<len; i++)
//	{
//		scanf("%d", &arr[i]);
//	}
//
//}
//
//void reverse(int arr[], int len)
//{
//	int i = 0;
//	printf("\n逆置数组->：");
//
//	for (i = len - 1; i >= 0; i--)
//	{
//		printf("%d ", arr[i]);
//	}
//}

//void empty(int arr[], int len)
//{
//	int i = 0;
//	printf("清空数组->：");
//	for (i = 0; i<len; i++)
//	{
//		arr[i] = 0;
//		printf("%d ", arr[i]);
//	}
//}

//int main()
//{
//	int arr[5];
//	int len = 0;
//	int i = 0;
//	len = sizeof(arr) / sizeof(arr[0]);
//
//	init(arr, len);
//	reverse(arr, len);
//	//printf("\n");
//	//empty(arr, len);
//
//	return 0;
//
//}

//void init(int *arr, int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		arr[i] = i;
//	}
//}
//void print(int *arr, int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	printf("\n");
//}
//
////void empty(int *arr, int size)
////{
////	int i = 0;
////	for (i = 0; i < size; i++)
////	{
////		arr[i] = 0;
////	}
////}
//
// void swap(int *p1, int *p2)
//{
//	int tmp = *p1;
//	*p1 = *p2;
//	*p2 = tmp;
//}
//
//void reverse(int *arr, int len)
//{
//	int left = 0;
//	int right = len - 1;
//	while (left < right)
//	{
//		swap(&arr[left], &arr[right]);
//		left++;
//		right--;
//	}
//}
//int main()
//{
//	int arr[10];
//	int len = sizeof(arr) / sizeof(arr[0]);
//	init(arr, len);
//	print(arr, len);
//	reverse(arr, len);
//	print(arr, len);
//	/*empty(arr, len);
//	print(arr, len);*/
//
//	system("pause");
//	return 0;
//}
//void swap1(int* x, int* y)
//{
//	for (int i = 0; i < 10; i++, x++, y++) 
//	{
//		*x = *x ^ *y;
//		*y = *x ^ *y;
//		*x = *x ^ *y;
//	}
//}
//void swap2(int* a) 
//{
//	for (int i = 0; i < 10; i++, a++) 
//	{
//		printf("%d\t", *a);
//	}
//	printf("\n");
//}
//int main()
//{
//	int a[10] = { 1,2,3,4,5,6,7,8,9,10 };
//	int b[10] = { 10,9,8,7,6,5,4,3,2,1 };
//	swap1(a, b);
//	printf("\n交换后数组a\n:");
//	swap2(a);
//	printf("\n交换后数组b\n:");
//	swap2(b);
//	return 0;
//}
//void print_table(int n)
//{
//	int i = 0;
//	for (i = 1; i <= n; i++)
//	{
//		int j = 0;
//		for (j = 1; j <= i; j++)
//		{
//			printf("%3d*%3d=%-3d ", i, j, i*j);
//		}
//		printf("\n");
//	}
//}
//int main()
//{
//	int line = 0;
//	scanf("%d", &line);
//	print_table(line);
//	return 0;
//}
//void reverse_string(char*str)
//{
//	char tmp = *str;
//	int len = my_strlen(str);
//	*str = str[len - 1];
//	str[len - 1] = '\0';
//	if (my_strlen(str + 1) >= 2)
//		reverse_string(str + 1);
//	str[len - 1] = tmp;
//}
//int main()
//{
//	char arr[] = "hello bit";
//	reverse_string(arr);
//	printf("%s\n", arr);
//	return 0;
//
//}