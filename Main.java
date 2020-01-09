package com.company;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {


    public static void main(String[] args) {
        // write your code here

    }

    public class node {
        String name;
        node Node;
        node(String name) {
            this.name=name;

        }


    }

    public class FolderNode extends node {
        Map<String,node> nodeMap= new Map<String, node>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object o) {
                return false;
            }

            @Override
            public boolean containsValue(Object o) {
                return false;
            }

            @Override
            public node get(Object o) {
                return null;
            }

            @Override
            public node put(String s, node node) {
                return null;
            }

            @Override
            public node remove(Object o) {
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ? extends node> map) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<node> values() {
                return null;
            }

            @Override
            public Set<Entry<String, node>> entrySet() {
                return null;
            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public node getOrDefault(Object key, node defaultValue) {
                return null;
            }

            @Override
            public void forEach(BiConsumer<? super String, ? super node> action) {

            }

            @Override
            public void replaceAll(BiFunction<? super String, ? super node, ? extends node> function) {

            }

            @Override
            public node putIfAbsent(String key, node value) {
                return null;
            }

            @Override
            public boolean remove(Object key, Object value) {
                return false;
            }

            @Override
            public boolean replace(String key, node oldValue, node newValue) {
                return false;
            }

            @Override
            public node replace(String key, node value) {
                return null;
            }

            @Override
            public node computeIfAbsent(String key, Function<? super String, ? extends node> mappingFunction) {
                return null;
            }

            @Override
            public node computeIfPresent(String key, BiFunction<? super String, ? super node, ? extends node> remappingFunction) {
                return null;
            }

            @Override
            public node compute(String key, BiFunction<? super String, ? super node, ? extends node> remappingFunction) {
                return null;
            }

            @Override
            public node merge(String key, node value, BiFunction<? super node, ? super node, ? extends node> remappingFunction) {
                return null;
            }
        };
        node Node;
        public FolderNode(String name, node Node) {
            super(name);
            this.Node=Node;
        }
        public void insertFolder(){
            Scanner reader=new Scanner(System.in);
            String newName;
            System.out.println("Input Folder Name");
            newName=reader.next();
            nodeMap.put(this.name,Node);
        }
        public void getParent(){

        }
    }

    class TreeNode extends node {

        TreeNode(String name){
            super(name);
        }
    }

    class Tree{
         public void insert(node newNode){

         }

    }

}