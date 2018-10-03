#include <iostream>
#include "MatrixTranspose.h"
#include "addition.h"
#include "MatrixMultiplication.h"

using namespace std;

int main(){
	int s;
	cout << "MENU" << endl << "1. Add" << endl << "2. Subtract" << endl << "3. Multiply" << endl << "4.Transpose" << endl << "To exit, enter 0. Enter 1, 2, 3 or 4: ";
	cin >> s;
	do{
		switch (s){
		case 0:
			exit(0);
			break;
		case 1:
			add();
			break;
		case 2:
			sub();
			break;
		case 3:
			matrixMultiplication();
			break;
		case 4:
			MatrixTranspose();
			break;
		default:
			cout << "Thats not quite right. Enter a number from 1 to 3." << endl;
			break;
		}
	} while (true);

}
