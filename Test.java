public class SortDsc {    
    public static void main(String[] args) {        
        //Initialize array     
        int [] arr = new int [] {7980, 22349, 999, 2799,229900, 11101,9999,2195,9800,4999};     
        int temp = 0;    
            
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in descending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
            
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in descending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    


        }   
      
int a[]=arr;
System.out.println("Smallest: "+getSmallest(a, a.length));

int smallest = getSmallest(a, a.length);
System.out.println("Smallest value: "+getSmallest(a, a.length));

    System.out.println("subtracted value below: ");  
int[] b= new int[a.length];
 for (int i = 0; i < a.length; i++) {     
            b[i]= a[i];    
}

int diff[] = a;
for(int j =0; j< diff.length; j++ )
{
    diff[j] = a[j]-smallest;
    
}
for(int j =0; j< diff.length; j++ )
{
    System.out.println(diff[j]);
    
}

    System.out.println("original equivalent value: "); 
for(int j =0; j< b.length; j++ )
{
    System.out.println(b[j]);
    
}
    }  
 
 
 
 
 
 
 
 
 
 
    
    public static int getSmallest(int[] a, int total){
int temp;
for (int i = 0; i < total; i++) 
        {
            for (int j = i + 1; j < total; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
       return a[0];
}

























//public static void main(String args[]){

//}
}
