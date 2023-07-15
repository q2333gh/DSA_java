package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.IntStream;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

  public static void main(String[] args) {
    Main main = new Main();
//    main.queueTest();
//    main.dequeTest();
//    main.testRandomInt();
    main.priorityQueueTest();
  }

  public void strTest() {
    String s1 = "asdfghj";
    String s3 = "asdfghj";
    String s2 = "asdqwe";
    String sub = s1.substring(0, 2);
    System.out.println(sub);
    int i = s1.compareTo(s2);
    int i2 = s1.compareTo(s3);
    System.out.println(i2);
    System.out.println(i);
  }

  public void queueTest() {
    Queue<Integer> q1 = new ArrayBlockingQueue<>(5);
    int length = 5;
    for (int i = 0; i < length; i++) {
      q1.add(i);
    }
    for (int i = 0; i < length; i++) {
      Integer poll = q1.poll();
      System.out.print(poll + " ");
    }


  }

  public void dequeTest() {
    Deque<Integer> q1 = new ArrayDeque<>();
    int length = 5;
    for (int i = 0; i < length; i++) {
      q1.offerFirst(i);
      q1.offerLast(10 + i);
    }
    for (int i = 0; i < length; i++) {
      System.out.print(q1.pollFirst() + " ");
    }

    for (int i = 0; i < length; i++) {
      System.out.print(q1.pollLast() + " ");
    }


  }

  public void priorityQueueTest() {
    PriorityQueue<Integer> pq1 = new PriorityQueue<>();
    int len = 10;
    for (int i = 0; i < len; i++) {
      pq1.add(i);
    }
    for (int i = 0; i < len; i++) {
      System.out.print(pq1.poll() + " ");
    }
    boolean offer = pq1.offer(5);
    System.out.println(pq1.peek());
    boolean contains = pq1.contains(5);
    System.out.println(contains);
  }

  public int randomInt() {
    int min = 0;
    int max = 10;
    int randomInt = ThreadLocalRandom.current().nextInt(min, max);
    return randomInt;
  }

  public void testRandomInt() {
    for (int i = 0; i < 10; i++) {
      System.out.print(randomInt() + " ");
    }
  }
}