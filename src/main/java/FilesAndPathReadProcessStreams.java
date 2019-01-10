import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FilesAndPathReadProcessStreams {

    public static void main(String[] args) throws IOException {


        List<String> stringList = Files.lines(Paths.get("C:/Users/rene/Documents/workspace-spring-tool-suite-4-4.0.0.RELEASE/lambdastreamsfunctional/pom.xml"))
                .filter(line -> line.contains("name"))
                .map(line -> line.trim().replaceAll("name", "")
                        .replaceAll("<", "")
                        .replaceAll(">", "")
                        .replaceAll("/", ""))
                .collect(Collectors.toList());

        System.out.println(stringList);


    }
}
