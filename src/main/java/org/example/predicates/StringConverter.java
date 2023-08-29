package org.example.predicates;

import org.example.entities.User;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringConverter {

    public static List<User> filterString(List<User> userList, Predicate<User> stringPredicate){
        return userList.stream()
                .filter(stringPredicate)
                .collect(Collectors.toList());

    }
}
