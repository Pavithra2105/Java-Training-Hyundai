package CRUD;
import java.io.IOException;  
import java.util.Scanner;  

class JDBCSingletonDemo{  
    static int count=1;  
     static int  choice;  
    public static void main(String[] args) throws IOException {  
          
        JDBCSingleton jdbc= JDBCSingleton.getInstance();  
          
          
    //    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
        Scanner br = new Scanner(System.in);
        
   do{   
        System.out.println("DATABASE OPERATIONS");  
        System.out.println(" --------------------- ");  
        System.out.println(" 1. Insertion ");  
        System.out.println(" 2. View      ");  
        System.out.println(" 3. Delete    ");  
        System.out.println(" 4. Update    ");  
        System.out.println(" 5. Exit      ");  
          
        System.out.print("\n");  
        System.out.print("Please enter the choice what you want to perform in the database: ");  
        choice = br.nextInt();  
        switch(choice) {  
              
           case 1:{  
                    System.out.print("Enter the username you want to insert data into the database: ");  
                    String username=br.nextLine();  
                    System.out.print("Enter the password you want to insert data into the database: ");  
                    String password=br.nextLine();  
                      
                    try {  
                            int i= jdbc.insert(username, password);  
                            if (i>0) {  
                            System.out.println((count++) + " Data has been inserted successfully");  
                            }else{  
                                System.out.println("Data has not been inserted ");      
                            }  
                          
                        } catch (Exception e) {  
                          System.out.println(e);  
                        }  
                      
                     System.out.println("Press Enter key to continue...");  
                     System.in.read();  
                       
                   }//End of case 1  
                   break;  
            case 2:{  
                    System.out.print("Enter the username : ");  
                    String username=br.next();  
               
                    try  {  
                            jdbc.view(username);  
                         } catch (Exception e) {  
                          System.out.println(e);  
                        }  
                     System.out.println("Press Enter key to continue...");  
                     System.in.read();  
                       
                   }//End of case 2  
                  break;  
             case 3:{  
                     System.out.print("Enter the userid,  you want to delete: ");  
                     int userid=br.nextInt(); 
             
                     try {  
                            int i= jdbc.delete(userid);  
                            if (i>0) {  
                            System.out.println((count++) + " Data has been deleted successfully");  
                            }else{  
                                System.out.println("Data has not been deleted");      
                            }  
                          
                         } catch (Exception e) {  
                          System.out.println(e);  
                         }  
                     System.out.println("Press Enter key to continue...");  
                     System.in.read();  
                       
                    }//End of case 3  
                   break;  
             case 4:{  
                    System.out.print("Enter the username,  you want to update: ");  
                    String username=br.next();  
                    System.out.print("Enter the new password ");  
                    String password=br.next();  
                      
                    try {  
                            int i= jdbc.update(username, password);  
                            if (i>0) {  
                            System.out.println((count++) + " Data has been updated successfully");  
                            }  
                          
                        } catch (Exception e) {  
                          System.out.println(e);  
                        }  
                     System.out.println("Press Enter key to continue...");  
                     System.in.read();  
                      
                   }// end of case 4  
                 break;  
                   
             default:  
                     return;  
        }  
          
       } while (choice!=0);   
   }
   
}  

