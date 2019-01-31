//+Atsisiųskite failus people ir payments. People failo struktūra yra kableliais išskirtos reikšmės - id, vardas, pavardė. Payments failo struktūra yra kableliais išskirtos reikšmės - mokėjimo id, suma, gavėjo id, siuntėjo id
// +       Sukurkite klasę, atspindinčią žmonių (people) failo įrašų struktūrą, pavadinimu Person
// +       Sukurkite Map<Person> tipo objektą, užpildykite jį Person tipo objektais, sukurtais iš žmonių failo įrašų (people)
//        Pridėkite Person klasei du naujus laukus: receivedMoney ir sentMoney
//        Skaitykite pavedimų failą (payments). Failas yra didelis, dėl to skaitykite jį pasinaudodami srautu. Iš nuskaitytų duomenų atnaujinkite laukus receivedMoney ir sentMoney tinkamiems asmenims
//        Sukurkite naują failą, kuriame mažėjimo tvarka bus surašyti žmonės, gavę daugiausiai pinigų
//        Sukurkite naują failą, kuriame mažėjimo tvarka bus surašyti žmonės, išsiuntę daugiausiai pinigų
package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<Integer, Person> people = new HashMap<>();
        Path peopleFile = Paths.get("C:\\Users\\VytautasB\\Desktop\\JP\\Java\\Su failais\\people.txt");
        List<String> lines = Files.readAllLines(peopleFile);
        int nr = 1;//saraso eilutes numeris
        for (String line : lines) {
            String[] strings = line.split(",");
            Person person =
                    new Person(Integer.parseInt(strings[0]), strings[1].trim(), strings[2].trim());
            System.out.print(nr + ". ");
            System.out.println(person);
            people.put(person.getId(), person);
            nr++;
        }
        Path paymentFile =Paths.get("C:\\Users\\VytautasB\\Desktop\\JP\\Java\\Su failais\\payments.txt");
       try (BufferedReader reader =Files.newBufferedReader(paymentFile)){
           String line;
           while ((line = reader.readLine()) !=null){
               String[] paymentLines = line.split(",");
               int senderId= Integer.parseInt(paymentLines[3].trim());
               int recipientId= Integer.parseInt(paymentLines[2].trim());
               int amuont= Integer.parseInt(paymentLines[1].trim());

               Person sender = people.get(senderId);
               Person recipient = people.get(recipientId);
               sender.setSentMoney(sender.getSentMoney()+amuont);
               recipient.setReceiveMoney(recipient.getReceiveMoney()+amuont);

           }
       }

       Path resultFile = Paths.get("C:\\Users\\VytautasB\\Desktop\\JP\\Java\\Su failais\\src").resolve("results");
       if (Files.exists(resultFile)){
           Files.delete(resultFile);
       }
       Files.createFile(resultFile);
       try(BufferedWriter writer = Files.newBufferedWriter(resultFile)){
           Collection <Person> collection= people.values();
           for (Person person:collection){
               writer.write(person.toString());
               writer.newLine();
           }

       }



    }
}
