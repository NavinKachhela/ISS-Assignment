import java.io.*;

class FileReadWrite {
  public static void main(String[] args) {

    try {
      FileReader inputFileReaderObject = new FileReader("input.txt");
      FileWriter outputFileWriterObject = new FileWriter("output.txt");
      String fileData = "";
      int asciiValue;

      // read from FileReader till the end of file
      while ((asciiValue = inputFileReaderObject.read()) != -1) {
        fileData = fileData + (char) asciiValue;
      }

      System.out.println(fileData);

      // write into FileWriter
      outputFileWriterObject.write(fileData);

      // close the file
      inputFileReaderObject.close();
      outputFileWriterObject.close();

      System.out.println("File Copied");

    } catch (FileNotFoundException fileMissingException) {
      System.out.println("Caught " + fileMissingException);
    } catch (IOException inputOutputException) {
      System.out.println("Caught " + inputOutputException);
    } catch (Exception exceptionObj) {
      System.out.println("Caught " + exceptionObj);
    }
  }
}