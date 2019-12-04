# FunctionalProgramming



# :green_book: What is Functional Programming:<br />

  :chocolate_bar: Every software program has two things:<br />

   :pushpin: Behavior (what the program does)<br />
   :pushpin: Data (data, is well, data)<br />
   :pushpin: When we’re learning about a programming paradigm — like functional programming — it’s often helpful to consider how the   paradigm approaches behavior and data respectively.<br />

  :chocolate_bar: Behavior, in functional programming, is handled purely using functions in functional programming. Functions are “self contained” pieces of code that accomplish a specific task. They define a relationship between a set of possible inputs and a set of possible outputs — they usually take in data, process it, and return a result. Once a function is written, it can be used over and over and over again.<br />

  :chocolate_bar: Data, in functional programming, is immutable — meaning it can’t be changed. Rather than changing data they take in, functions in functional programming take in data as input and produce new values as output. Always.<br />

  :chocolate_bar: Functions and immutable data are the only two things you need to ever deal with in functional programming. To make it even simpler, functions are treated no differently than data.<br />

  :chocolate_bar: Put another way, functions in functional programming can be passed around as easily as data. You can refer to them from constants and variables, pass them as parameters to other functions, and return them as results from other functions.<br />

  :chocolate_bar: This is the most important thing to understand when approaching functional programming.<br />
By treating functions as nothing more special than a piece of data and by only using data that is immutable, we are given a lot more freedom in terms of how we can use functions.<br />

  :chocolate_bar: Namely, it allows us to create small, independent functions that can be reused and combined together to build up increasingly complex logic. We can break any complex problem down into smaller sub-problems, solve them using functions, and finally combine them together to solve the bigger problem.<br />

  :chocolate_bar: Considering the ever-growing complexity of software applications, this kind of “building-block” approach makes a huge difference in keeping programs simple, modular, and understandable. This is also why developers strive to make their functions as general-purpose as possible, so that they can be combined to solve large, complex problems and reused to speed up development time for subsequent programs.<br />

:chocolate_bar: Ultimately, the reason that functions are so powerful in functional programming is because the functions follow certain core tenets.<br />

  :pear: Functions are pure<br />
  :pear: Functions use immutable data<br />
  :pear: Functions guarantee referential transparency<br />
  :pear: Functions are first-class entities<br />

:chocolate_bar: After that, I’ll briefly touch on how functional programming applies these tenets to encourage us to think carefully about our data and the functions that interact with it.<br />

:chocolate_bar: By the end, you’ll be able to understand how this approach leads to code that is:<br />

  :pear: Easier to understand (that is, “expressive”)<br />
  :pear: Easier to reuse<br />
  :pear: Easier to test<br />
  :pear: Easier to maintain<br />
  :pear: Easier to refactor<br />
  :pear: Easier to optimize<br />
  :pear: Easier to reason about<br />









