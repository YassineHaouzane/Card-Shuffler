type Type = "Spade" | "Club" | "Diamond" | "Heart";
type CardValue =
    "Two" |
    "Three" |
    "Four" |
    "Five" |
    "Six" |
    "Seven" |
    "Eight" |
    "Nine" |
    "Ten" |
    "Jack" |
    "Queen" |
    "King" |
    "Ace";

export type Card = {
    type: Type,
    value: CardValue,
};

