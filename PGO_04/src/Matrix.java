public class Matrix {
    private int data[][];
    private int rows, cols, filled_rows;
    private static Matrix temp;

    private Matrix(int _rows, int _cols) {
        filled_rows = 0;
        rows = _rows;
        cols = _cols;
        data = new int[rows][cols];
    }

    public void print() {
        for(int i = 0;i < rows;i++)
        {
            System.out.print("| ");
            for(int j = 0;j < cols;j++)
            {
                System.out.printf("%d ", data[i][j]);
            }
            System.out.println("|");
        }
    }

    public static void setUpMatrix(int _rows, int _cols) {
        temp = new Matrix(_rows, _cols);
    }

    public static void insertRow(int row[]) {
        if (temp.filled_rows == temp.rows || row.length != temp.cols) {
            System.out.println("Niepoprawne dane.");
        } else {
            for (int i = 0; i < temp.cols; i++) {
                temp.data[temp.filled_rows][i] = row[i];
            }
            temp.filled_rows += 1;
        }
    }

    public static Matrix create()
    {
        Matrix tmp = temp;
        temp = null;
        return tmp;
    }

    public Matrix add(Matrix m)
    {
        if(rows != m.rows || cols != m.cols)
        {
            System.out.println("Niepoprawne dane, nie udalo sie dodac macierzy");
        } else
        {
            for(int i = 0;i < rows;i++){
                for(int j = 0;j < cols;j++)
                {
                    data[i][j] += m.data[i][j];
                }
            }
        }
        return this;
    }

    public static Matrix add(Matrix m1, Matrix m2) {
        if(m1.rows != m2.rows || m1.cols != m2.cols)
        {
            System.out.println("Niepoprawne dane, nie udalo sie dodac macierzy");
            return null;
        } else
        {
            Matrix tmp = new Matrix(m1.rows, m1.cols);
            {
                for(int i = 0;i < m1.rows;i++)
                {
                    for(int j = 0;j < m1.cols;j++)
                    {
                        tmp.data[i][j] = m1.data[i][j] + m2.data[i][j];
                    }
                }
            }
            tmp.filled_rows = m1.rows;
            return tmp;
        }
    }

    public Matrix subtract(Matrix m)
    {
        if(rows != m.rows || cols != m.cols)
        {
            System.out.println("Niepoprawne dane, nie udalo sie odjac macierzy");
        } else
        {
            for(int i = 0;i < rows;i++){
                for(int j = 0;j < cols;j++)
                {
                    data[i][j] -= m.data[i][j];
                }
            }
        }
        return this;
    }

    public static Matrix subtract(Matrix m1, Matrix m2) {
        if(m1.rows != m2.rows || m1.cols != m2.cols)
        {
            System.out.println("Niepoprawne dane, nie udalo sie odjac macierzy");
            return null;
        } else
        {
            Matrix tmp = new Matrix(m1.rows, m1.cols);
            {
                for(int i = 0;i < m1.rows;i++)
                {
                    for(int j = 0;j < m1.cols;j++)
                    {
                        tmp.data[i][j] = m1.data[i][j] - m2.data[i][j];
                    }
                }
            }
            tmp.filled_rows = m1.rows;
            return tmp;
        }
    }

    public Matrix multiply(Matrix m)
    {
        Matrix result = Matrix.multiply(this, m);
        data = result.data;
        rows = result.rows;
        cols = result.cols;
        filled_rows = result.filled_rows;

        return this;
    }

    public static Matrix multiply(Matrix m1, Matrix m2) {
        if(m1.cols != m2.rows)
        {
            System.out.println("Niepoprawne dane, nie udalo sie pomnozyc macierzy");
            return null;
        } else
        {
            Matrix tmp = new Matrix(m1.rows, m2.cols);
            {
                for(int i = 0;i < m1.rows;i++)
                {
                    for(int j = 0;j < m2.cols;j++)
                    {
                        tmp.data[i][j] = 0;
                        for(int k = 0;k < m2.rows;k++)
                        {
                            tmp.data[i][j] += m1.data[i][k] * m2.data[k][j];
                        }
                    }
                }
            }
            tmp.filled_rows = m1.rows;
            return tmp;
        }
    }
}