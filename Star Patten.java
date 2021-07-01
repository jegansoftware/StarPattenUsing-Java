public class Main{
public static void main(String[] args)
{
int i;
int j;

int n=10;

    for(i=1;i<=n;i++)
    {
        System.out.printf("\n");
          for(j=1;j<n-i;j++)
          {
            System.out.printf(" ");
          }

          for(j=1;j<i;j++)
          {
            System.out.printf("*");
          }
    }

}
}
