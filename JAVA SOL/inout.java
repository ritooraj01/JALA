import java.io.*;
class inout{
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("E:\\Inout.txt");      //Answer 1
            FileOutputStream fie = new FileOutputStream("E:\\Inout.txt");   //Answer 2
            FileReader file = new FileReader("E:\\Inout.txt");          //Answer 5
            int i=0;
            while((i = fi.read())!=-1){
                System.out.print((char)i);
            }

            fi.close();
        } catch (Exception e) {
            System.out.println(e);
            // e.printStackTrace();
        }

        // try {
        //     FileWriter f = new FileWriter("E:\\Inout.txt");
        //     f.write("Hello this is Rituraj");
        //     f.close();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }System.out.println("Success");
    }
}