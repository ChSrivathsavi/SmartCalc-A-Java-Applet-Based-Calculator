import java.lang.*;
import java.io.*;
class transpose{
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,a[][],b[][],m,n;
a=new int[10][10];
b=new int[10][10];
System.out.println("enter the no of rows:\n");
n=Integer.parseInt(br.readLine());
System.out.println("enter the no of cols:\n");
m=Integer.parseInt(br.readLine());
System.out.println("enter the elements of a matrix:\n");
for(i=0;i<n;i++){
for(j=0;j<m;j++){
a[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println("The transpose of a matrix is");
for(i=0;i<n;i++){
for(j=0;j<m;j++){
System.out.print(a[j][i]);
}
System.out.println(" \n");
}

}
}