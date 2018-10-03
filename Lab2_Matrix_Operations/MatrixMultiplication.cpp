#include <iostream>
#include <cstring>
#include "MatrixMultiplication.h"
using namespace std;



void matrixMultiplication(){
	char choice;
	do {
		int row1, column1, row2, column2;
		int matrix1[10][10], matrix2[10][10], resulting_matrix[10][10];

		cout << "Enter rows and columns for first matrix: ";
		cin >> row1 >> column1;
		cout << "Enter rows and columns for second matrix: ";
		cin >> row2 >> column2;

		while (column1 != row2){
			cout << "Multiplication not possible!\nTry Again with different rows and columns!";
			cout << "Enter rows and columns for first matrix: ";
			cin >> row1 >> column1;
			cout << "Enter rows and columns for second matrix: ";
			cin >> row2 >> column2;
		}

		// Storing elements of first matrix.
		cout << endl << "Enter elements of matrix1:" << endl;
		for (int i = 0; i < row1; ++i){
			for (int j = 0; j < column1; ++j){
				cout << "Enter element a" << i + 1 << j + 1 << " : ";
				cin >> matrix1[i][j];
			}
		}

		// Storing elements of second matrix.
		cout << endl << "Enter elements of matrix2:" << endl;
		for (int i = 0; i < row2; ++i){
			for (int j = 0; j < column2; ++j){
				cout << "Enter element b" << i + 1 << j + 1 << " : ";
				cin >> matrix2[i][j];
			}
		}

		// Initializing resulting matrix[row1][column2]
		for (int i = 0; i < row1; i++){
			for (int j = 0; j < column2; j++){
				resulting_matrix[i][j] = 0;
			}
		}

		// Multiplying matrix1 and matrix2
		cout << "Multiplying...." << endl;
		for (int i = 0; i < row1; ++i){
			for (int j = 0; j < column2; ++j){
				for (int k = 0; k < column1; ++k){
					resulting_matrix[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		// Displaying the multiplication of two matrix.
		cout << endl << "Output Matrix: " << endl;
		for (int i = 0; i < row1; ++i){
			for (int j = 0; j < column2; ++j){
				cout << " " << resulting_matrix[i][j];
				if (j == column2 - 1)
					cout << endl;
			}
		}

		cout << "Do you want to multiply matrices again?(Y/N) ";
		cin >> choice;
	} while (choice != 'N' || choice != 'n');

}