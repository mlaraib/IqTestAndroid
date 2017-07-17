package com.grovelet.iq.quiz.bestiqquiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

public class DataBaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "triviaQuiz";
    private static final int DATABASE_VERSION = 1;
    private static final String KEY_ANSWER = "answer";
    private static final String KEY_ID = "id";
    private static final String KEY_OPTA = "opta";
    private static final String KEY_OPTB = "optb";
    private static final String KEY_OPTC = "optc";
    private static final String KEY_QUES = "question";
    private static final String TABLE_QUEST = "quest";
    private SQLiteDatabase dbase;

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        this.dbase = db;
        db.execSQL("CREATE TABLE IF NOT EXISTS quest ( id INTEGER PRIMARY KEY AUTOINCREMENT, question TEXT, answer TEXT, opta TEXT, optb TEXT, optc TEXT)");
        addQuestions();
    }

    private void addQuestions() {
        addQuestion(new Question("You are my son, but I'm not your father. Who says that ?", "The brother", " The mother", "The son", "B"));
        addQuestion(new Question("Divide 30 by 1/2 and add ten. What do you get ?", "40", "50", "70", "C"));
        addQuestion(new Question("A farmer has 17 sheep, all but 9 die. How many are left ?", "6 live sheep", "9 live sheep. ", "13 live sheeps", "B"));
        addQuestion(new Question("A man builds a house with four sides of rectangular construction, each a southern exposure. A big bear comes along. What color is the bear ?", "green", "black", "White", "C"));
        addQuestion(new Question("A women gives a beggar 50 cents; the women is the beggar's sister, but the beggar is not the woman's brother. How come ?", "beggar wife", "beggar daughter", " The beggar is the woman's sister", "C"));
        addQuestion(new Question("How many outs are there in an inning ?", "5", "4", "6", "C"));
        addQuestion(new Question("Is it legal for a man in Russia to marry his widow's sister ?", "yes", "No", "don't know", "B"));
        addQuestion(new Question("Take 2 apples from 3 apples. What do you have ?", "1 apple", "3 apples", "2 apples", "C"));
        addQuestion(new Question("Some months have 30 days, some months have 31 days. How many have 28 ?", "All 12 months", "6 months", "5 months", "A"));
        addQuestion(new Question("Why can't a man living in the USA be buried in Canada ?", "he is not canadain", "belong to U.S.A", "Because he's not dead yet.", "C"));
        addQuestion(new Question("If you had only one match and entered a cold and dark room, where there was an oil burner, a kerosene lamp and a candle, which would you light first ?", "lamp", "candle", " The match", "C"));
        addQuestion(new Question("What was the US President's name in 1960 ?", "George W. Bush", "Bill Clinton", "George f keneddy", "A"));
        addQuestion(new Question("How many birthdays does the average man have ?", "70", "60", "1", "C"));
        addQuestion(new Question("If a doctor gives you 3 pills and tells you to take one pill every half hour, how long would it be before all the pills had been taken ", " 1 hour", "5 hours", "6 hours", "A"));
        addQuestion(new Question("Two men play seven games of checkers. Each man wins the same number of games. There are no ties. Explain this. ", "They never play each other", "They play in different times", "They play in different leagues", "A"));
        addQuestion(new Question("Two men play seven games of checkers. Each man wins the same number of games. There are no ties. Explain this. ", "They never play each other", "They play doubles", "They play singles", "A"));
        addQuestion(new Question("Do they have a 4th of July in England ?", "Yes", "No", "Don't know", "A"));
        addQuestion(new Question("How many two cent stamps are there in a dozen ? ", "2", "3", " 12", "C"));
        addQuestion(new Question("I have two US coins totaling 55 cents. One is not a nickel. What are the coins ?", "Half dollar and a nickel. ", "2 nickels", "3 dollars", "A"));
        addQuestion(new Question("I went to bed at eight o'clock in the evening and wound up my clock alarm to sound at nine o'clock in the morning. How many hours sleep would I get before being awoken by the alarm ?", "3 hour ", "4 hour", "1 hour", "C"));
        addQuestion(new Question("2 + 2 x 2 =...    What do you get ?", "4", "5", "6", "C"));
        addQuestion(new Question("How far can a dog run into the woods ? ", "Half way ", "4km", "3km", "A"));
        addQuestion(new Question("A clerk in the butcher shop is 5' 10'' tall. What does he weigh ? ", "Meat.", "Vegetables", "Fruit", "A"));
        addQuestion(new Question("What is the color of the black box in a commercial airplane ?", "blak", "Orange", "White", "B"));
        addQuestion(new Question("The Barbara's father has five daughters: Lala, Lele, Lolo, Lulu and ... What is the name of the fifth daughter ?", "Malaika", "Angela", "Barbara", "C"));
        addQuestion(new Question("Where are Chinese gooseberries from ?\t", "U.S.A", "New Zealand", "U.S.S.R", "B"));
        addQuestion(new Question("In which month do Russians celebrate the October Revolution ?", "January", "November", "December", "B"));
        addQuestion(new Question("Which country makes Panama hats ?\t", "Ecuador", "Brazil", "Argentina", "A"));
        addQuestion(new Question("What is a camel's hair brush made of ?", "Camel hair", "Wool", " Squirrel fur.", "C"));
        addQuestion(new Question("If you drove a bus with 40 people on board from Chicago and stopped at Pittsburgh to pick up 5 more people and drop off 7 passengers and at Cleveland to drop off 6 passengers and pick up 7 more and eventually arrive at Philadelphia 10 hours later, what's the name of the driver ?", "ME", "YOU", "Don't know", "B"));
        addQuestion(new Question("How long did the Hundred Years War last ?", "100", "99", "116 ", "C"));
        addQuestion(new Question("What colour is a purple finch ?", "Black", "crimson", "White", "B"));
        addQuestion(new Question("The Canary Islands in the Pacific are named after what animal ?", "Island of the Dogs.", "After hourses", "Island of Donkeys", "A"));
        addQuestion(new Question("From which animal do we get catgut ?", "From sheep and horses.", "Cats", "Dogs", "A"));
        addQuestion(new Question("What was King George VI first name ?", "Albert", "Newton", "Einstein", "A"));
        addQuestion(new Question("How long did the Thirty Years War last ? ", "30years", "313years", "13years", "A"));
        addQuestion(new Question("A man, looking at a painting, says to himself: Brothers and sons I have none, but that person's father is my father's son. Who was the person in the picture ?", "The man's daughter.", "The man's mother", "The man's wife", "A"));
        addQuestion(new Question("An archaeologist claimed he found some coins of gold dated to 49 B.C. Do you think he did ?", "No", "yes", "Don't know", "A"));
        addQuestion(new Question("Is it possible for one's grandmother to be younger than one's mother ?", "Yes", "Ofcourse", "Both", "C"));
        addQuestion(new Question("Why won't an Eskimo, even if he or she is starving attempt to catch and eat a penguin ?", "Dont't know", "yes", " No,both on Opposite Poles", "C"));
        addQuestion(new Question("What four words appear on every denomination of U. S. coins ?", "United States of America", "Australia", "U.S.S.R", "A"));
        addQuestion(new Question("At a secret family meeting, everyone shakes hands exactly once with every other person present. If there was a total of 28 handshakes, how big was the family ?", "8 persons", "6 persons", "7 persons", "A"));
        addQuestion(new Question("Does a night watchman, who dies during the day, get his pension ?", "yes", "Don't know", "No", "C"));
        addQuestion(new Question("What is the exact opposite of not in ?", "IN", "Out", "Out-class", "A"));
        addQuestion(new Question("A man bought a painting for $700, sold it for $800, bought it back again for $900, and sold it again for $1000. How much profit did he make ?", "$313", "$113", "$200 ", "C"));
        addQuestion(new Question("What is the minimum number of active players on the field during any part of any inning in a game of American Baseball ? ", "300", "Zero ", "13", "B"));
        addQuestion(new Question("If an electric train is going south and the wind is blowing north, what direction is the smoke going ? ", "There's no smoke", "North-South", "East-West", "A"));
        addQuestion(new Question("Can you continue the following sequence of letters: OTTFFSSEN... ? ", "T", "Y", "N", "A"));
        addQuestion(new Question("A farmer leaves his chickens out when he goes to town. A big wind comes along blowing chicken feathers off in all directions. Which side loses the most feathers ?", "The outside", "Inside", "All sides", "A"));
        addQuestion(new Question("If sneakers are used in tennis, cleats in football and spikes in baseball, in what sport does every contestant wear metal shoes ? ", "Cricket", "Football", "Horse racing", "C"));
        addQuestion(new Question("How much dirt can be removed from a hole which is 4 feet deep, 5 feet wide and 6 feet long?", "Alot", "None", "Few", "B"));
        addQuestion(new Question("If it takes 4 people 4 days to dig a hole, how long does it take 2 people to dig a half-hole ?", "A half-hole doesn't exist", "30days", "13days", "A"));
        addQuestion(new Question("\tThree man ate in a restaurant and the check came to $25. Each man gave the waiter $10 and told him to keep $2 out of the change as a tip. The waiter returned with $3 and each man took $1. So each man had paid $9 making a total of 27, and the waiter got $2, what happened to the other $1 ?", "Nothing", "Something", "Everything", "A"));
        addQuestion(new Question("Is it possible to move a knight ( horse ) on a chessboard from the lower left corner ( a1 ) to the upper right corner ( h8 ) and visit every square on the board once ?", "No", "Yes", "Don't know", "A"));
        addQuestion(new Question("How many squares are on a chessboard ?", "108", "1", "204 ", "C"));
        addQuestion(new Question("A plane crashes on the Canadian - US border. In which country do you bury the survivors ?", "U.S.A", "None", "Canada", "B"));
        addQuestion(new Question("What is one thing that all wise men, regardless of their religion or politics, agree is between heaven and earth ?", "and", "Air", "Distance", "A"));
        addQuestion(new Question("How many 9's are in the range of numbers from 1 to 100 ?", "20", "30", "40", "A"));
        addQuestion(new Question("If you overtake the last person, then you arrive... ?", "You Cant't", "last", "Second last", "A"));
        addQuestion(new Question("Captain Frank and some of the boys were exchanging old war stories. Art Bragg offered one about how his grandfather led a battalion against a German division during World War I. Through brilliant maneuvers, he defeated them and captured valuable territory. After the battle he was presented with a sword bearing the inscription To Captain Bragg for Bravery, Daring and Leadership. World War I. From the Men of Battalion 6.Captain Frank looked at Art and said You really don't expect anyone to believe thet yarn, do you What's wrong with the story ?", "WWI not named till WW2", "Nothing", "Fabricated", "A"));
        addQuestion(new Question("The Smith family has a mother, father and 4 daughters. Each daughter has one brother. How many people are in the family ?", "7", "1", "0", "A"));
        addQuestion(new Question("The Smith family has a mother, father and 4 daughters. Each daughter has one brother. How many people are in the family ?", "7", "1", "0", "A"));
        addQuestion(new Question("There's one sport in which neither the spectators nor the participants know the score or the leader until the contest ends. What is it ? ", "cricket", "Foot ball", "Boxing", "C"));
        addQuestion(new Question("Which is correct to say The yolk of the egg are white or The yolk of the egg is white ?", "First one", "Neither ", "Last one", "B"));
        addQuestion(new Question("What is your name? Write it down --->.", "it", "Umar(R.A)", "Kumail(R.A)", "A"));
        addQuestion(new Question("How could you rearrange the letters in the words new door to make one word ?", "one word", "door", "open door", "A"));
        addQuestion(new Question("If there was a rooster on a top af a roof and it laid an egg, which way would the egg roll ?", "A", "neither A nor B ", "B", "B"));
        addQuestion(new Question("You are lost in a forest. The forest is between two villages. In village A live only liars, they always lie. In village B people always tell the truth. You want to go to village B. Then you see a man from village A or B. You can ask him only one question. Which question will you ask him to know for sure where village B is ?", "Ask city name", "Ask Forset direction", "Ask person name", "A"));
        addQuestion(new Question("In Oklahoma you cannot take a picture of a man with a wooden leg. Why not ?", "picture is taken with camera", "Sunlight", "Moonlight", "A"));
        addQuestion(new Question("A woman had two daughters who were born on the same hour of the same day on the same year. But they were not twins. How could this be so ? ", "two of a set of triplets", "twins", "triplets", "A"));
        addQuestion(new Question("What occurs once in every two minutes, twice in every moment, yet never in a thousand years ?", "Letter N", "Letter S", "letter M", "C"));
        addQuestion(new Question("The maker doesn't want it, the buyer doesn't use it, and the user doesn't see it. What is it ? ", "A coffin", "Bed", "Sofa", "A"));
        addQuestion(new Question("If it take 5 minutes to dry a t-shirt on a clothes wire, how long would it take to dry 5 t-shirts ? ", "5 minutes", "10 minutes", "20 minutes", "A"));
        addQuestion(new Question("A person lives on the tenth floor of a building. Every day he takes the elevator to go down to the ground floor to go out. When he returns he takes the elevator to the seventh floor and walks up the stairs to reach his apartment on the tenth floor. so why does he do it ? ", "Electricity problem", "can't reach button higher than 7th ", "He hates the stair", "B"));
        addQuestion(new Question("A child is born in Boston, Massachusetts to parents who were both born in Boston, Massachusetts.The child is not a United States citizen. How is this possible ? ", "Australian", "Canadian", "before 1776.", "C"));
        addQuestion(new Question("One day Terry celebrated his birthday. Two days later his older twin sister, Kerry, celebrated her birthday. How could this be ?", "triplet of another siblings", "twin of another sibling.", "qudruplet of another siblings", "B"));
        addQuestion(new Question("One word in the English language is always spelled incorrectly. What is it ?", "incorrectly", "Father", "Wife", "A"));
        addQuestion(new Question("There were an electrician and a plumber waiting in line for admission to the International Home Show. One of them was the father of the other's son.How could this be possible ?", "father and son", "mother and daughter", "husband and wife", "C"));
        addQuestion(new Question("How can you throw a ball as hard as you can and have it come back to you, even if it doesn't hit anything, there is nothing attached to it, and no one else catches or throws it ? ", "Upward", "Eastward", "Westward", "A"));
        addQuestion(new Question("A man went to a party and drank some of the punch. He then left early. Everyone else at the party who drank the same punch were poisoned and became very sick. Why did the man not get sick ?", "poisoned it after drinking", "he knows better", "Don't know", "A"));
        addQuestion(new Question("What is the closest relation that your father's sister's sister-in-law could be to you ?", "Your Father", "Your Brother", "Your mother", "C"));
        addQuestion(new Question("Before Mount Everest was discovered, what was the highest mountain on Earth ?", "Mount Everest ", "K-2", "Nanga Parbat", "A"));
        addQuestion(new Question("A man was found murdered on Sunday. His wife immediately called the police. The police questioned the wife and staff and got these alibis:The wife said she was sleeping The cook was cooking breakfast. The gardener was picking vegetables.  maid was getting the mail. The butler was cleaning the closet.The police instantly arrested the murderer. Who did it and how did they know ?", "The Butcher", "The Gardener", "maid,no mail on Sunday!", "C"));
        addQuestion(new Question("What 5 letter word becomes shorter when you add 2 letters to it ? ", "short", " Prevailing", " Ultimate", "A"));
        addQuestion(new Question("Why are 1990 American dollar bills worth more than 1989 American dollar bills ? ", "6 dollar more", "5dollar more", "1dollar more", "C"));
        addQuestion(new Question("Can you work with the following letters to spell a 10-letter English word: TTNUMNEROA ?", "League", "TOURNAMENT", "Championship", "B"));
        addQuestion(new Question("An ice cream cone cost a dollar more than a peppermint. Together they cost $1.10. How much did each of them cost ? ", "1.5,0.5", "2", "2.5", "A"));
        addQuestion(new Question("A girl who was just learning to drive went down a one-way street in the wrong direction, but didn't break the law. How come ? ", "running", "crawling", "walking", "C"));
        addQuestion(new Question("A woman from New York married ten different men from that city, yet she did not break any laws. None of these men died, and she never divorced. How was this possible ? ", "lady was a Justice of the Peace", "impossible", "Don't know", "A"));
        addQuestion(new Question("A man who wanted a drink walked into a bar. Before he could say a word, he fell unconscious. Why ? ", "don't know", "was sleepy", "walked into a bar!", "C"));
        addQuestion(new Question("IT is more good than G-d, IT is more evil than the devil, the poor have IT, the rich want IT, and if you eat IT you will die. What is IT ?", "NOTHING", "something", "everything", "A"));
        addQuestion(new Question("Tom was born on December 25th, yet his birthday is always in the summer. How is this possible ?", "Tom lives in the southern hemisphere", "lives in norway", "lives in canada", "A"));
        addQuestion(new Question("Two students are sitting on opposite sides of the same desk. There is nothing in between them but the desk. Why can't they see each other ?", "Don't know", "They are friends", "backs to each other", "C"));
        addQuestion(new Question("In what year did Christmas and New Year's fall in the same year ? ", "every year", "7th year ", "4th year", "A"));
        addQuestion(new Question("What is the one thing shared by all three items in the group: a cow, a shoe, a baby ?", "Tongue", "Dinar", "clothes", "A"));
        addQuestion(new Question("A little girl tells you Hey I was seven years old two days ago, but I'll be ten next year. is this possible ? ", "Yes", "Don't know", "No", "A"));
        addQuestion(new Question("A little girl tells you Hey I was seven years old two days ago, but I'll be ten next year. is this possible ? ", "Yes", "don't know", "No", "A"));
        addQuestion(new Question("As a rule, how long will a so called EIGHT DAY CLOCK run without winding ?", "won't run at all", "all day", "will run forever", "A"));
        addQuestion(new Question("What is the significance of the following: The year is 1978, thirty-four minutes past noon on May 6th ? ", "12:34, 5/6/78.", "yes", "no", "A"));
        addQuestion(new Question("Who is buried in Grant's tomb ? ", "dead body", "don't know", "General Grant", "C"));
        addQuestion(new Question("What did the beach say when the tide came in ?", "haha", "Long time no sea", "i'm happy ", "B"));
        addQuestion(new Question("One day a man decides to buy a talking parrot. So he goes to a pet store. The owner tells the man he has one bird left, and that the bird will repeat any word it hears. So the man buys the bird and takes it home and starts talking to it. But the bird never repeats a word. Whats wrong ?", "the bird is happy", "the bird is helping other birds", "The bird is deaf", "C"));
        addQuestion(new Question("Which is heavier, milk or cream ?", "Cream", "Milk ", "Both", "B"));
        addQuestion(new Question("What two letters that begin this eight letter word are the same as the last two letters....and in the same order, the four middle letters are ADAC ? ", "happiness", "joy", "Headache", "C"));
        addQuestion(new Question("Frank was bragging about his church's baseball team. He said, Three of our four players hit homeruns and two of those homeruns were hit with the bases loaded Our guys won 9 to 0 and not a single man crossed home plate. How is this possible ?", "Impossible", "possible", "They were all married", "C"));
        addQuestion(new Question("What famous North American landmark is constantly moving backward ?", "Aifal Tower", "London Bridge", "Niagara Falls", "C"));
        addQuestion(new Question("A rope ladder hangs over the side of a ship. The rungs are one foot apart and the ladder is 12 feet long. The tide is rising at four inches an hour. How long will it take before the first four rungs of the ladder are underwater ?", "ladder wont rise", "ladder will rise with the ship", "ladder not present", "B"));
        addQuestion(new Question("On my way to St Ives, I met a man with seven wives, the seven wives held seven sacks the seven sacks held seven cats, all in all, how many wives, sacks and cats were going to St Ives ?", "All", "Some", "None", "C"));
        addQuestion(new Question("Three fathers and three sons shot three rabbits, and each took one rabbit home. How is this possible ?", "All the sons are fathers themselves", "Don't know", "Impossible", "A"));
        addQuestion(new Question("Sam also has a potato plant that is growing near the edge of his property. Joe says he wants to pick any potato he sees growing over his fence. Can Joe pick the potato ?", "Yes", "both", "no", "C"));
        addQuestion(new Question("A man gave one son 10 cents and another son was given 15 cents. What time is it ?", "afternoon", "morning", " 1:45", "C"));
        addQuestion(new Question("How many dead people are buried in the cemetery ?", "All of them", "none", "few", "A"));
        addQuestion(new Question("If there is a red house to the north, a yellow house to the south, a green house to the east, where is the white house ?", "London", "Don't know", "Washington D.C", "C"));
        addQuestion(new Question("A man needs to hire miners but has no money to pay them. He may only pay with bars of gold. Focus on one miner who works 7 days and the forman is given one bar of gold to pay the miner with. You may only divide the bar of gold twice. And the miner needs to be payed after each day of work. Your bar of gold is the size of a brick. is it possible ?", "Yes", "no", "don' know", "A"));
        addQuestion(new Question("Rearrange the following letters so as to make the name of a living creature: BRINO", "Robin", "Juda", "Benjamin", "A"));
        addQuestion(new Question("What is the only U.S. state that shares no letters in common with its own capital? For instance New York. Capital is Albany. Shares the letters Y and N; California. Capital Sacramento, shares A,C,O,N. ?", "New-York", "Dakota. Capitol is Pierre", "California", "B"));
        addQuestion(new Question("What do the following letters make when they are unscrambled L E L E I N S O V S ?", "Loveliness", "lonliness", "happiness", "A"));
        addQuestion(new Question("Which word does not belong in the following group? (A) Knife (B) Swan (C) Smile (D) Feather (E) Lovely (F) Thought ?", "E", "C", "Both A and B", "A"));
        addQuestion(new Question("If an airplane travels at an average rate of 500 miles per hour, how long will it take to complete 20 trips, of which five are for 1000 miles, five for 1500 miles, five for 2000 miles, and five for 3000 miles ? ", "Three days, 3 hours", "10days", "20days", "A"));
        addQuestion(new Question("If Farmer John had three white pigs, four brown pigs, one black pig, and ten spotted pigs, how many pigs could say that they are the same color as another ?", "all", "some", "none", "C"));
        addQuestion(new Question("Why did the man sleep in the fireplace ?", "was sleepy", "don't know", "wanted to sleep like a log", "C"));
        addQuestion(new Question("Is half of two plus two equal to two or three ?", "Three", "Two", "n", "Neither"));
        addQuestion(new Question("What color was George Washington's white horse ?", "White", "Black", "White", "A"));
        addQuestion(new Question("A man takes a barrel that weighs 50 pounds, and then puts something in it. It now weighs less than 50 pounds. What did he put in it ?", "Water", "hole", "Oil", "B"));
        addQuestion(new Question("Joe was out for a walk and it started to rain. He did not have an umbrella and he wasn't wearing a hat. His clothes were soaked, yet not a single hair on his head got wet. How could this happen ?", "Miracle", "Short hair", "bald", "C"));
        addQuestion(new Question("What shoes should you wear when your basement is flooded ?", "Black", "Pumps", "White", "B"));
        addQuestion(new Question("Where is the ocean the deepest ?", "Manila Trench", "Niagra Waterfall", "On the bottom", "C"));
        addQuestion(new Question("If everything in a one story house is purple, what color are the stairs ?", "no stairs", "blue", "White", "A"));
        addQuestion(new Question("Two men were playing tennis. They played five sets and each man won three sets. How did they do this ?", "different championships", "different leagues", "Playing doubles", "C"));
        addQuestion(new Question("Name one or more things that you can wear on your feet, that begin with the letter h.", "Hen", "Hat", "Hue", "B"));
        addQuestion(new Question("According to most state laws, the attempt to commit a certain crime is punishable, but actually committing the crime is not. What is the crime ?", "Accident", "Mishap", "Suicide", "C"));
        addQuestion(new Question("If it were two hours later, it would be half as long until midnight as it would be if it were an hour later. What time is it ?", "Three AM", "Nine PM", "Ten PM", "B"));
        addQuestion(new Question("What did the chocolate bar say to the lollipop ?", " hello!partner", "Nothing", "Don't know", "A"));
        addQuestion(new Question("What can go up a chimney down, but can't go down a chimney up ?", "'Umbrella", "Water", "Oil", "A"));
        addQuestion(new Question("According to most state laws, the attempt to commit a certain crime is punishable, but actually committing the crime is not. What is the crime ?", "Overtake", "Playing on road", "Suicide", "C"));
        addQuestion(new Question("If a farmer has 5 haystacks in one field and 4 haystacks in the other field, how many haystacks would he have if he combined them all in the center field ?", "One big stack", "Two big stacks", "None of the above", "A"));
        addQuestion(new Question("Twelve pears hanging high, 12 men passing by. Each took a pear and left eleven hanging here. How can this be ?", "name of one of the man passing by.", "Impossibe", "Don't know", "A"));
        addQuestion(new Question("Your mother's brother's only brother-in-law is asleep on your couch. Who is asleep on your couch ?", "Your father", "Your Son", "Your Brother", "A"));
        addQuestion(new Question("What runs but cannot walk ?", "Horse", "Donkey", "Water", "C"));
        addQuestion(new Question("What did the sock say to the foot ?", "You are putting me on", "Don't know", "Nothing", "A"));
        addQuestion(new Question("What runs around a house but doesn't move ?", "fence", "Men", "Women", "A"));
        addQuestion(new Question("If one child has 3 1/3 sand piles and another has 1 2/3, and you combine them, how many sand piles do you have ?", "1sand pile", "13 sand pile", "2 sand pile", "A"));
        addQuestion(new Question("What runs around a house but doesn't move ?", "Fence", "Men", "Women", "A"));
        addQuestion(new Question("There once was a race horse That won great fame What-do-you-think Was the horse's name.", "What-do-you-think", "White Horse", "Black Horse", "A"));
        addQuestion(new Question("The 22nd and the 24th US president were born from the same father and the same mother. But they were not brothers. How come ? ", "Separate Man", "Women", "Same Man", "C"));
        addQuestion(new Question("Where is the best place to see a man-eating fish ?", "Hotel", "seafood restaurant", "Home", "B"));
        addQuestion(new Question("A man rode into town on Friday. He stayed for three nights and then left on Friday. Horse name was ?", "Friday", "Tuesday", "Sunday", "A"));
        addQuestion(new Question("A man walks into a bar and asks the barman for a glass of water. The barman pulls out a gun and points it at the man. The man says Thank you and walks out. Why ?", "sudden shock remove his hiccups", "Don't know", "He got alright", "A"));
        addQuestion(new Question("Find the number that logically completes the following series: 2, 3, 5, 9, 17,", "33", "10", "67", "A"));
        addQuestion(new Question("What came first, the chicken or the egg ?", "Surah Ta ha 20:20", "Surah al-Qalam 68:4", "egg", "C"));
        addQuestion(new Question("Mr & Mrs Smith have 5 children. Of these five, half are boys.  is this possible ?", "No", "Yes", "Don't know", "B"));
        addQuestion(new Question("Where does New York border on North Carolina ?", " alphabetical listing of US states", "Arabian Peninsula", "Russia", "A"));
        addQuestion(new Question("There is a room. The shutters are blowing in. There is broken glass on the floor. There is water on the floor. You find Sloppy dead on the floor. How did Sloppy die ?", "Sloppy didn't died", "goldfish-bowl knocked off the table", "Sloppy is travelling around world ", "A"));
        addQuestion(new Question("What is the beginning of eternity. The end of time and space. The beginning of every end. And the end of every place ?", "E", "End of World ", "End of Universe", "A"));
        addQuestion(new Question("There was an airplane crash, every single person died, but two people survived. How is this possible ?", "Impossible", "Don't know", "They were married", "C"));
        addQuestion(new Question("Which is heavier: a pound of gold or a pound of feathers ?", "First ", "Both Equal", "Last", "B"));
        addQuestion(new Question("Imagine a duck in a glass bottle. The neck of the bottle is too small to allow the duck through.  The bottle is perfectly formed and has no trick bottoms or other openings. How do you get the duck out of the bottle without damaging either the duck or the bottle ?", "Imagine it outside", "Imagine it around", "Imagine it inside", "A"));
        addQuestion(new Question("What is it that goes up and goes down but does not move ?\t", "Temperature", "countries", "Oceans", "A"));
        addQuestion(new Question("Tom is 20 years old in 1980, but only 15 years old in 1985. How is this possible ?", "years are in B.C., not A.D", "Don't know", "Impossible", "A"));
        addQuestion(new Question("What has four legs but only one foot ?", "bed", "Oceans", "Continents", "A"));
        addQuestion(new Question("What do you call a person who doesn't have all of his/her fingers on one hand ?", "A normal person", "Extra Ordinary person", "None of the above ", "A"));
        addQuestion(new Question("When travelling from the Pacific Ocean to the Atlantic Ocean on the Panama Canal, does one travel east or west ?", "South", "North", "All of above", "B"));
        addQuestion(new Question("When travelling from the Pacific Ocean to the Atlantic Ocean on the Panama Canal, does one travel east or west ?", "South", "North", "All of above", "B"));
        addQuestion(new Question("\tA man was walking downstairs in a building when he suddenly realized that his wife had just died. How ?", "Don't know", "was on life-support machine,light went off", "Impossible", "B"));
        addQuestion(new Question("Deep in the forest was found the body of a man who was wearing only swimming trunks, snorkel and facemask. The nearest lake was 8 miles away and the sea was 100 miles away. How had he died ?", " unfortunate swimmer.", "Don't know", "He wasn't dead", "A"));
        addQuestion(new Question("What number comes next in this series: 9, 16, 25, 36 ?", "49 ", "44", "56", "A"));
        addQuestion(new Question("Complete this analogy with a seven letter word ending with the letter T. Potential is to actual as future is to ------T.", "Past", "Present", "Future", "B"));
        addQuestion(new Question("Complete this analogy with a five letter word ending with the letter H.High is to low as sky is to ----H.", "Earth", "Universe ", "World", "A"));
        addQuestion(new Question("What dries as it gets wet ?", "Towel", "Don't know", "Roads", "A"));
        addQuestion(new Question("What is black and white, and black and white, and black and white, and black and white, and black and blue ?", "A nun falling down the stairs", "Horses", "Zebra", "A"));
        addQuestion(new Question("Why did the man bring a saddle to bed with him ?", "Don't know", "For Comfort", "He wanted to ride his nightmare", "C"));
        addQuestion(new Question("What has four legs in the morning, two legs in the afternoon, and three legs at night ?", "Ship", "Man", "Aeroplane", "B"));
        addQuestion(new Question("What is open when it is closed, and closed when it is open ?", "Drawer", "Closet", "drawbridge", "C"));
        addQuestion(new Question("The more you take away from it the bigger it gets. What is it ?", "Don't Know", "hole", "No", "B"));
        addQuestion(new Question("A man and his girlfriend was at a theater watching a scary movie. At the most climatic moment of the film when everyone screamed the man pulled out a butcher knife and brutally stabbed his girlfriend to death and left her a bloody mess. When the Film was over the man and his dead girlfriend were not the first to leave nor the last, however no one noticed that the girl was stabbed to death. How is this possible ?", "303", "10", "They were in a movie", "C"));
        addQuestion(new Question("There's a man who has three kids. The first kids name is Don. The second kids name is Juan. What is the third kids name.", "Zulqarnain ", "Incomplete question ", "Umar Farooq ", "B"));
        addQuestion(new Question("If you have it you want to share it. If you share it you wont to have it. What is it ?", "Secret", "Thoughts", "Happiness", "A"));
        addQuestion(new Question("You have 10 trees you need to make 5 rows of 4. How do you do it ?", "Don't know", "Possible", " Draw a star and put a tree at each intersection of the lines", "C"));
        addQuestion(new Question("If you spell sit all day in the tub S-O-A-K, and you spell a funny story J-O-K-E, how do you spell the white of an egg ?", "A-L-B-U-M-E-N or E-G-G-W-H-I-T-E", "Yes", "Alright", "A"));
        addQuestion(new Question("In a large western city, 75% of the phone numbers are listed, 25% of the phone numbers are businesses, and 25% of the phone numbers start with the numeral 2. If you were to take a random sample of 1000 phone numbers from the city's phone book, how many numbers would you expect to be unlisted, non-business phone numbers that start with a numeral other than 2 ?", " 0%", "90%", "10", "A"));
        addQuestion(new Question("If water going down the drain/toilet goes counter-clockwise in the Northern Hemisphere and clockwise in the Southern Hemisphere, in which direction would a toilet go on the equator ?", "North", "South", "Nowhere", "C"));
        addQuestion(new Question("There is a seven letter word in the English language that contains eight words without rearranging any of its' letters. What is it ?\t", "Therein", "No word", "Everyword", "A"));
        addQuestion(new Question("A masked man is attacked by a gang of men who shoot at him, then quickly flee. The masked man survives, but the gang returns again and again, then finally quit. The masked man moves to a new location, but the gang attacks him there and he ultimately moves back to his original location. The next night, he is attacked by a different gang. What is the masked man's profession  ?", "Hockey Player", "Cricket Player", "Football Player", "A"));
        addQuestion(new Question("A steady stream of people enter the place where Tom works and remove its belongings. The people do not pay for what they take, Tom allows them to take as much as they can carry as long as they keep their mouths shut. What type of business employs Tom ?", "Trade", "Travelling", "Librarian", "C"));
        addQuestion(new Question("A black dog stand in the middle of an intersection in a town painted black. None of the street lights are working due to a power failure caused by a local storm. A car with two broken headlights is heading right for the dog but turns at the last minute to avoid hitting him. How could the driver have seen the dog in time ?", "Dont know", "By chance", "was daylight", "C"));
        addQuestion(new Question("Farmer Black came to town with some watermelons. He sold half of them plus half a melon, and found that he had one whole melon left. How many melons did he take to town ?", "4", "4", "3 ", "C"));
        addQuestion(new Question("A man who was not wearing a parachute jumped out of a plane. He landed on hard ground yet was unhurt. Why ?", "Lucky", "Fortunate", "The plane was parked on the runway", "C"));
        addQuestion(new Question("This was invented by the Chinese in 1580, but, it took another 100 years before making it too the United States. What ?", "Aeroplane", "Car", "Toilet Paper", "C"));
        addQuestion(new Question("Where can you find roads without cars, forests without trees, and cities without houses ?", "map", "No", "Don't Know", "A"));
        addQuestion(new Question("Pizza Hut spends more on this one item than on the entire rest of the pizza. What ?", "The box it comes in", "No", "Don't Know", "A"));
        addQuestion(new Question("Of all vegetables, only two can live to produce on their own for several growing seasons. All other vegetables must be replanted every year. What are the only two perennial vegetables ?", "Asparagus and rhubarb", "Sugarcane", "Tulip", "A"));
        addQuestion(new Question("Only three words in standard English begin with the letters dw. They are all common. Name two of them.", "Dwarf, dwell, and dwindle", "Dear", "Deer", "A"));
        addQuestion(new Question("There are how many punctuation marks in English grammar?", "2", "0", "14", "C"));
        addQuestion(new Question("At noon and midnight the hour and minute hands are exactly coincident with each other. How many other times between noon and midnight do the hour and minute hands cross ?", "Ten times", "20 times", "13 times", "A"));
        addQuestion(new Question("How can you arrange for two people to stand on the same piece of newspaper and yet be unable to touch each other without stepping off the newspaper ?", "Possible", "Don't know", "In between them is a door", "C"));
        addQuestion(new Question("If the Vice-President of the United States should die, who would be President ?", "The President", "Governor", "Vice-President", "A"));
        addQuestion(new Question("Find the English word that can be formed from all these letters: PNLLEEEESSSSS.", "Sleeplessness", "Happiness", "Thoghfulness", "A"));
        addQuestion(new Question("If you are standing on a hard floor, how can you drop an egg three feet without breaking the egg ?", "Catch it before touching Ground", "Let it Drop", "Drop it From two feet above", "A"));
        addQuestion(new Question("3 men went diving into a river, only 2 men got their hair wet. Why only 2 ?", "Wearing costume", "3rd is Bald", "Lucky", "B"));
        addQuestion(new Question("A man is lying dead in a field. Next to him there is an unopened package. There is no other creature in the field. How did he die ?", "Giving away water", "Feeding the Poor", "parachute had failed to open.", "C"));
    }

    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        db.execSQL("DROP TABLE IF EXISTS quest");
        onCreate(db);
    }

    public void addQuestion(Question quest) {
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
        this.dbase.insert(TABLE_QUEST, null, values);
    }

    public List<Question> getAllQuestions() {
        List<Question> quesList = new ArrayList();
        this.dbase = getReadableDatabase();
        Cursor cursor = this.dbase.rawQuery("SELECT  * FROM quest", null);
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(DATABASE_VERSION));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        return quesList;
    }

    public int rowcount() {
        return getWritableDatabase().rawQuery("SELECT  * FROM quest", null).getCount();
    }
}
