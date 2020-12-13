package com.springboot.mapstruct.example.models.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class DEntity {
    private String string;
    private StringList list;

    public static class StringList {
        private static List<String> stringList;

        public List<String> getStringList() {
            if (stringList == null) {
                stringList = new ArrayList<>();
            }
            return stringList;
        }
    }
}
