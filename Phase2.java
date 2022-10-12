//cd C:\Users\amina\OneDrive - University College London\Coding projects\BN

import java.util.*;
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
        
  driveVehicle(matrix);

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
  public static void driveVehicle(int[][] matrix ){
    try{
      int x = 0;
      int y = 0;
    while (matrix[9][9]!= 2){
     
        if (matrix[x][y] == 0) {
          matrix[x][y] = 2;
          //resets the counter so it starts from the second row, first column etc
          if(x < 10){ x++; } else{ y++; x = 0;}
        } else{
          
          if(matrix[x++][y] == 1){
           if (matrix[x--][y] == 1){
            if (matrix[x][y++] ==1){
              if (matrix[x][y--] == 1){
                if(matrix[x--][y++] == 1){
                  if(matrix[x++][y++] ==1){
                    if (matrix[x--][y--] ==1){
                      if(matrix[x++][y--] ==1){
                        break;
                      }else{
                        matrix[x++][y--] =2;
                        if(x < 10){ x++; } else{ y++; x = 0;}
                      }
                    }else{
                      matrix[x--][y--] =2;
                      if(x < 10){ x++; } else{ y++; x = 0;}
                    }
                  } else{
                    matrix[x++][y++] = 2;
                    if(x < 10){ x++; } else{ y++; x = 0;}

                  }
                }else{
                  matrix[x--][y++] =2;
                  if(x < 10){ x++; } else{ y++; x = 0;}
                }
              }else{
                matrix[x][y--] = 2;
                if(x < 10){ x++; } else{ y++; x = 0;}
              }
            }else{
              matrix[x][y++] = 2;
              if(x < 10){ x++; } else{ y++; x = 0;}
            }
           } else{
            matrix[x--][y] = 2;
            if(x < 10){ x++; } else{ y++; x = 0;}
           }
          }else{
            matrix[x++][y] = 2;
            if(x < 10){ x++; } else{ y++; x = 0;}
          }

         
        }
      
    }
    } catch (Exception e){
      System.out.println("Unable to reach delivery point as too many obstacles are in the way ");
    }
  }
}
