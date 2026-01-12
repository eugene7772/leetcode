package problems.double_linked_list.medium;

import java.util.HashMap;

public class LRUCache {
    private class Node {
        int key, value;
        Node prev, next;
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private HashMap<Integer, Node> cache;
    private int capacity;
    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        Node node = cache.get(key);
        remove(node);
        add(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            remove(node);
            add(node);
        } else {
            if (cache.size() == capacity) {
                Node lru = head.next;
                remove(lru);
                cache.remove(lru.key);
            }
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            add(newNode);
        }
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void add(Node node) {
        node.prev = tail.prev;
        node.next = tail;
        tail.prev.next = node;
        tail.prev = node;
    }

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        int a = lRUCache.get(2);
        lRUCache.put(2, 6);
        int aa = lRUCache.get(1);
        lRUCache.put(1, 5);
        lRUCache.put(1, 2);
        int aad = lRUCache.get(1);
        int aa3 = lRUCache.get(2);
    }

}
