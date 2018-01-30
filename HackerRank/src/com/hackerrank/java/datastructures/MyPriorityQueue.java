package com.hackerrank.java.datastructures;

import java.util.*;


class Priorities {

    private Queue<MyStudent> q = new PriorityQueue<>(10, Comparator.comparing(MyStudent::getCgpa).reversed()
        .thenComparing(MyStudent::getName)
        .thenComparing(MyStudent::getId));

    public List<MyStudent> getStudents(List<String> events) {
        for (String event : events) {
            try (Scanner in = new Scanner(event)) {
                String action = in.next();
                if (action.equals("ENTER")) {
                    String name = in.next();
                    double cgpa = in.nextDouble();
                    int id = in.nextInt();
                    q.add(new MyStudent(id, name, cgpa));
                } else if(action.equals("SERVED")) {
                    q.poll();
                }
            }
        }
        return new ArrayList<>(q);
    }
}

class MyStudent {
    private int id;
    private String name;
    private double cgpa;

    public MyStudent(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return name + ": " + cgpa + ":" + id;
    }
}

public class MyPriorityQueue
{
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<MyStudent> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (MyStudent st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
