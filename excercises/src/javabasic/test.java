package javabasic;

import java.util.LinkedHashSet;
import java.util.Set;

public class test {
	public static void main(String[] args) {
		int[] a = {878,999,23132};
		Set<Integer> set = new LinkedHashSet<>();
		for (int i=0; i<a.length; i++) {
			set.add(a[i]);
		}
		for (int n:set) {
			System.out.print(n + "  ");
		}
//		print(a);
	}
	
	public static int[] xoaTrungLap(int[] a) {
		int size = a.length;
		for (int i=0; i<size-1; i++) {
			for (int j=i+1; j< a.length; j++) {
				if (a[i] == a[j]) {
					for (int k=j; k<a.length-1;k++) {
						a[k] = a[k+1];
					}
					size--;
				}
			}
		}
		int[] temp = a;
		a = new int[size];
		for(int i=0; i<a.length; i++) {
			a[i] = temp[i];
		}
		return a;
	}
	
	public static void print(int[] a) {
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}
}
