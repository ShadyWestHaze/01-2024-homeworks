package io.codelex.collections.practice.phonebook;

import java.util.TreeMap;
import java.util.Set;

public class PhoneDirectory {
    private final TreeMap<String, String> data;

    public PhoneDirectory() {
        data = new TreeMap<>();
    }

    public String getNumber(String name) {
        return data.get(name);
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        data.put(name, number);
    }

    public Set<String> getAllContacts() {
        return data.keySet();
    }
}
