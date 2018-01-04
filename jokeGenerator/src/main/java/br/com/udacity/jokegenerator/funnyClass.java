package br.com.udacity.jokegenerator;

public final class funnyClass {

    /**
     * List of silly jokes found on the internet
     */

    private static final String[] funnyJokes = {"Q: What goes up and down but does not move? \nA: Stairs",
            "Q: Where should a 500 pound alien go? \nA: On a diet",
            "Q: Why did the man run around his bed? \nA: Because he was trying to catch up on his sleep!",
            "Q: What did one toilet say to the other? \nA: You look a bit flushed.",
            "Q: Which hand is it better to write with? \nA: Neither, it’s best to write with a pen!",
            "Q: Why did the picture go to jail? \nA: Because it was framed.",
            "Q: Why did the math book look so sad? \nA: Because it had so many problems!",
            "Q: Why did the boy bring a ladder to school? \nA: He wanted to go to high school.",
            "Q: What did one wall say to the other wall? \nA: I'll meet you at the corner.",
            "Q: Which flower talks the most? \nA: Tulips, of course, because they have two lips!",
            "Q: What do you call a boy named Lee that no one talks to? \nA: Lonely",
            "Q: What gets wetter the more it dries? \nA: A towel.",
            "Q: Why do bicycles fall over? \nA: Because they are two-tired!",
            "Q: What do you call security guards working outside Samsung shops? \nA: Guardians of the Galaxy.",
            "Q: Why do dragons sleep during the day? \nA: So they can fight knights!",
            "Q: Why was the broom late? \nA: It over swept!",
            "Q: What part of the car is the laziest? \nA: The wheels, because they are always tired!",
            "Q: What do you call a pig that knows karate? \nA: A pork chop!",
            "Q: Why did the hipster burn his mouth with his coffee? \nA: Because he drank it way before it was cool!",
            "Q: What did the stamp say to the envelope? \nA: Stick with me and we will go places!",
            "Q: What is blue and goes ding dong? \nA: An Avon lady at the North Pole!",
            "Q: We're you long in the hospital? \nA: No, I was the same size I am now!",
            "Q: Why did the computer go to the doctor \nA: Because it had a virus!",
            "Q: Why couldn't the pirate play cards? \n A: Because he was sitting on the deck!",
            "Q: What did the laundryman say to the impatient customer? \n A: Keep your shirt on!",
            "Q: What do you call an alligator in a vest? \nA: An investigator!",
            "Q: What's the difference between a TV and a newspaper? \nA: Ever tried swatting a fly with a TV?",
            "Q: What did one elevator say to the other elevator? \nA: I think I'm coming down with something!",
            "Q: Why can’t you give Elsa a balloon? \nA: Because she will let it go!",
            "Q: What has four wheels and flies? \nA: A garbage truck!",
            "Q: Why was everyone so tired on April 1st? \nA: They had just finished a March of 31 days.",
            "Q: How do you make holy water? \nA: Boil the hell out of it!",
            "Q: Why can't your nose be 12 inches long? \nA: Because then it would be a foot!",
            "Q: Why did the robber take a bath before he stole from the bank? \nA: He wanted to make a clean get away!",
            "Q: What makes the calendar seem so popular? \nA: Because it has a lot of dates!",
            "Q: Why did Mickey Mouse take a trip into space? \nA: He wanted to find Pluto!",
            "Q: What is it that even the most careful person overlooks? \nA: Her nose!",
            "Q: Did you hear about the robbery last night? \nA: Two clothes pins held up a pair of pants!",
            "Q: Why do you go to bed every night? \nA: Because the bed won't come to you!"
    };

    public static String getJoke() {
        return funnyJokes[(int) (Math.random() * funnyJokes.length)];
    }
}
