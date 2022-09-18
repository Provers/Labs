package lab4;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadAndFind {

    public void readFile(String fileName){
        try {
            String path = new File("src/lab4/" + fileName).getAbsolutePath();
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                findArithmeticExpression(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void findArithmeticExpression(String line) {
        int firstPart = 0;
        int secondPart = 0;
        int result = 0;
        Pattern pt = Pattern.compile("(\\d+)([-+*/])(\\d*)");
        Matcher matcher = pt.matcher(line);
        String operation;

        while (matcher.find()) {
            firstPart = Integer.parseInt(matcher.group(1));
            secondPart = Integer.parseInt(matcher.group(3));
            operation = matcher.group(2);
            switch (operation) {
                case "-":
                    result = firstPart - secondPart;
                    break;
                case "+":
                    result = firstPart + secondPart;
                    break;
                case "/":
                    if (secondPart != 0) {
                        result = firstPart / secondPart;
                        break;
                    } else{
                        System.out.println(firstPart + operation + secondPart  + ": КУДА!!! АТАТА НА 0 ДЕЛИТЬ");
                        continue;
                    }
                case "*":
                    result = firstPart * secondPart;
                    break;
            }
            System.out.println(firstPart + operation + secondPart + " = " + result);
        }


    }
}
