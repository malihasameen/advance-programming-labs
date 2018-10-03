
#include "iostream"
#include "addition.h"
using namespace std;
void add()
{
	int a[50][50]; int b[50][50];
	int c[50][50], i, j, m, n, o, p;
	int ch=1;

	do{
		//taking orders of the two matrices 
		cout << "\nEnter the order of matrix a (must be m*n): " << endl;
		cin >> m;
		cout << "* \n";
		cin >> n;
		cout << "Enter the order of matrix b (must be o*p): " << endl;
		cin >> o;
		cout << "* \n";
		cin >> p;
		//checking for 2 valid matrices to be added
		if (m == o&&n == p)
		{
			//taking matrix elements from the user
			cout << "\n\nEnter the elements of matrix 1: " << endl;
			for (i = 1; i <= m; i++)
			{
				for (j = 1; j <= n; j++)
					cin >> a[i][j];
			}

			cout << "\nEnter the elements of matrix 2: " << endl;
			for (i = 1; i <= o; i++)
			{
				for (j = 1; j <= p; j++)
					cin >> b[i][j];
			}

			//functionality to add matrices
			cout << "\n\n\nAddition:\nc=a+b=";
			for (i = 1; i <= m; i++)
			{
				for (j = 1; j <= n; j++)
				{
					c[i][j] = a[i][j] + b[i][j];
				}
			}
			for (i = 1; i <= m; i++){
				cout << endl;
				for (j = 1; j <= n; j++)
					cout << c[i][j] << " ";
			}
		}
		else
		{
			cout << "Addition not possible ";
		}
		cout << "To exit press 0 ";
		cin >> ch;
		if(ch==0)
		{
			exit(0);
		}
	} while (ch ==1);

}
void sub()
{
	int a[50][50]; int b[50][50];
	int c[50][50], i, j, m, n, o, p;
	int ch=1;
	do{
		//taking orders of the two matrices 
		cout << "\nEnter the order of matrix a (must be m*n): " << endl;
		cin >> m;
		cout << "* \n";
		cin >> n;
		cout << "Enter the order of matrix b (must be o*p): " << endl;
		cin >> o;
		cout << "* \n";
		cin >> p;
		//checking for 2 valid matrices to be subtracted
		if (m == o&&n == p)
		{
			//taking matrix elements from the user
			cout << "\n\nEnter the elements of matrix 1: " << endl;
			for (i = 1; i <= m; i++){
				for (j = 1; j <= n; j++)
					cin >> a[i][j];
			}

			cout << "\nEnter the elements of matrix 2: " << endl;
			for (i = 1; i <= o; i++){
				for (j = 1; j <= p; j++)
					cin >> b[i][j];
			}

			//functionality to sub matrices
			cout << "\n\n\nSubtraction:\nc=a-b=";
			for (i = 1; i <= m; i++)
			{
				for (int j = 1; j <= n; j++)
				{
					c[i][j] = a[i][j] - b[i][j];
				}
			}
			for (i = 1; i <= m; i++)
			{
				cout << endl;
				for (j = 1; j <= n; j++)
					cout << c[i][j] << " ";
			}
		}
		else
		{
			cout << "Subtraction not possible ";
		}
		cout << "To exit press 0 ";
		cin >> ch;
		if(ch==0)
		{
			exit(0);
		}
	} while (ch ==1);

}
