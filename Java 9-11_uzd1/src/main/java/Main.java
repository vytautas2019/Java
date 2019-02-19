import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    private int females;

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("http://api.population.io:80/1.0/population/2019/Lithuania/"))
                .GET()
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        String json = response.body();

        ObjectMapper mapper = new ObjectMapper();

        List<People> map = mapper.readValue(json, new TypeReference<List<People>>(){});



//        List<People>mapAge100 =
                map.stream()
                .filter(people -> people.getAge()==100)
                .forEach(System.out::println);

        map.stream()
                //.filter(people -> people.getFemales()>=0)
                .map(people -> {
                    String f= "females quantity:";
                   int kiekis =people.getFemales();
                    String a= "age:";
                    int am =people.getAge();
                   return List.of(f,kiekis,a,am);

                })
                .collect(Collectors.toList())

                .forEach(System.out::println);

        List<List>mapfemales =map.stream()
                .filter(people -> people.getFemales()>=0)
                .map(people -> {
                    String f= "females quantity:";
                    int kiekis =people.getFemales();
                    String a= "age:";
                    int am =people.getAge();
                    return List.of(f,kiekis,a,am);

                })
                .collect(Collectors.toList());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");


        System.out.println(mapfemales);

        Map<Integer, Long> collect = map.stream()
                .map(People::getFemales)


                .collect(Collectors.summingInt();
        System.out.println(collect);


    }
}

