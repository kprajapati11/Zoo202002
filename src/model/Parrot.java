package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Parrot {
    private boolean isAnnoying;
    private boolean isLoud;
    private List<String> learnedPhrases;
    private final List<String> DEFAULT_PHRASES = new ArrayList<String>(
            Arrays.asList("meep", "pretty bird", "hello", "*andy griffith theme song*"));

    public Parrot(boolean isAnnoying, boolean isLoud, String[] learnedPhrases) {
        this.setLearnedPhrases(learnedPhrases);
        this.isAnnoying = isAnnoying;
        this.isLoud = isLoud;
    }

    public Parrot() {
        this.learnedPhrases = DEFAULT_PHRASES;
        this.isAnnoying = false;
        this.isLoud = false;
    }

    public Parrot(boolean isAnnoying, boolean isLoud) {
        this.learnedPhrases = DEFAULT_PHRASES;
        this.isAnnoying = isAnnoying;
        this.isLoud = isLoud;
    }

    public boolean getIsLoud() {
        return this.isLoud;
    }

    public void setIsLoud(boolean isLoud) {
        this.isLoud = isLoud;
    }

    public boolean isAnnoying() {
        return this.isAnnoying;
    }

    public void isAnnoying(boolean isAnnoying) {
        this.isAnnoying = isAnnoying;
    }

    public List<String> getLearnedPhrases() {
        return this.learnedPhrases;
    }

    public void setLearnedPhrases(String[] learnedPhrases) {
        this.learnedPhrases = new ArrayList<String>(DEFAULT_PHRASES);

        for (String phrase : learnedPhrases) {
            this.learnedPhrases.add(phrase);
        }
    }

    public String speak() {
        String phrase;
        if (this.isAnnoying) {
            phrase = this.learnedPhrases.get(0);
        } else {
            Random rand = new Random();
            phrase = this.learnedPhrases.get(rand.nextInt(this.learnedPhrases.size()));
        }
        return isLoud ? phrase.toUpperCase() : phrase;
    }
}