# Happy Birthday Matthias

## A horrifying Problem
This year's goodie bag from the Coding Contest contained something that's haunting my dreams to this day. Something that I can't seem to get out of my head. Something that fuels the anger of every programmer on the planet. A __mug__.  
I'm sure you know which one I'm talking about. The mug that was supposed to be a fun little present for nerds, that turned into an abomination.

"But wait, is it actually *that* awful?"  
"You're overexaggerating, right?"

Well... let me remind you of what was printed on this coffee mug.

```
while(working)
{
    coffee.drink();
    work.execute();
        if (coffee.isEmpty())
        {
            if(coffeePot.isEmpty())
                {coffPot.brew()}
            coffee.refill();
        }
}
```

On the first look... *bad.*  
On the second look... __worse.__  
Giving it a third look... ___horrendous!___

Here is a list of all that's wrong with these 11 lines of code:
- The formatting of all curly brackets is ugly af *and* is inconsistent.
- The space between `while` or `if` and the first bracket is inconsistent.
- The first `if` shouldn't be indented.
- There is a typo that would result in a syntax error at line 8: `{coffPot.brew()}`. The variable is called `coffeePot` (it's written right one line above which makes this much funnier).
- Even if someone fixed this typo, this line would still result in a syntax error because they missed a semicolon.
- Last but not least, there is no syntax highlighting. meh.

*Phew* that's a lot for this mini code snippet. I think I got everything that's wrong with it, but please feel free to make a Pull-Request, so we can safely say ___we got 'em___.

## A Solution
After noticing this monstrosity, I did what every self-respecting programmer would do. I fixed it! Not only did I fix it and print it on a new coffee mug. Nonono, I went ahead and wrote a small, but fun console program with the sole purpose of containing the exact piece of code written on the mug.

```java
while (working) {
    coffee.drink();
    work.execute();
    if (coffee.isEmpty()) {
        if (coffeePot.isEmpty()) {
            coffeePot.refill();
        }
        coffeePot.pour(coffee);
    }
}
```

Apart from changing everything that was wrong with the "code" from the original mug, I allowed myself to change `coffee.refill();` to `coffeePot.pour(coffee);` because it made more sense semantically in my opinion.

But man, it's just great! Being able to look at the code and not barf is great when you want to enjoy a beverage, isn't it? Now we can finally get a good night's sleep.  
And once again: **Happy Birthday!**