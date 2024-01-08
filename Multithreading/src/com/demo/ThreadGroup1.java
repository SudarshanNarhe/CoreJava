package com.demo;

public class ThreadGroup1 {

	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup g = new ThreadGroup("MyGroup");
		System.out.println("Name of group created : " + g.getName());
		System.out.println("Priority of group created : " + g.getMaxPriority());
		System.out.println("Parent of Group created : " +g.getParent().getName());
		ThreadGroup childGroup = new ThreadGroup(g,"ChildGroup");
		System.out.println(childGroup.getParent().getName());
	}
	
}
