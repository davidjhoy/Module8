import java.io.*;
import java.net.*;
public class Text {
    // Write a program that will display lines of a text you specify. 
    // It should take two arguments: a file or a URL and the number of lines to display. 
    // If the number of lines given is positive, it should display the first n lines of the text.
    // If it is 0, it should display all the lines of the text. 
    // If it is a negative number, it should display the last n lines of the text. 
    // Your program should handle errors appropriately.

    public static void main(String[] args){

        //make sure that there is input 
        if (args.length < 1){
            System.out.println("Please enter a valid url and number");
            return;
        }
        try{
            URL givenUrl = new URL(args[0]);
            URLConnection connect = givenUrl.openConnection();
           
            
            try(
                BufferedReader br = new BufferedReader(new InputStreamReader(connect.getInputStream()));
                PrintWriter pw = new PrintWriter(System.out, true);
            ){
                String input;
                Integer direction = Integer.parseInt(args[1]);

                //Split logic based on direction
                if (direction > 0){
                    for (int i = direction; i > 0; i--){
                        if((input = br.readLine()) != null){
                            pw.println(input);
                        }
                        
                    }
                } else if (direction < 0){

                }else{
                    while ((input = br.readLine()) != null){
                        pw.println(input);
                    }
                }
                
    
    
            }
            catch(MalformedURLException ex){
                System.out.println("Please enter a valid URL");
                return;
            }
            catch(IOException ex){
                System.out.println("IO Exception");
                return;
            }

            
        } catch(MalformedURLException ex){
            System.out.println("Please enter a valid URL");
        }
        catch(IOException ex){
            System.out.println("IO Exception");
            return;
        }
       
        
        
    }

    
}
