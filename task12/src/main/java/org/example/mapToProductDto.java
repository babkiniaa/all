package org.example;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapToProductDto {
    public Animal mapToProductDto(Pet cat) throws NoSuchFieldException, IllegalAccessException {

        Animal animal = new Animal();

        try {

            Field filed1 = cat.getClass().getDeclaredField("photosList");
            Field filed2 = cat.getClass().getDeclaredField("name");
            Field filed3 = cat.getClass().getDeclaredField("status");

            Field field1_1 = animal.getClass().getDeclaredField("title");
            Field field2_1 = animal.getClass().getDeclaredField("isAvailable");
            Field field3_1 = animal.getClass().getDeclaredField("isSold");
            Field field4_1 = animal.getClass().getDeclaredField("photosMap");

            filed1.setAccessible(true);
            filed2.setAccessible(true);
            filed3.setAccessible(true);
            field1_1.setAccessible(true);
            field2_1.setAccessible(true);
            field3_1.setAccessible(true);
            field4_1.setAccessible(true);

            String name = (String) filed2.get(cat);
            Status status = (Status) filed3.get(cat);
            List<Photo> photolist = (List<Photo>) filed1.get(cat);

            HashMap<String, String> phmap = new HashMap<>();
            for(Photo photo: photolist){
                phmap.put(photo.getName(), photo.getURL());
            }
            field1_1.set(animal, name);
            field2_1.set(animal, status == Status.AVAILABLE);
            field3_1.set(animal, status == Status.SOLD);
            field4_1.set(animal, phmap);
        }catch (NoSuchFieldException e){
            System.out.println(e);
        }
        return animal;
    }

}
