# `8kyu` `c003` Triple Trouble

Create a function that will return a string that combines all of the letters of the three inputed strings in groups. Taking the first letter of all of the inputs and grouping them next to each other. Do this for every letter, see example below!

**E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"**

_Note: You can expect all of the inputs to be the same length._

### Solution

https://github.com/afonsodemori/codewars-java/blob/main/src/dev/afonso/codewars/java/kyu8/c003/Kata.java


---

# `8kyu` `c002` Will there be enough space?

### The Story

Bob is working as a bus driver. However, he has become extremely popular amongst the city's residents. With so many
passengers wanting to get aboard his bus, he sometimes has to face the problem of not enough space left on the bus! He
wants you to write a simple program telling him if he will be able to fit all the passengers.

### Task Overview

You have to write a function that accepts three parameters:

* `cap` is the amount of people the bus can hold excluding the driver.
* `on` is the number of people on the bus excluding the driver.
* `wait` is the number of people waiting to get on to the bus excluding the driver.

If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.

### Usage Examples

```
cap = 10, on = 5, wait = 5 --> 0 # He can fit all 5 passengers
cap = 100, on = 60, wait = 50 --> 10 # He can't fit 10 of the 50 waiting
```

### Solution

https://github.com/afonsodemori/codewars-java/blob/main/src/dev/afonso/codewars/java/kyu8/c002/Bob.java

---

# `8kyu` `c001` Welcome!

Your start-up's BA has told marketing that your website has a large audience in Scandinavia and surrounding countries.
Marketing thinks it would be great to welcome visitors to the site in their own language. Luckily you already use an API
that detects the user's location, so this is an easy win.

### The Task

* Think of a way to store the languages as a database (eg an object). The languages are listed below so you can copy and
  paste!
* Write a 'welcome' function that takes a parameter 'language' (always a string), and returns a greeting - if you have
  it in your database. It should default to English if the language is not in the database, or in the event of an
  invalid input.

### The Database

```
english: "Welcome",
czech: "Vitejte",
danish: "Velkomst",
dutch: "Welkom",
estonian: "Tere tulemast",
finnish: "Tervetuloa",
flemish: "Welgekomen",
french: "Bienvenue",
german: "Willkommen",
irish: "Failte",
italian: "Benvenuto",
latvian: "Gaidits",
lithuanian: "Laukiamas",
polish: "Witamy",
spanish: "Bienvenido",
swedish: "Valkommen",
welsh: "Croeso"
```

Possible invalid inputs include:

```
IP_ADDRESS_INVALID - not a valid ipv4 or ipv6 ip address
IP_ADDRESS_NOT_FOUND - ip address not in the database
IP_ADDRESS_REQUIRED - no ip address was supplied
```
### Solution

https://github.com/afonsodemori/codewars-java/blob/main/src/dev/afonso/codewars/java/kyu8/c001/Welcome.java
