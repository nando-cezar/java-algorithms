package ui;

import java.util.Scanner;

import business.MusicStore;

public class TestMusicStore {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a hora de abertura: ");
		int open = Integer.parseInt(input.nextLine());
		System.out.println("Digite a hora de fechamento: ");
		int close = Integer.parseInt(input.nextLine());
		
		MusicStore music = new MusicStore("Manoel", open, close);
		
		music.setOpenTime(open);
		music.setCloseTime(close);
		music.displayHoursOfOperation();
		System.out.println(music.getOpenClosedMessage());
		
		System.out.println(music);

	}

}
