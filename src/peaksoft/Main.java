package peaksoft;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {

        Adress johnDoeAdress = new Adress("100 Elm Way", "Foo City", "NJ", "01234");
        Person johnDoe = new Person("John", "Doe", null, 29, true, johnDoeAdress);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(johnDoe);
        System.out.println(json);

    }
}
