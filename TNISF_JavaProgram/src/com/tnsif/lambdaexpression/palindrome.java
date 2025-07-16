//Program to define generic functional interface Palindrome

package com.tnsif.lambdaexpression;

public interface palindrome<T> {
	boolean checkPalindrome(T data);
}
