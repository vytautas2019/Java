
import sun.misc.ObjectInputFilter;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws Exception {
        objectOutputInputTest(new GeraKlase());
        objectOutputInputTest(new BlogKlase());
    }

    private static void objectOutputInputTest(Object objectToSerialize) throws Exception {

        // objekto serializavimas
        Path path = Files.createTempFile("failas", "");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            try (objectOutputStream) {
                objectOutputStream.writeObject(objectToSerialize);
            }
        }

        // objekto deserializavimas
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()));
        objectInputStream.setObjectInputFilter(createObjectFilter()); // nustatomas filtras
        try (objectInputStream) {
            Object o = objectInputStream.readObject();
            System.out.println("Deserializuotas objektas: " + o);
        }
    }

    private static ObjectInputFilter createObjectFilter() {
        return filterInfo -> {
            Class<?> theClass = filterInfo.serialClass();

            if (GeraKlase.class.isAssignableFrom(theClass)) {
                System.out.println("Leistina klase: " + theClass.getSimpleName());
                return ObjectInputFilter.Status.ALLOWED;
            } else {
                System.err.println("Neleistina klase: " + theClass.getSimpleName());
                return ObjectInputFilter.Status.REJECTED;
            }
        };
    }

}

class GeraKlase implements Serializable {
}

class BlogKlase implements Serializable {
}