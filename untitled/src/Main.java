import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\es028443\\IdeaProjects\\untitled\\src\\input.txt");

        BufferedReader br
                = new BufferedReader(new FileReader(file));

        String st;
        Integer num = null;
        Integer initial = Integer.valueOf(br.readLine());

        File myObj = new File("output.txt");
        String result = "";

        while ((st = br.readLine()) != null) {
            num = Integer.valueOf(st);

            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i) {

                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                result += "Prime \n";
            else
                result += "Not \n";

            FileWriter myWriter = new FileWriter("output.txt");
            myWriter.write(result);
            myWriter.close();
        }

    }
}