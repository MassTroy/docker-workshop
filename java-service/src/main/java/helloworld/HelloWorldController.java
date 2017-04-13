package helloworld;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HelloWorldController {

    private final String greeting;

    public HelloWorldController() {
        String fileName = System.getProperty("greetingFile");
        if (fileName == null) {
            throw new RuntimeException("No greeting file specified");
        }

        String fileContents = "";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                fileContents += currentLine;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        this.greeting = fileContents;
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String root() {
        return "Its working. Try adding /hello/{your name} in the url";
    }

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable(value = "name") String name) {
        return greeting + " " + name;
    }

}
