package com.vee.controller;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;

import com.sun.crypto.provider.RSACipher;

public class Tester {
	public static void main(String[] args) {
		
		ShaPasswordEncoder sha = new ShaPasswordEncoder();
		Md5PasswordEncoder md5 = new Md5PasswordEncoder();
	}
}
