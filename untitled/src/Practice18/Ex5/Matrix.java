package Practice18.Ex5;

public class Matrix<T extends Number> {
    private T[][] data;
    private int rows;
    private int columns;

    // Конструктор для создания матрицы
    public Matrix(T[][] data) {
        // Проверка на корректные данные для создания матрицы
        if (data == null || data.length == 0 || data[0].length == 0) {
            throw new IllegalArgumentException("Некорректные данные для создания матрицы");
        }

        this.data = data;
        this.rows = data.length;
        this.columns = data[0].length;
    }

    // Метод для вывода матрицы на экран
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Метод для сложения матриц
    public Matrix<T> add(Matrix<T> other) {
        if (rows != other.rows || columns != other.columns) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размерности для сложения");
        }

        T[][] result = createMatrixArray(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = addElements(data[i][j], other.data[i][j]);
            }
        }

        return new Matrix<>(result);
    }

    // Метод для вычитания матриц
    public Matrix<T> subtract(Matrix<T> other) {
        if (rows != other.rows || columns != other.columns) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размерности для вычитания");
        }

        T[][] result = createMatrixArray(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = subtractElements(data[i][j], other.data[i][j]);
            }
        }

        return new Matrix<>(result);
    }

    // Метод для умножения матриц
    public Matrix<T> multiply(Matrix<T> other) {
        if (columns != other.rows) {
            throw new IllegalArgumentException("Количество столбцов в первой матрице должно быть равно количеству строк во второй для умножения");
        }

        T[][] result = createMatrixArray(rows, other.columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                result[i][j] = multiplyRowColumn(i, j, other);
            }
        }

        return new Matrix<>(result);
    }

    // Метод для транспонирования матрицы
    public Matrix<T> transpose() {
        T[][] result = createMatrixArray(columns, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = data[i][j];
            }
        }

        return new Matrix<>(result);
    }

    // Вспомогательный метод для сложения элементов
    private T addElements(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
    }

    // Вспомогательный метод для вычитания элементов
    private T subtractElements(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
    }

    // Вспомогательный метод для умножения строки на столбец
    private T multiplyRowColumn(int row, int column, Matrix<T> other) {
        T result = addElements(data[row][0], other.data[0][column]);
        for (int i = 1; i < columns; i++) {
            result = addElements(result, multiplyElements(data[row][i], other.data[i][column]));
        }

        return result;
    }

    // Вспомогательный метод для умножения элементов
    private T multiplyElements(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
    }

    // Вспомогательный метод для создания массива матрицы
    private T[][] createMatrixArray(int rows, int columns) {
        return (T[][]) new Number[rows][columns];
    }

    // Пример использования класса Matrix
    public static void main(String[] args) {
        Integer[][] data1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Integer[][] data2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        Matrix<Integer> matrix1 = new Matrix<>(data1);
        Matrix<Integer> matrix2 = new Matrix<>(data2);

        System.out.println("Матрица 1:");
        matrix1.printMatrix();

        System.out.println("\nМатрица 2:");
        matrix2.printMatrix();

        System.out.println("\nМатрица 1 + Матрица 2:");
        Matrix<Integer> sumResult = matrix1.add(matrix2);
        sumResult.printMatrix();

        System.out.println("\nМатрица 1 - Матрица 2:");
        Matrix<Integer> subtractResult = matrix1.subtract(matrix2);
        subtractResult.printMatrix();

        System.out.println("\nМатрица 1 * Матрица 2:");
        Matrix<Integer> multiplyResult = matrix1.multiply(matrix2);
        multiplyResult.printMatrix();

        System.out.println("\nТранспонирование Матрицы 1:");
        Matrix<Integer> transposeResult = matrix1.transpose();
        transposeResult.printMatrix();
    }
}
