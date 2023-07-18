# `7kyu` `c006` Complementary DNA

Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the
development and functioning of living organisms.

If you want to know more: http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one side of
the DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is never empty or
there is no DNA at all (again, except for Haskell).

More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

Example: (**input --> output**)

```
"ATTGC" --> "TAACG"
"GTAT" --> "CATA"
```

### Solution

https://github.com/afonsodemori/codewars-java/blob/main/src/dev/afonso/codewars/java/kyu7/c006/DnaStrand.java

---

# `7kyu` `c005` Visible Dots On a Die

Your task is to return the number of visible dots on a die after it has been rolled (that means the total count of dots
that would not be touching the table when rolled)

6, 8, 10, 12, 20 sided dice are the possible inputs for "numOfSides"

topNum is equal to the number that is on top, or the number that was rolled.

for this exercise, all opposite faces add up to be 1 more than the total amount of sides Example: 6 sided die would have
6 opposite 1, 4 opposite 3, and so on. for this exercise, the 10 sided die starts at 1 and ends on 10.

Note: topNum will never be greater than numOfSides

### Solution

https://github.com/afonsodemori/codewars-java/blob/main/src/dev/afonso/codewars/java/kyu7/c005/DiceDotCount.java
