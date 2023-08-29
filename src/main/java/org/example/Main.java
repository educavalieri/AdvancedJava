package org.example;

import org.example.entities.User;
import org.example.predicates.StringConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1L, "Eduardo");
        User user2 = new User(2L, "Camila");
        User user3 = new User(3L, "Leonardo");
        User user4 = new User(4L, "Rafael");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        users.sort( (u1, u2)  -> u1.getId().compareTo(u2.getId()));

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


    }
}