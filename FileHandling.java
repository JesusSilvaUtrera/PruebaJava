import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

class FileHandling {
    public static void main(String[] args) {
        try {
            // To create a file, create an object of class File giving the name and call the method 'createNewFile'
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
                System.out.println("Writeable: " + myObj.canWrite());
                System.out.println("Readable " + myObj.canRead());
                System.out.println("File size in bytes " + myObj.length());
            } else {
              System.out.println("File already exists.");
            }

            // To write we use the FileWriter over an already created file
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

            // To read, we use the Scanner passing a File object
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

            // * To finish, delete the file that we created before with the delete method
            if (myObj.delete()) { 
                System.out.println("Deleted the file: " + myObj.getName());
            } else {
                System.out.println("Failed to delete the file.");
            } 

            //! You could also use a Folder with the File class, but to delete it it must be empty
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}