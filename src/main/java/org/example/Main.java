package org.example;

import org.example.entities.User;
import org.example.predicates.DoIt;
import org.example.predicates.StringConverter;
import org.example.util.Base64Converter;

import javax.sound.midi.Soundbank;
import java.io.UnsupportedEncodingException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {

        User user1 = new User(1L, "Eduardo");
        User user2 = new User(2L, "Camila");
        User user3 = new User(3L, "Leonardo");
        User user4 = new User(4L, "Rafael");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

/*        users.sort( (u1, u2)  -> u1.getId().compareTo(u2.getId()));

        users.forEach( user -> {
            System.out.printf("The user id is " + user.getId() + " and the name" + user.getName() + "/n");
        });

        Predicate<User> lessThanten = user -> user.getId() < 10;
        Predicate<String> startsWithE = str -> str.startsWith("E");
        Predicate<User> startsWithEuser = str -> str.getName().startsWith("E");
        System.out.println(lessThanten.test(user1));

        List<User> newUsers = users.stream()
//                .filter( x -> x.getName().startsWith("E"))
                .filter(startsWithEuser)
                .collect(Collectors.toList());

        System.out.println(newUsers);

        var list = StringConverter.filterString(users, userPred -> userPred.getName().startsWith("L"));
        System.out.println(list);


        // Stream

        var users2 = users.stream()
                .filter(user -> user.getId() < 3)
                .map(user -> user.getName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(users2);;

        DoIt<User> doString = x -> x.getName().startsWith("E");

        users.forEach( user -> {
            if(doString.doo(user)){
                System.out.println(user);
            }
        });

        //Base 64
        String teste = Base64Converter.encode("teste");
        System.out.println(teste);

        System.out.println(Base64Converter.decode(teste));*/


        //Optional

        Optional<String> teste = Optional.ofNullable("teste");
        System.out.println(teste.isPresent() ? teste.get() : "not present");

        Optional<String> teste2 = Optional.ofNullable(null);
//        Optional<String> teste2 = Optional.ofNullable("teste3");
        System.out.println(teste2.orElse("teste2"));


    }
}