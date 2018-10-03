#include <iostream>
using namespace std;
#include "MatrixTranspose.h"
void MatrixTranspose(){
	int A[10][10], i, j, rows, cols, ans;
	do{
		cout << "How many rows does your matrix have?" << endl;
		cin >> rows;
		cout << "How many columns does your matrix have?" << endl;
		cin >> cols;

		cout << "Enter Matrix entries: \n ";
		for (i = 0; i < rows; i++){
			for (j = 0; j < cols; j++){
				cin >> A[i][j];
			}
		}
		
		cout << "Entered Matrix: \n ";
		for (i = 0; i < rows; i++){
			for (j = 0; j < cols; j++){
				cout << A[i][j] << " ";
			}
			cout << "\n ";
		}
		cout << "Transpose of your Matrix:" << endl;
		for (i = 0; i < rows; ++i){
			for (j = 0; j < cols; ++j){
				cout << A[j][i] << " ";
			}
			cout << endl;
		}
		cout << "Do you want to transpose another matrix? (Press 0 to exit. Else press any key)" << endl;
		cin >> ans;
		if (ans == 0){
			exit(0);
		}
	} while (ans != 0);
}
