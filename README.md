# se459_team9_trivia_game

[![Build Status](https://travis-ci.org/verbalhanglider/se459_team9_trivia_game.svg?branch=master)](https://travis-ci.org/verbalhanglider/se459_team9_trivia_game)

## Introduction

This is a class project for Depaul University SE 359/459-701/700 Agile Software Development course. The team consists of 

- Adlai Abdelrezaq (adull)
- Tyler Danstrom (verbalhanglider)
- Ilian Iliev (iiliev82)
- Alejandro Vicuna (avicuna)
- Peilin Song (peilin82)

It is a variation of the board game Taboo meant to be played on a single computer by a minimum of 2 teams and a maximum of 4 teams. Each team must have exactly 2 players. The teams take turns drawing cards where for each round a clue giver tries to get the guesser on the team to guess the word on the card without being allowed to use any Agile terms on the prohibited word list as hints. The game lasts until there are no more cards to draw. The winning team is the one with the most points at the end of the game.

## Quickstart Instructions

1. download and install maven to your computer from the instructions [here](https://maven.apache.org/download.cgi)
1. open up a shell. 
   - on Mac, you can do this by opening up the Terminal app; 
   - on Windows, you can do this by clicking on your Start menu then typing run in the search box and clicking enter. In the run command type cmd and hit enter. You will see a DOS window open up now.
   - On Linux, you can do this by opening up whatever shell you have selected as your default. 
1. make sure the mvn command ins on your path. On Windows, the easiest way to do this is to change directory to the location of the mvn exeutable
1. run the command ```git clone https://github.com/verbalhanglider/se459_team9_trivia_game.git```
1. change directory into the new directory se459_team9_trivia_game
1. run the command ```mvn clean install```
1. run the command ```mvn package```
1. run the command ```java -cp target\triviaGame-1.0.0-SNAPSHOT.jar se459Team9.triviaGame.Main```

Success! You should see the start screen of the game appear on your screen

## Quickstart Eclipse instructions

To use windowbuilder with eclipse, you need to take the following extra steps

1. import this project into your eclipse
1. go the pom.xml and add the following xml fragment to the dependencies section if you are on a Windows box
```text/xml
<dependency>
  <groupId>org.eclipse.swt</groupId>
  <artifactId>org.eclipse.swt.win32.win32.x86_64</artifactId>
  <version>4.3</version>
  <scope>runtime</scope>
</dependency>
```
1. go to pom.xml and add the following xml fragment to the depdencies section if you are on a Mac
```text/xml
<dependency>
  <groupId>org.eclipse.swt</groupId>
  <artifactId>org.eclipse.swt.cocoa.macosx.x86_64</artifactId>
  <version>4.3</version>
  <scope>runtime</scope>
</dependency
```
1. if you are not using a Mac or a Windows computer select the artifact appropriate for your computer from the [Maven repository](https://mvnrepository.com/artifact/org.eclipse.swt/org.eclipse.swt.cocoa.macosx.x86_64)
1. once the dependency is added the pom.xml file make sure you save the pom.xml file
1. go to the root folder of the project and right click on it in the preview pane
1. select Maven->Update Project
1. you should see the new artifact appear in your Maven Dependencies folder. Now you should be able to right click on any of the GUI classes and see the Open With->Window Builder. Once it opens up, you should see two tabs at the bottom of the editing screen one for Source and one for Design. The Design tab will let you preview the source code in a WYSIWIG edit screen.
