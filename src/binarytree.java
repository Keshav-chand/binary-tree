import java.util.Scanner;
public class binarytree{
    public int[] tree;
    public int size,i;
    Scanner sc= new Scanner(System.in);

    public void insertvalue(){
        System.out.println("enter the values to be inserted in the binary tree");
        size=sc.nextInt();
        tree=new int[size+1];
        for(i=1;i<=size;i++){
            System.out.println("Enter the values at "+i+"=");
            tree[i]=sc.nextInt();
        }
             tree();//fucntion call
        
    }
    public void  tree(){
        System.out.println("Binary tree Root is"+tree[1]);
        for(int j=1;j<=size;j++){
            System.out.println(tree[j]);
        }
    }
    public static void main(String[] args) {
        binarytree b= new binarytree();
        b.insertvalue();
    }

}