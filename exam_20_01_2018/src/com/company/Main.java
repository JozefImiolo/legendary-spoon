package com.company;

import com.company.Ex_12.Size;
import com.company.Ex_3.DenseMatrix;
import com.company.Ex_7.GeometricalChecker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws Exception {
        ex_11();
    }

    /**
     * Commented ones are wrong
     */
    public static void ex_2() {
        List<String> list = Arrays.asList((new String[]{"asd", "d", "xxxx"}));

        // 1
        //System.out.print(list.stream().map(s->s.length()).collect(Collector.toList()));

        // 2
        //list.forEach(System.out::println(s->s.size));

        // 3
        list.forEach(s -> System.out.println(s.length()));

        // 4
        for (String s : list) System.out.println(s.length());

        // 5
        // for(String s:list) System.out.print(s.length);
    }

    /**
     * Commented ones are wrong
     */
    public static void ex_3() {
        // 1
        //String str = `a` + "a";

        // 2
        long bigNumber = 10_000___0_0_0;

        // 3
        //int hexVal = 0x01ffag0h;

        // 4
        //float d2 = 1.1234e2;

        // 5
        char c = 'A' + 1;
    }

    public static void ex_4() throws Exception {
        DenseMatrix<Integer> denseMatrix = new DenseMatrix<>(2, 2);
        denseMatrix.set(0, 0, 1);
        System.out.println(denseMatrix.get(0, 0));
    }

    /**
     * Answer: c\nd
     */
    public static void ex_5() {
        try {
            throw new Exception("abc");
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        } catch (Throwable ex) {
            System.out.println("c");
        } finally {
            System.out.println("d");
        }
    }

    /**
     * Ex 6 in README
     **/

    public static void ex_7() {
        System.out.println(GeometricalChecker.isGeometrical(1.0, 2.0, 3.0));
        System.out.println(GeometricalChecker.isGeometrical(1.0, 2.0, 4.0));
    }

    /**
     * Matrix multiplication can be found in one of my examples in other directories in this repo :)
     */
    public static void ex_8() {

    }

    /**
     * We should carry more about exceptions(check if file exist, do we
     * have rights to read & write etc.)
     * If you want to test it, initialize `arg` variable with some paths.
     *
     * @throws IOException
     */
    public static void ex_9() throws IOException {
        String arg[] = new String[2];

        if (arg.length != 2) {
            System.out.println("Usage: cp src dst");
            System.exit(1);
        }

        Path src = Paths.get(arg[0]);
        Path dst = Paths.get(arg[1]);

        Files.copy(src, dst);
    }

    public static int ex_10(/** String log **/) {
        String log = "Content-Length: 123; Content-Length: 321;";

        Pattern p = Pattern.compile("Content\\-Length: (\\d+)");
        Matcher m = p.matcher(log);

        int sum = 0;
        while (m.find()) {
            sum += Integer.parseInt(m.group(1));
        }

        System.out.println("Sum of bytes: " + sum);
        return sum;
    }

    public static void ex_11(/** Map<String,String>**/) {
        Map<String, String> map = new HashMap<>();
        map.put("85123123123", "Kowalski");
        map.put("85321312312", "Adamek");

        System.out.println(map.entrySet().stream().filter(e -> e.getKey().contains("85")).sorted(Map.Entry.comparingByValue()).findFirst().get().getValue());
    }

    public static void ex_12() {
        Size xl = Size.XL;
    }


}
