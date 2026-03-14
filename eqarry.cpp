#include <iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int arr1[n];
	int arr2[n];
	bool flag=true;
	for(int i=0;i<n;i++)
	{
		cin>>arr1[i];
	}
	for(int i=0;i<n;i++)
	{
		cin>>arr2[i];
	}
	for(int i=0;i<n;i++)
	{
		if(arr1[i]!=arr2[i])
		{
			flag=false;
			break;
		}
	}
	if(flag)
	{
		cout<<"two arrays are equal"<<endl;
	}
	else
	{
		cout<<"two arrays are not equal"<<endl;
	}
}
