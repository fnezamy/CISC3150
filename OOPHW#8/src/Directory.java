import java.io.File;

/*
 * Write a program that goes through your file system and outputs a tree 
diagram of all of your directories in a file called dir_tree.txt. The 
methods in the File class will probably come in very handy. For a sample 
output, check out this webpage: http://www.computerhope.com/treehlp.htm 
Make sure you get the indentation right/tree branches right.

NOTE: GIVEN THAT YOUR ENTIRE DIRECTORY TREE WILL PROBABLY BE HUGE, FEEL 
FREE TO START FROM ANY FOLDER JUST AS LONG AS THAT FOLDER CONTAINS A 
BUNCH OF SUB FOLDERS AND A BUNCH OF SUB-SUB FOLDERS, AND FILES AT EACH 
LEVEL. THE LOGIC IS THE SAME.
 */




public class Directory {
	
 static void Print(File[] arr,int index,int level){
         
    	 if(index == arr.length)
             return;
         
         for (int i = 0; i < level; i++){
             System.out.print("\t");
             if(arr[index].isDirectory()){
            	 System.out.print("|-----------"); 
             }
         }
         if(arr[index].isFile()){
             System.out.println(arr[index].getName());
         }
          
         else if(arr[index].isDirectory()){
             System.out.println("[" + arr[index].getName() + "]");
             Print(arr[index].listFiles(), 0, level + 1);
         }
           
         Print(arr,++index, level);
    }
 
	public static void main(String args[]){
		String dir = "C:\\Program Files (x86)\\Apple Software Update";
		File file = new File(dir);
		File[] arr = file.listFiles();
		
		
        System.out.println("Directory: " + dir);
        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
		
		Print(arr,0,0);
		
		
	}
}


