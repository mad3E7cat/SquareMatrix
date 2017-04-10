class TestClass{
	public static void main(String[] args) {
		// basic functionality tests
		// SquareMatrix mt1 = new SquareMatrix(3);
		// SquareMatrix mt2 = new SquareMatrix(3);
		// SquareMatrix mt3 = mt1.sum(mt2);
		// System.out.println("\nmt1: ");
		// mt1.toString();
		// System.out.println("\nmt2: ");
		// mt2.toString();
		// System.out.println("\nmt1 + mt2 = mt3:");
		// mt3.toString();
		// mt1.setElement(0, 0, 20);
		// mt1.setElement(0, 1, 40);
		// mt1.setElement(0, 2, 80);
		// mt2.setElement(0, 0, 20);
		// mt2.setElement(1, 0, 21);
		// mt2.setElement(2, 0, 22);
		// System.out.println("\nmt1: ");
		// mt1.toString();
		// System.out.println("\nmt2: ");
		// mt2.toString();
		// mt3 = mt1.product(mt2);
		// System.out.println("\nmt1 * mt2 = mt3:");
		// mt3.toString();
		//
		// extra task
		// SquareMatrix matrixBase = new SquareMatrix(2);
		// SquareMatrix matrix = new SquareMatrix(2);
		// System.out.println("matrix^0: ");
		// System.out.println(matrixBase);//matrixBase.toString();
		// matrixBase.setElement(0, 0, 1);
		// matrixBase.setElement(0, 1, 1);
		// matrixBase.setElement(1, 0, 1);
		// matrixBase.setElement(1, 1, 0);
		// //
		// matrix.setElement(0, 0, 1);
		// matrix.setElement(0, 1, 1);
		// matrix.setElement(1, 0, 1);
		// matrix.setElement(1, 1, 0);
		// System.out.println("matrix^1: ");
		// System.out.println(matrixBase);
		// for (int i = 2; i < 10; i++) {
		// 	matrix = matrixBase.product(matrix);
		// 	System.out.println("matrix^" + i + ": ");
		// 	System.out.println(matrix);
		// }
		// extra task2 doSortColumns():
		SquareMatrix m = new SquareMatrix(3);
		SquareMatrix m2 = new SquareMatrix(3);
		m.setElement(0,0,2);
		m.setElement(0,1,3);
		m.setElement(1,0,4);
		m.setElement(1,1,5);
		m.setElement(2,0,6);
		m.setElement(2,1,7);
		m.setElement(2,2,8);
		System.out.println(m);
		m2 = m.doSortColumns();
		System.out.println(m2);
	}
}