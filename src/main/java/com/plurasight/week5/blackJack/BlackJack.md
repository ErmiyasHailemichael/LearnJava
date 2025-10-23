# 🃏 BlackJack

A simple **Java Maven** project that simulates a console-based Blackjack game.  
Players are prompted for their names, dealt cards from a shuffled deck, and the player closest to **21** without going over wins!

---

## 📘 Project Overview

This project demonstrates **object-oriented programming** in Java, using classes such as `Card`, `Deck`, `Hand`, and `Player`.  
It also reinforces working with **Maven**, **Git**, and **console-based user input**.

---

## 🚀 Features

- Prompt the user for player names
- Create and shuffle a standard deck of 52 cards
- Deal 2 cards to each player’s hand
- Calculate and display each player’s total
- Determine which player is closest to 21 without going over
- Declare the winner
- ✅ Bonus: Support multiple players and allow them to choose **Hit** or **Stay**
- ✅ Bonus: Handle **Ace** as 1 or 11 intelligently to avoid busting

---

## 🧩 Scoring Rules

| Card Type  | Value |
|-------------|--------|
| Number cards (2–10) | Face value |
| Face cards (J, Q, K) | 10 points |
| Ace | 11 points (or 1 point if 11 would cause bust) |

---

## 🛠️ Class Overview

| Class | Description |
|--------|--------------|
| **Card** | Represents a single playing card (suit and rank). |
| **Deck** | Contains 52 cards, can shuffle and deal cards. |
| **Hand** | Represents a player’s hand and can calculate total score. |
| **Player** | Stores the player’s name and hand. |
| **BlackJackGame** | Controls the main game flow and user input. |

---

## 🧩 Bonus Features
- Allow players to Hit (take another card) or Stay
- Recalculate Ace value dynamically (1 or 11)
- Support multiple rounds
- Track scores across games