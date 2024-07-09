package com.example.scala.collections

object Iterable extends App {

  // Iterable also defines many concrete methods, which are all listed in the following code.
  // These methods fall into the following categories:
  // Reference: https://docs.scala-lang.org/overviews/collections-2.13/trait-iterable.html

  private val xs: List[Int] = List(1, 2, 3, 4, 5)
  private val ys: List[Int] = List(6, 7, 8)

  // 1. Abstract Method:
  // Additional Details: Check ABSTRACT_METHOD.md file.

  // 2. Addition:
  // "concat", which appends two collections together, or appends all elements of an iterator to a collection.
  // Syntax: collection.concat(collection)
  // xs.concat(ys): A collection consisting of the elements of both xs and ys.
  // ys is a IterableOnce collection, i.e., either an Iterable or an Iterator.
  // Additional Details: Check ADDITION.md file.
  println()
  println("1. Addition Operation: ")
  println(s"private val xs: List[Int] = ${xs.toList}")
  println(s"private val ys: List[Int] = ${ys.toList}")
  println(s"Concat Operation: \"xs.concat(ys)\" = ${xs.concat(ys)}")
  println(s"Concat Operation: \"xs ++ ys\" = ${xs ++ ys}")
  println()

  // 3. Other Iterators:
  // Additional Details: Check OTHERITERATORS.md file.

  // 4. Maps Operations:
  // "map", "flatMap", and "collect", which produce a new collection by applying some function to collection elements.
  println()
  println("2. Maps Operation: ")

  // 4.1 map:
  // Syntax: collection.map(function)
  // xs.map(f): The collection obtained from applying the function f to every element in xs.
  // Additional Details: Check MAP.md file.
  println()
  println("2.1 map Operation: ")
  println(s"private val xs: List[Int] = ${xs.toList}")
  println(s"xs.map(n => n * 2): ${xs.map(n => n * 2)}")
  println()

  // 4.2 flatMap:
  // Syntax: collection.flatMap(function)
  // xs.flatMap(f): The collection obtained from applying the collection-valued function f to every element in xs and concatenating the results.
  // Additional Details: Check FLATMAP.md file.
  println()
  println("2.2 flatMap Operation: ")
  println(s"private val xs: List[Int] = ${xs.toList}")
  println(s"xs.flatMap(n => List(n, n * 2)): ${xs.flatMap(n => List(n, n * 2))}")
  println()

  // 4.3 collect:
  // Syntax: collection.collect(partialFunction)
  // xs.collect(pf): The collection obtained from applying the partial function pf to every element in xs for which it is defined and collecting the results.
  // Additional Details: Check COLLECT.md file.
  println()
  println("2.3 collect Operation: ")
  println(s"private val xs: List[Int] = ${xs.toList}")
  val evenDoubled = xs.collect {
    case n if n % 2 == 0 => n * 2
  }
  println(s"Even Doubled Numbers: $evenDoubled")
  println()

  // 5. Conversions:
  // to, toList, toVector, toMap, toSet, toSeq, toIndexedSeq, toBuffer, toArray which turn an Iterable collection into something more specific.
  // If the destination is a mutable collection(to(collection.mutable.X), toArray, toBuffer), a new collection is created by copying the original elements.
  // All these conversions return their receiver argument unchanged if the run-time type of the collection already matches the demanded collection type.
  // For instance, applying toList to a list will yield the list itself.
  // Additional Details: Check CONVERSIONS.md file.

  // 5.1 to
  // xs.to(SortedSet): Generic conversion operation that takes a collection factory as parameter.

  // 5.2 toList
  // xs.toList: Converts the collection to a list.

  // 5.3 toVector
  // xs.toVector:	Converts the collection to a vector.

  // 5.4 xs.toMap: Converts the collection of key/value pairs to a map. If the collection does not have pairs as
  //               elements, calling this operation results in a static type error.

  // 5.5 xs.toSet: Converts the collection to a set.

  // 5.6 xs.toSeq: Converts the collection to a sequence.

  // 5.7 xs.toIndexedSeq: Converts the collection to an indexed sequence.

  // 5.8 xs.toBuffer: Converts the collection to a buffer.

  // 5.9 xs.toArray: Converts the collection to an array.

  // 6. Size Info:
  // Size info operations isEmpty, nonEmpty, size, knownSize, sizeIs.
  // The number of elements of a collections can require a traversal in some cases (e.g. List).
  // In other cases the collection can have an infinite number of elements (e.g. LazyList.from(1)).
  // Additional Details: Check SIZEINFO.md file.

  // 7. Element Retrieval:
  // Element retrieval operations head, last, headOption, lastOption, and find.
  // These select the first or last element of a collection, or else the first element matching a condition.
  // Note, however, that not all collections have a well-defined meaning of what “first” and “last” means.
  // For instance, a hash set might store elements according to their hash keys, which might change from run to run.
  // In that case, the “first” element of a hash set could also be different for every run of a program.
  // A collection is ordered if it always yields its elements in the same order.
  // Most collections are ordered, but some (e.g. hash sets) are not– dropping the ordering gives a little bit of extra efficiency.
  // Ordering is often essential to give reproducible tests and to help in debugging.
  // That’s why Scala collections give ordered alternatives for all collection types.
  // For instance, the ordered alternative for HashSet is LinkedHashSet.
  // Additional Details: Check ELEMENT_RETRIEVAL.md file.

  // 8. Subcollections:
  // Sub-collection retrieval operations tail, init, slice, take, drop, takeWhile, dropWhile, filter, filterNot, withFilter.
  // These all return some sub-collection identified by an index range or some predicate.
  // Additional Details: Check SUBCOLLECTIONS.md file.

  // 9. Subdivision Operations:
  // splitAt, span, partition, partitionMap, groupBy, groupMap, groupMapReduce, which split the elements of this collection into several sub-collections.
  // Additional Details: Check SUBDIVISION.md file.

  // 10. Element Tests:
  // exists, forall, count which test collection elements with a given predicate.
  // Additional Details: Check ELEMENT_CONDITION.md

  // 11. Folds:
  // Folds foldLeft, foldRight, reduceLeft, reduceRight which apply a binary operation to successive elements.
  // Additional Details: Check FOLDS.md

  // 12. Specific Folds
  // Specific folds sum, product, min, max, which work on collections of specific types (numeric or comparable).
  // Additional Details: Check SPECIFICFOLDS.md

  // 13. Strings
  // String operations mkString and addString which give alternative ways of converting a collection to a string.
  // Additional Details: Check STRINGS.md

  // 14. Zippers
  // Additional Details: Check ZIPPERS.md

  // 15. View
  // View operation: A view is a collection that’s evaluated lazily. You’ll learn more about views in later.
  // Additional Details: Check VIEW.md

}
