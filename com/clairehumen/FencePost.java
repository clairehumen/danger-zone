package com.clairehumen;

public class FencePost {

	public static void main(String[] args) {

		String wire = "";
		String fencepost = "/" + "|" + "\\";
		int howManyPosts = 12;

		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < howManyPosts; i++) {
				System.out.print(wire + fencepost);
				wire = "---";
			}
			System.out.println("");
			wire = "";
		}

	}

}
