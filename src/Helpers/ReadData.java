package Helpers;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by tuxedo21 on 26/08/17.
 */
public class ReadData {

    static ArrayList<String> readData() throws IOException {
        List<String> fileArr = Files.readAllLines(Paths.get("/home/tuxedo21/IdeaProjects/Algorithms/src/Helpers/cyber_sec.txt"));
        return (ArrayList<String>) fileArr;
    }


    public static void main(String[] args) {

    try(Stream<String> lines = Files.lines(Paths.get("/home/tuxedo21/IdeaProjects/Algorithms/src/Helpers/cyber_sec.txt"))) {

        lines.forEach(line -> System.out.println("Line: " + line));
        List<String> fileArr = Files.readAllLines(Paths.get("/home/tuxedo21/IdeaProjects/Algorithms/src/Helpers/cyber_sec.txt"));
        System.out.println(fileArr.toString());



    } catch (IOException e) {
        e.printStackTrace();
    }

    }
}
