package com.learn.patterns.structural.flyweight.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TreeFactory {

    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        return Optional.ofNullable(treeTypes.get(name))
                .orElseGet(() -> {
                    TreeType treeType = new TreeType(name, color, otherTreeData);
                    treeTypes.put(name, treeType);
                    return treeType;
                });
    }
}
