//cd C:\Users\amina\OneDrive - University College London\Coding projects\BN
public class AmazonDelivery {
  public static void main(String[] args){
    int[][] matrix = new int[10][10];

    //creates a 2D matrix/ grid and populates them with 0s
    for (int x = 0; x < matrix.length; x++){
      for (int y = 0; y < matrix.length; y++){
        matrix[x][y] = 0;
      }
    }
    //Exceptions for the obstacles and the delivery truck, which will be
    //noted by the computer as a 2(truck) or 1(obstacle)
    //matrix[9][9] is the goal
  //  matrix[0][0] = 2;
    matrix[9][7] = 1;
    matrix[8][7] = 1;
    matrix[6][7] = 1;
    matrix[6][8] = 1;


// if the cell next to it e.g. matrix[0][x + 1 ] == 0 then matrix[0][x + 1 ] ==2
  int x = 0;
  int y = 0;

  while(y < 9){
    if (matrix[x][y] == 0){
      matrix[x][y] = 2;
      y++;
    }
  }

  while(x < 9){
    if (matrix[x][y] == 0){
      matrix[x][y] = 2;
      x++;
    }
  }
  int count = 0;
  for (int i = 0; i < 10; i++) {
             for (int j = 0; j < 10; j++) {
               if(matrix[i][j] == 2){
                 System.out.print("(" + i + ", " + j + ") ");
                 count++;
               }
             }
      }
      System.out.println("The number of steps are: " + count);



  }
}
