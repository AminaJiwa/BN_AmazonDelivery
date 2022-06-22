//cd C:\Users\amina\OneDrive - University College London\Coding projects\BN
import java.lang.Math;
import java.util.Random;
public class Phase2 {
  public static void main(String[] args){
    int[][] matrix = new int[10][10];
    Random numberGenerator = new Random();
    //creates a 2D matrix/ grid and populates them with 0s
    for (int x = 0; x < matrix.length; x++){
      for (int y = 0; y < matrix.length; y++){
        matrix[x][y] = 0;
        //System.out.println(matrix[x][y]);
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
int i = 0;
for(; i < 20; i++){
    int x = numberGenerator.nextInt(10);
    int y = numberGenerator.nextInt(10);
        if (x != 0 && y!= 0){
           if (x != 9 && y!= 9){
            if(x != 9 && y!= 7){
               if(x != 8 && y!= 7){
                if(x != 6 && y!= 7){
                  if(x != 6 && y!= 8){
                    matrix[x][y] = 1;
                    }
                    else{ i--;}
                  }
                  else{i--;}
                }
                else{ i--;}
              }
              else{ i--;}
            }
            else{i--;}
          }
          else{i--;}
        }



// if the cell next to it e.g. matrix[0][x + 1 ] == 0 then matrix[0][x + 1 ] ==2
  int a = 0;
  int b = 0;

  while(b < 9 && a < 9){
    if (matrix[a][b] == 0){
      matrix[a][b] = 2;
      b++;
      a++;
    }
    else if (matrix[a - 1][b] == 0){
      matrix[a - 1][b] = 2;
    }
    else if (matrix[a][b - 1] == 0){
      matrix[a][b - 1] = 2;
    }
    else if (matrix[a + 1][b] == 0){
      matrix[a + 1][b] = 2;
    }
    else if (matrix[a][b + 1] == 0){
      matrix[a][b + 1] = 2;
    }
  }

  int count = 0;
  for (int l = 0; l < 10; l++) {
             for (int j = 0; j < 10; j++) {
               if(matrix[l][j] == 2){
                 System.out.print("(" + l + ", " + j + ") ");
                 count++;
               }
             }
      }
      System.out.println("The number of steps are: " + count);
  }
}
