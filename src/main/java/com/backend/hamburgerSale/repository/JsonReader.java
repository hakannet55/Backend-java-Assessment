package com.backend.hamburgerSale.repository;

import com.backend.hamburgerSale.types.Burger;
import com.backend.hamburgerSale.types.User;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonReader {
    public static String filePathBurger = "src/main/resources/jsonDb/burgers.json";
    public static String filePathUser = "src/main/resources/jsonDb/users.json"; //filePathUser

    public static void writeBurgersToFile(List<User> users) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(filePathBurger), users);
    }

    public static void writeUsersToFile(List<User> users) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(filePathUser), users);
    }

    public List<Burger> readBurgersFromFile() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(this.filePathBurger);
        List<Burger> burgers = objectMapper.readValue(file, new TypeReference<List<Burger>>() {
        });
        return burgers;
    }

    public List<User> readUsersFromFile() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(filePathUser), new TypeReference<List<User>>() {
        });
    }
}
