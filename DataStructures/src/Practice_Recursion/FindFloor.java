int findFloor(int *arr,int n,int x)
{
 for(int i=0;i<n;i++)
 {
     if(arr[i]<x && arr[i+1]>x)
     {
         return arr[i];
     }
 }
}
