package com.org.coding_questions;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	static class Node{
		int key;
		int value;
		Node prev;
		Node next;
		
		Node(int key,int value){
			this.key=key;
			this.value=value;
		}
	}// Node class closed
	
	private int capacity;
	private Map<Integer,Node> map=new HashMap<>();
	private Node head= new Node(-1,-1);
	private Node tail= new Node(-1,-1);
	
	public LRUCache(int capacity) {
		this.capacity=capacity;
		tail.prev=head;
		head.next=tail;
	}
	
	public int get(int key) {
		if(!map.containsKey(key)) {
			return-1;
		}
		Node node=map.get(key);
		remove(node);
		add(node);
		return node.value;
	}
	
	public void put(int key,int value) {
		if(map.containsKey(key)) {
			Node node=map.get(key);
			remove(node);
			node.value=value;
			add(node);
		}else {
			if(map.size()==capacity) {
				map.remove(tail.prev.key);
				remove(tail.prev);
			}
			Node node=new Node(key,value);
			add(node);
			map.put(key, node);
		}
	}

	private void add(Node node) {
		node.prev=head;
		node.next=head.next;
		head.next.prev=node;
		head.next=node;
		
	}

	private void remove(Node node) {
		node.prev.next=node.next;
		node.next.prev=node.prev;
	}
	
	public static void main(String[] args) {
		LRUCache cache=new LRUCache(2);
		cache.put(1, 10);
		cache.put(2, 120);
		System.out.println(cache.get(1));
		cache.put(3, 30);
		System.out.println(cache.get(2));
		cache.put(4, 40);
		System.out.println(cache.get(1));
		System.out.println(cache.get(4));
		System.out.println(cache.get(3));
		
		
	}
}
