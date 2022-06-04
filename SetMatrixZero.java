import java.util.* ;
import java.io.*; 
public class SetMatrixZero{
     public static void setZeros(int matrix[][]) {
         Set<Integer> rows=new HashSet<>();
         Set<Integer> columuns=new HashSet<>();
         List<Integer> Rows=new ArrayList<>();
         List<Integer> Columuns=new ArrayList<>();
         for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[i].length;j++){
              if(matrix[i][j]==0){
                  if(rows.add(i)){
                    Rows.add(i);
                  }
                  if(columuns.add(j)){
                    Columuns.add(j);
                  }
              }
          }
         }
         for(int j=0;j<Columuns.size();j++){
          for(int i=0;i<matrix.length;i++){
            matrix[i][Columuns.get(j)]=0;
          }
         }
          for(int i=0;i<Rows.size();i++){
            for(int j=0;j<matrix[0].length;j++){
              matrix[Rows.get(i)][j]=0;
            }
          }
     }
}