package org.lang;

public class LanguageInfo extends StateDetails {

	private void tamilLanguage() {
		System.out.println("tamil is oldest Language");
	}
	private void englishLanguage() {
		System.out.println("english is universal Language");
	}
	private void hindiLanguage() {
		System.out.println("hindi is national Language");
	}
	public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		l.southIndia();
		l.northIndia();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
}
}
