2.
 
* There are a few limitations of using var in lambda.

* For example, we cannot use var for some parameters and skip for others:

* (var s1, s2) -> s1 + s2
   Similarly, we cannot mix var with explicit types:

 * (var s1, String s2) -> s1 + s2
  Finally, even though we can skip the parentheses in single parameter lambda:

* s1 -> s1.toUpperCase()
  we cannot skip them while using var:

* var s1 -> s1.toUpperCase()