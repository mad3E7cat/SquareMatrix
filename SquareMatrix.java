class SquareMatrix{
	private int[][] matrix;
	SquareMatrix(int sz){
		matrix = new int[sz][sz];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				matrix[i][j] = (i == j) ? 1 : 0;
			}
		}
	}
	SquareMatrix(SquareMatrix obj){
		matrix = new int[obj.getSize()][obj.getSize()];
		for (int i = 0; i < obj.getSize(); i++){
			for (int j = 0; j < obj.getSize(); j++){
				matrix[i][j] = obj.getElement(i,j);
			}
		}
	}
	public int getSize(){
		return matrix.length;
	}
	public void setElement(int row, int column, int value){
		matrix[row][column] = value;
	}
	public int getElement(int row, int column){
		return matrix[row][column];
	} 
	public SquareMatrix sum(SquareMatrix m){
		SquareMatrix res = new SquareMatrix(m.getSize());
		int sum = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				res.setElement(i, j, matrix[i][j] + m.getElement(i,j));
			}
		}
		return res;
	}
	public SquareMatrix product(SquareMatrix m){
		SquareMatrix res = new SquareMatrix(m.getSize());
		int strSum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				for (int k = 0; k < matrix.length; k++) {
					strSum += matrix[i][k] * m.getElement(k, j); // i,k exactly 
				}
				res.setElement(i, j, strSum);
				strSum = 0;
			}
		}
		return res;
	}
	public String toString(){
		String info = "";
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				info += matrix[i][j] + " ";
			}
			info += "\n";
		}
		return info;
	}
	private int columnSum(int c){
		int sum = 0;
		for(int i = 0; i < matrix.length; i++){
			sum += matrix[i][c];
		}
		return sum;
	}
	private void swapColumns(int a, int b){
		int temp = 0;
		for (int i = 0; i < matrix.length; i++){
			temp = matrix[i][a]; 
			matrix[i][a] = matrix[i][b];
			matrix[i][b] = temp;
		}
	}
	public SquareMatrix doSortColumns(){
		SquareMatrix temp = new SquareMatrix(this);
		for (int i = matrix.length - 1; i >= 0; i--){
			for (int j = 0; j < i; j++) {
				if(temp.columnSum(j) > temp.columnSum(j + 1)){
					temp.swapColumns(j, j + 1);
				}
			}
		}
		return temp;
	}
}


/*
***конструктор с целочисленным параметром --- размером матрицы, создающий единичную матрицу;
***метод Matrix sum(Matrix) 
***метод Matrix product(Matrix)
***setElement(int row, int column, int value)
***getElement(int row, int column),
***toString()
*/
	
//doSortColumns  sorty by sum of elements in column