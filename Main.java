import java.util.Scanner; 

public class Main{

public static void main(String[]args){
Scanner input = new Scanner(System.in); 

int limit; 
int arr[]=new int[100]; 

System.out.print("Enter the size of a array: "); 
limit= input.nextInt(); 

System.out.print("Enter "+limit+" elements of a array: ");

for(int i = 0; i < limit; i++){
arr[i]=input.nextInt(); 
}
cap j1 = new cap(limit, arr);
j1.display();  
j1.ascending(); 
j1.decending();
j1.sum(); 
j1.avg(); 
j1.even();
j1.sumeven();  
j1.odd(); 
j1.sumodd();
j1.max(); 
j1.min(); 
j1.secondmax(); 
j1.secondmin(); 
}

}